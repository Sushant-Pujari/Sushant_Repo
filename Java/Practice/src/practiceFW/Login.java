package practiceFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Webdriver{
	static By unm=By.xpath("//input[@id=\"username\"]");

	static By pwd=By.xpath("//input[@id=\"password\"]");

	static By smt=By.id("submit");

	static WebElement usrnm=d.findElement(unm);
	
	static	WebElement pswd=d.findElement(pwd);
	
	static WebElement submit=d.findElement(smt);
	
	public static void unm_action() 
	{
		usrnm.sendKeys("student");

	}
	public static void pwd_action() 
	{
		pswd.sendKeys("Password123");

	}
	public static void smt_action() 
	{
		submit.click();

		
	}
	


}
