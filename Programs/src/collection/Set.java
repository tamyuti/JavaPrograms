package collection;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		int[] arr={25,15,30,25,50,50};
		HashSet<Integer> set=new HashSet<Integer>();		
		for(Integer i:arr){
			if(!set.add(i)){
				System.out.println("Duplicate element is: "+i) ;
			}
			
		}
		
	}
}
