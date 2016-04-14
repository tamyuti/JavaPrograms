package arraysTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import arrays.MissingNum;

public class MissingNumTest {
	
@Test
	public void posMissingNum(){
	int a[] = { 2,3, 6 };
	List<Integer> actual=MissingNum.findMissingNumbers(a, 2, 6);
	List<Integer> expected=new ArrayList<Integer>(Arrays.asList(4,5));
	Assert.assertEquals(actual, expected);	
	}

@Test
public void negMissingNum(){
	int a[] = { -1};
	List<Integer> actual=MissingNum.findMissingNumbers(a, -2, -1);
	List<Integer> expected=new ArrayList<Integer>(Arrays.asList(-2));
	Assert.assertEquals(actual, expected);	
}

@Test
public void posNegMissingNum(){
	int a[] = {-1,1,2};
	List<Integer> actual=MissingNum.findMissingNumbers(a, -1, 2);
	List<Integer> expected=new ArrayList<Integer>(Arrays.asList(0));
	Assert.assertEquals(actual, expected);
}

@Test
public void duplicateMissingNum(){
	int a[] = {1,1,2};
	List<Integer> actual=MissingNum.findMissingNumbers(a, 1, 3);
	List<Integer> expected=new ArrayList<Integer>(Arrays.asList(3));
	Assert.assertEquals(actual, expected);
}

}
