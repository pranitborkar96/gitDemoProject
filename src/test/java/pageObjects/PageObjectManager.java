package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager{
public LandingPage landingpage;
public offersPage offerspage;
public WebDriver driver;
public CheckoutPage checkoutPage;
public PageObjectManager(WebDriver driver)
{
	this.driver= driver;
	}


public LandingPage getLandingPage() {
	LandingPage landingpage = new LandingPage(driver);
	return landingpage;
	
}

public offersPage offersPage() {
	
	 offersPage offerspage = new offersPage(driver);
	 return offerspage;
	
}

public CheckoutPage getCheckoutPage() {
	
	checkoutPage = new CheckoutPage(driver);
	 return checkoutPage;
	
}

}
