package com.difital.pages;

import com.difital.helper.MenuHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{
    MenuHelper menuHelper = new MenuHelper();
    @FindBy(xpath = "//ul [@id='nav']/li[2]/a")
    public WebElement SubSubListSelectOption;

    public MenuPage selectClickSubSubMenu(){
        elementActions.clickTheButton(SubSubListSelectOption).;
        menuHelper.menuSelect();
        return this;

    }

}
