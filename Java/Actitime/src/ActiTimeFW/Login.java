package ActiTimeFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Webdriver {
	
	//Xpath
	
	static By username =By.id("username");
	static By pass =By.name("pwd");
	static By login =By.xpath("//div[text()='Login ']");
	
	
	
	//FindElements
	
	static WebElement find_username = d.findElement(username);
	static WebElement find_pass = d.findElement(pass);
	static WebElement find_login = d.findElement(login);
	
	
	//Action
	
	public static void signusername(String s) {
		find_username.sendKeys(s);
	}
	
	public static void actionPass(String s) {
		find_pass.sendKeys(s);
	}
	
	public static void actionLogin(String s) {
		find_login.sendKeys(s);
	}

}
