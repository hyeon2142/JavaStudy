package chapter04;

public class MyClass {
	
	private static MyClass my = new MyClass();
	
	private MyClass() {
		
	}
	
	// Singleton + Factory Method
	
	public static MyClass getInstance() {
		
		if(my == null) {
			my = new MyClass();
		}
		
		return my;
		
	}
	
	

}
