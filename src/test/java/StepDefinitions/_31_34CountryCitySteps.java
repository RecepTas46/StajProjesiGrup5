//package StepDefinitions;
//
//import Pages.DialogContent;
//import Pages.LeftNav;
//import Pages.Parent;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.openqa.selenium.By;
//
//public class _31_34CountryCitySteps {
//    LeftNav ln=new LeftNav();
//    DialogContent dc=new DialogContent();
//
//    @And("^Navigate to country page$")
//    public void navigateToCountryPage() {
//        ln.findAndClick("setupOne");
//        ln.findAndClick("parameters");
//        ln.findAndClick("Countries");
//    }
//
//    @When("^Create a country name as \"([^\"]*)\" code as \"([^\"]*)\"$")
//    public void createACountryNameAsCodeAs(String name, String code) {
//        dc.findAndClick("addButton");
//        dc.findAndSend("nameInput",name);
//        dc.findAndSend("codeInput",code);
//        dc.findAndClick("saveButton");
//    }
//
//    @Then("^Success message should be displayed$")
//    public void successMessageShouldBeDisplayed() {
//        dc.findAndContainsText("successMessage","success");
//        dc.invisibilityOfElement("successMessage");
//    }
//
//    @When("^Create a city name as \"([^\"]*)\" for \"([^\"]*)\"$")
//    public void createACityNameAsFor(String cityname, String countryname)  {
//        ln.findAndClick("cities");
//        dc.findAndClick("countrySelect");
//        dc.ChooseListElement("countryAllOptions",countryname);
//        dc.findAndClick("addButton");
//        dc.findAndSend("cityName",cityname);
//        dc.findAndClick("saveButton");
//    }
//
//    @When("^Delete the \"([^\"]*)\"$")
//    public void deleteThe(String name) {
//        ln.SliderAction("surgu",0,-100);
//        ln.findAndClick("Countries");
//        dc.findAndDelete(name);
//
//    }
//
//    @Then("^Can not be deleted message should be displayed$")
//    public void canNotBeDeletedMessageShouldBeDisplayed() {
//        dc.findAndContainsText("cannotDeletedMsg","deleted");
//        dc.invisibilityOfElement("cannotDeletedMsg");
//
//    }
//
//
//    @When("^Delete the city \"([^\"]*)\" for \"([^\"]*)\"$")
//    public void deleteTheTheCityFor(String cityname, String countryname) {
//        ln.findAndClick("cities");
//        dc.findAndClick("countrySelect");
//        dc.ChooseListElement("countryAllOptions",countryname);
//        dc.waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 4);
//        dc.findAndClick("deleteButton");
//        dc.findAndClick("deleteDialogBtn");;
//
//    }
//}
