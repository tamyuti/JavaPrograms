package loopsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import loops.Swapping;

public class SwappingTest {
@Test
public void posNumSwap(){
	int[] arr = {25,35};
	int[] actual=Swapping.method1(arr);
	int[] expected={35,25};
	Assert.assertEquals(actual, expected);
}

@Test
public void negNumSwap(){
	int[] arr = {-25,-35};
	int[] actual=Swapping.method1(arr);
	int[] expected={-35,-25};
	Assert.assertEquals(actual, expected);
}

@Test
public void DupNumSwap(){
	int[] arr = {25,25};
	int[] actual=Swapping.method1(arr);
	int[] expected={25,25};
	Assert.assertEquals(actual, expected);
}
}
