package DEMO.HomeWork;

import DEMO.BaseTestHWNambaFood;
import DEMO.HomeWork.BasicHomWork;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.Test;

public class HWMenu extends BaseTestHWNambaFood {




    @Test
    void DemoHWMenu1 () throws InterruptedException {
        JavascriptExecutor jsMenu = (JavascriptExecutor) driver;
        jsMenu.executeScript("window.location='https://demoqa.com/menu'");


        Thread.sleep(1000);
        WebElement menuHW = driver.findElement(By.xpath("//div[@class='nav-menu-container']/ul/li[2]"));
        jsMenu.executeScript("arguments[0].setAttribute('style',arguments[1]);", menuHW, "boredr: 2px solid red");
        jsMenu.executeScript("arguments[0].click()",menuHW);
        //menuHW.click();





        Assert.assertTrue(menuHW.getText().contains("Main Item 2"));
        //Thread.sleep(5000);

        WebElement subSubM = driver.findElement((By.xpath("//div[@class = 'nav-menu-container']/ul/li[2]/ul/li[3]")));
        Assert.assertTrue(subSubM.getText().contains("SUB SUB LIST »"));
        subSubM.click();
        Thread.sleep(1000);

        WebElement subSSItem = driver.findElement(By.xpath("//div[@class = 'nav-menu-container']/ul/li[2]/ul/li[3]/ul/li[2]"));
        Assert.assertTrue(subSSItem.getText().contains("Sub Sub Item 2"));
        Thread.sleep(5000);





    }
}
