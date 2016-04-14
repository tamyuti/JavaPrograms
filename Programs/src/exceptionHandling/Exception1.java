//7 a. Write a program that is expected to throw a null pointer exception and in turn handles it using try catch and finally.
package exceptionHandling;


public class Exception1 {

	public static void main(String[] args) {
		try{
			Integer num=null;
			int x=num+2;
			System.out.println(x);
		}
		catch(NullPointerException n){
			n.printStackTrace();
		}
		finally{
			System.out.println("Exiting program");
		}
	}
}
