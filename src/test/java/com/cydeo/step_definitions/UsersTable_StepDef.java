package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.UserPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UsersTable_StepDef {
    LoginPage loginPage = new LoginPage();
    UserPage userPage = new UserPage();
    BasePage basePage = new BasePage();
    String act = null;

    @And("clicks on {string} link")
    public void clicks_on_link(String string) {
        BrowserUtils.waitForVisibility(basePage.booksDashIcon, 10);

        switch (string.toLowerCase()){
            case "users":
                basePage.userPageIcon.click();
                break;
            case "dashboard":
                basePage.userDashIcon.click();
                break;
            case "books":
                basePage.booksDashIcon.click();
                break;
        }



    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedTableHeader) {

        BrowserUtils.waitForVisibility(userPage.userProfile,10);
        List<String> actualTableHeader = BrowserUtils.getElementsText(userPage.tableContents);
        Assert.assertEquals(expectedTableHeader,actualTableHeader);
    }
}
