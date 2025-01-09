package com.thetestingacademy.tests.sampleTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium2 {


    @Test
    public void test_VWOLogin(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }



}