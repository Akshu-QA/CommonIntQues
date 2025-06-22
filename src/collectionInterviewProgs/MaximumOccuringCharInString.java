package collectionInterviewProgs;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumOccuringCharInString {

	public static void main(String[] args) {

		String s = "programming";
		char a[] = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char ref : a) {
			if (hm.containsKey(ref)) {
				int x = hm.get(ref);
				hm.put(ref, x + 1);
			} else {
				hm.put(ref, 1);
			}
		}
		char b = s.charAt(0);
		int count = 0;
		for (char x : hm.keySet()) {
			if (hm.get(x) > count) {
				count = hm.get(x);
				b = x;
			}
		}
		System.out.println(b);

	}

}
