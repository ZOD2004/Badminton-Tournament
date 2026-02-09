package day06;

public class Main implements InterfaceAA{
	
	public static void main(String[] args) {
		Main m = new Main();
		m.defaultFun();
		FunInterface2 fun2 = (a,b)->{
			System.out.println("a = "+a+"b = "+b);
			return "DOne";
		};
		String str = fun2.fun(10,20);
		System.out.println(str);
	}

	@Override
	public int fun(int a, int b) {
		return a*b;
	}
	
}
