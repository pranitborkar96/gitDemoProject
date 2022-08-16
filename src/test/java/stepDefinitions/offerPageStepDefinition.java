package stepDefinitions;
import org.testng.Assert;
import Utilities.TestContextsSetup;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import pageObjects.offersPage;

public class offerPageStepDefinition {
public String offerpageproductname;
TestContextsSetup testContextsSetup;
PageObjectManager pageObjectManager;
public offerPageStepDefinition (TestContextsSetup testContextsSetup){
	this.testContextsSetup = testContextsSetup;
}
	
	@Then("^user searched for (.+) shortname in offers page to check if product exist with same name$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String shortname) throws InterruptedException {
	   switchToOffersPage();
	   offersPage offerspage = testContextsSetup.pageObjectManager.offersPage();
	   offerspage.searchitem(shortname);
	   offerpageproductname = offerspage.getProductName();
	   offerspage.getsearchname();
	}
	public void switchToOffersPage() 
	{	
		LandingPage landingpage = testContextsSetup.pageObjectManager.getLandingPage();
	    landingpage.selectTopDeals();
	    testContextsSetup.genericUtils.SwitchWindowToChild();
	}
	
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	   Assert.assertEquals(offerpageproductname,testContextsSetup.landingPagename);
	}
	
	
	
	
	
}
