package com.cydeo.step_definitions;

import com.cydeo.pages.HiOscarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HiOscar_Steps {

HiOscarPage hiOscarPage = new HiOscarPage();
    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.getDriver().get("https://www.hioscar.com/care-options");
    }
    @When("the user clicks search Networks")
    public void the_user_clicks_search_networks() {
        hiOscarPage.searchButton.click();
    }
    @When("from Coverage year dropdown Select {string} option")
    public void from_coverage_year_dropdown_select_option(String string) {
        BrowserUtils.waitForVisibility(hiOscarPage.dropdownCoverageYear, 35);
          hiOscarPage.dropdownCoverageYear.click();
          BrowserUtils.waitForVisibility( hiOscarPage.getOption(string),30);
          hiOscarPage.getOption(string).click();
    }
    @When("from Coverage access dropdown Select {string} option")
    public void from_coverage_access_dropdown_select_option(String string) {
        hiOscarPage.clickOptions(string, hiOscarPage.dropdownCoverageAccess);
    }
    @When("from Network partner dropdown Select {string} option")
    public void from_network_partner_dropdown_select_option(String string) {
        hiOscarPage.clickOptions(string, hiOscarPage.dropdownNetworkPartner);
    }
    @When("from Coverage area dropdown Select {string}")
    public void from_coverage_area_dropdown_select(String string) {
       hiOscarPage.clickOptions(string, hiOscarPage.dropdownCoverageArea);
    }
    @When("Clicks Continue button")
    public void clicks_continue_button() {
        BrowserUtils.waitForVisibility(hiOscarPage.continueButton, 45);
        hiOscarPage.continueButton.click();
    }
    @Then("Verify title contains {string}")
    public void verify_title_contains(String string) {
        BrowserUtils.waitForVisibility(hiOscarPage.titleH2, 50);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}
