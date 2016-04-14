
//1 a Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.
//You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number.



package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacii {
	
	public static List<Integer> calculation(int n){
		List<Integer> fibList=new ArrayList<Integer>();
		if(n<1){
			return fibList;
		}
		int n1=0; int n2=1; int n3=0;
		fibList.add(n1);
		
		if(n==1){
			return fibList;
		}
		fibList.add(n2);
		for(int i=1;i<=n-2;i++){
			n3=n1+n2;
			fibList.add(n3);
			n1=n2;
			n2=n3;
		}
		return fibList;
	}
	//Inputs from user 
	public static void calc(){
		int num1=0; int num2=1; int num3=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number" );
		int count=in.nextInt();
		for(int j=1;j<=count;j++){
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		in.close();
	}
	
public static void main(String[] args) {
	
	List list=Fibonacii.calculation(4);
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	
	//Fibonacii.calc();
	
}
}
