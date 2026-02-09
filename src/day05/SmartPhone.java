package day05;

class SmartPhone implements Camera, Phone {
	@Override
	public void start() {
		System.out.println("smart phone");
	}
}
