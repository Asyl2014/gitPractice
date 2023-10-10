package com.difital.pages;

import com.difital.helper.AlertHelperHW;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{
    AlertHelperHW alertHelperHW = new AlertHelperHW();

    @FindBy (id = "alertButton")
    public WebElement alertButton;
    @FindBy (id = "timerAlertButton")
    public WebElement timerAlertButton;
    @FindBy (id = "confirmButton")
    public WebElement confirmButton;
    @FindBy (id = "promtButton")
    public WebElement promtButton;

    public AlertPage clickAlertBtn(){
        elementActions.clickTheButton(alertButton);
        alertHelperHW.switchAlertAccept();
        return this;
    }
    public AlertPage clickTimerAlertBtn (){
        elementActions.clickTheButton(timerAlertButton);
        alertHelperHW.waitTheTimeForAlert().switchAlertAccept();
        return this;
    }
    public AlertPage clickConfirmButton(){
        elementActions.clickTheButton(confirmButton);
        alertHelperHW.waitTheTimeForAlert().switchAlertDissmis();
        return this;
    }
     public AlertPage clickPromtButton(){
        elementActions.clickTheButton(promtButton);
        alertHelperHW.waitTheTimeForAlert().sendKeysAlert("AsylInAlertPage");
        return this;
     }
}
