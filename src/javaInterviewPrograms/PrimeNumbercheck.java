package javaInterviewPrograms;

import java.util.Scanner;

public class PrimeNumbercheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u want to check for prime");
		int num = sc.nextInt();

		int count = 0;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				count = count + 1;
			}
		}
		if (count == 0) {
			System.out.println("yes " + num + " is prime");
		} else {
			System.out.println("no " + num + " is not prime");
		}

	}

}
