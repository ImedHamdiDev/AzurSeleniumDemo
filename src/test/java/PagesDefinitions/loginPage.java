package PagesDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath ="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath ="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement login;
	@FindBy(xpath ="//*[@class=\"oxd-brand-banner\"]/img")
	private WebElement logo;
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	

}
