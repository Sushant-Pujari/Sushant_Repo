package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(3000);
		By by_Username = By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[1]");
		WebElement username = driver.findElement(by_Username);
		username.sendKeys("1234567890");
		
		
		
		Thread.sleep(3000);
		By by_Fullname = By.xpath("//input[@aria-label='Full Name']");
		WebElement fullname = driver.findElement(by_Fullname);
		fullname.sendKeys("Sushant Pujari");
		
		
		
		Thread.sleep(3000);
		By by_name = By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[2]");
		WebElement name = driver.findElement(by_name);
		name.sendKeys("Sushantttt_07");
		
		
		
		Thread.sleep(3000);
		By by_password = By.xpath("//input[@aria-label='Password']");
		WebElement password = driver.findElement(by_password);
		password.sendKeys("0"
				+ "123456789");
		
		
		
		Thread.sleep(3000);
		By by_SignUp = By.xpath("//button[text()='Sign up']");
		WebElement signup = driver.findElement(by_SignUp);
		signup.click();

	}
}
