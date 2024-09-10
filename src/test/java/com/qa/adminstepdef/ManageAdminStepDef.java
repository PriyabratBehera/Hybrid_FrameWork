package com.qa.adminstepdef;

import com.qa.adminpages.ManageAdminPage;
import com.qa.adminpages.WebBasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ManageAdminStepDef {
    WebBasePage basePage = new WebBasePage();
    ManageAdminPage manageAdminPage = new ManageAdminPage();
    @And("user is in {string} page")
    public void userIsInPage(String pageTitle) throws InterruptedException {
        manageAdminPage.isDisplayPageTitle(pageTitle);
    }
    @Given("Admin Clicks on User Kyc Module")
    public void adminClicksOnUserKycModule() throws InterruptedException {
        manageAdminPage.Click_Users();
        manageAdminPage.Click_KYC();
    }
}
