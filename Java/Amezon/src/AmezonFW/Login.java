package AmezonFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends WebDriver_Class {
	
	
	
	//Xpath
	
	static By sign =By.xpath("//span[text()='Hello, sign in']");
	static By username =By.id("ap_email");
	static By continu =By.id("continue");
	static By pass =By.id("ap_password");
	static By signup =By.id("signInSubmit");
	
	
	
	//Findelement
	
	public static WebElement find_Sign = d.findElement(sign);
	static WebElement find_username = d.findElement(username);
	static WebElement find_continue = d.findElement(continu);
	static WebElement find_Pass = d.findElement(pass);
	static WebElement find_Signup = d.findElement(signup);
	
	
	
	//ActionMethod
	
	public static void signAction() {
		find_Sign.click();
	}
	public static void signusername(String s) {
		find_username.sendKeys(s);
	}
	public static void signContinue() {
		find_continue.click();
	}
	public static void signPass(String s) {
		find_Pass.sendKeys(s);
	}
	public static void signupAction() {
		find_Signup.click();
	}
	
	

}
