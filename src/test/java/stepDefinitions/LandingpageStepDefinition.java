package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.TestContextsSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class LandingpageStepDefinition {
public WebDriver driver;
public String landingPagename;
public String offerpageproductname;
TestContextsSetup testContextsSetup;
LandingPage landingpage;
// on top of the line there is instance and global variable
// inside of contructors round braket there is a instance and variable and scope of that is instance variable is 
// within the constructor only thats why we declare globally and then we 
// assigned the variable which one have knowledge to your global variable by using this keyword inside the constructor
	public LandingpageStepDefinition (TestContextsSetup testContextsSetup){
	this.testContextsSetup =testContextsSetup;
	this.landingpage = testContextsSetup.pageObjectManager.getLandingPage();
}


	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingpage.getTitleLandingPage().contains("GreenKart"));
	}

	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		landingpage.searchitems(shortname);
		//testContextsSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(2000);
		testContextsSetup.landingPagename = landingpage.getProductNameText().split("-")[0].trim();
		System.out.println(landingPagename + "is Extracted from Home Page");
	}

	@And("^Added \"([^\"]*)\" items of the selected product to cart$")
    public void added_something_items_of_the_selected_product_to_cart(String quantity)
	
	{
		
		landingpage.incrementQuantity(Integer.parseInt(quantity));
		landingpage.addToCart();
	}
	
	
}
