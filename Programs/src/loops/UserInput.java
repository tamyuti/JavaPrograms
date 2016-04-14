//1 g. Write a program  that accepts input from the command line and then prints them.

package loops;

import java.util.Scanner;

public class UserInput {
	
	public static void getUserInput(){
		System.out.println("Enter your name");
		Scanner in=new Scanner(System.in);
		String name=in.next();
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		UserInput.getUserInput();
		
	}

}
