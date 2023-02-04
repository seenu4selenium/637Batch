package corejava;

public class StringsSample {
	public static void main(String[] args) {
		String abc = "Selenium is automation tool";
		System.out.println(abc);
		// Length:Returns the length of this string.
		String f = "Hi all";
		System.out.println(f.length());

		// Print 3th position character
		System.out.println(f.charAt(3));

		// Convert to Uppercase and Lowercase
		System.out.println(f.toUpperCase());
		System.out.println(f.toLowerCase());

		String a = "VAnI";
		String b = "vanI";
		// equal(): System will verify each char on String[upper case / lowercase]
		if (a.equals(b)) {
			System.out.println("Both the Strings are matching");
		} else {
			System.out.println("Both the Strings are NOT matching");
		}

		// equalsIgnoreCase(): System will verify each char on String is matching or
		// not, not consider cases[upper/lowercase]
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Both the Strings are matching**");
		} else {
			System.out.println("Both the Strings are NOT matching**");
		}
		// contains
		String c = "Hi All, How are you?";
		if (c.contains("are you")) {
			System.out.println("Given text has presents on screen");
		} else {
			System.out.println("Given text has NOT presents on screen");
		}

	}
}
