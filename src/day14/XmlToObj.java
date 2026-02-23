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
//    private static Set<String>CLASS_INSIDE_XML = new HashSet<>();
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        String str = "<Address><street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode></Address>";
        String str2="<Employee><empFirstName>john</empFirstName><empLastName>p</empLastName><empId>102</empId><empSalary>6000.0</empSalary><Department><deptId>101</deptId><deptName>IT</deptName><block>C</block><manager>Ram</manager><Address><street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode></Address></Department><Address><street>654/22 nehru nagar</street><city>coimbatore</city><zipCode>67892</zipCode></Address></Employee>";
        String str1 = "<Employee><empFirstName>max</empFirstName><empLastName>k</empLastName><empId>101</empId><empSalary>5000.0</empSalary><Department><deptId>101</deptId><deptName>IT</deptName><block>C</block><manager>Ram</manager><Address><street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode></Address></Department><Address><street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode></Address></Employee>";
        String xml = removeRootTag(str);
        String empXml = removeRootTag(str2);
//        System.out.println(empXml);
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
//        Address a = new Address();
//        Address a1 = new Address();
//        Object createdObj = new Address();
        Employee e1 = new Employee();
//        try{
//            createdObj = basicXmlToObj(xml,a);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(createdObj);

        System.out.println(split(empXml,e1));


    }
    public static int findStartAngular(String xml){
        return xml.indexOf(">")+1;
    }
    public static int findLastEndAngular(String xml){
        return xml.lastIndexOf("</");
    }
    public static String removeRootTag(String str){
        int startAngular = findStartAngular(str);
        int lastAngular = findLastEndAngular(str);
        return  str.substring(startAngular,lastAngular);
    }
//    public static void intializeClassInsideXmlSet(Object [] objs){
//        for(Object obj:objs){
//            Class<?>cls = obj.getClass();
//            CLASS_INSIDE_XML.add(cls.getSimpleName());
//        }
//        System.out.println(CLASS_INSIDE_XML);
//    }
    public static String getFullTagBlock(String xml,String tag){
//        System.out.println("I did ig "+tag+" the xml = "+xml);
        String startTag="<"+tag+">";
        String endTag="</"+tag+">";
        int startIndex = xml.indexOf(startTag)+1;
        int endIndex = xml.indexOf(endTag, startIndex);
        endIndex += endTag.length();
        return xml.substring(startIndex, endIndex);
    }
    public static Object split(String xml,Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<?> cls = obj.getClass();
        Field[]fields = cls.getDeclaredFields();
        for (Field f : fields){
            Class<?> fieldType = f.getType();
            Method currMethod = cls.getDeclaredMethod(getSetterMethodName(f.getName()),f.getType());;
            if(!isNonObject(fieldType)){
//                System.out.println("Object came in");
                Object nestedObj = fieldType.getDeclaredConstructor().newInstance();
                String nestedXml = getFullTagBlock(xml,f.getType().getSimpleName());
//                System.out.println("nestedXml = "+nestedXml);
                split(nestedXml, nestedObj);
                currMethod.invoke(obj, nestedObj);
                xml = xml.replace(nestedXml,"");

            }
            else{
                setField(currMethod,obj,f.getType(),getValueOutOfTag(xml,f.getName()));
            }
        }
//        System.out.println(obj);
        return obj;
    }


//    public static boolean checkIfObjPresent(String xml)
    public static String getValueOutOfTag(String xml,String fieldName){
        int start = xml.indexOf("<"+fieldName+">")+fieldName.length()+2;
        int end = xml.indexOf("</"+fieldName+">");
        return xml.substring(start,end);
    }
//    public static Object basicXmlToObj(String xml,Object obj) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Class<?> cls = obj.getClass();
//        Object returnObj = obj;//cls.getDeclaredConstructor().newInstance();
//            //can not do using constructor
//        Constructor constructor = cls.getConstructor(cls,);
//        while(xml != null && xml.length()>1){
//            int startInd = 0;
//
//            while(xml.charAt(startInd) != '<'){
//                startInd++;
//            }
//
//            int endInd = startInd+1;
//            while(xml.charAt(endInd) != '>'){
//                endInd++;
//            }
//            System.out.println("currString ");
//            String currString = xml.substring(startInd+1,endInd);
//            System.out.println(currString);
//            int trueEndIndex = xml.indexOf("/"+currString);
//
//            String objValue = xml.substring(endInd+1,trueEndIndex-1);
//
//            System.out.println(objValue);
//
//            String setterMethodName = getSetterMethodName(currString);
//            Field currField = cls.getDeclaredField(currString);
//            Method currMethod = cls.getDeclaredMethod(setterMethodName);
//            Method currMethod = cls.getDeclaredMethod(getSetterMethodName(currString), currField.getType());
//            System.out.println("Current Method :"+currMethod.getName());
//
//
//            System.out.println("Current field : "+currField.getName());
//            currField.setAccessible(true);
//            System.out.println("The call : "+currField.getName());
//            Class<?> currFieldType = currField.getType();
//            System.out.println("reached");
//            setField(currMethod,returnObj,currFieldType,objValue);
//
//            xml = xml.substring(trueEndIndex+currString.length()+1);
//            System.out.println(xml);
//        }
//        return returnObj;
//    }
    private static String getSetterMethodName(String currFieldName) {
        String start = currFieldName.substring(0,1).toUpperCase();
        String end = currFieldName.substring(1);
        String getterMethodName = start+end;
        return "set"+getterMethodName;
    }

    public static void setField(Method currMethod,Object obj,Class<?>currFieldType,String objValue) throws IllegalAccessException, InvocationTargetException {
        currMethod.setAccessible(true);
//        System.out.println("setField "+objValue);
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
        }
    }

    public static boolean isNonObject(Class<?>type){
        return (type.isPrimitive() || type == String.class || WRAPPER_TYPES.contains(type));
    }
    
}