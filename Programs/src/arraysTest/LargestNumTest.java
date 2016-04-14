package arraysTest;

import org.testng.Assert;

import org.testng.annotations.Test;

import arrays.LargestNum;


public class LargestNumTest {
	@Test
	public void posNumTest(){
		int a[]={12,10,25,5,18,30};
		int actual=LargestNum.findLargestNum(a);
		Assert.assertEquals(actual, 30);
	}

	@Test
	public void negNumTest(){
		int a[]={-12,-10,-25,-5,-18,-30};
		int actual=LargestNum.findLargestNum(a);
		Assert.assertEquals(actual, -5);
	}

	@Test
	public void posNegNumTest(){
		int a[]={12,-10,-25,-5,18,-30};
		int actual=LargestNum.findLargestNum(a);
		Assert.assertEquals(actual, 18);
	}
	
	@Test
	public void sameNumTest(){
		int a[]={12,10,25,5,18,30,30};
		int actual=LargestNum.findLargestNum(a);
		Assert.assertEquals(actual, 30);
	}



}
