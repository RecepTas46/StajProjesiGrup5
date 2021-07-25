package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _311_budgetSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("^Navigate to Budget page$")
    public void navigateToBudgetPage() {
        ln.findAndClick("budgetBtn");
        ln.findAndClick("budgetSetup");


    }

    @When("^Create a Budget definition as \"([^\"]*)\"  comment as \"([^\"]*)\"$")
    public void createABudgetescriptionAsCommentAs(String description, String comment)  {
        ln.findAndClick("budgetGroups");
        dc.findAndClick("addSubjectButton");
        dc.findAndSend("descriptionSendKeys",description);
        dc.findAndSend("budgetCommentInput",comment);



    }

    @When("^Click  start_End_Date and enter Comment$")
    public void clickStart_End_DateAndEnterComment() {
        dc.findAndClick("budgetStartDate");
        dc.findAndClick("budgetStartSecim");
        dc.findAndClick("budgetEndDate");
        dc.findAndClick("budgetEndSecim");
        dc.findAndClick("saveButton");


    }

    @When("^User edit budget the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditBudgetTheTo(String oldWord, String newWord) {
        dc.findAndEditbudget(oldWord, newWord);


    }


    @When("^Delete Budget \"([^\"]*)\"$")
    public void deleteBudget(String newWord)  {

        dc.findAndDelete(newWord);
    }


}
