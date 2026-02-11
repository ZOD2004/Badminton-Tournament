package day09;

public interface Inter3 {
    void Bark();
    static void staticMethod(){
        System.out.println("Static Method from Inter3");
    }
    default void wagTail(){
        System.out.println("Wagtail from Inter 3");
    }
}
