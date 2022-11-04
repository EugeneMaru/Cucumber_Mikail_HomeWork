package com.mikail_homeWork.pages;

import com.mikail_homeWork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    public Login_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Username field
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement logInField;

    // Password field
    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement password;

    // Login button
    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement logInBtn;

    // Forgot your password link
    @FindBy(xpath = "//a[@href='/user/reset-request']")
    public WebElement forgotPasswordLink;


}
