package arrayInterviewProgs;

import java.util.Arrays;

public class LargestEleArray {

	public static void main(String[] args) {

		// largest element in array
		int a[] = { 1, 44, 7, 35, 79 };
		/// ararys sorted
		Arrays.sort(a);
		System.out.println("sorted arrays is: " + Arrays.toString(a));
		System.out.println("largest element in array is: " + a[a.length - 1]);
		System.out.println("second largest element in array is: " + a[a.length - 2]);
		System.out.println("third largest element in array is: " + a[a.length - 3]);

	}

}
