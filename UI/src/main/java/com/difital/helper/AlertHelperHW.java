package com.difital.helper;

import com.difital.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelperHW {
    Alert alert;

    public AlertHelperHW switchToTheAlert(){
        alert = Driver.getDriver().switchTo().alert();
        return this;
    }
    public AlertHelperHW waitTheTimeForAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6))
                .until(ExpectedConditions.alertIsPresent());
        return this;
    }

    public AlertHelperHW switchAlertAccept(){
        switchToTheAlert();
        waitTheTimeForAlert();
        alert.accept();
        return this;
    }
    public AlertHelperHW switchAlertDissmis(){
        switchToTheAlert();
        waitTheTimeForAlert();
        alert.dismiss();
        return this;
    }
    public AlertHelperHW sendKeysAlert(String txt){
        waitTheTimeForAlert();
        switchToTheAlert();
        alert.sendKeys(txt);
        alert.accept();
        return this;

    }


}
