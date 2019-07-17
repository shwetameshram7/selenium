package ParameterPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param 
{
  @Test
  @Parameters({"Browser"})
  public void browserFunction(String BrowseName ) 
  {
	  
	  if(BrowseName.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\All old\\Selenium Jar\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Chrome launched");
		}
		
		else if(BrowseName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "D:\\All old\\Selenium Jar\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Firefox launched");
		}
  }
}
