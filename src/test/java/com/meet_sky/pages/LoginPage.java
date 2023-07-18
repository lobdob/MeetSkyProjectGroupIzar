package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='user']")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement logInBtn;

    public void login(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        logInBtn.click();
    }
}
