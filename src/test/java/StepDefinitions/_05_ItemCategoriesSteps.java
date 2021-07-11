package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _05_ItemCategoriesSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();


    @And("^Navigate to Item Category page$")
    public void navigateToItemCategoryPage() {
        ln.findAndClick("inventory");
        ln.findAndClick("setupTwo");
        ln.findAndClick("itemCategories");

    }

    @When("^User create a item categories as \"([^\"]*)\" short as \"([^\"]*)\"$")
    public void userCreateAItemCategoriesNameAsShortNameAs(String name, String userType) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.ChooseListElement("userTypeAllOptions", userType);
        dc.findAndClick("saveButton");
        dc.findAndDelete(name);
    }

}
