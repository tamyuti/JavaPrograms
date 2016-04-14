package stringsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import strings.Implementation;

public class ImplementationTest {
@Test
public void equalTest(){
	String s1="Java";
	String s2="Java" ;
	boolean isEqual=Implementation.implement(s1,s2);
	Assert.assertTrue(isEqual);
}

@Test
public void notEqualTest(){
	String s1="Jav";
	String s2="Java" ;
	boolean isEqual=Implementation.implement(s1,s2);
	Assert.assertFalse(isEqual);
}
}
