/*4 a. Write a program that takes input from user dynamically using below classes.
 			--> Scanner: Use this class to input 2 integer numbers and sum them.
   			--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
   			--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
  			--> Console: Use this class to input 2 integer numbers and divide them.*/
package file;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FileUserInput {
	public class division{
	int a; int b;
	public void divi(){
		System.out.println("enter integer");
		Console console=System.console();
		
	}
		
}
	public static int sum(){
		int a; int b;
		System.out.println("Enter first num");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		System.out.println("Enter second number");
		Scanner scan=new Scanner(System.in);
		b=scan.nextInt();
		return a+b;		
	}
	public static int sub() throws IOException{
		int a; int b;
		System.out.println("Enter first num");
		InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        a=br.read();
        System.out.println("Enter second num");
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(is);
        b=BR.read();
		return a-b;
	}
	
	public static int mul() throws IOException{
		
		/*System.out.println("Enter first num");
		InputStream d = DataInputStream(InputStream d);
		//a=d.readInt();
		 */
		System.out.println("Enter first num");
		DataInputStream DIS=new DataInputStream(System.in);
		StringBuffer inputLine = new StringBuffer();
        String tmp = "";
        tmp = DIS.readLine();
        inputLine.append(tmp);
       
		
		System.out.println("Enter second num");
		DataInputStream dIS=new DataInputStream(System.in);
		StringBuffer inputLine1 = new StringBuffer();
        String tmp1 = ""; 
       dIS.readLine();
       inputLine1.append(tmp1);
        
		
		
        return Integer.parseInt(tmp)*Integer.parseInt(tmp1);
		
	}
	public static int div(){
		String s; String s1; int a,b;
		try{
		System.out.println("enter first num");
		Console c=System.console();
		s=c.readLine();
		a = Integer.parseInt(s);
		System.out.println("enter second num");
		Console con=System.console();
		s1=con.readLine();
		b=Integer.parseInt(s1);
		}
		catch(Exception e){
			System.out.println("catch");
		}
		return a/b;
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		//System.out.println("Sum is " +FileUserInput.sum());
		//System.out.println("Difference is "+FileUserInput.sub());
		//System.out.println("Multiplication is "+FileUserInput.mul());
		System.out.println("Multiplication is "+FileUserInput.div());
		
	}

}
