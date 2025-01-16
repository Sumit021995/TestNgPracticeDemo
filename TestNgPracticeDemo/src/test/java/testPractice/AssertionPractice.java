package testPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionPractice {
	@Test
	public void strictLevelHardAssertion()
	{
		String actualName="Sumit Saurav";
		String expectedName="Sumit";
		Assert.assertEquals(actualName,expectedName);
		Assert.assertEquals(actualName.equals(expectedName),true);
		System.out.println("Validation Ended");;
	}
}
