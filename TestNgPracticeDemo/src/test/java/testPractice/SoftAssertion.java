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
		System.out.println("");
	}
}
