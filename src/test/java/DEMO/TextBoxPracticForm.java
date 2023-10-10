package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxPracticForm {
    @Test

    void fillUpTheFormTestPracticForm() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        String expectedFirstName = "Mark";
        firstNameField.sendKeys(expectedFirstName);


        WebElement lastNameField = driver.findElement(By.id("lastName"));
        String expectedlastName = "Sugar";
        lastNameField.sendKeys(expectedlastName);

        WebElement userEmailField = driver.findElement(By.id("userEmail"));
        String expecteduserEmail = "face@mail.us";
        userEmailField.sendKeys(expecteduserEmail);


        WebElement radius = driver.findElement(By.className("gender"));

        radius.click();
        Thread.sleep(5000);
//
//
//        WebElement labelBtnSecond = driver.findElement(By.id("gender-radio-2"));
//        labelBtnSecond.click();
//
//        WebElement labelBtnOther = driver.findElement(By.id("gender-radio-3"));
//        labelBtnOther.click();

        WebElement  userNumberField= driver.findElement(By.id("userNumber"));
        String expectedUserNumber = "1234567890";
        userNumberField.sendKeys(expectedUserNumber);

//        WebElement dateOfBirthInputField = driver.findElement(By.id("dateOfBirthInput"));
//        dateOfBirthInputField.click();
//        Select dateOfBirth = new Select(driver.findElement(By.id("react-datepicker__day react-datepicker__day--020")));
//        dateOfBirthInputField.sendKeys(expecteddateOfBirthInput);
//        Select subjectsContainerField = new Select(driver.findElement(By.id("subjectsContainer")));
        //WebElement subjectsContainerField = driver.findElement(By.id("subjectsContainer"));
//         subjectsContainerField.selectByVisibleText("Hindi");
        //subjectsContainerField.sendKeys(expectedSubjectsContainer);

//        WebElement labelBtnSports = driver.findElement(By.id("hobbies-checkbox-1"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelBtnSports);
//        labelBtnSports.click();
//
//        WebElement labelBtnReading = driver.findElement(By.id("hobbies-checkbox-2"));
//        labelBtnReading.click();
//
//        WebElement labelBtnMusic = driver.findElement(By.id("hobbies-checkbox-3"));
//        labelBtnMusic.click();
//
//        WebElement buttunChoosePct = driver.findElement(By.id("uploadPicture"));
//        buttunChoosePct.click();

        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
        String expectedCurrentAddress = "Bishkek city str345";
        currentAddressField.sendKeys(expectedCurrentAddress);


        Select chooseCity = new Select(driver.findElement(By.id("stateCity-wrapper")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chooseCity);
        chooseCity.selectByVisibleText("Uttar Pradesh");





    }

}
