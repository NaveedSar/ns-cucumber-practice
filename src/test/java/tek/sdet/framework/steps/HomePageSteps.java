package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomePageSteps extends CommonUtility{
	
	POMFactory pomFactory = new POMFactory();
	
	@When("user click on sign in button")
	public void userClickOnSignInButton() {
	    pomFactory.homePage().sigIn.click();
	    logger.info("user click on sign in button succesfully");
	}
	@And("user enter email {string} password {string}")
	public void userEnterEmailPassword(String email, String password) {
	    sendText(pomFactory.homePage().emailField, email);
	    sendText(pomFactory.homePage().passwordField, password);
	    logger.info("user enter email and password succesfully");
	}
	@And("user click on log in button")
	public void userClickOnLogInButton() {
	    click(pomFactory.homePage().logInButtn);
	    logger.info("user clicked on log in button succesffully");
	}
	@Then("user is logged in")
	public void userIsLoggedIn() {
	   
	}
	//Rigester account
	
	@When("user click on create new account button")
	public void userClickOnCreateNewAccountButton() {
	    pomFactory.homePage().createAccountButton.click();
	    logger.info("user clicked on create account successfully");
	}
	@Then("user enter information below")
	public void userEnterInformationBelow(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> info = dataTable.asMaps(String.class , String.class);
		
			sendText(pomFactory.homePage().nameFieldR, info.get(0).get("name"));
			sendText(pomFactory.homePage().emailR,info.get(0).get("email"));
			sendText(pomFactory.homePage().passwrdR, info.get(0).get("password"));
			sendText(pomFactory.homePage().passwordConfirmR, info.get(0).get("confirmPassword"));
	}

	@Then("user click on sign up button")
	public void userClickOnSignUpButton() {
	    pomFactory.homePage().signUpButton.click();
	}
	@Then("user should be logged in")
	public void userShouldBeLoggedIn() {
	    pomFactory.homePage().logOutButton.isDisplayed();
	}




}
