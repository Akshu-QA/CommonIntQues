package arrayInterviewProgs;

public class LeaderPrograme {

	public static void main(String[] args) {
		
		// right side element is greater than left element 
		
		//int arr[]= {16,17,4,3,5,2}
         int arr [] = {1,1,2,2,3,3,1,0};
		int length = arr.length;
		int maxRight=arr[length-1];
		
		System.out.println(maxRight);
		
		for(int i=length-2;i>=0;i--) {
			if(arr[i]>maxRight) {
				maxRight=arr[i];
				System.out.println(maxRight);
			}
		}


	}

}
