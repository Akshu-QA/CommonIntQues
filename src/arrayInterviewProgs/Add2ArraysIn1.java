package arrayInterviewProgs;

public class Add2ArraysIn1 {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5 };
		int b[] = { 2, 4, 6 };
		int c[] = new int[a.length + b.length];

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);

		for (int ref : c) {
			System.out.println(ref);
		}
	}

}
