package Cyclos_FW;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	public class Xpath extends Webdriver
	{
		static By rstr=By.id("register-link");

		static By nm=By.id("id_1");

		static By lgnnm=By.id("id_2");
	 
		static By emlnm=By.id("id_3");

		static By webste=By.name("website");

		static By gndr=By.xpath("(//label[@class=\"custom-control-label\"])[2]");

		static 	By bnstp=By.id("business_type");

		static By drnlst=By.xpath("//a[@id=\"business_type_technical\" and text()=\" Technical \"]");

		static By mobno=By.id("id_4");

		static By nxt=By.xpath("//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary\"]");

		
		static WebElement register=drv.findElement(rstr);
			
		static WebElement name=drv.findElement(nm);

	  	static WebElement loginnm=drv.findElement(lgnnm);

	  	static WebElement emailnm=drv.findElement(emlnm);

	  	static WebElement website=drv.findElement(webste);

	  	static WebElement gender=drv.findElement(gndr);

	  	static WebElement businesstype=drv.findElement(bnstp);

	  	static WebElement drnlist=drv.findElement(drnlst);

	  	static WebElement mobileno=drv.findElement(mobno);

	  	static WebElement next=drv.findElement(nxt);
		
	  	public static void rtr() 
	  	{
	  		register.click();

	  	}
	  	public static void nme() 
	  	{
	  		name.sendKeys("satyabrata");

	  	}
	  	public static void logn() 
	  	{
	  		loginnm.sendKeys("satya123");

	  	}
	  	public static void emlnme() 
	  	{
	  		emailnm.sendKeys("abc@gmail.com");

	  	}
	  	public static void wbst() 
	  	{
	  		website.sendKeys("w3school.com");

	  	}
	    public static void gdr() 
	    {
	    	gender.click();

	    }

	    public static void bns_tp() 
	    {
	    	businesstype.click();

	    }
	    public static void dropdrnlst() 
	    {
	    	drnlist.click();

	    }
	    public static void mblno() 
	    {
	    	mobileno.sendKeys("9348433541");

	    }
	    public static void nxt_s() 
	    {
	    	next.click();

	    }
	 

}
