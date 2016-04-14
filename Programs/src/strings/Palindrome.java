//3 e. Write a program to check for a palindrome string.

package strings;

public class Palindrome {
	public static boolean palindromeMethod(String s){
		boolean isPalindrome=false;
		String ls=s.toLowerCase();
		String reverse="";
		for(int i=ls.length()-1;i>=0;i--)
		{
			reverse=reverse+ls.charAt(i);

		}
		if(ls.equals(reverse)){
			isPalindrome=true;

		}
		else{
			isPalindrome=false;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		String s="Bob";
		boolean isPalindrome=Palindrome.palindromeMethod(s);
		if(isPalindrome==true){

			System.out.println("String is Palindrome String");
		}
		else{

			System.out.println("String is not Palindrome String");
		}


	}

}