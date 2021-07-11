package StepDefinitions;

import Pages.FormContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _07_EntranceExamSteps {
    FormContent fc=new FormContent();

    @And("^Click on the element in the Form Content$")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement= elements.asList(String.class);
        for(int i=0;i<listElement.size();i++)
        {
            fc.findAndClick(listElement.get(i));
        }
    }

    @When("^User delete the  \"([^\"]*)\" from Form$")
    public void userDeleteTheFromForm(String examName) {
        fc.findAndDelete(examName);
    }
}
