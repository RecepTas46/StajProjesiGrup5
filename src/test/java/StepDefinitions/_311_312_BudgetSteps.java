package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _311_312_BudgetSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("^Navigate to Budget page$")
    public void navigateToBudgetPage() {
        ln.findAndClick("budgetBtn");
        ln.findAndClick("budgetSetup");


    }

    @When("^Create a Budget definition as \"([^\"]*)\"  comment as \"([^\"]*)\"$")
    public void createABudgetescriptionAsCommentAs(String description, String comment) {
        ln.findAndClick("budgetGroups");
        dc.findAndClick("addSubjectButton");
        dc.findAndSend("descriptionSendKeys", description);
        dc.findAndSend("budgetCommentInput", comment);


    }

    @When("^Click  start_End_Date and enter Comment$")
    public void clickStart_End_DateAndEnterComment() {
        dc.findAndClick("budgetStartDate");
        dc.findAndClick("budgetStartSecim");
        dc.findAndClick("budgetEndDate");
        dc.findAndClick("budgetEndSecim");
        dc.findAndClick("saveButton");


    }
    @When("^Delete BudgetGroups \"([^\"]*)\"$")
    public void deleteBudgetGroups(String newWord)  {
        dc.findAndDelete(newWord);

    }

    @When("^User edit budget the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditBudgetTheTo(String oldWord, String newWord) {
        dc.findAndEditbudget(oldWord, newWord);


    }


    @When("^Delete Budget \"([^\"]*)\"$")
    public void deleteBudget(String newWord) {
        dc.findAndClick("deleteButton");
        dc. findAndClick("deleteDialogBtn");

    }


    @When("^Create a Cost Centers name as \"([^\"]*)\" as \"([^\"]*)\" as \"([^\"]*)\"$")
    public void createACostCentersNameAsAsAs(String name, String code, String expense) {
        ln.findAndClick("budgetCost");
        dc.findAndClick("addSubjectButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("codeInput", code);
        dc.findAndSend("expenseAccount", expense);

    }

    @When("^select type and click btnSave$")
    public void selectTypeAndClickBtnSave() {
        dc.findAndClick("budgetTypeClick");
        dc.ChooseListElement("budgetCostAllOptions", "Production");
        dc.findAndClick("saveButton");


    }

    @When("^edit budget Cost \"([^\"]*)\" to \"([^\"]*)\"$")
    public void editBudgetCostTo(String oldWord, String newWord) {
        dc.findAndClick("budgetCostEditBtn");
        dc.findAndSend("nameInput", newWord);
        dc.findAndClick("saveButton");
    }


}
