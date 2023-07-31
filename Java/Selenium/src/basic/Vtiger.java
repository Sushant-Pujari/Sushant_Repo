package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		By by_Id = By.id("username");
		WebElement Id = driver.findElement(by_Id);
		Id.clear();
		Id.sendKeys("admin");
		Thread.sleep(3000);
		By by_Pass = By.id("password");
		WebElement pass = driver.findElement(by_Pass);
		pass.clear();
		pass.sendKeys("Test@123");
		Thread.sleep(3000);
		By by_Login = By.xpath("//button[text()='Sign in']");
		WebElement login = driver.findElement(by_Login);
		login.click();
		Thread.sleep(3000);
		By by_Logout = By.xpath("//span[@class='fa fa-user']");
		WebElement logout = driver.findElement(by_Logout);
		logout.click();
		Thread.sleep(3000);
		By by_Signout = By.id("menubar_item_right_LBL_SIGN_OUT");
		WebElement signout = driver.findElement(by_Signout);
		signout.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
