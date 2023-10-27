package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement RetailLogo;
	
	@FindBy (id = "signinLink")
	public WebElement sigIn ;
	
	@FindBy (id = "email")
	public WebElement emailField;
	
	@FindBy (id = "password")
	public WebElement passwordField;
	
	@FindBy (id = "loginBtn")
	public WebElement logInButtn;
	
	@FindBy(id = "newAccountBtn")
	public WebElement createAccountButton;
	
	@FindBy(id = "nameInput")
	public WebElement nameFieldR;
	
	@FindBy(id = "emailInput")
	public WebElement emailR;
	
	@FindBy(id  = "passwordInput")
	public WebElement passwrdR;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement passwordConfirmR;
	
	@FindBy(id = "signupBtn")
	public WebElement signUpButton;
	
	@FindBy(id = "logoutBtn")
	public WebElement logOutButton;
	
	@FindBy(id ="hamburgerBtn")
	public WebElement sideButton;
	
	
}
