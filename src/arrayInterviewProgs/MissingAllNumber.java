package arrayInterviewProgs;

import java.util.*;

public class MissingAllNumber {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 4, 7, 10};
        
        // Store all array elements in HashSet for fast lookup
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr) {
            hs.add(num);
        }
        
        // Find max value in the array
        int max = Arrays.stream(arr).max().getAsInt();
        
        System.out.println("Missing elements:");
        for (int i = 1; i <= max; i++) {
            if (!hs.contains(i)) {
                System.out.println(i);
            }
        }
    }

}
