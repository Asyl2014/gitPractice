package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AcctionsDemo extends BaseTest{

    @Test
    void demo123(){
        driver.get ("https://demoqa.com/buttons");
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton);
        // make double click
        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleCliktestText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        Assert.assertEquals(doubleCliktestText.getText(),"You have done a double click");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton);

        WebElement rightClickTestText = driver.findElement(By.xpath("//p[text()=''"));
        Assert.assertEquals(rightClickTestText.getText(),"You have done a right click");

        WebElement clickOne = driver.findElement(By.xpath("//button[text()='Click me'"));
        actions.click(clickOne);

        WebElement clickOneTestText = driver.findElement(By.xpath("//p[text()=''"));
        Assert.assertEquals(clickOneTestText.getText(), "You have done a right click");


            }
        }



