package com.difital.utils;

import com.difital.driver.Driver;
import com.difital.models.Student;
import com.difital.pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class MainPracticeForm {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = Driver.getDriver();

    }

    @Test void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        Student student = new Student();
        student.setFirstName("Asylbek");
        student.setLastName("Choturaliev");
        student.setEMail("Asyl@gmal.com");
        student.setCurrentAddress("Shopokow 123");
        student.setPhoneNumber("0999655458562");
        PracticeFormPage practiceFormPage = new PracticeFormPage();

        //practiceFormPage.fillUpTheForm(student).test(student); // nujno ispravit`

    }

}
