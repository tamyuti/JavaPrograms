//1 d
// Write a program  to calculate factorial of a given number. You need to compute the factorial with one logic that uses recursion and another logic without recursion.
package loops;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n){
		int f=1;
		
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
	}
	/*Factorial that uses recursion
	 public static int facto(int n){
		//int f=1;
		//System.out.println("Enter number to be factorial");
		//Scanner in=new Scanner(System.in);
		//n=in.nextInt();
		if(n==1){
			return 1;
		}
		
		int	output=facto(n-1)*n;
		return output;
		
		
	}*/
	public static void main(String[] args) {
		System.out.println(Factorial.fact(4));
		/*int factorial=facto(4);
		System.out.println(factorial);*/
		
		
	}

}
