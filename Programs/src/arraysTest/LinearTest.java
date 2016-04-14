package arraysTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import arrays.Linear;

public class LinearTest {
	
	@Test
	public void numInArray(){
		int a[]={15,31,12,40,50};
		int actual=Linear.LinearSearch(a);
		int expected=2;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void numNotInArray(){
		int a[]={15,31,18,40,50};
		int actual=Linear.LinearSearch(a);
		int expected=-1;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void negNumArray(){
		int a[]={-15,-31,-12,-40,-50};
		int actual=Linear.LinearSearch(a);
		int expected=-1;
		Assert.assertEquals(actual, expected);
	}

}
