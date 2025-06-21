package javaInterviewProg;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		int num = 372;
		int rem = 0, sum = 0, n;
		n = num;

		while (n > 0) {
			rem = n % 10;
			sum = sum + rem * rem * rem;
			n = n / 10;
		}

		if (sum == num) {
			System.out.println("yes armsstrong number");
		} else
			System.out.println("not a armstrong number");

	}

}
