package day14;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class ObjToXml1 {

    private static final Set<Class<?>> WRAPPER_TYPES = new HashSet<>(Arrays.asList(
            Boolean.class,Character.class,Integer.class,Long.class,Float.class,Double.class));

    static String splitResult = "";

    static String recurString = "";

    public static String split(Object obj) throws IllegalAccessException {

        splitResult+=createStartTag(getRootTag(obj.getClass()));
        Class<?> cls = obj.getClass();
        Field classFields[] = cls.getDeclaredFields();

        for(Field currField : classFields){
//            currField.setAccessible(true);
            if(currField == null)continue;
            Object currObj = null;
            int modifier = currField.getModifiers();
            if(Modifier.isFinal(modifier) || Modifier.isTransient(modifier)){
                continue;
            }

            // in case of private accessPrivateField method is executed
            if(Modifier.isPrivate(modifier) || Modifier.isProtected(modifier)){
//                currField.setAccessible(true);
//                System.out.println("Private detected");
                currObj = accessPrivateField(currField,obj);
            }else{
                currObj = currField.get(obj);
            }

            Class<?> fieldType = currField.getType();
            if(isTagCreatable(fieldType)){
//                System.out.println("create element tag came in");
                splitResult+=createElementTag(currField,obj);
            }
            else if (List.class.isAssignableFrom(fieldType)) {

//                System.out.println("list came in");
//                currField.setAccessible(true);
//                System.out.println(currField.getType());
//                System.out.println(currObj.toString());
                List<?>currList = (List<?>) currObj;
                Object firstElementOfCurrList = currList.get(0);
                Class<?> firstListObjClass = firstElementOfCurrList.getClass();
                if(isTagCreatable(firstListObjClass)){
                    splitResult+=createStartTag(getRootTag(firstListObjClass));
                    for (Object listObj : currList) {
                        splitResult += createStartTag("item") + listObj + createEndTag("item");
                    }
                    splitResult+=createEndTag(getRootTag(firstListObjClass));
                }
                else{
//                    // should look more recursion problem
//                    recurString="";

                    for (Object listObj : currList) {
                        recurString+=split(listObj);
                    }
                    splitResult+=recurString;

                }
            }
            else{
                split(currObj);
            }
        }
        splitResult+=createEndTag(getRootTag(obj.getClass()));
//        System.out.println("splitResult = "+splitResult);
        return splitResult;
    }

    private static String getGetterMethodName(Field currField) {
        String currFieldName = currField.getName();
        String start = currFieldName.substring(0,1).toUpperCase();
        String end = currFieldName.substring(1);
        String getterMethodName = start+end;
        return "get"+getterMethodName;
    }

    //    public static String parseObject(Object obj) throws IllegalAccessException {
//        String objParsedResult = "";
//        objParsedResult+=createStartTag(getRootTag(obj.getClass()));
//        Class<?> cls = obj.getClass();
//        Field[] objFields = cls.getDeclaredFields();
//        for(Field currField : objFields){
//            Class<?> fieldType = currField.getType();
//            if(isTagCreatable(fieldType)){
//                objParsedResult+=createElementTag(currField,obj);
//            }
//            else{
//                currField.setAccessible(true);
//                Object fieldValue = currField.get(obj);
//                if(fieldValue != null){
//                    objParsedResult += parseObject(fieldValue);
//                }
//            }
//        }
//        System.out.println("objParsedResult = "+objParsedResult);
//        objParsedResult+=createEndTag(getRootTag(obj.getClass()));
//        return objParsedResult;
//    }
    public static Class<?> getTypeOfObject(Object obj){
        return obj.getClass();
    }
    public static Object accessPrivateField(Field f,Object obj){
        Object currObj =null;
        String getterMethodName = getGetterMethodName(f);
        Method getterMethod = null;
        try{
            getterMethod = obj.getClass().getDeclaredMethod(getterMethodName);
        }catch (NoSuchMethodException e){
            System.out.println(obj.getClass());
            System.out.println("There is no method as "+getterMethodName+" Please ensure to " +
                    "make a getter method the the given name");
        }
//                System.out.println(getterMethod);
        try{
            currObj = getterMethod.invoke(obj);
        }catch (NullPointerException | InvocationTargetException | IllegalAccessException e){
            System.out.println("The invoke aint working");
        }
        return currObj;
    }
    public static boolean isTagCreatable(Class<?>type){
        if(type.isPrimitive() || type == String.class || WRAPPER_TYPES.contains(type)){
            return true;
        }
        return false;
    }
    public static String createElementTag(Field f,Object obj) throws IllegalAccessException,NullPointerException {
//        System.out.println("Maybe mistake");
        int modifier = f.getModifiers();
        Object currObj = obj;
        if(Modifier.isPrivate(modifier) || Modifier.isProtected(modifier)){
            currObj = accessPrivateField(f,obj);
        }
        String res = "";
        Class<?>cls = currObj.getClass();
        String str = f.getName();
        res+=createStartTag(str);
        res+=String.valueOf(currObj);
        res+=createEndTag(str);
//        System.out.println("Create Ele Tag = "+res);
        return res;
    }
    public static String getRootTag(Class<?> cls){
        return cls.getSimpleName();
    }
    public static String createStartTag(String str){
        return "<"+str+">";
    }
    public static String createEndTag(String str){
        return "</"+str+">";
    }
}
