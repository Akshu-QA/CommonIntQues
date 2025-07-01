package javaInterviewProg;

import java.util.Arrays;

public class ReverseOnlyLetter {

	public static void main(String[] args) {
String str= "12java21";
		
		char arr[]=str.toCharArray();
		
		int left=0;
		int right=str.length()-1;
		while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
		}		
		System.out.println("output:" +Arrays.toString(arr));		
	

	}

}
