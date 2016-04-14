package collection;

import java.util.ArrayList;

public class Copy {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("first");
	list.add("second");
	list.add("third");
	String[] arr=new String[list.size()];
	list.toArray(arr);
	for(String s:arr){
		System.out.println(s);
	}
	
}
}
