package day06;

@FunctionalInterface
public interface InterfaceAA {
	public default void defaultFun() {
		System.out.println("InterfaceAA defaultFun");
	}
	public int fun(int a,int b);
}
