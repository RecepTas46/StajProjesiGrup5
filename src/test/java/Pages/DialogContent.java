package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    public WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-add-button//button[contains(@class,'mat-button')]")
    private WebElement addButton1;

    @FindBy(xpath = "//ms-table-toolbar//ms-add-button[contains(@class, 'ng-star-inserted')]//button")
    private WebElement addSubjectButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'error')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//mat-form-field//ms-text-field[contains(@id,'ms-text-field')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(css = "div>mat-option>span")
    private List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//mat-chip-list[@formcontrolname='roles']//input")
    private WebElement userType;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;

    @FindBy(xpath = "//input[@id='ms-integer-field-0']")
    private WebElement priorityInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editBtn;

    @FindBy(css = "div>mat-option")
    private List<WebElement> countryAllOptions;

    @FindBy(xpath = "//mat-select[contains(@aria-labelledby,'mat-form-field')]")
    private WebElement countrySelect;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement cityName;

    @FindBy(xpath = "//div[contains(text(),'deleted')]")
    private WebElement cannotDeletedMsg;

    @FindBy(xpath = "//span[text()='Subject Category']")
    private WebElement SubjectCategoriesClik;

    @FindBy(css = "div>mat-option>span")
    private List<WebElement> educationAllOptions;

    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c70-50']")
    private WebElement descriptionClick;

    @FindBy(css = "input[aria-required='true']")
    private WebElement descriptionSendKeys;

    @FindBy(xpath = "//input[@data-placeholder='Budget Info Entering Start Date']")
    private WebElement budgetStartDate;

    @FindBy(xpath = "//div[text()=17]")
    private WebElement budgetStartSecim;

    @FindBy(xpath = "//input[@data-placeholder='Budget Info Entering End Date']")
    private WebElement budgetEndDate;

    @FindBy(xpath = "//div[text()=18]")
    private WebElement budgetEndSecim;

    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c70-53']")
    private WebElement budgetCommentClick;

    @FindBy(css = "textarea[formcontrolname='comment']")
    private WebElement budgetCommentInput;

    @FindBy(xpath = "//input[@placeholder='Expense account code prefixes']")
    private WebElement expenseAccount;

    @FindBy(xpath = "//span[text()='Type']")
    private WebElement budgetTypeClick;

    @FindBy(css = "div>mat-option>span")
    private List<WebElement> budgetCostAllOptions;

    @FindBy(xpath = "(//ms-edit-button//button)")
    private WebElement budgetCostEditBtn;

    //******************************
    @FindBy(xpath = "(//mat-select[contains(@aria-labelledby,'mat-form-field')])[2]")
    private WebElement countrySelectDialog;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']//input")
    private WebElement editName;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement salConstName;

    @FindBy(xpath = "//input[@data-placeholder='Valid From']")
    private WebElement validFrom;

    @FindBy(xpath = "(//ms-custom-header//div//button)[5]")
    private WebElement nextYear;

    @FindBy(xpath = "(//tbody//td[@role='gridcell'])[1]")
    private WebElement firstJuly;

    @FindBy(xpath = "//ms-text-field[@name='key']//input")
    private WebElement keyInput;

    @FindBy(xpath = "//input[@inputmode='numeric']")
    private WebElement vaLue;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement salConsName;

    @FindBy(xpath = "//button[contains(@class,'mat-accent')]")
    private WebElement salsearchBtn;

    @FindBy(xpath = "//ms-delete-button//button")
    private List<WebElement> delButtons;

    @FindBy(xpath = "/ms-edit-button//button[contains(@class,'mat-focus-indicator')]")
    private List<WebElement> editButtons;

    WebElement myElement;
    List<WebElement> myElements;

    public void findAndSend(String elementName, String value) {
        switch (elementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "codeInput":
                myElement = codeInput;
                break;

            case "shortName":
                myElement = shortName;
                break;

            case "searchInput":
                myElement = searchInput;
                break;

            case "cityName":
                myElement = cityName;
                break;

            case "descriptionSendKeys":
                myElement = descriptionSendKeys;
                break;

            case "budgetCommentInput":
                myElement = budgetCommentInput;
                break;
            case "expenseAccount":
                myElement = expenseAccount;
                break;
            case "editName":myElement = editName; break;
            case "salConstName":myElement = salConstName; break;
            case "keyInput":myElement = keyInput; break;
            case "vaLue":myElement = vaLue; break;
            case "salConsName":myElement = salConsName; break;


        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String elementName) {
        switch (elementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "addButton":
                myElement = addButton;
                break;
            case "addSubjectButton":
                myElement = addSubjectButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "closeDialog":
                myElement = closeDialog;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "deleteDialogBtn":
                myElement = deleteDialogBtn;
                break;

            case "rightScroll":
                myElement = rightScroll;
                break;

            case "acceptCookies":
                myElement = acceptCookies;
                break;

            case "editBtn":
                myElement = editBtn;
                break;

            case "countrySelect":
                myElement = countrySelect;
                break;


            case "SubjectCategoriesClik":
                myElement = SubjectCategoriesClik;
                break;
            case "descriptionClick":
                myElement = descriptionClick;
                break;
            case "budgetCommentClick":
                myElement = budgetCommentClick;
                break;

            case "budgetStartDate":
                myElement = budgetStartDate;
                break;

            case "budgetStartSecim":
                myElement = budgetStartSecim;
                break;
            case "budgetEndDate":
                myElement = budgetEndDate;
                break;
            case "budgetEndSecim":
                myElement = budgetEndSecim;
                break;
            case "budgetTypeClick":
                myElement = budgetTypeClick;
                break;
            case "budgetCostEditBtn":
                myElement = budgetCostEditBtn;
                break;
            case "addButton1":myElement= addButton1; break;
            case "countrySelectDialog":myElement= countrySelectDialog; break;
            case "validFrom":myElement= validFrom; break;
            case "nextYear":myElement= nextYear; break;
            case "firstJuly":myElement= firstJuly; break;
            case "salsearchBtn":myElement= salsearchBtn; break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String elementName, String msg) {
        switch (elementName) {
            case "successMessage":
                myElement = successMessage;
                break;

            case "errorMessage":
                myElement = errorMessage;
                break;

            case "alreadyExist":
                myElement = alreadyExist;
                break;
            case "cannotDeletedMsg":
                myElement = cannotDeletedMsg;
                break;
        }

        verifyContainsText(myElement, msg);
    }


    public void findAndDelete(String deleteString) {
        // t??klatma
        scrollToUpElement(rightScroll);
        findAndSend("searchInput", deleteString);
        findAndClick("searchButton");

        // ????p kovalar?? 5 den az olana kadar bekle: search sonucu g??z??kene kadar bekle
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }

    List<WebElement> myList;

    public void ChooseListElement(String listName, String option) {
        switch (listName) {

            case "userTypeAllOptions":
                myList = userTypeAllOptions;
                break;

            case "countryAllOptions":
                myList = countryAllOptions;
                break;

            case "educationAllOptions":
                myList = educationAllOptions;
                break;
            case "budgetCostAllOptions":
                myList = budgetCostAllOptions;
                break;


        }
        listSelectOption(myList, option);
    }


    public void findAndEdit(String oldWord, String newWord) {
        // t??klatma
        scrollToUpElement(rightScroll);
        findAndSend("searchInput", oldWord);
        findAndClick("searchButton");

        // ????p kovalar?? 5 den az olana kadar bekle: search sonucu g??z??kene kadar bekle
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("editBtn");
        findAndSend("nameInput", newWord);
        findAndClick("saveButton");
    }

    // ---
    public void findAndEditbudget(String oldWord, String newWord) {
        // t??klatma
        scrollToUpElement(rightScroll);
        findAndSend("searchInput", oldWord);
        findAndClick("searchButton");

        // ????p kovalar?? 5 den az olana kadar bekle: search sonucu g??z??kene kadar bekle
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("editBtn");
        descriptionSendKeys.clear();
        findAndSend("descriptionSendKeys", newWord);
        findAndClick("saveButton");
    }


    // --
    public void invisibilityOfElement(String elementName) {
        switch (elementName) {
            case "successMessage":
                myElement = successMessage;
                break;

        }
        waitUntilInvisibility(myElement);
    }

    public void listElementsSituation(String listName,By selector)
    {
        switch (listName) {
            case "delButtons":myElements = delButtons; break;
            case "editButtons":myElements = editButtons; break;
        }
        if (myElements.size()>1)
            waitnumberOfElementsToBeLessThan(selector,2);

    }
}


