package com.difital.helper;

import com.difital.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {
    Alert alert;

    public AlertHelper acceptAlert(){
        switchToTheAlert();
        waitAlertToBePresent();
        alert.accept();
        return this;


    }

    public AlertHelper dismissAlert (){
        switchToTheAlert();
        waitAlertToBePresent();
        alert.dismiss();
        return this;
    }
    public AlertHelper sentKeysAlert(String txt){
        switchToTheAlert();
        waitAlertToBePresent();
        alert.sendKeys(txt);
        alert.accept();
        return this;
    }
    public AlertHelper switchToTheAlert (){
        alert = Driver.getDriver().switchTo().alert();
        return this;
    }

    public AlertHelper waitAlertToBePresent (){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        return this;
    }
}
