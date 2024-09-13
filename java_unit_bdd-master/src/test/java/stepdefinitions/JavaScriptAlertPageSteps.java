package stepdefinitions;

import static io.qameta.allure.Allure.step;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.JavaScriptAlertsPage;

public class JavaScriptAlertPageSteps {
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @When("I generate JS alert on the JavaScript Alert Page")
    public void generateJSAlert() {
        step("I generate JS alert on the JavaScript Alert Page");
        javaScriptAlertsPage.clickForJsAlertBtn();
    }

    @Then("Success message is displayed on the JavaScript Alert Page")
    public void acceptAlert() {
        step("check that succes message is displayed on javascript alert page");
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success message is not displayed");
    }
}
