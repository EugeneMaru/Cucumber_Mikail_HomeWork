package com.mikail_homeWork.pages;

import com.mikail_homeWork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement forgotPasswordEmail;

    @FindBy(xpath = "//button[@class='btn extra-submit btn-uppercase btn-primary']")
    public WebElement requestBtn;

    @FindBy(xpath = "//a[.='« Return to Login']")
    public WebElement returnToLoginBtn;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorText;

}
