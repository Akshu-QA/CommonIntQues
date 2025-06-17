package collectionInterviewQues;

import java.util.HashMap;

public class Add2ArraysIn1HashMap {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7 };
		String s[] = { "a", "f", "r", "l" };

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		for (int i = 0; i < a.length; i++) {
			hm.put(a[i], s[i]);
		}
		System.out.println(hm);

	}

}
