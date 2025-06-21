package javaInterviewProg;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		int count = 0;
		int num = 21;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				count = count + 1;
			}
		}
		if (count == 0) {
			System.out.println("yes prime");
		} else {
			System.out.println("not prime");
		}
	}

}
