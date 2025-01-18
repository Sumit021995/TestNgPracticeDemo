package testPractice;

import org.testng.annotations.Test;

public class AnnotationsTestNG {
	
	@Test(priority=1)
	public void addUser()
	{
		System.out.println("User Added");
	}
	@Test(priority=2,dependsOnMethods= {"addUser"})
	public void modifyUser()
	{
		System.out.println("User Modified");
	}
	@Test(priority=3,dependsOnMethods= {"addUser"})
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
}
