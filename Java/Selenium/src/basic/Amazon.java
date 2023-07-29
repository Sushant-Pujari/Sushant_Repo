package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		By by_account = By.id("nav-link-accountList-nav-line-1");
		WebElement account = driver.findElement(by_account);
		account.click();
		Thread.sleep(3000);
		By by_order = By.id("nav-search-submit-button");
		WebElement order = driver.findElement(by_order);
		order.click();
		Thread.sleep(3000);
		By by_Buy = By.id("twotabsearchtextbox");
		WebElement buy = driver.findElement(by_Buy);
		buy.click();
		
	}

}
