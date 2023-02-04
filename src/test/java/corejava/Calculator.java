package corejava;

public class Calculator {
	public static void add() {
		
		int a = 90;
		int b = 80;
		//System.out.println(a+b);
		System.out.println("add Results is : " + (a + b));
	}
	
	public static void sub() {
		int a = 90;
		int b = 80;
		//System.out.println(a+b);
		System.out.println("sub Results is : " + (a - b));
	}
	

	public static void main(String[] args) {
		System.out.println("Hi Main Method");
		// Method call
		add();
		sub();
	}

}
