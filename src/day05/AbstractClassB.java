package day05;
public class AbstractClassB extends SmartPhone implements Camera{
	public static void main(String[] args) {
		AbstractClassB ab = new AbstractClassB();
		ab.start();//cls is given priority coz it wont damage the close relationship
	}
}
