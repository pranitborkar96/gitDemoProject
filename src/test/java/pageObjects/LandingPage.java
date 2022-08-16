package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	}
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By TopDeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
 // action methods
	public void searchitems(String name) {
		driver.findElement(search).sendKeys(name);
		
	}
	
	public void getsearchText() {
		driver.findElement(search).getText();
		
	}
	public void incrementQuantity(int quantity) {
		
		int i = quantity-1;
		while(i>0) {
			i--;
		}
		
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();		
	}
	public String getProductNameText() {
		return driver.findElement(productName).getText();
		
	}
	public void selectTopDeals() {
		driver.findElement(TopDeals).click();
		
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
		
	}
	
}
