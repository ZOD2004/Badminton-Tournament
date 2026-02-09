package day07;

public class Excep {
	public static void main(String[] args) {
		int a[]=new int[5];
		Student s1 = null;
		try {
			int b = a[6];
//			System.out.println(s1.id);//put another try catch for this
			try {
				System.out.println(s1.id);
			}catch(NullPointerException e) {
				System.out.println("Nestedcatch");
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
//			e.printStackTrace();
			System.out.println("Null pointer block");
			int b = a[10];
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception block");
		}
//		System.out.println("After null pointer Exception");
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("OUTSIDE");
	}
}
