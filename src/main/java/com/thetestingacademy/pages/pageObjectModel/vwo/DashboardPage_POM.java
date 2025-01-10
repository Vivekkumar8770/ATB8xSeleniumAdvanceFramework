package com.thetestingacademy.pages.pageObjectModel.vwo;

import com.thetestingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_POM extends CommonToAllPage {

    WebDriver driver;

    public DashboardPage_POM(WebDriver driver) {
        this.driver = driver;
    }



    // Page Locators
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }


}