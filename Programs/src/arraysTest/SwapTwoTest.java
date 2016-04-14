package arraysTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import arrays.SwapTwo;

public class SwapTwoTest {
	
	@Test
	public static void posNum(){
		int[] arr={1,2,6,5,4};
		int[] actual=SwapTwo.Swap(arr);
		int[] expected={1,2,4,5,6};
		Assert.assertEquals(actual, expected);
	}

	@Test
	public static void negNum(){
		int[] arr={-1,-2,-6,-5,-4};
		int[] actual=SwapTwo.Swap(arr);
		int[] expected={-6,-5,-4,-2,-1};
		Assert.assertEquals(actual, expected);
	}
	@Test
	public static void posNegNum(){
		int[] arr={-1,2,6,-5,-4};
		int[] actual=SwapTwo.Swap(arr);
		int[] expected={-5,-4,-1,2,6};
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public static void dupNum(){
		int[] arr={2,2,6,5,4};
		int[] actual=SwapTwo.Swap(arr);
		int[] expected={2,2,4,5,6};
		Assert.assertEquals(actual, expected);
	}
	

}
