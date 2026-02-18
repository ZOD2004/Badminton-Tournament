package day14;

import day13.Address;
import day13.Department;
import day13.Employee;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Address add1 = new Address("1/2 mg nagar","hosur","63992");
        Address add2 = new Address("654/22 nehru nagar","coimbatore","67892");
        Department dept1=new Department(101,"IT","C","Ram",add1);
        Employee emp1 = new Employee("max", "k", 101, 5000.00,dept1,add1);
        Employee emp2 = new Employee("john", "p", 102, 6000.00,dept1,add2);

//        try{
//            ObjectToXml.convert(emp1);
////            ObjectToXml.use(emp2);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
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
        System.out.println(ObjectToXml.ObjectToXmlConversion(emp2));
    }
}
