package javaInterviewProg;

public class NumberReverse {

	public static void main(String[] args) {
		int num = 4512;
		int sum = 0, rem = 0, n;
		n = num;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		System.out.println("reverse of num " + num + " is : " + sum);

	}

}
