package javaInterviewProg;

import java.util.HashMap;

public class ConvertintoRoman {

	public static void main(String[] args) {
		
		String str = "VII";
		int result = 0;
		int previousValue = 0;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		for (int i = str.length() - 1; i >= 0; i--) {

			char currentChar = str.charAt(i);

			int currentValue = hm.get(currentChar);
			if (currentValue >= previousValue) {
				result = result + currentValue;

			} else {
				result = result - currentValue;
				previousValue = currentValue;
			}
		}
		System.out.println(result);

	
		
	}

}
