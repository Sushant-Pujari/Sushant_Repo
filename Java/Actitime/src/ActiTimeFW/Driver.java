package ActiTimeFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.manage().window().maximize();
		
		Login.signusername("trainee");
	}

}
