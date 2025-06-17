package javaInterviewPrograms;

public class ReverseAString {

	static String rev = "";

	static void enterString(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse of String- " + s + "- is : " + rev);
	}

	public static void main(String[] args) {
		enterString("Ankit");

	}

}
