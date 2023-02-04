package corejava;

public class DataTypes {

	public static void main(String[] args) {
		//byte a =127;
		//double a = 90.5467;
		//double b = 80.54654;
		float a = 90.5467f;
		float b = 80.54654f;
		System.out.println("Add Results is: " + (a + b));
		
		char d = 't';
		boolean e = true;
		
		String abc = "Selenium is automation tool";
		System.out.println(abc);
		//Length:Returns the length of this string. 
		String f = "Hi all";
		System.out.println(f.length());
		
		//Print 3th position character
		System.out.println(f.charAt(3));
		
		//Convert to Uppercase and Lowercase
		System.out.println(f.toUpperCase());
		System.out.println(f.toLowerCase());
	}
	
}
