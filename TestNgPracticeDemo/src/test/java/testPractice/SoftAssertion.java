package testPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void strictLevelSoftAssertion()
	{
		String expectedValue="hello";
		String actualValue="Hello";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		System.out.println("Before asserAll()");
		System.out.println("Validation ended");
		s.assertAll();
	}
	@Test
	public void containsLevelSoftAssertion()
	{
		String expectedValue="Patna";
		String actualValue="Patna city";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue.contains(expectedValue), true);
		System.out.println("Before asserAll() form 2nd Method");
		s.assertFalse(actualValue.contains(expectedValue));
		System.out.println("Validation ended");
		s.assertAll();
	}
}
