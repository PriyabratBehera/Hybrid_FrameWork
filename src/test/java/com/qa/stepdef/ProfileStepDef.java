package com.qa.stepdef;

import com.qa.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;

public class ProfileStepDef {
    @When("user logout of app")
    public void userLogoutOfApp() {
        ProfilePage profilePage = new ProfilePage();
        profilePage.clickHamburgerIconInHomePage();
        profilePage.clickLogOut();
    }
}
