package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class _38_310HumanResourcesSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent fc=new FormContent();
    Parent pr=new Parent();

    @And("^Navigate to human resources page$")
    public void navigateToHumanResourcesPage() {
        ln.findAndClick("humanResources");
        ln.findAndClick("humanRecSetUp");

    }

    @When("^Create a position salary name as \"([^\"]*)\"$")
    public void createAPositionSalaryNameAs(String salaryName) {
        ln.findAndClick("positionSalary");
        pr.waitUrlContains("positions/list");
        dc.findAndClick("addButton");
        dc.findAndSend("editName",salaryName);
        dc.findAndClick("saveButton");
    }

    @When("^Edit position salary \"([^\"]*)\" as \"([^\"]*)\"$")
    public void editNameAs(String name1, String name2) {
      dc.findAndClick("editBtn");
      dc.findAndSend("editName", name2);
      dc.findAndClick("saveButton");

    }

    @When("^Delete the position salary \"([^\"]*)\"$")
    public void deleteThePositionSalary(String name)  {
     dc.findAndClick("deleteButton");
     dc.findAndClick("deleteDialogBtn");

    }

    @And("^Navigate to Positions page$")
    public void navigateToPositionsPage() {
        ln.findAndClick("positions");
    }

    @When("^Create a position name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void createAPositionNameAsShortNameAs(String name, String shortName)  {
        pr.waitUrlContains("employee-position");
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("shortName",shortName);
        dc.findAndClick("saveButton");

    }
    @When("^Edit the position \"([^\"]*)\" as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void editThePositionAsShortNameAs(String oldName, String newName, String newshortName)  {
        dc.findAndClick("editBtn");
        dc.findAndSend("nameInput", newName);
        dc.findAndSend("shortName", newshortName);
        dc.findAndClick("saveButton");
    }

    @When("^Delete the position \"([^\"]*)\"$")
    public void deleteThePosition(String name)  {
      dc.findAndClick("deleteButton");
      dc.findAndClick("deleteDialogBtn");
    }

    @When("^Create a salary Modifiers name as \"([^\"]*)\"$")
    public void createASalaryModifiersNameAs(String name) {
        ln.findAndClick("salaryModifiers");
        pr.waitUrlContains("modifier-salary/list");
        dc.findAndClick("addButton");
        fc.findAndSend("description",name);
        fc.findAndSend("variable","KG15");
        fc.findAndClick("modifierType");
        fc.ChooseListElement("listOptions","Base Salary Modifier");
        fc.findAndClick("valueType");
        pr.waitnumberOfElementsToBeLessThan(By.xpath("//mat-option//span"), 3);
        fc.ChooseListElement("listOptions","Fixed Value");
        fc.findAndSend("priority","15");
        fc.findAndSend("amount","208");
        fc.findAndClick("saveButton");

    }
    @When("^Edit salary Modifiers \"([^\"]*)\" as \"([^\"]*)\"$")
    public void editSalaryModifiersAs(String oldNme, String newName){
       ln.findAndClick("humanResources");
       ln.findAndClick("humanRecSetUp");
        ln.findAndClick("salaryModifiers");
        pr.waitUrlContains("modifier-salary/list");
        dc.findAndClick("editBtn");
        fc.findAndEdit(newName);

    }

    @When("^Delete the salary Modifiers \"([^\"]*)\"$")
    public void deleteInFormContent(String newName) {
        ln.findAndClick("humanResources");
        ln.findAndClick("humanRecSetUp");
        ln.findAndClick("salaryModifiers");
        pr.waitUrlContains("modifier-salary/list");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }

    @And("^Navigate to Salary Constants page$")
    public void navigateToSalaryConstantsPage() {
        ln.findAndClick("salaryConstants");
    }

    @When("^Create a Salary Constants name as \"([^\"]*)\" key input as \"([^\"]*)\"$")
    public void createASalaryConstantsNameAsKeyInputAs(String name, String keyName)  {
        pr.waitUrlContains("salary-constants");
        dc.findAndClick("addButton");
        dc.findAndSend("salConstName",name);
        dc.findAndClick("validFrom");
        dc.findAndClick("nextYear");
        dc.findAndClick("firstJuly");
        dc.findAndSend("keyInput",keyName);
        dc.findAndSend("vaLue","200$");
        dc.findAndClick("saveButton");
    }

    @When("^Edit Salary Constants \"([^\"]*)\" as \"([^\"]*)\"$")
    public void editSalaryConstantsAs(String oldName, String newName)  {
        dc.findAndClick("editBtn");
        dc.findAndSend("salConstName",newName);
        dc.findAndClick("saveButton");

    }


    @When("^Delete Salary Constants \"([^\"]*)\"$")
    public void deleteSalaryConstants(String name)  {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }


    @When("^Create a Salary Types name as \"([^\"]*)\"$")
    public void createASalaryTypesNameAs(String name)  {
       pr.waitUrlContains("salary-type/list");
        dc.findAndClick("addButton");
        fc.findAndSend("Name",name);
        fc.findAndClick("userType");
        fc.ChooseListElement("listOptions","Manager");
        dc.findAndClick("saveButton");
    }


    @When("^Edit Salary Types \"([^\"]*)\" as \"([^\"]*)\"$")
    public void editSalaryTypesAs(String oldName, String newName)  {
        dc.findAndClick("editBtn");
        fc.findAndSend("Name",newName);
        fc.findAndClick("cancelUserType");

        fc.ChooseListElement("listOptions","Everyone");
        dc.findAndClick("saveButton");
    }

    @When("^Delete Salary Types \"([^\"]*)\"$")
    public void deleteSalaryTypes(String name)  {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }


}
