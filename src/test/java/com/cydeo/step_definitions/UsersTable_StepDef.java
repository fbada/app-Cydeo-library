package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.UserPage;
import com.cydeo.utilitiies.BrowserUtils;
import com.cydeo.utilitiies.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
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
            case "user":
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
    public void table_should_have_following_column_names(List<String> expDataTable) {
        //expected keyword dictates that an exp to act assertion is iin play

       List<String> actDataTable = BrowserUtils.getElementsText(userPage.tableContents);
        Assert.assertEquals(expDataTable, actDataTable);



    }


}
