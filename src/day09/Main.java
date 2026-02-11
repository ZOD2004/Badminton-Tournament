package day09;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        GrandFather gf = new Child("amy","stud",12,"None","Reading");
        System.out.println(gf.toString());

//        NOT POSSIBLE COZ CHILD VAriable IS MORE THEN THE GRANDFATHER
//        GRANDFATHER WILL NOT HAVE ALL FIELD AS CHILD
//        Child gf2 = new GrandFather("grand","old man",78,"uncle");
//        System.out.println(gf2.toString());

//        Child gf3 = new Father("Uncle","Working",45,"child","IT");

//                A Parent (Superclass) reference can hold a Child (Subclass) object.
//                A Child (Subclass) reference cannot hold a Parent (Superclass) object.
//                A Sibling reference cannot hold another Sibling object.
        Child gf4 = new Child("jane","Study",16,"None","Reading");

        if(gf4 instanceof GrandFather){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
        cat.eat();

        if(cat instanceof Cat c){//PATTERN MATCHING (giving c in if statement itself)
            c.cuddle();
        }
        Integer a[]=new Integer[]{1,2,3,4,5};
        java.util.List<Integer> list = Arrays.asList(a);
        Excep ex = new Excep();
        try{
            ex.someException();
        }catch(Exception e){
            System.out.println("In catch");
            System.out.println("In catch before");
            System.out.println(e.getMessage());
            System.out.println("In catch after");
        }

    }
}
