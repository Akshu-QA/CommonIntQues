package collectionInterviewProgs;

import java.util.HashMap;

public class OccurencesOfCharInString {

	public static void main(String[] args) {
		String s = "Automation";
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
		for (char x : hm.keySet()) {
			System.out.println("repeated characters " + x + " are : " + hm.get(x));
		}
	}
}
/* logic for code
 * Let’s say s = "Automation":
 * 
 * First char: A → Not in map → hm.put('A', 1)
 * 
 * Second char: u → Not in map → hm.put('u', 1)
 * 
 * Third char: t → Not in map → hm.put('t', 1)
 * 
 * Fourth char: o → Not in map → hm.put('o', 1)
 * 
 * Fifth char: m → Not in map → hm.put('m', 1)
 * 
 * Sixth char: a → Not in map → hm.put('a', 1)
 * 
 * Seventh char: t → Already in map → hm.get('t') = 1 → hm.put('t', 2)
 * 
 */