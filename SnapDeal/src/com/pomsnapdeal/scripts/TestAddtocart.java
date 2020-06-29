package com.pomsnapdeal.scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pomsnapdeal.pages.HomePage;
import com.pomsnapdeal.pages.ItemPage;

public class TestAddtocart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.snapdeal.com");
		
		HomePage hp= new HomePage(driver);
		hp.clickSignup(driver);
		hp.clickLogin();
		
		hp.textBox1(driver,"9951237670");
		hp.clickCont();
		hp.textBox2("Heidi123");
		hp.clickLogin1();
		hp.search1(driver,"i phones");
		hp.clickImg();
		
		String pwh = driver.getWindowHandle();
		
		
	    Set<String> cwh = driver.getWindowHandles();
	    for(String w:cwh)
	    {
	    	driver.switchTo().window(w);
	    if(pwh.equals(w))
	    {
	    	String pTitle = driver.getTitle();
	    	System.out.print(pTitle);
	    }
	    else
	    {
	     ItemPage ip = new ItemPage(driver);
	    	ip.clickAddcart();
	    	ip.clickProcced();
	    	ip.enterDetails("503001", "J.Vaishnavi Reddy", "11-1-1928/14", "sr college", "Nizamabad", "Telangana");
	    	ip.clickSaveAndCont();
	    }
	}
	}
}
	


