package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ProfilePage;
import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HomeStepDef {

    GlobalParams globalParams = new GlobalParams();

    @When("^verify menu options in homepage$")
    public void verifyMenuOptionsInHomePage() {
        new HomePage().verifyMenuOptionsInHomePage();
    }

    @Given("user login with user {string}")
    public void userLoginWithKYCCompletedUser(String mobileNumber) throws Exception {
        new HomePage().logout();
        new LoginPage().loginWithoutPermission(mobileNumber, "");
    }
    @Given("user login with this user {string}")
    public void userLoginWithThisUser(String mobileNumber) throws Exception {
        new HomePage().logoutForNewUser();
        new LoginPage().loginWithThisUser(mobileNumber, "");
    }
}

