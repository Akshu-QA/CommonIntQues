package collectionInterviewProgs;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		String s = "swiss";
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

		for (Entry<Character, Integer> r : hm.entrySet()) {
			if (r.getValue() == 1) {
				System.out.println(r.getKey());
			}
		}

	}

}
