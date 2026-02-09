package day07;

import java.util.List;


public class Main {
	public static void main(String[] args) {
		GenericA<Integer> intType = new GenericA<>();
		intType.set(100);
		System.out.println(intType.get());
//		intType.set("string");//error only int allowed
		//String
		GenericA<String> stringType = new GenericA<>();
		stringType.set("100 as a string");
		System.out.println(intType.get());
		
		//Multiple Parameter
		
		MulGen<String,Integer> gen1 = new MulGen<>();
		
		gen1.put("Hi",10);
		
		System.out.println(gen1.getKey());
		
		System.out.println(gen1.getValue());
		
		System.out.println(gen1.getValueByKey("Hi"));
		
		//mulgen with obj instance variable
		
//		MulGen<Student.id,String>stuGen = new MulGen<>(); // Not possible can just keep wrapper cls
		
//		OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(...)); // this is fine
		
		double result = intType.add(10, 20);
		double result2 = stringType.add(10.5, 4.5);
		
		System.out.println("res = "+result);
		System.out.println("Res2 = "+result2);

		
	}


}
