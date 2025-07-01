package collectionInterviewProgs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 4, 5, 5, 3, 3, 7, 7, 7, 8, 8, 9, 10, 1, 4 };

		Set<Integer> hs = new HashSet<Integer>();
		for (int ref : a) {
			hs.add(ref);
		}
		System.out.println("duplictes are remvoed from array a : " + hs);

	}
}
