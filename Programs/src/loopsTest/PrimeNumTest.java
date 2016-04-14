package loopsTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import loops.PrimeNum;


public class PrimeNumTest {
	
@Test
public void isprimeTest(){
	int num=5;
	boolean isPrime=PrimeNum.method1(num);
	Assert.assertTrue(isPrime);
}

@Test
public void isNotprimeTest(){
	int num=10;
	boolean isPrime=PrimeNum.method1(num);
	Assert.assertFalse(isPrime);
}

@Test
public void negPrimeTest(){
	int num=-10;
	boolean isPrime=PrimeNum.method1(num);
	Assert.assertFalse(isPrime);
}
}
