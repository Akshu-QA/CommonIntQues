package collectionInterviewProgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		// remove the duplicates from this array
		int a[] = { 21, 19, 19, 5, 5, 7, 7, 99, 72, 72, 63, 54, 54, 92, 501 };

		Arrays.sort(a);

		HashSet<Integer> hs = new LinkedHashSet();
		for (int ref : a) {
			hs.add(ref);
		}

		for (int ref : hs) {
			System.out.print(ref + " ");
		}

	}

}
