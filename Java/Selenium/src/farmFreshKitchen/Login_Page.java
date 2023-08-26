package farmFreshKitchen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	WebDriver d;

	public Login_Page(WebDriver d) {
		this.d=d;
	}
	
	//Xpath
	
	By signBy = By.xpath("//a[text()=' Sign-In ']");
	By usernameBy = By.name("email");
	By passBy = By.id("passwordInput");
	By signbuttonBy = By.xpath(" //button[text()='Sign In']");
	By dashBy = By.xpath(" //h1[text()='My Rewards']");
	


	//Identification


	public WebElement findusername() {
		WebElement userName = d.findElement(usernameBy);
		return userName;

	}

	public WebElement findsignIn() {
		WebElement signIN = d.findElement(signBy);
		return signIN;

	}

	public WebElement findPass() {
		WebElement pass = d.findElement(passBy);
		return pass;

	}

	public WebElement findsignButton() {
		WebElement signButton = d.findElement(signbuttonBy);
		return signButton;

	}

	public WebElement findDashboard() {
		WebElement dashbord = d.findElement(dashBy);
		return dashbord;

	}


	//Action

	public void actionSign() {

		findsignIn().click();
	}

	public void actionUsername(String s) {

		findusername().sendKeys(s);
	}
	public void actionPassword(String s) {

		findPass().sendKeys(s);
	}

	public void actionsignButton() {

		findsignButton().click();
	}
	
	
	
	

	//Validation

	public boolean valid_Dashboard() {

		boolean b=findDashboard().isDisplayed();
		return b;
	}

}
