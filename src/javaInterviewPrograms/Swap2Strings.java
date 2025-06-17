package javaInterviewPrograms;

public class Swap2Strings {

	public static void main(String[] args) {

		String a = "ankit";
		String b = "pawar";

		a = a + b;

		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
