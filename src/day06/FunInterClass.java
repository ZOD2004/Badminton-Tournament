package day06;

@AnnotationExp(name  = "murali",age = 21 , role= "Experimenting")
public class FunInterClass{
	public static void main(String[] args) {
		FunInterface greeting = (name) -> "Hello, " + name;
		
		System.out.println(greeting.sayHello("Murali"));
		
		FunInterface2 inter2 = (a,b)->{
			for(int i=a;i<=b;i++) {
				System.out.println(i);
			}
		};
		inter2.fun(1, 10);
		//can be reused
//		FunInterface2 add = (a,b)-> System.out.println(a+b);;
		
		add.fun(10, 45);
		
		FunInterface.staticFun("Murali ");
		
//		FunInterface de = ()-> System.out.println("Hi from de");
		
		greeting.defaultFun();
		
		InterfaceAA aa = (a,b) ->  a*b;
		
		int mul = aa.fun(2, 4);
		System.out.println("mul = "+mul);
	}
}
