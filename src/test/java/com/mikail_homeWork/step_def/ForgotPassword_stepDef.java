package com.mikail_homeWork.step_def;

import com.mikail_homeWork.pages.ForgotPasswordPage;
import com.mikail_homeWork.pages.Login_page;
import com.mikail_homeWork.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPassword_stepDef {

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    Login_page login_page = new Login_page();

    @When("user click on Forgot your password button")
    public void user_click_on_forgot_your_password_button() {
        login_page.forgotPasswordLink.click();
    }

    @When("user enters invalid email on forgot password page")
    public void user_enters_invalid_email_on_forgot_password_page() {
        forgotPasswordPage.forgotPasswordEmail.sendKeys(ConfigurationReader.getProperty("forgotPasswordEmail"));
    }

    @When("user click on Request button")
    public void user_click_on_request_button() {
        forgotPasswordPage.requestBtn.click();
    }

    @Then("error message appears")
    public void error_message_appears() {
        String actual = forgotPasswordPage.errorText.getText();
        String expected = "There is no active user with username or email address " + "\"" + ConfigurationReader.getProperty("forgotPasswordEmail") + "\"" + ".";

        Assert.assertEquals(actual, expected);
    }
}
