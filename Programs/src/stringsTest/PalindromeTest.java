package stringsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import strings.Palindrome;

public class PalindromeTest {

	@Test
	public void palindrome(){
	String s="Bob";
	boolean isPalindrome=Palindrome.palindromeMethod(s);
	Assert.assertTrue(isPalindrome);
	}
	
	@Test
	public void notPalindrome(){
	String s="Bobby";
	boolean isPalindrome=Palindrome.palindromeMethod(s);
	Assert.assertFalse(isPalindrome);
	}
	
	@Test(expectedExceptions= NullPointerException.class)
	public void nullPalindrome(){
	String s=null;
	boolean isPalindrome=Palindrome.palindromeMethod(s);
	Assert.assertFalse(isPalindrome);
	}
	
	@Test
	public void numberPalindrome(){
	String s="123";
	boolean isPalindrome=Palindrome.palindromeMethod(s);
	Assert.assertFalse(isPalindrome);
	}
}
