package priorityCheck;

import org.testng.annotations.Test;

public class priorityCheck 
{
	
  @Test(priority=-1)
  public void priorityCheck() 
  {
	  System.out.println("Constructor exceuted");
  }
  
  @Test(priority=-2)
  public void function() 
  {
	  System.out.println("function exceuted");
  }
  
}
