package StepDefinitions;

import Pages.FormContent;
import cucumber.api.java.en.When;

import java.util.List;

public class _09_EmployeeSteps {
    FormContent fc =new FormContent();

    @When("^User sending the keys in form content$")
    public void userSendingTheKeysInFormContent(List<List<String>> data) {
        for(int i=0;i<data.size();i++)
        {
            fc.findAndSend(data.get(i).get(0), data.get(i).get(1));
        }
    }
}
