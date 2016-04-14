//7 b. Write a program containing a function which is expected to throw any kind of exception say NullPointerException or ArithmeticException etc and then handle this function in the parent function which calls this function.
		
package exceptionHandling;

public class Exception2 {
	
	public static void Expression(){
		int a,b,c;
		a=10; b=0; c=0;
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args){
		
		try{
			Exception2.Expression();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		
	}
}
