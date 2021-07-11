package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _10_EducationSteps {
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

}
