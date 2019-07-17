package TestCase;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepository.LoginRep;
import Utility.ExcelRead;

public class Login_1 
{
	WebDriver driver=null;
	@FindBy(how=How.XPATH,using="//*[@id='email']") WebElement name1;
	
	@BeforeTest
	public void driverIni() 
	{
		try 
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");///for browser popup handle		
			System.setProperty("webdriver.chrome.driver", "D:\\All old\\Selenium Jar\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			System.out.println("done 1");	
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("");
		}	
	}
	
	@Test(dataProvider="getData")///called data provider
	public void loginFun1(String username, String password) 
	{
		try 
		{			
			driver.findElement(LoginRep.name).sendKeys(username);
			driver.findElement(LoginRep.password).sendKeys(password);	
			driver.findElement(LoginRep.button).click();
			Thread.sleep(2000);
			System.out.println("login done");		
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
	}
	@DataProvider
	public Object[][] getData() throws Exception
	{
		ExcelRead er= new ExcelRead();
		System.out.println("");
		return er.read("D:\\Read.xlsx", "Sheet1");
		
	}
	
	/*@Test
	public void morevalueSelection() throws Exception
	{	

		Thread.sleep(2000);
		driver.findElement(LoginRep.profile).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//		wait.until(ExpectedConditions.elementToBeClickable((driver.findElement(LoginRep.moreOption))));		
//		for(int i=0;i<5;i++) 
//		{
//			Actions act= new Actions(driver);
//			act.moveToElement(driver.findElement(LoginRep.moreOption)).click().build().perform();
//			System.out.println("acted");
//		}			
		try 
		{
		    WebElement ele = driver.findElement(LoginRep.moreOption);
		    ele.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement ele = driver.findElement(LoginRep.moreOption);
		    ele.click();
		    System.out.println("more option clicked");
		}
		System.out.println("more option clicked end method");
		
		List<WebElement> ele = driver.findElements(LoginRep.hovertext);
		System.out.println(ele.size());
		
		for(WebElement element : ele) 
		{
			String elementText = element.getText();
			if(elementText.equalsIgnoreCase("videos")) 
			{
				System.out.println("got videos");
				element.click();
				//act.moveToElement(element).click().build().perform();;
				
			}
			else 
			{
				System.out.println("not got videos");
			}
			
		}
		
	}
*/
	@Test
	public void timelineFunction() 
	{
		driver.findElement(LoginRep.profile).click();
		driver.findElement(LoginRep.timeline).click();
		System.out.println("timelineee");	
	}
	
	@AfterTest
	public void finalAction() 
	{
		try 
		{
			driver.findElement(LoginRep.dropLogout).click();
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.presenceOfElementLocated(LoginRep.logoutButton));
			driver.findElement(LoginRep.logoutButton).click();
			driver.quit();
		}
		catch (Exception e) 
		{
			e.getMessage();
			System.out.println("");
		}
	}

}
