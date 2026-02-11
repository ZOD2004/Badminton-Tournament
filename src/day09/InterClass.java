package day09;

public class InterClass extends Child implements Inter1,Inter2,Inter3{
    @Override
    public void wagTail(){
        System.out.println("Waging Tail");
    }

    @Override
    public void Bark() {
        System.out.println("A aloud Bark");
    }

    @Override
    public void MakeNoise() {
        System.out.println("Barking continuously");
    }
    public static void main(String[] args){
        System.out.println("hi");
        InterClass ic = new InterClass();
        ic.Bark();
        ic.MakeNoise();
        ic.wagTail();
        Inter3.staticMethod();
    }
}
