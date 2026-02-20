package day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class XmlToObj {
    private static final Set<Class<?>> WRAPPER_TYPES = new HashSet<>(Arrays.asList(
            Boolean.class,Character.class,Integer.class,Long.class,Float.class,Double.class));
    //TODO: obj to obj to obj
    public static void main(String[] args) {
        String str = "<Address><street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode></Address>";
        String str1 = "<Employee><empFirstName>max</empFirstName><empLastName>k</empLastName><empSalary>5000.0</empSalary><Department><deptId>101</deptId><deptName>IT</deptName><block>C</block><manager>Ram</manager><Address><street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode></Address></Department><Address><street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode></Address></Employee>";
        String xml = removeRootTag(str);
        String empXml = removeRootTag(str1);
        System.out.println(empXml);
        // not working got using angular bracket
//        while(xml!=null&&xml.length()>0){
//            int startIndex = findStartAngular(xml);
//            int endIndex = findFirstEndAngular(xml);
//            String currString = xml.substring(startIndex,endIndex);
//            endIndex+=2;
//            xml = xml.substring(endIndex);
//            System.out.println("currString = "+currString);
//            System.out.println("xml = "+xml);
//        }
        Address a = new Address();
        Object createdObj = new Address();
        Employee e1 = new Employee();
//        try{
//            createdObj = basicXmlToObj(xml,a);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(createdObj);
        split(empXml,e1);


    }
    public static int findStartAngular(String xml){
        return xml.indexOf(">")+1;
    }
    public static int findLastEndAngular(String xml){
        return xml.lastIndexOf("</");
    }
    public static int findFirstEndAngular(String xml){
        return xml.indexOf("</");
    }
    public static String removeRootTag(String str){
        int startAngular = findStartAngular(str);
        int lastAngular = findLastEndAngular(str);
        return  str.substring(startAngular,lastAngular);
    }
    public static void split(String xml,Object obj){
        Class<?> cls = obj.getClass();
        Field[]fields = cls.getDeclaredFields();
        List<Class<?>>listOfObject = new ArrayList<>();
        List<String>listOfXml = new ArrayList<>();
        for (Field f : fields){
            Class<?> fieldType = f.getType();
            if(!isNonObject(fieldType)){
                String fieldName = fieldType.getSimpleName();
//                System.out.println(fieldName);
                int startInd = xml.indexOf(fieldName)-1;
                int lastInd = xml.lastIndexOf(fieldName)+fieldName.length()+1;
                String start = xml.substring(0,startInd);
                String end = xml.substring(lastInd);
                String getInsideObj = xml.substring(startInd,lastInd);
                xml = start+end;
                System.out.println("getInsideObj = "+getInsideObj);
                System.out.println("xml "+xml);
                System.out.println("\n\n");
            }
        }
    }
//    public static boolean checkIfObjPresent(String xml)
    public static Object basicXmlToObj(String xml,Object obj) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> cls = obj.getClass();
        Object returnObj = obj;//cls.getDeclaredConstructor().newInstance();
            //can not do using constructor
//        Constructor constructor = cls.getConstructor(cls,);
        while(xml != null && xml.length()>1){
            int startInd = 0;

            while(xml.charAt(startInd) != '<'){
                startInd++;
            }

            int endInd = startInd+1;
            while(xml.charAt(endInd) != '>'){
                endInd++;
            }
//            System.out.println("currString ");
            String currString = xml.substring(startInd+1,endInd);
//            System.out.println(currString);
            int trueEndIndex = xml.indexOf("/"+currString);

            String objValue = xml.substring(endInd+1,trueEndIndex-1);

//            System.out.println(objValue);

            String setterMethodName = getSetterMethodName(currString);
            Field currField = cls.getDeclaredField(currString);
//            Method currMethod = cls.getDeclaredMethod(setterMethodName);
            Method currMethod = cls.getDeclaredMethod(getSetterMethodName(currString), currField.getType());
//            System.out.println("Current Method :"+currMethod.getName());


//            System.out.println("Current field : "+currField.getName());
            currField.setAccessible(true);
//            System.out.println("The call : "+currField.getName());
            Class<?> currFieldType = currField.getType();
//            System.out.println("reached");
            setField(currMethod,returnObj,currFieldType,objValue);

            xml = xml.substring(trueEndIndex+currString.length()+1);
//            System.out.println(xml);
        }
        return returnObj;
    }
    private static String getSetterMethodName(String currFieldName) {
        String start = currFieldName.substring(0,1).toUpperCase();
        String end = currFieldName.substring(1);
        String getterMethodName = start+end;
        return "set"+getterMethodName;
    }

    public static void setField(Method currMethod,Object obj,Class<?>currFieldType,String objValue) throws IllegalAccessException, InvocationTargetException {
        currMethod.setAccessible(true);
//        System.out.println("setField "+objValue);
//        if(currFieldType == int.class || currFieldType == Integer.class){
//            currMethod.invoke(obj,Integer.parseInt(objValue));
//        }
        switch (currFieldType.getName()) {
            case "int":
            case "java.lang.Integer":
                currMethod.invoke(obj, Integer.parseInt(objValue));
                break;
            case "long":
            case "java.lang.Long":
                currMethod.invoke(obj, Long.parseLong(objValue));
                break;
            case "double":
            case "java.lang.Double":
                currMethod.invoke(obj, Double.parseDouble(objValue));
                break;
            case "float":
            case "java.lang.Float":
                currMethod.invoke(obj, Float.parseFloat(objValue));
                break;
            case "boolean":
            case "java.lang.Boolean":
                currMethod.invoke(obj, Boolean.parseBoolean(objValue));
                break;
            case "char":
            case "java.lang.Character":
                currMethod.invoke(obj, objValue.charAt(0));
                break;
            case "java.lang.String":
//                System.out.println("String got");
                currMethod.invoke(obj, String.valueOf(objValue));
                break;
            default:
                throw new IllegalArgumentException("Unsupported field type:"+currFieldType.getName());
        }
    }

    public static boolean isNonObject(Class<?>type){
        return (type.isPrimitive() || type == String.class || WRAPPER_TYPES.contains(type));
    }
    
}
