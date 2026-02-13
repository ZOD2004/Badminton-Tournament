package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String nullval = null;
        list.add("hi");
        list.add(null);
        list.add(nullval);
        list.add("reborn");
        list.add("capability");
        list.add("i");
        list.add("perform");
        list.add("food");
        list.add("am");
        list.add("");
        list.add("");
        list.add("break");

        Predicate<String> isNull = (a)->a!=null;
        Predicate<String> belowThree = (a)->a.length()>=3;
        Function<String,String> trim = (str)->str.trim();
        Function<String,String> upper =String::toUpperCase;
        List<String>res= list.stream()
                .filter(isNull).
                map(trim).
                filter(belowThree).
                map(upper).
                collect(Collectors.toList());
        System.out.println(res);




    }
}
