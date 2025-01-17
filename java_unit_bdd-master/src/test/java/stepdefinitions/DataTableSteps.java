package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.DataTablesPage;
import utils.StringUtils;

import static io.qameta.allure.Allure.step;

public class DataTableSteps {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("The sum of the Due column is {double}")
    public void checkSumOfColumn(Double sum) {
        step("check that some of the due list is: " + sum);
        Double actualSum = 0.0;
        for (String due : dataTablesPage.getFirstDueList()) {
            actualSum += StringUtils.getDoubleFromString(due);
        }
        Assert.assertEquals(actualSum, sum, "Sum is not correct");
    }
}
