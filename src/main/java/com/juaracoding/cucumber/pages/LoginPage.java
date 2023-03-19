package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='rememberme']")
    WebElement rememberme;

    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement invalidLogin;

    @FindBy(xpath = "/html/body/p/a")
    WebElement btnDismiss;

    @FindBy(xpath = "(//a[normalize-space()='My Account'])[1]")
    WebElement myAccount;

    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clikbtnLogin(){
        this.rememberme.click();
        this.btnLogin.click();
    }

    public String getTxtDashboard(){
        return invalidLogin.getText();
    }
}