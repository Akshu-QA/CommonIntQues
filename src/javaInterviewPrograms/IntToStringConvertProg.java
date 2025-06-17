package javaInterviewPrograms;

public class IntToStringConvertProg {

	static void intToString(int a) {
		String s = Integer.toString(a);
		System.out.println("string value is: " + s);
	}

	static void stringToInt(String s) {
		int x = Integer.parseInt(s);
		System.out.println("int value of string is: " + x);
	}

	static void charToInt(char s) {
		int y = Integer.valueOf(s);
		System.out.println("int value of string is: " + y);
	}

	public static void main(String[] args) {
		intToString(190);
		stringToInt("123");
		charToInt('1');
	}

}
