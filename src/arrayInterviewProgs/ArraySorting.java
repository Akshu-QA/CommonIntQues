package arrayInterviewProgs;

import java.util.Arrays;

public class ArraySorting {

	static int a[] = { 99, 1, 3, 11, 51, 19 };

	static void normalSort() {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	static void logicSorting() {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		logicSorting();
	}

}
