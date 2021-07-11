package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.BaseDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class _01_LoginSteps {

    DialogContent dc=new DialogContent();
    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {
      // siteyi aç
        WebDriver driver= BaseDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();

    }

    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button()  {
        // login işlemleri
//        dc.username.sendKeys("richfield.edu");
//        dc.password.sendKeys("Richfield2020!");
//        dc.loginButton.click();

        dc.findAndSend("username", "richfield.edu");
        dc.findAndSend("password", "Richfield2020!");
        dc.findAndClick("loginButton");
        dc.findAndClick("acceptCookies");
    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully()  {
       //kontrol
        Parent.waitUntilVisible(dc.dashboard);
        System.out.println("dc.dashboard= "+dc.dashboard.getText());
        Assert.assertEquals(dc.dashboard.getText(), "Dashboard");

    }

}
