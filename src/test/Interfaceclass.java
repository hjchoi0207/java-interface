package test;

public class Interfaceclass implements InterfaceA, InterfaceB {

	public static void main(String[] args) {

	}

	@Override
	public void funcA() {
		System.out.println("--- funcA() ---");
	}
	
	
	@Override
	public void funB() {
		System.out.println("--- funcB() ---");
	}


}
