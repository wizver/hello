package test;

public class HelloWorld {
	
	private void sayHello() {
		System.out.println("Hello World!");
		System.getProperties().list(System.out);
	}
	
	private void sayHello(String name) {
		System.out.println("Hello, " + name);
	}

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		
		hw.sayHello();
		hw.sayHello("wizver");
	}

}
