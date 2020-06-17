package test;

public class HelloWorld {
	
	private void sayHello() {
		System.out.println("Hello World!");
		System.getProperties().list(System.out);
	}

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		
		hw.sayHello();
	}

}
