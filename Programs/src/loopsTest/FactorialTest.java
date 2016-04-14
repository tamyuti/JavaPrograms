package loopsTest;

import loops.Factorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

	@Test
	public static void PosNumTest(){
		int actual=Factorial.fact(4);
		int expected=24;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public static void oneNumTest(){
		int actual=Factorial.fact(1);
		int expected=1;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public static void zeroNumTest(){
		int actual=Factorial.fact(0);
		int expected=1;
		Assert.assertEquals(actual, expected);
	}
	
	
}
