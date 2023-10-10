package com.difital.pages;

import com.difital.driver.Driver;
import com.difital.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public  BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    ElementActions elementActions = new ElementActions();
}

