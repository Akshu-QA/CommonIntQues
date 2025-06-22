package arrayInterviewProgs;

public class BubbleSortProg {

	public static void main(String[] args) {

		int a[] = { 64, 34, 25, 12, 11, 90 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int ref : a) {
			System.out.println(ref);
		}

	}

}
