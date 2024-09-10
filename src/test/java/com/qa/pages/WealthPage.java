package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class WealthPage extends BasePage {
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//*[contains(@text,'Digital Gold')]")
    private MobileElement digitalGoldTile;
    @AndroidFindBy(xpath = "//*[contains(@text,'Gold - 24K')]")
    private MobileElement gold24k_button;
    @AndroidFindBy(xpath = "//*[contains(@text,'Silver - 24K')]")
    private MobileElement silver24k_button;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter weight')]")
    private MobileElement enterWeightTextBox;
    @AndroidFindBy(xpath = "//*[@content-desc='IPGDBUYN']")
    private MobileElement buyNowButton;

    public WealthPage() {
    }

    public void clickOnDigitalGoldTile() {
        waitForVisibility(digitalGoldTile);
        click(digitalGoldTile);
    }

    public void validateUserBuyGoldOrSilver(String metalName, String grams) {
        waitForVisibility(gold24k_button);
        if (metalName.equals("Gold - 24K")) {
            click(gold24k_button);
        } else {
            click(silver24k_button);
        }
        sendKeys(enterWeightTextBox, grams);
        click(buyNowButton);
    }

    public void verifyBuyNowButtonIsEnabled() {
        waitForVisibility(buyNowButton);
        Assert.assertTrue(buyNowButton.isEnabled());
    }
}




