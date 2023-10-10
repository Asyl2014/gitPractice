package com.difital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{
// Page Object Model
    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAdressInput;

    @FindBy(id= "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id= "submit")
    public WebElement submitBtn;

    public TextBoxPage fillUpTheFullName (String fullName) {
        elementActions.writeText(fullNameInput, fullName);
        return this;
    }
    public TextBoxPage fillUpTheEmail (String email) {
        elementActions.writeText(userEmailInput, email);
        return this;
    }
    public TextBoxPage fillUpCurrentAddress (String currentAddress) {
        elementActions.writeText(currentAdressInput, currentAddress);
        return this;
    }
    public TextBoxPage fillPermanentAddressInput (String permanentAddress) {
        elementActions.writeText(permanentAddressInput, permanentAddress);
        return this;
    }

    public TextBoxPage submitForm() {

        elementActions.waitButtonToBeClickAble(submitBtn)
                .scrollToTheElement(submitBtn)
                .clickTheButton(submitBtn);

        return this;
    }
//    public TextBoxPage testTextBoxForm(){
//        Assert.assertTrue(expectedUserFullName.getText().contains(fullNameInput.getText()));
//
//
//        return this;
//    }


    }

