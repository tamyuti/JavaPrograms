package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
	ArrayList <Integer> list=new ArrayList<Integer>();
	public void method1(){
		list.add(5);
		list.add(15);
		list.add(10);
		list.add(2);
		list.add(50);
	}
	
	public void method2(){
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(10))
			System.out.println(list.get(i));
		}
	}
	public void method3(){
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			int element=it.next();
			System.out.print(element + " ");
		}
	}
	public void method4(){
		ListIterator<Integer> li=list.listIterator(list.size());
		
		while(li.hasPrevious()){
			int ele=li.previous();
			System.out.print(ele +" ");
		}
	}
	public static void main(String[] args) {
		List obj=new List();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

}
