package com.difital.helper;

import org.openqa.selenium.WebDriver;

import java.awt.*;

public class FrameHelper {

    WebDriver driver;
    Frame frame;

    public FrameHelper moveToParentFrame(){

        driver.switchTo().parentFrame();
        return this;
    }

    public FrameHelper switchToFrameParentStr(String txtFrm){
        driver.switchTo().frame(txtFrm);
        return this;
    }
    public FrameHelper switchToChildByIndex(int index){
        driver.switchTo().frame(index);
        return this;
    }

    public FrameHelper switchDefaultFrame (){
        driver.switchTo().defaultContent();
        return this;
    }
}
