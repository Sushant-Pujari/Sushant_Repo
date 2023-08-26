package farmFreshKitchen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	// 1)(//h5[text()='Candied Yams (8oz)'])[1]    
	
	WebDriver d;
	
	public Cart(WebDriver d) {
		
		this.d=d;
	}
	
	// Xpath 
	
	By menuBy = By.xpath("//a[@class='nav-link' and text()='Menu']");
	By orderBy = By.xpath("(//button[text()='Order'])[1]");
	By item_1By = By.xpath("(//img[@class='card-img-top single-d'])[1]");
	By item_2By = By.xpath("(//h5[text()='Greens (8oz)'])[1]");
	By item_3By = By.xpath("h5[text()='Rice']");
	By item_4By = By.xpath("//h5[text()='Greens - Large (16oz)']");
	By bagBy = By.id("web-btn");
	By msgBy = By.xpath("//div[text()='Successfully added into the cart']");
	By locationBy = By.xpath("//button[text()='Use My Location']");
	
	
	
	//Identification
	
	public WebElement findMenu() {
		WebElement menueElement=d.findElement(menuBy);
		return menueElement;
	}
	public WebElement findOrder() {
		WebElement orderElement=d.findElement(orderBy);
		return orderElement;
	}
	public WebElement findItem_1() {
		WebElement Item_1Element=d.findElement(item_1By);
		return Item_1Element;
	}
	public WebElement findItem_2() {
		WebElement Item_2Element=d.findElement(item_2By);
		return Item_2Element;
	}
	public WebElement findItem_3() {
		WebElement Item_3Element=d.findElement(item_3By);
		return Item_3Element;
	}
	public WebElement findItem_4() {
		WebElement Item_4Element=d.findElement(item_4By);
		return Item_4Element;
	}
	public WebElement findBag() {
		WebElement bagElement=d.findElement(bagBy);
		return bagElement;
	}
	public WebElement findmsg() {
		WebElement msgElement=d.findElement(msgBy);
		return msgElement;
	}
	public WebElement findLocation() {
		WebElement locElement=d.findElement(locationBy);
		return locElement;
	}
	
	
	// Action
	
	public void actionMenu() {
		findMenu().click();
	}
	public void actionOrder() {
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(510, 1057)","");
		findOrder().click();
	}
	public void actionItem_1() {
		findItem_1().click();
	}
	public void actionItem_2() {
		findItem_2().click();
	}
	public void actionItem_3() {
		findItem_3().click();
	}
	public void actionItem_4() {
		findItem_4().click();
	}
	public void actionBag() {
		findBag().click();
	}
	public void actionLocation() {
		findLocation().click();
	}
	
	
	
	//validation
	
	
	public boolean validmsg() {
		
		return findmsg().isDisplayed();
	}
	
	
	

}
