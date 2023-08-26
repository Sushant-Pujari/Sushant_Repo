package farmFreshKitchen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment extends Checkout_Pro {
	


	public Payment(WebDriver d){
		super(d);

	}

	//Xpath

	By confirmBy = By.xpath("//button[text()='Save']");
	By msgBy = By.id("notistack-snackbar");
	By cardBy= By.id("cardNumber");
	By mmYYBy= By.id("expirationDate-label");
	By cVVBy= By.id("cvv-label");


	//Identification


	public WebElement findConfirm() {

		WebElement confirmeElement = d.findElement(confirmBy);
		return confirmeElement;
	}
	public WebElement findMsg() {

		WebElement msgElement = d.findElement(msgBy);
		return msgElement;
	}
	public WebElement findcard() {

		WebElement cardElement = d.findElement(cardBy);
		return cardElement;
	}
	public WebElement findMMYY() {

		WebElement MMYYElement = d.findElement(mmYYBy);
		return MMYYElement;
	}
	public WebElement findCVV() {

		WebElement cVVElement = d.findElement(cVVBy);
		return cVVElement;
	}
	
	
	
	//Action
	
	public void actionConfirm() {
		findConfirm().click();
	}
	public void actionCard(String s) {
		findcard().sendKeys(s);
	}
	public void actionMMYY(String s) {
		findConfirm().sendKeys(s);
	}
	public void actionCVV(String s) {
		findCVV().sendKeys(s);
	}
	
	
	//Validation
	
	public boolean validmsg() {
		boolean b=findMsg().isDisplayed();
		return b;
	}



}
