package arraysTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import arrays.Merge;

public class MergeTest {
@Test
	public void PosMerge(){
	int a[]={5,20,15};
	int b[]={2,10,35};
	int actual[]=Merge.mergeNum(a, b);
	int[] expected={5,20,15,2,10,35};
	Assert.assertEquals(actual, expected);
}

@Test
public void NegMerge(){
	int a[]={-5,-20,-15};
	int b[]={-2,-10,-35};
	int actual[]=Merge.mergeNum(a, b);
	int[] expected={-5,-20,-15,-2,-10,-35};
	Assert.assertEquals(actual, expected);
}

@Test
public void PosNegMerge(){
	int a[]={-5,20,-15};
	int b[]={2,10,-35};
	int actual[]=Merge.mergeNum(a, b);
	int[] expected={-5,20,-15,2,10,-35};
	Assert.assertEquals(actual, expected);
}
@Test
public void DoubleNumMerge(){
	int a[]={5,20,15};
	int b[]={5,10,-35};
	int actual[]=Merge.mergeNum(a, b);
	int[] expected={5,20,15,5,10,-35};
	Assert.assertEquals(actual, expected);
}
@Test
public void Empty(){
	int a[]={};
	int b[]={};
	int actual[]=Merge.mergeNum(a, b);
	int expected[]={};
	Assert.assertEquals(actual, expected);
}
}
