package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _35_37_EducationSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("^Navigate to education page$")
    public void navigateToEducationPage() {
        ln.findAndClick("EducationBtn");
        ln.findAndClick("setupfive");

    }

    @When("^Create a education name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createAEducationNameAsCodeAs(String name, String code) {
        ln.findAndClick("subjectCategoriesBtn");
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("codeInput", code);
        dc.findAndClick("saveButton");
    }


    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String newWord) {
        ln.findAndClick("subjectCategoriesBtn");
        dc.findAndDelete(newWord);
    }


    @When("^Create a subject education name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createASubjectEducationNameAsCodeAs(String name, String code) {
        ln.findAndClick("subjectBtn");
        dc.findAndClick("addSubjectButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("codeInput", code);
        dc.findAndClick("SubjectCategoriesClik");
        dc.ChooseListElement("educationAllOptions","Mathematics");
        dc.findAndClick("saveButton");
    }


    @When("^Create a subject new Education name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createASubjectNewEducationNameAsCodeAs(String name, String code) {
        ln.findAndClick("subjectBtn");
        dc.findAndClick("addSubjectButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("codeInput", code);
        dc.findAndClick("SubjectCategoriesClik");
        dc.ChooseListElement("educationAllOptions","MySubjectCat");
        dc.findAndClick("saveButton");
    }

    @When("^User delete subject the \"([^\"]*)\"$")
    public void userDeleteSubjectThe(String subjectName)  {
        ln.findAndClick("subjectBtn");
        dc.findAndDelete(subjectName);

    }



}
