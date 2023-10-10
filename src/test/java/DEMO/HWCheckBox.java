package DEMO;

import DEMO.BaseTestHWNambaFood;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HWCheckBox extends BaseTestHWNambaFood {

    @Test
    public void CheckBox12() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.location = 'https://demoqa.com/checkbox'");
        Thread.sleep(500);



        WebElement CheckBoxOpen = driver.findElement(By.xpath("//div [@class ='check-box-tree-wrapper']/div/ol/li/span/button"));
        CheckBoxOpen.click();


        WebElement CheckBoxDownload = driver.findElement(By.xpath("//div [@class ='check-box-tree-wrapper']/div/ol/li/ol/li[3]/span/button"));
        executor.executeScript("arguments[0].click",CheckBoxDownload); ////div [@class ='check-box-tree-wrapper']/div/ol/li/ol/li[3]/span/button
        //CheckBoxDownload.click();


        WebElement ChooseFileType = driver.findElement(By.xpath("//div [@class ='check-box-tree-wrapper']/div/ol/li/ol/li[3]/ol/li[2]/span/label/span"));
        executor.executeScript("arguments[0].click;",ChooseFileType); //why do not work
        //ChooseFileType.click();
        Thread.sleep(10000);

        WebElement textForTest = driver.findElement(By.className("text-success"));
        String expectedMassegeD3 = "excelFile";
        Assert.assertTrue(textForTest.getText().contains(expectedMassegeD3));


    }

}
