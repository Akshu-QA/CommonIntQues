package collectionInterviewQues;

import java.util.HashMap;

public class OccurenceOFSingleCharacter {

	public static void main(String[] args) {

		String s = "Ankshu and Ankit are highest paid QA's ";
		char a[] = s.toCharArray();
		char p = 'a';

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char ref : a) {
			if (hm.containsKey(ref)) {
				int x = hm.get(ref);
				hm.put(ref, x + 1);
			} else {
				hm.put(ref, 1);
			}
		}
		int count = hm.getOrDefault(p, 0);
		System.out.println(p + "&" + count);

	}

}
