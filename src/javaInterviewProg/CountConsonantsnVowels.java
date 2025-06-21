package javaInterviewProg;

public class CountConsonantsnVowels {

	public static void main(String[] args) {

		String s = "Automation";
		char a[] = s.toCharArray();
		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E'
					|| a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
				vowelCount++;

			} else
				consonantCount++;

		}
		System.out.println("Total vowels are: " + vowelCount);

		System.out.println("Total consonants are: " + consonantCount);

	}

}
