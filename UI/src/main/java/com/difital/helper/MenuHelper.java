package com.difital.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MenuHelper {
    WebDriver driver;
    public MenuHelper menuSelect (){
        WebElement selectMenu = driver.findElement(By.xpath("//ul [@id='nav']/li[2]/a"));
        Select select = new Select(selectMenu);
        select.selectByVisibleText("SUB SUB LIST »");
        return this;

    }
}
