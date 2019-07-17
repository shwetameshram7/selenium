package Groups_1;

import org.testng.annotations.Test;

public class GroupClass1 
{

	@Test (groups = { "smokeTest", "functionalTest" })
	
	 public void loginTest(){
	 System.out.println("Logged in successfully");
	 }
}
