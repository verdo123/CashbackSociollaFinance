package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FinancePage {
    private WebDriver driver;
    private Select select;

    public FinancePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    //Locator find element
    @FindBy(xpath = "//p[normalize-space()='Finance']")
    private WebElement FinanceMenu;

    @FindBy(xpath = "//*[@id='table_filter']/label/input")
    private WebElement coloumnSearch;

    @FindBy(xpath = "//*[@id='data_id']")
    private WebElement checkBox;

    @FindBy(xpath = "//*[@id='form_distribution']/button[1]")
    private WebElement btnUpdate;

//------------------------------------
    public void clickFinanceMenu(){FinanceMenu.click();}

    public void clickCloumnSearch(){
        coloumnSearch.sendKeys("tester");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);
    }

    public void clickCheckBox(){checkBox.click();}

    public void clickBtnUpdate(){btnUpdate.click();}


}
