package corejava;

public class ArraySample {

	public static void main(String[] args) {

		// int i = 12,13,14,15;
		// String a = "Hi","hello","how are you?";
		// String a[] = {"Hi","hello","how are you?"};

		String[] a = { "Hi", "hello", "how are you?" };
		System.out.println(a.length);
		// print 2nd position value in a array
		// System.out.println(a[Index]);
		System.out.println(a[2]);

		int b[] = { 12, 34, 3, 56, 75465, 23432, 1, 3, 5, 6 };
		System.out.println(b.length);
		System.out.println(b[6]);

		// print all array values using for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("***************");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("***************");

		// print all array values using FOREACH / ADVANCED FOR LOOP/ ENHANCED FOR LOOP
		for (String i : a) {
			System.out.println(i);
		}


	}

}
