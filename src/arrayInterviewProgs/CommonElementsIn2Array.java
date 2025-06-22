package arrayInterviewProgs;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsIn2Array {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9 };
		int b[] = { 1, 2, 3, 4, 5, 6, 8, 9, 0 };

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int ref : a) {
			hs.add(ref);
		}

		for (int ref1 : b) {
			if (hs.contains(ref1)) {
				System.out.println(ref1);
			}
		}

	                    }

}
