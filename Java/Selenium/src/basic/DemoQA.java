package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		
		
		
//		Thread.sleep(3000);
//		By by_Element = By.xpath("(//div[@class='card-body'])[1]");
//		WebElement Element = driver.findElement(by_Element);
//		Element.click();
		
		
		
		Thread.sleep(3000);
		By by_TextBox = By.xpath("//h5[text()='Elements']");
		WebElement textBox = driver.findElement(by_TextBox);
		textBox.click();
		
		
		
		Thread.sleep(3000);
		By by_Username = By.id("userName");
		WebElement username = driver.findElement(by_Username);
		username.sendKeys("Sushant pujari");
		
		
		
		Thread.sleep(3000);
		By by_Email = By.id("userEmail");
		WebElement Email = driver.findElement(by_Email);
		Email.click();

  }
}
