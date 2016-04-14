package oopTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import oop.Circle;

public class PolyTest {

@Test
	public void posTest(){
		Circle c=new Circle();
		c.radius=2;
		double actual=c.calculatePerimeter();
		double expected=12.56;
		Assert.assertEquals(actual, expected);
		double actualArea=c.calulateArea();
		double expectedArea=12.56;
		Assert.assertEquals(actualArea, expectedArea);
	}

@Test
public void zeroTest(){
	Circle c=new Circle();
	c.radius=0;
	double actual=c.calculatePerimeter();
	double expected=0;
	Assert.assertEquals(actual, expected);
	double actualArea=c.calulateArea();
	double expectedArea=0;
	Assert.assertEquals(actualArea, expectedArea);
}

@Test
public void oneTest(){
	Circle c=new Circle();
	c.radius=1;
	double actual=c.calculatePerimeter();
	double expected=6.28;
	Assert.assertEquals(actual, expected);
	double actualArea=c.calulateArea();
	double expectedArea=3.14;
	Assert.assertEquals(actualArea, expectedArea);
}

@Test
public void negTest(){
	Circle c=new Circle();
	c.radius=-2;
	double actual=c.calculatePerimeter();
	double expected=-12.56;
	Assert.assertEquals(actual, expected);
	double actualArea=c.calulateArea();
	double expectedArea=12.56;
	Assert.assertEquals(actualArea, expectedArea);
}
}
