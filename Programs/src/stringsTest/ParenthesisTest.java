package stringsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import strings.Parenthesis;

public class ParenthesisTest{
	@Test 
	public void correctParenthesis() {
		String s="a(b+c)*(c+d)";
		boolean isCorrect=Parenthesis.parenthesisMethod(s);
		Assert.assertTrue(isCorrect);
	}

	@Test 
	public void wrongParenthesis() {
		String s="a(b+c)*(c+d))";
		boolean isCorrect=Parenthesis.parenthesisMethod(s);
		Assert.assertFalse(isCorrect);
	}

	@Test 
	public void openParenthesis() {
		String s="(";
		boolean isCorrect=Parenthesis.parenthesisMethod(s);
		Assert.assertFalse(isCorrect);
	}

	@Test 
	public void closeParenthesis() {
		String s=")";
		boolean isCorrect=Parenthesis.parenthesisMethod(s);
		Assert.assertFalse(isCorrect);
	}

	@Test 
	public void openCloseParenthesis() {
		String s="()";
		boolean isCorrect=Parenthesis.parenthesisMethod(s);
		Assert.assertTrue(isCorrect);
	}
}