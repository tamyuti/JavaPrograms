package loopsTest;

import loops.Divisible;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DivisibleTest {
@Test
	public void pingPongDiv(){
		String actual=Divisible.div(15);
		String expected="Ping Pong";
		Assert.assertEquals(actual, expected);
	}

@Test

public void pingDiv(){
	String actual=Divisible.div(10);
	String expected="Pong";
	Assert.assertEquals(actual, expected);
}
	
@Test
public void pongDiv(){
	String actual=Divisible.div(21);
	String expected="Ping";
	Assert.assertEquals(actual, expected);
	
}

@Test
public void noNumDiv(){
	String actual=Divisible.div(22);
	String expected="No Div";
	Assert.assertEquals(actual, expected);
}
@Test
public void negPingPongDiv(){
	String actual=Divisible.div(-15);
	String expected="Ping Pong";
	Assert.assertEquals(actual, expected);
}

}
