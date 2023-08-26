package ActiTimeFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		Login.signusername("trainee");
	}

}






