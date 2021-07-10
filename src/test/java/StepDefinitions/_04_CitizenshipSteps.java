package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _04_CitizenshipSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @And("^Navigate to Citizenship page$")
    public void navigateToCitizenshipPage() {
        ln.findAndClick("setupOne");//Setup click
        ln.findAndClick("parameters");//Parameter Click
        ln.findAndClick("citizenShip");//Country Click

    }

    @When("^User a Ctizenship name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void userACtizenshipNameAsShortNameAs(String name, String shortName)  {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("saveButton");
    }

    @Then("^Already exist message should be displayed$")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.findAndContainsText("alreadyExist", "already exists");
    }

    @And("^Click on close button$")
    public void clickOnCloseButton() {
        dc.findAndClick("closeDialog");
    }

    @When("^User delete the  \"([^\"]*)\"$")
    public void userDeleteThe(String name) {
        dc.findAndDelete(name);
    }
}
