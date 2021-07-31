package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _39_ReportsSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent fc=new FormContent();
    Parent pr=new Parent();

    @And("^Navigate to reports page$")
    public void navigateToReportsPage() {
        ln.findAndClick("reports");
        ln.findAndClick("reportsSetup");
        ln.findAndClick("excelTemplate");
    }

    @When("^Create a Excel Template name as \"([^\"]*)\"$")
    public void createAExcelTemplateNameAs(String name)  {
        pr.waitUrlContains("budget-excel-templates/list");
        dc.findAndClick("addButton1");
        fc.findAndSend("Name",name);
        fc.findAndSend("periodCount","1");
        dc.findAndClick("saveButton");

    }

    @Then("^Create the version part$")
    public void createTheVersionPart() {
        fc.findAndSend("rowSize","100");
        fc.findAndSend("columnSize","10");
        dc.findAndClick("saveButton");
        fc.findAndClick("closeDialog");
    }

    @When("^Edit the Excel Template \"([^\"]*)\" as \"([^\"]*)\"$")
    public void editTheExcelTemplateAs(String oldName, String newName)  {
      dc.findAndClick("editBtn");
      fc.findAndSend("Name",newName);
      fc.findAndSend("periodCount","30");
      dc.findAndClick("saveButton");
      fc.findAndClick("closeDialog");
    }

    @When("^Delete the Excel Template \"([^\"]*)\"$")
    public void deleteTheExcelTemplate(String name)  {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");

    }

    @And("^Navigate to Salary Types page$")
    public void navigateToSalaryTypesPage() {
        ln.SliderAction("surgu",0,-250);
        ln.findAndClick("humanResources");
        ln.findAndClick("humanRecSetUp");
        ln.findAndClick("salaryTypes");

    }


}
