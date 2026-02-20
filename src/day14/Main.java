package day14;

import day13.ObjToXml;
import day13.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Address add1 = new Address("1/2 mg nagar","hosur","63992");
        Address add2 = new Address("654/22 nehru nagar","coimbatore","67892");
        Department dept1=new Department(101,"IT","C","Ram",add1);
        Employee emp1 = new Employee("max", "k", 101, 5000.00,dept1,add1);
        Employee emp2 = new Employee("john", "p", 102, 6000.00,dept1,add2);
        Student s1 = new Student("01", "Alice", 20, "Cse", "a");
        Student s2 = new Student("02", "Bob", 22, "it", "b");
        Student s3 = new Student("03", "ram", 21, "eee", "r");
        List<Student>studs = new ArrayList<>(Arrays.asList(s1,s2,s3));
//        CheckList cl = new CheckList();
        List<String>l = new ArrayList<>();
        l.add("os");
        l.add("dsa");
        l.add("bda");
        l.add("m1");
//        cl.setList(l);
//        List<?>checkLi = cl.getList();
////        System.out.println(checkLi);
        List<Integer>list1 = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8));
        WrapperListCheck wlc = new WrapperListCheck("mu",21,"IT",l);
        CheckList cl = new CheckList(studs);
        CheckList cl1 = new CheckList(list1);
//        System.out.println(cl.getEmpList());
        try{
            //TODO: to make the function work correctly on one variable try to introduce local variable and passing
//            works while Result is static
            System.out.println(ObjToXml1.split(emp1));
//            System.out.println(ObjToXml1.split(emp2));
//            System.out.println(ObjToXml1.split(add1));
//            System.out.println(ObjToXml1.split(wlc));

//            works while Result is non static
//            System.out.println(ObjToXml1.split(cl));
//            System.out.println(ObjToXml1.split(cl1));

//            ObjToXml1.split(emp2)
//            ObjToXml1.split(add1)
//            ObjToXml1.split(cl)
//            ObjToXml1.split(wlc)

//            ObjToXml1.split(cl);
//            ObjectToXml.convert(emp1);
//            ObjectToXml.printRes();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//
//
//        try(FileOutputStream fos = new FileOutputStream("output.txt")){
//            byte[] bytes = ObjectToXml.getRes().getBytes();
//            fos.write(bytes);
//            System.out.println("data written");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        ObjectToXml.printRes();
//        System.out.println(ObjectToXml.ObjectToXmlConversion(emp2));

//        CheckList cl = new CheckList();
//        List<String>l = new ArrayList<>();
//        l.add("os");
//        l.add("dsa");
//        l.add("bda");
//        l.add("m1");
//        cl.setList(l);
//        List<?>checkLi = cl.getList();
//////        System.out.println(checkLi);
//        ObjToXml1.spilt(cl);
    }
}
