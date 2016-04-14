package stringsTest;

import org.testng.Assert;
import org.testng.annotations.Test;


import strings.ReverseString;

public class ReverseStringTest {

	@Test
	public static void test1(){
		String str="This is my book";
		String actual=ReverseString.reverseStringMethod(str);
		String expected="koob ym si sihT";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public static void test2(){
		String str="book";
		String actual=ReverseString.reverseStringMethod(str);
		String expected="koob";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public static void test3(){
		String str="";
		String actual=ReverseString.reverseStringMethod(str);
		String expected="";
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions= NullPointerException.class)
	public static void test4(){
		String str=null;
		String actual=ReverseString.reverseStringMethod(str);
		String expected=null;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public static void test5(){
		String str="123my book";
		String actual=ReverseString.reverseStringMethod(str);
		String expected="koob ym321";
		Assert.assertEquals(actual, expected);
	}
}
