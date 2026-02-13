package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ImmutableClass ic  =new ImmutableClass("Alex","hi");
//        ImmutableClass ic1  =new ImmutableClass("Kishore","Hello");
//        Immutability i =  Immutability.getInit(1,"Ram","It");
////        Immutability i1 =  Immutability.getInit(2,"Raja","It");//wont considered or throw error
//        try{
//            Immutability i1 =  Immutability.getInit(2,"Raja","It");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(ic.toString());
//        System.out.println(ic1.toString());
//        System.out.println(i.toString());
////        System.out.println(i1.toString());
//
//
////        OP
////        ImmutableClass{name='Alex', data='hi'}
////        ImmutableClass{name='Kishore', data='Hello'}
////        Immutability{id=1, name='Ram', role='It'}
////        Immutability{id=1, name='Ram', role='It'}
//
//        FunInter<Integer> add = ((a,b)->{
//            return Integer.valueOf(a.intValue() + b.intValue());
//        });
//
//        System.out.println(add.apply(10,10));
//
//        FunInter<Integer> div = (a,b)->{
//            return a/b;
//        };
//        try{
//            System.out.println(div.apply(10,0));
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//
//        MethodGen obj = new MethodGen() {
////            AnonymousClass
//            @Override
//            public <T extends Number> T apply(T a, T b) {
//                return a;
//            }
//        };
//
//        Integer res =  obj.apply(10,20);
//    ######################################Comparable

        Product p1 = new Product("lap",10.20d);
        Product p2 = new Product("comp",20.20d);
        Product p3 = new Product("mouse",22.20d);
        Product p4 = new Product("keyboard",11.20d);
        Product p5 = new Product("earphone",45.20d);
        Product p6 = new Product("charger",9.20d);

        List<Product>productList = Arrays.asList(p1,p2,p3,p4,p5,p6);

        //depends on campareTo method on Product class
        // it dynamically invokes when this Collections.sort(productList) is called
        Collections.sort(productList);
        for (Product p : productList){
            System.out.println(p.toString());
        }

    }



}
