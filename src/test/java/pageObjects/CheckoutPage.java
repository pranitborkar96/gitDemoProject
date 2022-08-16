package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver= driver;
	}
	By CartBag = By.cssSelector("img[alt='Cart']");
	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.xpath("//button[contains(text(),'Apply')]");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
 // action methods
	public void CheckoutItems() {
		driver.findElement(CartBag).click();
		driver.findElement(checkOutButton).click();

	}
	
	public boolean verifypromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();		
	}
	
	public boolean verifyplaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();		
	}
	
}
