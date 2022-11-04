package com.mikail_homeWork.step_def;

import com.mikail_homeWork.pages.Login_page;
import com.mikail_homeWork.utilities.ConfigurationReader;
import com.mikail_homeWork.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDef {

    Login_page login_page = new Login_page();

    @Given("user is on a truck driver login page")
    public void user_is_on_a_truck_driver_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters truck driver's user name")
    public void user_enters_truck_driver_s_user_name() {
        login_page.logInField.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @When("user enters truck driver's password")
    public void user_enters_truck_driver_s_password() {
        login_page.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click on Log In button")
    public void user_click_on_log_in_button() {
        login_page.logInBtn.click();
    }

    @Then("user successfully logged in and user sees main page")
    public void user_successfully_logged_in_and_user_sees_main_page() throws InterruptedException {

        Thread.sleep(2000);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
