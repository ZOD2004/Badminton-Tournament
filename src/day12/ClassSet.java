package day12;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClassSet {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("banana");
        set1.add("apple");
        set1.add("grape");
        set1.add("orange");
        // no duplicate
        set1.add("apple");

        // Null allowed only one null
        set1.add(null);

        System.out.println("HashSet"+set1);
        set1.remove("banana");
        System.out.println("After removing "+set1);

        System.out.println("Contains apple?"+set1.contains("apple"));
        for (String fruit : set1) {
            System.out.println(fruit);
        }

        Set<String> set2 = new LinkedHashSet<>();

        set2.add("banana");
        set2.add("apple");
        set2.add("grape");
        set2.add("orange");

        // maintians insertion order
        System.out.println(set2);
        set2.add("apple");
        System.out.println(set2);
        // it gose to the last acc to insertion order
        set2.remove("banana");
        set2.add("banana");
        System.out.println("remove and add banana"+set2);

        TreeSet<String> set4 = new TreeSet<>();

        set4.add("banana");
        set4.add("apple");
        set4.add("grape");
        set4.add("orange");

        System.out.println(set4);

        set4.add("apple");
        System.out.println(set4);

        // NullPointerException
        // set4.add(null);

        System.out.println("1st element:"+set4.first());
        System.out.println("Last element: "+set4.last());

        Set<Integer> numbersHash = new HashSet<>();
        Set<Integer> numbersLinked = new LinkedHashSet<>();
        Set<Integer> numbersTree = new TreeSet<>();
    }
}

