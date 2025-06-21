package javaInterviewProg;

import java.util.Scanner;

public class FactorialNumber {

	static int num;
	static int fact = 1;

	static int enterNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u want factorial of ");
		return num = sc.nextInt();
	}

	static void factorailLogic() {
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
	}

	static void printFactorial() {
		System.out.println(fact);
	}

	public static void main(String[] args) {
		enterNum();
		factorailLogic();
		printFactorial();
	}

}
