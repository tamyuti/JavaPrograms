//3 f. Write a program to check if a given string of parenthesis has balanced parenthesis or not.
//For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings.

package strings;

import java.util.Stack;

public class Parenthesis {
	
	public static boolean parenthesisMethod(String s){
		boolean isCorrect=true;
		
		char[] c=s.toCharArray();
		Stack stack=new Stack();
		for(int i=0;i<c.length;i++){
			if(c[i]=='('){
				stack.push(1);
			}
			else if(c[i]==')'){
				if(stack.isEmpty()){
					isCorrect=false;
					break;
				}
				stack.pop();
			}
		}
		if(stack.isEmpty()&& isCorrect){
			isCorrect=true;
			
		}
		else{
			isCorrect=false;
		
		}
		return isCorrect;
	}
	public static void main(String[] args) {
		
		String s="a(b+c)*(c+d))";
		boolean isCorrect=Parenthesis.parenthesisMethod(s);
		if(isCorrect==true){
			System.out.println("Parenthesis is right!!!");
		}
		else{
			System.out.println("Parenthesis is wrong!!!");
		}
		
	}
}
