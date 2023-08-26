package AmezonFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dirver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
	      Login.signAction();
	}

}
