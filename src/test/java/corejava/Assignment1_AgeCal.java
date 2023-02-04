package corejava;

public class Assignment1_AgeCal {
	public static void main(String[] args) {
		int age = 65;
		if (age > 0 && age <= 2) {
			System.out.println("infant");
		} else if (age > 2 && age <= 12) {
			System.out.println("Child");
		} else if (age > 12 && age <= 25) {
			System.out.println("youth");
		} else if (age > 25 && age <= 59) {
			System.out.println("adult");
		} else if (age > 59 && age <= 100) {
			System.out.println("senior citizen");
		} else {
			System.out.println("Please enter age greterthan ZERO[0] to lessthan 100");
		}
	}

}
