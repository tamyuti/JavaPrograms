package stringsTest;

import org.testng.Assert;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

import strings.AcceptString;

public class AcceptStringTest {

	@Test
	public void singleStringTest(){
		String str="This";
		String actual=AcceptString.acceptStringMethod(str);
		String expected="This1";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test
	public void StringTest(){
		String str="This is nice";
		String actual=AcceptString.acceptStringMethod(str);
		String expected="This1 is2 nice3";
		Assert.assertEquals(actual, expected);
		
	}
	
	
	@Test
	public void mulitpleStringTest(){
		String str="This is nice. I am learning Java.";
		String actual=AcceptString.acceptStringMethod(str);
		String expected="This1 is2 nice.3 I4 am5 learning6 Java.7";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void nullStringTest(){
		String str=null;
		String actual=AcceptString.acceptStringMethod(str);
		String expected=null;
		Assert.assertEquals(actual, expected);
		
	}

}
