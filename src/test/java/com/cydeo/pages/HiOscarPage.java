package com.cydeo.pages;


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.hioscar.com/care-options
public class HiOscarPage {
    String url = "https://www.hioscar.com/care-options";
    
    @FindBy(xpath = "//span[text()='Search network']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='Dropdown_visibleContent__NGHUm']")
    public WebElement dropdownCoverageYear;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[2]")
    public WebElement dropdownCoverageAccess;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")
    public WebElement dropdownNetworkPartner;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[4]")
    public WebElement dropdownCoverageArea;

    @FindBy(xpath = "//button[@class='Button_buttonBase__26hAr Button_filled__1Lgot Button_button_primary__1BOBS Button_button_medium__2_2dm NetworkSelector_buttonSubmit__l3NsD']")
    public WebElement continueButton;

    @FindBy(xpath = "//h2")
    public WebElement titleH2;

    public WebElement getOption(String str){
        String xPath = "//ul/li[contains(@id, '"+str+"')]";
        return Driver.getDriver().findElement(By.xpath(xPath));
    }
    public void clickOptions(String str, WebElement element){
        BrowserUtils.waitForVisibility(element, 15);
        element.click();
        BrowserUtils.waitForVisibility(getOption(str),15);
        getOption(str).click();
    }
    public HiOscarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}