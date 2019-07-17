package Groups_1;

import org.testng.annotations.Test;

public class GroupClass2 
{
	@Test (groups = { "functionalTest" })
	public void composeMail()
	{
		System.out.println("Mail Sent");
	}
}
