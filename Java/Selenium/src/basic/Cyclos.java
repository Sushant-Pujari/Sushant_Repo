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
		
		
		
		Thread.sleep(3000);
		By by_Difine = By.id("id_6");
		WebElement define = driver.findElement(by_Difine);
		define.click();
		
		
		Thread.sleep(3000);
		By by_Address = By.id("addressLine1");
		WebElement Address = driver.findElement(by_Address);
		Address.click();
		
		
		Thread.sleep(3000);
		By by_Zip = By.id("zip");
		WebElement zip = driver.findElement(by_Zip);
		zip.click();
		
		
		Thread.sleep(3000);
		By by_Login = By.xpath("//span[text()='Next']");
		WebElement Login = driver.findElement(by_Login);
		Login.click();
	}

}
