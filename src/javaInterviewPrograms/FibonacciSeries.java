package javaInterviewPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		System.out.print(a);
		System.out.print(" ");
		int b = 1;
		System.out.print(b);
		for (int i = 2; i <= 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" ");
			System.out.print(c);
		}

	}

}
