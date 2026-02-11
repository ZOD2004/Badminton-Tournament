package day09;

public interface Inter1{
    void MakeNoise();
    default void Bark(){
        System.out.println("Barking from Inter1");
    }
}
