package com.difital;


import com.difital.driver.Driver;
import com.difital.helper.AlertHelperHW;
import com.difital.helper.FrameHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Main {

  //  public static void main(String[] args) {
//        Student john = new Student("John", "Dow", "mail@mail.vom",
//                "456456", "hjgjghjgh");
//        System.out.println(john.getFirstName());




    WebDriver driver;


    @BeforeClass
    public void setIp() {
        driver = Driver.getDriver();
    }


        @Test
        void test12() throws InterruptedException {

        driver.get("https://demoqa.com/alerts");


        }

        @Test
        void test13(){
            driver.get("https://www.google.com/");
        }

        @Test
        void test14(){
            driver.get("https://www.google.com/");
        }

        @Test
        void test15(){
            driver.get("https://www.google.com/");
        }


    @Test
    void test122() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());

    }

    @Test
    void test133() {
        driver.get("https://demoqa.com/nestedframes");
        //first go to parent frame
        driver.switchTo().frame("frame1");
        // then go to child frame
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
    }

        @Test
    void test20(){
        driver.get("https://demoqa.com/nestedframes");
        FrameHelper frameHelper=new FrameHelper();
        frameHelper.switchDefaultFrame();
        frameHelper.switchToChildByIndex(0);
            System.out.println(driver.findElement(By.tagName("body")).getText());




//        @Test
//        void test16(){
//            driver.get("https://www.google.com/");
//            @Test
//            public void test1() {
//                driver.get("https://demoqa.com/automation-practice-form");
//                FakeDataProvider fakeDataProvider = new FakeDataProvider();
//                PracticeFormPage student1 = new PracticeFormPage();
//
//                student1.fillFirstNameInput(fakeDataProvider.generateFakeFullName())
//                        .fillLastNameInput(fakeDataProvider.generateFakeFullName())
//                        .fillUserEmailInput(fakeDataProvider.generateFakeEmail())
//                        .filUserNumberInput(fakeDataProvider.generateFakeEmail())
//                        .fillCurrentAddressInput(fakeDataProvider.generateFakeCurrentAddress())
//                        .clickGender()
//                        .clickHobbies()
//                        .selectState()
//                       // .selectSubject()
//                        //.selectSubject()
//                        //.selectSubject()
//                        //.setUploadPicture(student1.uploadPicture)
//                        //.selectSubmitBtn();
//
//            }
//        }
    }
    }

