package day13;

import java.lang.reflect.*;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
//        Class<?>cls = null;
//        try{
//            cls = Class.forName("day13.Student");
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        Student s = new Student("Ram",21);
//        Class<?>cls = s.getClass();
//        Class<?>cls1 = Student.class;
//        try{
//            //to create a new instance with the type if its available
//            //to get access to spicific constructor
//            //search for cons para that holds Student(int,String)
//            Class<?>[] constructorParams = new Class<?>[]{Integer.TYPE, String.class};
//            //to get constructor
//            Constructor<?> constructor = cls.getConstructor(constructorParams);
//
//            Object instance = constructor.newInstance(42, "ramya");
//            System.out.println("this one"+instance);
//        }
//        catch(NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException |
//                InvocationTargetException | ClassCastException | NullPointerException e){
//            System.out.println(e.getMessage());
//        }

//        try{
//            Constructor<?>constructors[] = cls.getDeclaredConstructors();
//            for (Constructor<?> c : constructors){
//                System.out.println(c.toString());
//            }
//            Student s1 = (Student) cls.getDeclaredConstructor().newInstance("Ramya",21);
////            System.out.println(s1.toString());
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException |
//                 InvocationTargetException | ClassCastException | NullPointerException e) {
//            System.out.println("Exception : "+e.getMessage());
//        }

        Class<?> cls = Student.class;
//        Method[] methods = cls.getMethods();
//        for (Method m : methods) {
//            System.out.println(m.getName());
//        }

//        Method method = cls.getDeclaredMethod("sayHello", String.class);
//        // wont work because its already public reflection cannot chnage that
//        method.setAccessible(false);
//        Student s = new Student("Murali", 1);
//        // equals to s.sayHello("Murali");
//        method.invoke(s,"Murali");

//        Class<?> cls = Student.class;

//        System.out.println(cls.getName());
//        System.out.println(cls.getSuperclass());
//        System.out.println(Arrays.toString(cls.getInterfaces()));
//        System.out.println(Modifier.toString(cls.getModifiers()));
//
        Student s = new Student("Murali", 11);
        Field field = cls.getDeclaredField("name");
        if(field.isAnnotationPresent(CusAnno.class)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        field.setAccessible(true);
        Object val = field.get(s);
        System.out.println(val);
        field.setAccessible(true);

        field.set(s,"ChangedNameAlsoMine");
        System.out.println(field.get(s));

        Field f1=cls.getDeclaredField("password");
        if(f1.isAnnotationPresent(CusAnno.class)){
            CusAnno an = f1.getDeclaredAnnotation(CusAnno.class);
            System.out.println("Value "+an.value()+" priority "+an.priority());
        }






    }
}
