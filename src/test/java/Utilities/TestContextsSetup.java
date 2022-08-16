package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;



public class TestContextsSetup {
// in this class we need to tell what are the variable and properties we gonna share with another stepdefinition
	public WebDriver driver;
	public String landingPagename;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtils genericUtils;
	public TestContextsSetup() throws IOException {
		testbase = new TestBase();
		pageObjectManager = new PageObjectManager(testbase.WebDriverManager());
		genericUtils = new GenericUtils(testbase.WebDriverManager());

	}
}
