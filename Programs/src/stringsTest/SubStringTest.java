package stringsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import strings.SubString;

public class SubStringTest {
@Test
	public static void Test1(){
		String str="Ram is good boy";
		String actual=SubString.subStringMethod(str);
		String expected="Ram is bad boy";
		Assert.assertEquals(actual, expected);
	}

@Test
public static void Test2(){
	String str="bad Ram is good boy";
	String actual=SubString.subStringMethod(str);
	String expected="bad Ram is bad boy";
	Assert.assertEquals(actual, expected);
}

@Test
public static void Test3(){
	String str="good Ram is good boy";
	String actual=SubString.subStringMethod(str);
	String expected="bad Ram is bad boy";
	Assert.assertEquals(actual, expected);
}

}
