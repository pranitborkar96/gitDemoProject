package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Utilities.TestContextsSetup;
import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;

public class CheckoutpageStepDefinition {
public WebDriver driver;
public String landingPagename;
public String offerpageproductname;
public CheckoutPage checkoutPage;  //img[alt='Cart']  //button[type='button'] //input[class='promoCode'] //button[contains(text(),'Apply')]
TestContextsSetup testContextsSetup;
//button[contains(text(),'Place Order')] //input[@type='checkbox'] //button[contains(text(),'Proceed')]
// on top of the line there is instance and global variable
// inside of contructors round braket there is a instance and variable and scope of that is instance variable is 
// within the constructor only thats why we declare globally and then we 
// assigned the variable which one have knowledge to your global variable by using this keyword inside the constructor
public CheckoutpageStepDefinition (TestContextsSetup testContextsSetup){
	this.testContextsSetup =testContextsSetup;
	this.checkoutPage = testContextsSetup.pageObjectManager.getCheckoutPage();
}
	

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
		
		Assert.assertTrue(checkoutPage.verifypromoBtn());
		Assert.assertTrue(checkoutPage.verifyplaceOrder());
		
	}
	
	@Then("^user proceed to Checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_Checkout(String name) throws InterruptedException
	{
		
		checkoutPage.CheckoutItems();
		
	}
	
	
	
	
}
