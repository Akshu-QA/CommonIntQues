package collectionInterviewProgs;

import java.util.HashMap;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String s = "ankit is highest paid QA";
		char a[] = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap();
		for (char ref : a) {
			if (hm.containsKey(ref)) {
				int x = hm.get(ref);
				hm.put(ref, x + 1);
			} else {
				hm.put(ref, 1);
			}
		}
		// System.out.println(hm);

		for (char r : hm.keySet()) {
			System.out.println("repeated words " + r + " are : " + hm.get(r));
		}
	}

}
