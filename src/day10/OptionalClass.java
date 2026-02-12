package day10;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalClass {
    static  OptionalClass op=new OptionalClass();
    public static void main(String[] args) {
//        ****** creation*****
        String [] a = new String[]{"a","b","c"};
        String hi = "Print Hi Statement";
        String nullVal = null;

//         of gives NullPointerException if there is null or value present it gives the value inside optional array
//        cannot pass array in optional
//        Optional<String> opt = Optional.of("hi");
//        Optional<String> opt1 = Optional.of(null);
//        gives Optional[hi]
//        System.out.println(opt);
//        gives NullPointerException
//        System.out.println(opt1);

//        ######ofNullable
////        gives Optional[hi]
//        Optional<String> opt = Optional.ofNullable("hi");
////        gives Optional.empty
//        Optional<String> opt1 = Optional.ofNullable(null);
//        System.out.println(opt);
//        System.out.println(opt1.get());

        Optional<String> opt3 = Optional.of(hi);
////        gives Optional.empty
//        System.out.println(opt3);

////        ######isPresent
//        if(opt3.isPresent()){
//            System.out.println("opt3 is present"+opt3.get());
//        }
//        else{
//            System.out.println("opt3 is not present");
//        }
//
//        if(opt.isPresent()){
//            System.out.println("opt is present");
//        }
//        else{
//            System.out.println("opt is not present");
//        }

////        #####isEmpty
//        if(opt3.isEmpty()){
//            System.out.println("opt3 is empty");
//        }
//        else{
//            System.out.println("opt3 is not empty");
//        }
//
//        if(opt.isEmpty()){
//            System.out.println("opt is empty");
//        }
//        else{
//            System.out.println("opt is not empty");
//        }
        Consumer<String>print = (str)-> System.out.println(str);
        Consumer<String>upper = (str)->str.toUpperCase();
//        wont convert to upper coz consumer does not return anything
//        OP word
//        upper.andThen(print).accept("word");

//        to overcome use Function FunctionalInterface which takes 1 and gives 1
        Function<String,String>upperFun=(str)->str.toUpperCase();

//        wont happen due to no return
//        upperFun.andThen(print).apply("word");


//        crt form
////        print.accept(upperFun.apply("word"));
//        public void consumer(String st){
//            System.out.println(st);
//        }

////        #####ifPresent (Executes a consumer if a value is present.)
//        //op prints the statement
//        Optional<String> ifPresentOptional = Optional.ofNullable("print the satement");
//        //op show ntg in console (blank)
//        Optional<String> ifPresentOptional1 = Optional.ofNullable(null);
//        ifPresentOptional.ifPresent(print);
//        System.out.println(ifPresentOptional.get());
//        ######get
//        op print the satement
//        System.out.println(ifPresentOptional.get());
//        op .NoSuchElementException
//        System.out.println(ifPresentOptional1.get());

//        ######orElse(T other) No optional String in left side

//        // op Default WORD this is good
//        String str = Optional.ofNullable(nullVal).orElse("Default WORD");
//        System.out.println(str)
//        op NullPointerException this is bad .orElse waste
////        String str1 = Optional.of(nullVal).orElse("Default WORD");
//        System.out.println(str1);

//        #########orElseThrow
//
//        String str2 = Optional.ofNullable(hi).orElseThrow();
//        System.out.println(str2);
//        // dont even need to print if null comes by it throws NoSuchElementException
//        String str3 = Optional.ofNullable(nullVal).orElseThrow();

////        #########or
////        needs Supplier<Optional<String>> to replace(differance of orElse)
////        use lambda Supplier not to get every time just when not present
//        Optional<String>emp = Optional.empty();
//        Optional<String>defaultVal = Optional.ofNullable("Default Word");
//        Supplier<Optional<String>> sup = ()->Optional.of("Supplier Word");
//        Optional<String> result = emp.or(sup);
//        System.out.println(result.get());

////        #########filter(checks if the value inside the box meets a specific condition (the Predicate))
//        // even on null and below 5 result in same Optional.empty
//        // or result the word
//        Optional<String> word = Optional.ofNullable("hi");
//        Predicate<String> above5 = (str)-> str.length()>=5;
//        //gets optional
//        Optional<String> opt1= word.filter(above5);
//        String str = Optional.ofNullable(hi).orElse("Default WORD");
//        //why string and not optional string
//        String result = word
//                .filter(above5)
//                .orElse("Too Short");
//
//        System.out.println(result);
//        #######MAP((transform the value inside the box without actually taking it out))
        //gets optional in left
        //on null throw NullPointerException on using Function
        // return result
//        Optional<String>opt = Optional.ofNullable(nullVal);
//        Function<String,Integer>getLen = (str)->str.length();
//        Optional<Integer> len = opt.map(getLen);
//        System.out.println(len);
//
//        String nullName = null;
//        Function<String,String>trim = (str)->str.trim();
//        Optional<Integer> result = Optional.ofNullable(nullName)
//                .map(trim)     // Skipped if null or processed
//                .map(getLen);  // Skipped same reason
//        System.out.println(result);


    }

}
