package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "mat-select-value-7")
    private WebElement academicPeriod;

    @FindBy(css = "span[class='mat-option-text']")
    private WebElement academicPeriod2;

    @FindBy(id = "mat-select-value-9")
    private WebElement gradeLevel;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//mat-form-field//input")
    private WebElement formSearchInput;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement gradeLevel1;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel3;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement gradeLevel4;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement inputEmployeeName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement inputEmployeeLastName;

    @FindBy(xpath = "//mat-select[@formcontrolname='gender']")
    private WebElement gender;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement male;

    @FindBy(xpath = "(//div[contains(@class,'mat-select-value ng-tns-c')])[2]")
    private WebElement employeeType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement employeeTeacher;

    @FindBy(xpath = "//input[@formcontrolname='employeeId'][@data-placeholder='Employee ID']")
    private WebElement employeeId;

    @FindBy(xpath = "(//mat-select[@formcontrolname='type']//div)[2]")
    private WebElement documentType;

    @FindBy(xpath = "//span[contains(text(),'Passport')]")
    private WebElement passport;

    @FindBy(xpath = "(//mat-form-field//input)[9]")
    private WebElement documentNumber;


    WebElement myElement;

    public void findAndClick(String elementName) {
        switch (elementName) {
            case "academicPeriod":
                myElement = academicPeriod;
                break;

            case "academicPeriod2":
                myElement = academicPeriod2;
                break;

            case "gradeLevel":
                myElement = gradeLevel;
                break;

            case "gradeLevel1":
                myElement = gradeLevel1;
                break;

            case "gradeLevel2":
                myElement = gradeLevel2;
                break;

            case "gradeLevel3":
                myElement = gradeLevel3;
                break;

            case "gradeLevel4":
                myElement = gradeLevel4;
                break;

            case "saveButton":
                myElement = saveButton;
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

            case "gender":
                myElement = gender;
                break;

            case "male":
                myElement = male;
                break;

            case "employeeType":
                myElement = employeeType;
                break;

            case "employeeTeacher":
                myElement = employeeTeacher;
                break;

            case "documentType":
                myElement = documentType;
                break;

            case "passport":
                myElement = passport;
                break;


        }

        clickFunction(myElement);

        if (myElement == employeeTeacher) {
            ESCClick();
        }

    }

    public void findAndSend(String elementName, String value) {
        switch (elementName) {
            case "formSearchInput":
                myElement = formSearchInput;
                break;

            case "inputEmployeeName":
                myElement = inputEmployeeName;
                break;

            case "inputEmployeeLastName":
                myElement = inputEmployeeLastName;
                break;

            case "employeeId":
                myElement = employeeId;
                break;

            case "documentNumber":
                myElement = documentNumber;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndDelete(String deleteString) {
        // tıklatma
        scrollToUpElement(rightScroll);
        findAndSend("formSearchInput", deleteString);
        findAndClick("searchButton");

        // çöp kovaları 5 den az olana kadar bekle: search sonucu gözükene kadar bekle
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }
}
