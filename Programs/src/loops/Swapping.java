//1 c  c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   //--> One Function should swap the numbers without any third new variable.
      		// --> Second function should swap the numbers using a third variable.


package loops;

import java.util.Scanner;

public class Swapping {
	public static int[] method1(int arr[]){
		int temp=0;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		return arr ;
	}
	//swapping without using temp variable
	public static void method2(){
		int num1=2; int num2=3;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("The value of num1 is " +num1);
		System.out.println("The value of num2 is " +num2);	
	}
	//swapped the numbers by taking inputs from user
	public static void method3(){
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		System.out.println("Enter second number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int t=num;
		num=number;
		number=t;
		System.out.println("two numbers are swapped " +num +" " +number);
		
	}
	public static void main(String[] args) {
		int[] arr = {25,35};
		Swapping.method1(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//Swapping.method2();
		//Swapping.method3();
		
	}

}
