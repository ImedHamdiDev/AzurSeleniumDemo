package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configurations.Config;
import PagesDefinitions.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public WebDriver driver;
	public loginPage lgp;

	@Given("I navigate to thz login page")
	public void i_navigate_to_thz_login_page() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(Config.getProperties("url"));
		lgp = new loginPage(driver);
	}

	@When("I entre username")
	public void i_entre_username() throws IOException {

		lgp.getUsername().sendKeys(Config.getProperties("username"));

	}

	@When("I enter password")
	public void i_enter_password() throws IOException {

		lgp.getPassword().sendKeys(Config.getProperties("password"));
	}

	@When("I click on login button")
	public void i_click_on_login_button() {

		lgp.getLogin().click();
	}

	@Then("I should be redirected to the landing page")
	public void i_should_be_redirected_to_the_landing_page() throws IOException {
		
		lgp.getLogo().isDisplayed();
	}

}
