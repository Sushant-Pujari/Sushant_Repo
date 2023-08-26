package Cyclos_FW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://demo.cyclos.org/ui/home");

		d.manage().window().maximize();
		Thread.sleep(2000);
		
		Xpath.rtr();
		

	}


}
