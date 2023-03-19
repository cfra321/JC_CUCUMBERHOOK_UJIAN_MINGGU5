package com.juaracoding.cucumber;


import com.juaracoding.cucumber.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    public static WebDriver driver;
    public static LoginPage loginPage;

    @Given("Admin open browser and url")
    public void admin_open_browser_and_url(){
        driver.get("https://shop.demoqa.com/my-account/");
        System.out.println("Admin open browser and url");
    }

    @When("Admin enter valid username")
    public void admin_enter_valid_username(){
        loginPage.enterUsername("kukuh");
        System.out.println("Admin enter valid username");
    }
    @And("Admin enter valid password")
    public void admin_enter_valid_password(){
        loginPage.enterPassword("Nasiuduk123");
        System.out.println("Admin enter valid password");
    }

    @And("Admin click button login")
    public void admin_click_button_login(){
        loginPage.clikbtnLogin();
        System.out.println("Admin click button login");
    }

    @Then("Admin sukses Login")
    public void admin_sukses_login(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"");
        System.out.println("Admin sukses Login");
    }



}
