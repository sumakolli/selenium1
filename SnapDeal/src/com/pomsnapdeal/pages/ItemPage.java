    package com.pomsnapdeal.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ItemPage {
		@FindBy(xpath="//span[text()='add to cart']")
		private WebElement addtocart;
		
		@FindBy(xpath="//a[text()='Proceed To Checkout']")
		private WebElement proceed1;
		
		@FindBy(id="zip")
		private WebElement pincode;
		
		@FindBy(id="fullName")
		private WebElement fullname;
		
		@FindBy(id="address")
		private WebElement address;
		
		@FindBy(id="nearestLandmark")
		private WebElement landmark;
		
		@FindBy(id="city")
		private WebElement city;
		
		@FindBy(id="state")
		private WebElement state;
		
		@FindBy(id="alternateMobile")
		private WebElement phone;
		
		
		@FindBy(xpath="//span[@class='circle']/parent::input[@id='home-mobile']")
		private WebElement addrType;
		
		@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
		private WebElement saveAndcont;
		
		
		public ItemPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
		public void clickAddcart()
		{
			addtocart.click();
		}
		public void clickProcced()
		{
			proceed1.click();
		}
		public void enterDetails(String pincode1,String fullname1,String addr,String landmark1,String city1,String state1)
		{
			pincode.clear();
			pincode.sendKeys(pincode1);
			fullname.sendKeys(fullname1);
			address.sendKeys(addr);
			landmark.sendKeys(landmark1);
			//city.sendKeys(city1);
			//state.sendKeys(state1);
			//phone.sendKeys("9845678900");
			addrType.click();
		}
		
		public void clickSaveAndCont()
		{
			saveAndcont.click();
		}

}
