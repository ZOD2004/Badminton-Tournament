package day06;

@FunctionalInterface
public interface FunInterface {
	String sayHello(String name);
	
	public static void staticFun(String name) {
		System.out.println("hi "+name);
	}
	
	public default void defaultFun() {
		System.out.println("Default Called");
	}
}