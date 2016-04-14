package arraysTest;


import org.testng.Assert;
import org.testng.annotations.Test;

import arrays.CommonNum;

public class CommonNumTest {
	@Test
	public void PositiveNumTest(){
		int a[]={25,5,30,18,2};
		int b[]={20,5,35,10,1};
		int actual=CommonNum.commonNumCalc(a, b);
		Assert.assertEquals(actual, 5);
	}
	
	@Test
	public void NegativeNumTest(){
		int a[]={-25,-5,-30,-18,-2};
		int b[]={-20,-5,-35,-10,-1};
		int actual=CommonNum.commonNumCalc(a, b);
		Assert.assertEquals(actual, -5);
	}
	@Test
	public void DuplicateNumTest(){
		int a[]={25,5,30,18,2,5};
		int b[]={20,5,35,10,1,5};
		int actual=CommonNum.commonNumCalc(a, b);
		Assert.assertEquals(actual, 5);

	}
	@Test
	public void PosNegNumTest(){
		int a[]={-25,-5,-30,18,2};
		int b[]={20,5,-35,10,1,-5};
		int actual=CommonNum.commonNumCalc(a, b);
		Assert.assertEquals(actual,-5);
	}
	

}
