package arraysTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import arrays.SortArray;

public class SortArrayTest {

	@Test
	public void posSort(){
		int a[]={50,20,10,30,15};
		int[] actual=SortArray.sortArrayMethod(a);
		int[] expected={10,15,20,30,50};
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void NegSort(){
		int a[]={-50,-20,-10,-30,-15};
		int[] actual=SortArray.sortArrayMethod(a);
		int[] expected={-50,-30,-20,-15,-10};
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void PosNegSort(){
		int a[]={-50,20,-10,30,-15};
		int[] actual=SortArray.sortArrayMethod(a);
		int[] expected={-50,-15,-10,20,30};
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void SameNumSort(){
		int a[]={50,20,10,30,15,10};
		int[] actual=SortArray.sortArrayMethod(a);
		int[] expected={10,10,15,20,30,50};
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void Empty(){
		int a[]={};
		int[] actual=SortArray.sortArrayMethod(a);
		int[] expected={};
		Assert.assertEquals(actual, expected);
	}
}
