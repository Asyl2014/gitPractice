package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveToElement extends BaseTest{

    @Test
    void demo1234() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        String expectedFullname = "John Doe";
        fullNameInputField.sendKeys(expectedFullname);

        String expectedEmail = "john@gmail.com";
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys(expectedEmail);

        String expectedCurentAddress = "Bishkek312";
        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys(expectedCurentAddress);

        String expectedpermamentAdress = "Dubai";
        WebElement permamentAddress = driver.findElement(By.id("permanentAddress"));
        permamentAddress.sendKeys(expectedpermamentAdress);


        WebElement submitBtn = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitBtn);
        submitBtn.click();
        Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains(expectedFullname));

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultAddress.getText().contains(expectedCurentAddress));

        WebElement resultPermAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermAddress.getText().contains(expectedpermamentAdress));

    }
}
