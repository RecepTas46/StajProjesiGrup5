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
        ln.findAndClick("subjectCategoriesBtn");
    }

    @When("^Create a education name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createAEducationNameAsCodeAs(String name, String code) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("codeInput", code);
        dc.findAndClick("saveButton");
    }


    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String newWord) {
        dc.findAndDelete(newWord);
    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String oldWord, String newWord) {
        dc.findAndEdit(oldWord, newWord);

    }

    @And("^Navigate to education pageSubject$")
    public void navigateToEducationPageSubject() {
        ln.findAndClick("EducationBtn");
        ln.findAndClick("setupfive");
        ln.findAndClick("subjectBtn");
    }

    @When("^Create a subject education name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createASubjectEducationNameAsCodeAs(String name, String code) {
        ln.findAndClick("subjectBtn");
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("codeInput", code);
        dc.findAndClick("SubjectCatogires");
        dc.findAndClick("MathBtn");
        dc.findAndClick("saveButton");
    }


    @And("^Select 'MySubjectCat'$")
    public void selectMySubjectCat() {

    }
}
