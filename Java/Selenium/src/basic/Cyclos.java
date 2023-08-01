package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cyclos {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		By by_Register = By.xpath("//div[text()=' Register ']");
		WebElement Register = driver.findElement(by_Register);
		Register.click();
		
		Thread.sleep(3000);
		By by_Username = By.id("id_1");
		WebElement Username = driver.findElement(by_Username);
		Username.sendKeys("Sushant");
		
		Thread.sleep(3000);
		By by_LoginName = By.id("id_2");
		WebElement LoginName = driver.findElement(by_LoginName);
		LoginName.sendKeys("Sushantttt");
		
		Thread.sleep(3000);
		By by_Email = By.id("id_3");
		WebElement email = driver.findElement(by_Email);
		email.sendKeys("abc@gmail.com");
		
		Thread.sleep(3000);
		By by_Male = By.xpath("//label[text()=' Male ']");
		WebElement male = driver.findElement(by_Male);
		male.click();
	}

}
