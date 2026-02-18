package day14;

import java.lang.reflect.Field;
import java.util.*;

public class ObjectToXml  {
    static StringBuilder result = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");

    private static final Set<Class<?>> WRAPPER_TYPES = new HashSet<>(Arrays.asList(
            Boolean.class,Character.class,Integer.class,Long.class,Float.class,Double.class));

    private static final Set<Class<?>> LIST_TYPES = new HashSet<>(Arrays.asList(HashSet.class, LinkedHashSet.class,
    TreeSet.class,ArrayList.class,Vector.class,List.class));


    public static <T> String ObjectToXmlConversion(T obj) throws IllegalAccessException {

        Class<?> cls = obj.getClass();
        String curr ="\n";
        curr += createStartTag(getRootTag(cls));
        Field[] fields = cls.getDeclaredFields();
        for(Field f:fields){
            Class<?>type = f.getType();
            if(isTagCreatable(type)){
                curr+=(createElementTag(f,obj));
            }else if(List.class.isAssignableFrom(type)){
                f.setAccessible(true);
                Object val = f.get(obj);
                List<?> list = (List<?>) val;
                for(Object i : list){
                    curr+=ObjectToXmlConversion(i);
                }
            }
            else{
                f.setAccessible(true);
                Object value = f.get(obj);
                curr+= ObjectToXmlConversion(value);
            }
        }
        curr+=createEndTag(getRootTag(cls));
        curr+="\n";
        return curr;
    }

    public static boolean isTagCreatable(Class<?>type){
        return (type.isPrimitive() || type == String.class || WRAPPER_TYPES.contains(type));
    }

    public static String createElementTag(Field f,Object obj) throws IllegalAccessException {
        String res = "";
        f.setAccessible(true);
        String str = f.getName();
        res+=createStartTag(str);
        res+=String.valueOf(f.get(obj));
        res+=createEndTag(str);
        return res;
    }

    public static String createStartTag(String str){
        return "<"+str+">";
    }
    public static String createEndTag(String str){
        return "</"+str+">";
    }

    public static void printField(Field[] fields,Object obj) throws IllegalAccessException {
        for(Field f:fields){
            f.setAccessible(true);
            System.out.print(f.getName());
            Object val = f.get(obj);
            System.out.println(" type  = "+f.getType());
            System.out.println(" = "+val);
        }
    }
    public static String getRootTag(Class<?> cls){
        return cls.getSimpleName();
    }

    public static void printRes(){
        System.out.println(result.toString());
    }
    public static String getRes(){
        return result.toString();
    }
    public static <T extends Object> void convert(T obj) throws IllegalAccessException {
        result.append(ObjectToXmlConversion(obj));

    }

}
