package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.TestContextsSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;


public class Hooks {

	TestContextsSetup testcontextsetup;
	
	public Hooks(TestContextsSetup testcontextsetup) {
		
		this.testcontextsetup = testcontextsetup;
	}
	@After
	public void AfterScenario() throws IOException {
		
		testcontextsetup.testbase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testcontextsetup.testbase.WebDriverManager();
		if(scenario.isFailed()) {
			
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontain = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(filecontain,"image/png","image");
		}
		
	}
	
	
}
