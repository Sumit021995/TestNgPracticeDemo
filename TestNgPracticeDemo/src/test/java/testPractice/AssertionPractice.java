package testPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionPractice {
	@Test(priority=1)
	public void strictLevelHardAssertion()
	{
		String actualName="Sumit Saurav";
		String expectedName="Sumit";
		Assert.assertEquals(actualName,expectedName);
		Assert.assertEquals(actualName.equals(expectedName),true);
		System.out.println("Validation Ended");;
	}
	@Test(priority=2)
	public void containsLevelHardAssertion()
	{
		String actualName="don";
		String expectedName="London";
//		Assert.assertTrue(actualName.contains(expectedName));
		Assert.assertTrue(expectedName.contains(actualName));
//		Assert.assertEquals(actualName.equals(expectedName),true);
		System.out.println("Validation Ended");;
	}
}
