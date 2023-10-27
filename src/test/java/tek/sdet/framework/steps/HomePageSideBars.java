package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomePageSideBars extends CommonUtility{
	
	POMFactory pomFactory = new POMFactory();
	
	@Given("user is on retial website")
	public void userIsOnRetialWebsite() {
	    pomFactory.homePage().RetailLogo.isDisplayed();
	    logger.info("User is on tek retail website");
	}
	@When("user clicks on side bar option")
	public void userClicksOnSideBarOption() {
	   pomFactory.homePage().sideButton.click();
	   logger.info("User click on side button successfully");
	}
	@Then("below info should be listed in side bar option")
	public void belowInfoShouldBeListedInSideBarOption(DataTable dataTable) {
		List<List<String>> shopSideButton = dataTable.asLists(String.class);
		for (int i = 0; i < shopSideButton.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//div[@class='sidebar_content-item']"))));
			logger.info("shop options: " + shopSideButton.get(0).size()+ "is displayed");
		}
	    
	}


}
