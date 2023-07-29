package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		By by_uName = By.id("username");
		WebElement Username = driver.findElement(by_uName);
		Username.sendKeys("admin");
		Thread.sleep(3000);
		By by_pass = By.xpath("//input[@name='pwd']");
		WebElement password = driver.findElement(by_pass);
		password.sendKeys("admin");
		Thread.sleep(3000);
		By by_login1 = By.id("loginButton");
		WebElement login = driver.findElement(by_login1);
		login.click();
		Thread.sleep(3000);
	}

}

