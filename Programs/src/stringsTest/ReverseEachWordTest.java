package stringsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import strings.ReverseEachWord;

public class ReverseEachWordTest {

@Test
	public static void Test1(){
		String s="book";
		String actual=ReverseEachWord.reverseEachWordMethod(s);
		String expected="koob";
		Assert.assertEquals(actual,expected);
	}

@Test
public static void Test2(){
	String s="This is my book";
	String actual=ReverseEachWord.reverseEachWordMethod(s);
	String expected="sihT si ym koob";
	Assert.assertEquals(actual,expected);
}
	
@Test
public static void Test3(){
	String s="book.";
	String actual=ReverseEachWord.reverseEachWordMethod(s);
	String expected=".koob";
	Assert.assertEquals(actual,expected);
}
}
