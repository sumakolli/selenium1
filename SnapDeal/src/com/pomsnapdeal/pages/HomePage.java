package com.pomsnapdeal.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	@FindBy(xpath="//div[@class='accountInner']")
	private WebElement signnup;
	
	@FindBy(xpath="//span[@class='accountBtn btn rippleWhite']")
	private WebElement login;
	
	@FindBy(xpath="//input[@class='col-xs-24']")
	private WebElement textbox1;
	
	@FindBy(id="checkUser")
	private WebElement cont1;
	
	@FindBy(id="j_password_login_uc")
	private WebElement pwd;
	
	@FindBy(id="submitLoginUC")
	private WebElement login1;
	
	@FindBy(id="inputValEnter")
	private WebElement search;
	
	@FindBy(xpath="(//img[@class='product-image '] )[1]")
	private WebElement img1;
	
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickSignup(WebDriver driver) {
		Actions act = new Actions(driver);
		
		act.moveToElement(signnup).perform();
	}
	public void clickLogin()
	{
		login.click();
	}
	public void textBox1(WebDriver driver,String name)
	{
		driver.switchTo().frame(0);
		textbox1.sendKeys(name);
		
	}
	public void clickCont()
	{
		cont1.click();
	}
	public void textBox2(String pwd1)
	{
	
		pwd.sendKeys(pwd1);
	}
	public void clickLogin1()
	{
		login1.click();
	}
	public void search1(WebDriver driver,String item)
	{
		driver.switchTo().frame(0);
		search.sendKeys(item,Keys.ENTER);
	}
	
	public void clickImg()
	{
		img1.click();
	}
	
	
}
