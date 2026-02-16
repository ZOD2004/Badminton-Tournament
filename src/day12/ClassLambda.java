package day12;

public class ClassLambda implements Lambda{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String concat(String a, String b) {
        return a+b;
    }

    @Override
    public String greet(String a) {
        return "Hello "+a;
    }

    @Override
    public void printInt(int a) {
        System.out.println("The int "+a);
    }
}
