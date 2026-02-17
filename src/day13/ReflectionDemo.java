package day13;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionDemo {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        System.out.println("HI");
        Student s = new Student("101", "Murali", 21, "It");
        Class<?>cls = s.getClass();
//        Field field = cls.getDeclaredField("name");
////        System.out.println(field.getName());// gives name as op return field name
//        field.setAccessible(true);
//        System.out.println("old name:"+field.get(s));
//        field.set(s,"Prasath");
//        System.out.println("new name: "+field.get(s));


//        Field[] fields = cls.getDeclaredFields();
//
//        for(Field f:fields){
//            System.out.println("Field Name : "+f.getName());
//            System.out.println("Type of Field: "+f.getType());
//        }

//        Field courseField = cls.getDeclaredField("courses");
//        courseField.setAccessible(true);
//        List<String> newCourses = new ArrayList<>();
//        newCourses.add("os");
//        newCourses.add("dsa");
//        newCourses.add("bda");
//        newCourses.add("m1");
//        System.out.println("old course:"+courseField.get(s));
//        courseField.set(s,newCourses);
//        System.out.println("new course: "+courseField.get(s));


//        // even works on final
//        // not recommended
//        Field f = cls.getDeclaredField("rollNo");
//        f.setAccessible(true);
//        f.set(s,"102");
//
//        //with package
//        System.out.println(cls.getName());
//
//        //with no package
//        System.out.println(cls.getSimpleName());
//
//        Field [] fs = cls.getDeclaredFields();
////        Field f2 = cls.getDeclaredField();
//        for (Field i : fs){
//            System.out.println(i.getName());
//            System.out.println(i.getType());
//            System.out.println(i.getGenericType());
//        }

//        Field field = cls.getDeclaredField("rollNo");
//        int mod = field.getModifiers();
//        System.out.println(Modifier.toString(mod));

//        Method getRollMethod = cls.getMethod("getRollNo");
//
//
//        Method gradAgeMethod = cls.getMethod("findGraduationAge");
//        int result = (int) gradAgeMethod.invoke(s);
//        System.out.println("Graduation Age: "+result);
//
//        Method setMethod = cls.getMethod("setName", String.class);
//        System.out.println(setMethod.getName());
//
//        System.out.println(setMethod.getDeclaringClass());
//
//        System.out.println(setMethod.getModifiers());

//        setMethod.setAccessible(true);
//        setMethod.invoke(s,"Prasath");
//        System.out.println("changed Name: "+s.getName());
//        Class<?>anClass = AnnotationClass.class;
//        if(anClass.isAnnotationPresent(SuppressWarnings.class)){
//            System.out.println("SuppressWarnings is present");
//        }
////        only RetentionPolicy.RUNTIME can be fetched
//        Annotation[] annotations = anClass.getAnnotations();
//        System.out.println("Annotations:"+Arrays.toString(annotations));


//        Constructor cons[] =cls.getDeclaredConstructors();
//        Object obj = cls.getDeclaredConstructor().newInstance();

//        Class<?> cls1=Student.class;
//        Constructor<?> constructor=cls1.getDeclaredConstructor(String.class,String.class,Integer.class,String.class);
//        Object obj=constructor.newInstance("104","Main",21,"CSE");
//        System.out.println(obj);


    }
}
