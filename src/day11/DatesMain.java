package day11;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class DatesMain {
    public static void main(String[] args) {
//        LocalDateTime currentDate = LocalDateTime.now();
//        System.out.println(currentDate);
//        LocalDateTime ofMethod = LocalDateTime.of(2026, Month.JANUARY,02,10,02);
//        System.out.println(ofMethod);
////        LocalDateTime parsed = LocalDateTime.parse("2023-10-27");
////        System.out.println(parsed);
//        System.out.println(LocalDateTime.now().getChronology());
//        System.out.println(LocalDateTime.now().getDayOfWeek());
//        System.out.println(LocalDateTime.now().getHour());


        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i", "j"));

        // comparator
        Comparator<String> desc = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        Consumer<String> cons = (a)-> System.out.println(a);

        Comparator<String> asc = new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        List<String>res = listOfLists.stream()
                .flatMap((list)->list.stream())
                .map((a)->a.toUpperCase())
//                .sorted(Comparator.reverseOrder())
                .peek(cons)
                .sorted(desc)// my comparator
                .peek((a)-> System.out.println(a))
//                .sorted(Collections.reverseOrder())
                .sorted(asc)
                .peek(cons)
                .sorted(desc)
                .collect(Collectors.toList());

        System.out.println(res);

    }

}
