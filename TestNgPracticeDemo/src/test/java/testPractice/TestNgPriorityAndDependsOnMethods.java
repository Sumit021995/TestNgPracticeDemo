package testPractice;

import org.testng.annotations.Test;

public class TestNgPriorityAndDependsOnMethods {
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("User Created");
	}
	@Test(priority=2,dependsOnMethods= {"createuser"})
	public void updateUser()
	{
		System.out.println("User Updated");
	}
	@Test(priority=3,dependsOnMethods= {"createuser"})
	public void deleteUser()
	{
		System.out.println("User Updated");
	}
}
