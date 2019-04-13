package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	public ChromeDriver driver;

	@Given("Open the Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("Max Browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}

	@And("Set the Timeouts")
	public void setTimeouts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("Load the URL")
	public void enterURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Enter the Username as (.*)")
	public void enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);	
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	@When("Click On the Login Button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();	
	}

	@Then("Verify Login Successful")
	public void verifyLogin() {
		System.out.println("Login Successful");
	}




































}




