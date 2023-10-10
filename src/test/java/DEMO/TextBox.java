package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox extends BaseTest{

    @Test


    void fillUpTheFormTest() throws InterruptedException {


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
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
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

        driver.close();
        driver.quit();

    }
}
