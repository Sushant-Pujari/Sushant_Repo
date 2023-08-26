package practiceFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/");

		d.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
	}


}

