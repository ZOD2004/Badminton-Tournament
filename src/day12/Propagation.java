package day12;

public class Propagation {
    public static void main(String[] args) {
//        try {
//            methodA();
//        } catch (Exception e) {
//            System.out.println("Handled in Main");
//        }

        System.out.println(testMethod());
    }

    public static int testMethod() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    static void methodA() throws Exception {
        try{
            methodB();
        } catch (Exception e) {
            System.out.println("method a");
        }
    }

    static void methodB() throws Exception {
        throw new Exception("Error from B");
    }
}