package corejava;

public class ConditionalStatements {

	public static void main(String[] args) {
		int a = 90;
		int b = 8790;
		int c = 908758;

		// find the Large Value
		if (a > b && a > c) {
			System.out.println("A is large value");
		} else if (b > a && b > c) {
			System.out.println("B is large value");
		} else if (c > b && c > a) {
			System.out.println("C is large value");
		} else {
			System.out.println("All are equal***");
		}

	}

}
