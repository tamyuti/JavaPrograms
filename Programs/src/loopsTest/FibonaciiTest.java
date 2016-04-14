package loopsTest;
import java.util.Arrays;
import java.util.List;

import loops.Fibonacii;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FibonaciiTest {
@Test
public void posFib(){
	List<Integer> actual=Fibonacii.calculation(4);
	List<Integer> expected=Arrays.asList(0,1,1,2);
	Assert.assertEquals(actual, expected);
}

@Test
public void negFib(){
	List<Integer> actual=Fibonacii.calculation(-1);
	List<Integer> expected=Arrays.asList();
	Assert.assertEquals(actual, expected);
}

@Test
public void zeroFib(){
	List<Integer> actual=Fibonacii.calculation(0);
	List<Integer> expected=Arrays.asList();
	Assert.assertEquals(actual, expected);
}

@Test
public void oneFib(){
	List<Integer> actual=Fibonacii.calculation(1);
	List<Integer> expected=Arrays.asList(0);
	Assert.assertEquals(actual, expected);
}
}
