package com.meet_sky.step_definitions;

import com.meet_sky.pages.LoginPage;
import com.meet_sky.utilities.BrowserUtils;
import com.meet_sky.utilities.ConfigurationReader;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

LoginPage loginPage =new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloud_url"));
    }
    @When("user enters the user information")
    public void user_enters_the_user_information() {
        loginPage.login(ConfigurationReader.getProperty("user"), ConfigurationReader.getProperty("pass"));

    }

    @Then("user should be able to login and see {string} as a title")
    public void userShouldBeAbleToLoginAndSeeAsATitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}
