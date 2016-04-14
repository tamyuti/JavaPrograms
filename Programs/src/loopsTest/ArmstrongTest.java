package loopsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import loops.Armstrong;

public class ArmstrongTest {
	@Test
	public void numArmstrong(){
		int n=153;
		boolean num=Armstrong.calcArmstrong(n);
		Assert.assertTrue(num);
	}

	@Test
	public void numNotArmstrong(){
		int n=248;
		boolean num=Armstrong.calcArmstrong(n);
		Assert.assertFalse(num);
	}
	@Test
	public void negNumArmstrong(){
		int n=-153;
		boolean num=Armstrong.calcArmstrong(n);
		Assert.assertFalse(num);
	}
	@Test
	public void zeroNumArmstrong(){
		int n=0;
		boolean num=Armstrong.calcArmstrong(n);
		Assert.assertTrue(num);
	}
	@Test
	public void oneNumArmstrong(){
		int n=1;
		boolean num=Armstrong.calcArmstrong(n);
		Assert.assertTrue(num);
	}
	@Test(expectedExceptions=NullPointerException.class)
	public void nullNumArmstrong(){
		int n=(Integer) null;
		boolean num=Armstrong.calcArmstrong(n);
		Assert.assertFalse(num);
	}
}
