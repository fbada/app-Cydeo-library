package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.UserPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStep_Defs {
LoginPage loginPage = new LoginPage();
UserPage userPage = new UserPage();
BasePage basePage = new BasePage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    String act = null;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("envt"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
       loginPage.emailInputField.sendKeys(ConfigurationReader.getProperty("lib01_username"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
       loginPage.passwordInputField.sendKeys(ConfigurationReader.getProperty("lib01_password"));
       loginPage.submitButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        wait.until(ExpectedConditions.visibilityOf(userPage.librarianUserCount));
        String act = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(act.contains("dashboard"));
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        loginPage.emailInputField.sendKeys(ConfigurationReader.getProperty("student03_Username"));
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.passwordInputField.sendKeys(ConfigurationReader.getProperty("student03_password"));
        loginPage.submitButton.click();
    }
    @Then("user should see books displayed")
    public void user_should_see_books_displayed() {
       BrowserUtils.waitFor(3);
        act= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(act.contains("books"));
    }

    @When("the user enters username {string}")
    public void the_user_enters_username(String string) {
        loginPage.emailInputField.sendKeys(string);
    }
    @When("the user enters password {string}")
    public void the_user_enters_password(String string) {
        loginPage.passwordInputField.sendKeys(string);
    }
    @When("the user enters clicks the sign in button")
    public void the_user_enters_clicks_the_sign_in_button() {
       loginPage.submitButton.click();
    }
    @Then("there should be {int} users")
    public void there_should_be_users(Integer int1) {

        wait.until(ExpectedConditions.visibilityOf(userPage.librarianUserCount));
        Assert.assertTrue(userPage.librarianUserCount.getText().equals(String.valueOf(int1)));
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String string, String string2) {
        loginPage.emailInputField.sendKeys(string);
        loginPage.passwordInputField.sendKeys(string2);
        loginPage.submitButton.click();
    }
    @Then("the user should see their {string} in the dashboard")
    public void the_user_should_see_their_in_the_dashboard(String string) {
        wait.until(ExpectedConditions.visibilityOf(userPage.userProfile));

        String actualUser = userPage.userProfile.getText();
        Assert.assertEquals(actualUser, string);

    }

    @Given("user logs in as a librarian")
    public void user_logs_in_as_a_librarian() {
        loginPage.emailInputField.sendKeys(ConfigurationReader.getProperty("lib01_username"));
        loginPage.passwordInputField.sendKeys(ConfigurationReader.getProperty("lib01_password"));
        loginPage.submitButton.click();
    }



}
