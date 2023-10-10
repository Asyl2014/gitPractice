package com.difital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistationPage extends BasePage{
    @FindBy(id = "firstname")
    public WebElement firstNameInput;
    @FindBy(id = "lastname")
    public WebElement lastNameInput;
    @FindBy(id = "userName")
    public WebElement userNameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(id = "recaptcha-anchor")
    public WebElement recaptchaAnchorClick;
    @FindBy(id = "btn btn-primary")
    public WebElement btnBtnPrimaryClick;

    public RegistationPage fillUpFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;

    }

    public RegistationPage fillUpLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }

    public RegistationPage createUserName(String txt) {
        elementActions.writeText(userNameInput, txt);
        return this;
    }
    public RegistationPage createPassword(String txt){
        elementActions.writeText(passwordInput,txt);
        return this;
    }

}
