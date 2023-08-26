package farmFreshKitchen;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Execution {
	
	WebDriver d;
	
	@BeforeMethod
	public void setUp() {
		
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://farmersfreshkitchen.com/");
	}
	
	@Test(priority =  1 )
	public void login() {
		Login_Page l = new Login_Page(d);
		l.actionSign();
		l.actionUsername("suspujari007@gmail.com");
		l.actionPassword("Farmers123");
		l.actionsignButton();
		assertTrue(l.valid_Dashboard(), "Dasboard is not displayed");
	}
	
	@Test(priority =  2 )
	public void cart() throws InterruptedException {
		Login_Page l = new Login_Page(d);
		l.actionSign();
		l.actionUsername("suspujari007@gmail.com");
		l.actionPassword("Farmers123");
		l.actionsignButton();
		assertTrue(l.valid_Dashboard(), "Dasboard is not displayed");
		Thread.sleep(3000);
		Cart c = new Cart(d);
		c.actionMenu();
		c.actionLocation();
		c.actionOrder();
		Thread.sleep(5000);
		c.actionItem_1();
		c.actionItem_2();
		c.actionItem_3();
		c.actionItem_4();
		c.actionBag();
		assertTrue(c.validmsg(),"Items not added");
		
	}
	@Test(priority =  3 )
	public void chechOut_Process() throws InterruptedException {
		Login_Page l = new Login_Page(d);
		l.actionSign();
		l.actionUsername("suspujari007@gmail.com");
		l.actionPassword("Farmers123");
		l.actionsignButton();
		assertTrue(l.valid_Dashboard(), "Dasboard is not displayed");
		Cart c = new Cart(d);
		c.actionMenu();
		c.actionLocation();
		c.actionOrder();
		Thread.sleep(5000);
		c.actionItem_1();
		c.actionItem_2();
		c.actionItem_3();
		c.actionItem_4();
		c.actionBag();
		assertTrue(c.validmsg(),"Items not added");
		Checkout_Pro cp = new Checkout_Pro(d);
		cp.actionMyBag();
		cp.actionCheckout();
		cp.actionTime();
		
		
		
	}
	
	@Test(priority =  4 )
	public void payment() {
		Login_Page l = new Login_Page(d);
		l.actionSign();
		l.actionUsername("suspujari007@gmail.com");
		l.actionPassword("Farmers123");
		l.actionsignButton();
		assertTrue(l.valid_Dashboard(), "Dasboard is not displayed");
		Checkout_Pro cp = new Checkout_Pro(d);
		cp.actionMyBag();
		cp.actionCheckout();
		Payment p = new Payment(d);
		p.actionCard("12345678912345677");
		p.actionMMYY("05330");
		p.actionCVV("123");
		p.actionConfirm();
		assertTrue(p.validmsg());
		
	}
	
	
	@Test(priority =  5 )
	public void freshMeat() {
		Login_Page l = new Login_Page(d);
		l.actionSign();
		l.actionUsername("suspujari007@gmail.com");
		l.actionPassword("Farmers123");
		l.actionsignButton();
		assertTrue(l.valid_Dashboard(), "Dasboard is not displayed");
		Fresh_Meat f = new Fresh_Meat(d);
		f.actionFreshMeat();
		f.actionYes();
		ArrayList<String> id = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(id.get(1));
		f.actionBestMatch();
	}
	
	@AfterMethod
	public void Close() {
		d.quit();
	}

}
