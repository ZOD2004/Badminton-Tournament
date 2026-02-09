package day07;

public class ThrowExcep {

    public static int fun(int a,int b){
        try {
        	if(b == 0)
            throw new ArithmeticException("/ by zero");
        	else {
        		return a/b;
        	}
        }
        catch (ArithmeticException e) {
        	System.out.println("ON   Function ");
        }
		return a/b;
    }

    public static void main(String args[])
    {
    	System.out.println("Hi");
        try {
            fun(4,0);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught in main.");
        }
    }
}