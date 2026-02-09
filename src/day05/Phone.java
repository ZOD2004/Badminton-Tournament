package day05;
interface Phone {
    default void start() { 
    	System.out.println("Phone on"); 
    }
}