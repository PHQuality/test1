package stepDefinition;

import java.util.concurrent.TimeUnit;
//import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

WebDriver driver;
	
@Given("^user is in home page$")
public void user_is_in_home_page() {
		System.setProperty("webdriver.chrome.driver","/Users/himaliabeykoon/eclipse-workspace2/Drivers/chromedriver 2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.co.uk/");
	}

@When("^user clicks Sign in$")
public void user_clicks_Sign_in() {
	   driver.findElement(By.id("idcta-link")).click();
	}

@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String username, String password) {
	    driver.findElement(By.id("user-identifier-input")).sendKeys(username);
	    driver.findElement(By.id("password-input")).sendKeys(password);
	}

@When("^user clicks Sign in button$")
public void user_clicks_Sign_in_button() {
		driver.findElement(By.id("submit-button")).click();
	}

@Then("^user is logged in to the system$")
public void user_is_logged_in_to_the_system() {
		driver.findElement(By.id("idcta-username")).isDisplayed();
		String exp_message = "hima";
		String acc_message = driver.findElement(By.id("idcta-username")).getText();
		//Assert.assertEquals(exp_message,acc_message);
		
		
	}



}
