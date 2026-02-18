package day14;

import java.io.File;
import java.lang.reflect.Field;
import java.util.*;

public class ObjToXml1 {

    private static final Set<Class<?>> WRAPPER_TYPES = new HashSet<>(Arrays.asList(
            Boolean.class,Character.class,Integer.class,Long.class,Float.class,Double.class));
    static String splitResult = "";
    public static String split(Object obj) throws IllegalAccessException {


        splitResult+=createStartTag(getRootTag(obj.getClass()));
        Class<?> cls = obj.getClass();
        Field classFields[] = cls.getDeclaredFields();
        for(Field currField : classFields){
            if(currField == null)continue;
            currField.setAccessible(true);
            Class<?> fieldType = currField.getType();
            if(isTagCreatable(fieldType)){
                splitResult+=createElementTag(currField,obj);
            }
            else if (List.class.isAssignableFrom(fieldType)) {
//                System.out.println("list came in");
                currField.setAccessible(true);
                Object currObj = currField.get(obj);
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
                    for (Object listObj : currList) {
                        splitResult+=split(listObj);
                    }
                }
            }
            else{
                currField.setAccessible(true);
                split(currField.get(obj));
            }
        }
        splitResult+=createEndTag(getRootTag(obj.getClass()));
//        System.out.println("splitResult = "+splitResult);
        return splitResult;
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
    public static boolean isTagCreatable(Class<?>type){
        if(type.isPrimitive() || type == String.class || WRAPPER_TYPES.contains(type)){
            return true;
        }
        return false;
    }
    public static String createElementTag(Field f,Object obj) throws IllegalAccessException {
        String res = "";
        f.setAccessible(true);
        String str = f.getName();
        res+=createStartTag(str);
        res+=String.valueOf(f.get(obj));
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
