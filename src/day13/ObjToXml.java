package day13;

import java.lang.reflect.Field;

public class ObjToXml {
    public static <T> String convert(T obj) throws IllegalAccessException {
        String curr="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n";
        Class<?>cls = obj.getClass();
        String rootTag = cls.getSimpleName();
        createStartTag(rootTag);
        Field[] fields = cls.getDeclaredFields();
        for(Field f:fields){
            f.setAccessible(true);
            curr+=createTag(f,obj);
        }
        createEndTag(rootTag);
        return curr;
    }
    public static String createTag(Field f,Object obj) throws IllegalAccessException {

        String res = "";
        res += createStartTag(f.getName());
        res+=String.valueOf(f.get(obj));
        res += createEndTag(f.getName());
        return res;

    }
    public static String createStartTag(String str){
        return "<"+str+">";
    }
    public static String createEndTag(String str){
        return "</"+str+">";
    }
}
