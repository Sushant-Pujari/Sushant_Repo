package farmFreshKitchen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Fresh_Meat {
	WebDriver d;
	
	public Fresh_Meat(WebDriver d) {
		this.d = d;
	}
	 
	//Xpath
	//option[text()='Best match']
	
	By freshMeatBy = By.xpath("//a[text()='Fresh Meat & Grocery']");
	By yesBy = By.xpath("//button[text()='Yes, Proceed']");
	By bestMatchBy = By.xpath("(//select)[1]");
	By sortBy = By.xpath("//option[text()='Price low to high']");
	
	
	//Identification
	
	public WebElement findFreshMeat() {
		WebElement freshMeatElement = d.findElement(freshMeatBy);
		return freshMeatElement;
	}
	public WebElement findYes() {
		WebElement yesElement = d.findElement(yesBy);
		return yesElement;
	}
	public WebElement findBestMatch() {
		WebElement bestMatch= d.findElement(bestMatchBy);
		return bestMatch;
	}
	public WebElement findsort() {
		WebElement sortElement = d.findElement(sortBy);
		return sortElement;
	}
//	public WebElement findFreshMeat() {
//		WebElement freshMeatElement = d.findElement(freshMeatBy);
//		return freshMeatElement;
//	}
	
	
	//Action
	
	public void actionFreshMeat() {
		findFreshMeat().click();
	}
	public void actionYes() {
		findYes().click();
	}
	public void actionBestMatch() {
		findBestMatch().click();
		WebElement ele =findBestMatch();
		Select s = new Select(ele);
		s.selectByVisibleText("Price low to high");
	}
	

}
