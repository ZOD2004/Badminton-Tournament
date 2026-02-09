package day07;

import java.util.ArrayList;
import java.util.List;

public class Excep2 {
	public static  String function() throws NullPointerException{
		Student s1 = new Student();
//		String srt = s1.name;
		if(s1.name.equals("da")) {
			System.out.println("Error");
		}
		return "";
	}
	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			System.out.println(function());
		}catch(NullPointerException  | ArithmeticException e){ // multiple exception in single catch
			// cant assign value to e since its final and cant be changed
			System.out.println(e.getMessage());
		}finally {
			List<Integer>l = new ArrayList<>();
			System.out.println(l.get(0));
		}
		System.out.println("OUTSIDE");
	}
}
