package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPage{
	
public WebDriver driver;
public offersPage(WebDriver driver)
{
	this.driver= driver;
	}
private By searchproduct = By.xpath("//input[@type='search']");
private By productName = By.xpath("//tbody/tr/td[1]");

// action methods
public void searchitem(String name) {
	driver.findElement(searchproduct).sendKeys(name);
	
}

public void getsearchname() {
	driver.findElement(searchproduct).getText();
	
}

public String getProductName() {
	return driver.findElement(productName).getText();
	
}


}
