package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class ProfilePage extends BasePage {
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    private MobileElement hamburgerIcon;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"IPDRAWERCONTENT\"]/android.view.ViewGroup/android.widget.TextView")
    private MobileElement profileName;
    @AndroidFindBy(accessibility = "Aboutme")
    private MobileElement profile;
    @AndroidFindBy(accessibility = "MutualFundKYC")
    private MobileElement kyc;
    @AndroidFindBy(accessibility = "Share App")
    private MobileElement shareApp;
    @AndroidFindBy(accessibility = "Rewards")
    private MobileElement rewards;
    @AndroidFindBy(accessibility = "Notification")
    private MobileElement notification;
    @AndroidFindBy(accessibility = "Feedback")
    private MobileElement feedback;
    @AndroidFindBy(accessibility = "FAQ")
    private MobileElement faq;
    @AndroidFindBy(accessibility = "Support")
    private MobileElement support;
    @AndroidFindBy(accessibility = "Terms")
    private MobileElement termsOfUse;
    @AndroidFindBy(accessibility = "Logout")
    private MobileElement logout;

    public void clickHamburgerIconInHomePage() {
        click(hamburgerIcon);
    }

    public void validateProfilePageOptionsIsDisplayed() throws InterruptedException {

        waitForVisibility(profileName);
        Assert.assertTrue(profile.isDisplayed());
        Assert.assertTrue(kyc.isDisplayed());
        Assert.assertTrue(shareApp.isDisplayed());
        Assert.assertTrue(rewards.isDisplayed());
        Assert.assertTrue(notification.isDisplayed());
        Assert.assertTrue(feedback.isDisplayed());
        Assert.assertTrue(faq.isDisplayed());
        Assert.assertTrue(support.isDisplayed());
        Assert.assertTrue(termsOfUse.isDisplayed());
        Assert.assertTrue(logout.isDisplayed());
    }

    public String getUserName() {
        return profileName.getText();
    }

    public void clickLogOut() {
        click(logout);
    }


}
