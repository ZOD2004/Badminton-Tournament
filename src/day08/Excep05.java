package day08;

import java.util.ArrayList;
import java.util.List;

public class Excep05 {
    public static void fun(String str) throws Exception{

        System.out.println(str.length());
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            System.out.println("Start");
            list.get(6);
            System.out.println("End");
        }catch (Exception e){

        }
        finally {
            System.out.println("Finally ..");
        }
        String str=null;
        System.out.println("outside");
        try{
            fun(str);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
