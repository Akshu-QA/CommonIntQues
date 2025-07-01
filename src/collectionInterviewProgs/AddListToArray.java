package collectionInterviewProgs;

import java.util.ArrayList;

public class AddListToArray {

	public static void main(String[] args) {
		
      int a []= {1,2,0,6,7,8};
		
		//convert array into list 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int value :a) {
			list.add(value);			
		}
		//convert list into array 
		
		int[]arrayfromlist = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			arrayfromlist[i]=list.get(i);
		}
		System.out.println("list" +list);
		System.out.println("array");
		
		for(int ref: arrayfromlist) {
			System.out.println(ref);
		}

	}

	}


