package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginRep 
{
	public static By name= By.xpath("//*[@id='email']");
	public static By password =By.xpath("//*[@id='pass']");
	public static By button = By.xpath("//input[@type='submit']");
	public static By dropLogout = By.xpath("//*[@id='userNavigationLabel']");
	public static By logoutButton =By.xpath("//span[text()='Log Out']");
//	@FindBy(how=How.XPATH,using="//*[@id='email']") WebElement name1;
//	@FindBy(how=How.XPATH,using="//*[@id='pass']") WebElement password1;
//	@FindBy(how=How.XPATH,using="//input[@type='submit']") WebElement button1;
//	@FindBy(how=How.XPATH,using="") WebElement dropLogout1;
	public static By profile = By.xpath("//*[@title='Profile']");
	public static By hovertext=By.xpath("//*[@id='u_12_0']/div/ul/li[starts-with(@class,'_54')]");
	//public static By moreOption = By.xpath("//*[starts-with(@id,'u_fetchstream')]/a[contains(text(),'More')]");
	public static By timeline = By.xpath("//a[contains(text(),'Timeline')]");
	public static By moreOption = By.xpath("//a[contains(text(),'More') and @id='u_0_19']");
	
}
