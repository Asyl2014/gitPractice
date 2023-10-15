package com.difital.pages;

import com.difital.helper.MenuHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{
    MenuHelper menuHelper = new MenuHelper();
    @FindBy(xpath = "//ul [@id='nav']/li[2]/a")
    public WebElement menuMain;

    @FindBy(xpath = "//ul [@id='nav']/li[2]/ul/li[3]")
    public WebElement subMenu;

    @FindBy(xpath = "//ul [@id='nav']/li[2]/ul/li[3]/ul/li[2]")
    public WebElement susSubMenu;



}
