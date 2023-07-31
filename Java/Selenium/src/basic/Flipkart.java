package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		By by_Close = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		WebElement close = driver.findElement(by_Close);
		close.click();
		By by_Grocery = By.xpath("//div[text()='Grocery']");
		WebElement Grocery = driver.findElement(by_Grocery);
		Grocery.click();
		Thread.sleep(3000);
		By by_Searchbar = By.name("q");
		WebElement Searchbar = driver.findElement(by_Searchbar);
		Searchbar.click();
		Searchbar.sendKeys("oil");
		Thread.sleep(3000);
		By by_Button = By.xpath("//button[@class=\"L0Z3Pu\"]");
		WebElement Button = driver.findElement(by_Button);
		Button.click();
		
	}

}
