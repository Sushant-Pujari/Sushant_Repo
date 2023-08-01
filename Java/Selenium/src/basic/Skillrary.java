package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		By by_Selenium = By.xpath("(//a[text()='Selenium Training'])[2]");
		WebElement selenium = driver.findElement(by_Selenium);
		selenium.click();
		Thread.sleep(3000);
		By by_Add = By.id("add");
		WebElement add = driver.findElement(by_Add);
		add.click();
		Thread.sleep(3000);
		By by_AddCart = By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']");
		WebElement addCart = driver.findElement(by_AddCart);
		addCart.click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
