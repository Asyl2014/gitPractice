package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HWForsecond extends BaseTestHWNambaFood{

    @Test
    void DemoTEstHW() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='http://adactinhotelapp.com/'");

        WebElement firstName = driver.findElement(By.id("username"));
        firstName.sendKeys("Sox");
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", firstName, "border: 3px solid red");


        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("Poxit");
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", passWord, "border: 3px solid red");


        WebElement submit = driver.findElement(By.id("login"));
        js.executeScript("arguments[0].click()",submit);
        Thread.sleep(5000);



    }
}
