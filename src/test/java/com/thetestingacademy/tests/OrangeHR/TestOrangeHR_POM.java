package com.thetestingacademy.tests.OrangeHR;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.pages.pageObjectModel.orangehr.DashBoardPage_POM_OHR;
import com.thetestingacademy.pages.pageObjectModel.orangehr.LoginPage_POM_OHR;
import com.thetestingacademy.pages.pageObjectModel.vwo.DashboardPage_POM;
import com.thetestingacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestOrangeHR_POM extends CommonToAllTest {


    @Owner("PRAMOD")
    @Description("Verify that the login to the OrangeeHR ")
    @Test
    public void testLoginPositive() {
        LoginPage_POM_OHR loginPagePomOhr = new LoginPage_POM_OHR(DriverManager.getDriver());
        loginPagePomOhr.loginToHRCreds(PropertiesReader.readKey("ohr_username"),PropertiesReader.readKey("ohr_password"));


        DashBoardPage_POM_OHR dashboardPagePom = new DashBoardPage_POM_OHR(DriverManager.getDriver());
        String loggedInUserName = dashboardPagePom.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName, PropertiesReader.readKey("ohr_expected_username"));



    }



}
