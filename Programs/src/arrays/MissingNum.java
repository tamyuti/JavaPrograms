package arrays;

import java.util.ArrayList;
import java.util.List;


public class MissingNum {
	public static List findMissingNumbers(int[] a, int first, int last) {
		List<Integer> list=new ArrayList();
		for (int i = first; i < a[0]; i++) {
			list.add(i);
		
		}
		
		for (int i = 1; i < a.length; i++) {
			for (int j = 1+a[i-1]; j < a[i]; j++) {
				list.add(j);
				
			}
		}
		for (int i = 1+a[a.length-1]; i <= last; i++) {
			list.add(i);
			
		}
		return list;
		
	}
	public static void main(String[] args) {
		int a[] = { 2, 3, 6 };
		List<Integer> val=findMissingNumbers(a, 0, 6);
		for(Integer k:val){
			System.out.println(k);
		}
		

	}


	
}


