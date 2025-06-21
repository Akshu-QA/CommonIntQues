package javaInterviewPrograms;

import java.util.Scanner;

public class REverseString {

	static String s;
	static String rev = "";

	static String enterString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string you want to reverse");
		return s = sc.nextLine();
	}

	static void reverseLogic() {
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
	}

	static void printReverseString() {
		System.out.println("reverse of string " + s + " is : " + rev);
	}

	static void palindromeCheck() {
		if (s.equals(rev)) {
			System.out.println("yes palidrome");
		} else
			System.out.println("not palindrome");
	}

	public static void main(String[] args) {
		enterString();
		reverseLogic();
		printReverseString();
		palindromeCheck();

	}

}
