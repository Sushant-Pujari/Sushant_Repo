package farmFreshKitchen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkout_Pro {
	   WebDriver d;
	   
	   public Checkout_Pro(WebDriver d) {
		
		   this.d=d;
	}
	
	//Xpath
	
	By mybagBy = By.id("navbarDropdown1");
	By checkBy = By.xpath("//button[text()='Proceed To Checkout']");
	By timeBy = By.id("checkout-timing");
	By timeBy2 = By.xpath("//option[text()='1:15 pm']");
	
	By placeBy = By.xpath("(//button[text()='Confirm & Place Order'])[1]");
	
	
	
	//Identification
	
	public WebElement findmybag() {
		WebElement mybagElement = d.findElement(mybagBy);
		return mybagElement;
	}
	public WebElement findCheck() {
		WebElement checkElement = d.findElement(checkBy);
		return checkElement;
	}
	public WebElement findtime() {
		WebElement timeElement = d.findElement(timeBy);
		return timeElement;
	}
	public WebElement findplace() {
		WebElement placElement = d.findElement(placeBy);
		return placElement;
	}
	
	
	//Action
	
	public void actionMyBag() {
		findmybag().click();
	}
	public void actionCheckout() {
		findCheck().click();
	}
	public void actionTime() {
		Select s = new Select(findtime());
		s.selectByVisibleText("1:15 pm");
	}

}
