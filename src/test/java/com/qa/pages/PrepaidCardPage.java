

package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PrepaidCardPage extends ProfilePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();
    @AndroidFindBy(xpath = "//*[@text='Name as in Aadhaar']")
    private MobileElement nameInAadhaar;
    @AndroidFindBy(xpath = "//*[@text='Aadhaar Number']")
    private MobileElement aadhaarNumberScroll;
    @AndroidFindBy(xpath = "//*[@text='Card']")
    private MobileElement card;
    @AndroidFindBy(xpath = "//*[contains(@text,'Mobile Number')]/following-sibling::android.widget.EditText")
    private MobileElement mobileNo;
    @AndroidFindBy(xpath = "//*[contains(@text,'Email ID')]/following-sibling::android.widget.EditText")
    private MobileElement emailID;
    @AndroidFindBy(xpath = "//*[contains(@text,'Communication')]/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    private MobileElement communicationAddress;
    @AndroidFindBy(xpath = "//*[contains(@text,'City')]/following-sibling::android.widget.EditText")
    private MobileElement city;
    @AndroidFindBy(xpath = "//*[contains(@text,'State')]/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement state;
    @AndroidFindBy(xpath = "//*[contains(@text,'Area PIN Code')]/following-sibling::android.widget.EditText")
    private MobileElement areaPinCode;
    @AndroidFindBy(xpath = "//*[contains(@text,'Name as in Aadhaar')]/following-sibling::android.widget.EditText[1]")
    private MobileElement nameAsInAadhaar;
    @AndroidFindBy(xpath = "//*[contains(@text,'Gender')]/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement gender;
    @AndroidFindBy(xpath = "//*[contains(@text,'Aadhaar Number')]/following-sibling::android.widget.EditText[1]")
    private MobileElement aadhaarNumber;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@content-desc=\"OTPinput\"])[1]")
    private MobileElement otpKidsPan;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@content-desc=\"OTPinput\"])[2]")
    private MobileElement otpEmailKidsPan;
    @AndroidFindBy(xpath = "//*[contains(@text,'@gmail.com')]/following-sibling::android.widget.TextView[1]")
    private MobileElement otpEmailTextKidsPan;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"OTPinput\"]")
    private MobileElement otpSelfCard;

    public void clickCard() {
        click(card);
    }

    public void enterMobileNo(String mobileNos) {
        sendKeys(mobileNo, mobileNos);
    }

    public void enterEmailID(String emailIDs) {
        sendKeys(emailID, emailIDs);
    }

    public void enterAddress(String address) {
        sendKeys(communicationAddress, address);
    }

    public void enterCity(String cities) {
        andScrollToElementUsingUiScrollable("text", "Area PIN Code");
        sendKeys(city, cities);
    }

    public void selectState(String states) throws Exception {
        click(state);
        new BasePage().clickByText(states);
    }

    public void enterPINCode(String pinCodes) {
        sendKeys(areaPinCode, pinCodes);
    }

    public void enterNameAsInAadhaar(String nameInAadhaar) {
        sendKeys(nameAsInAadhaar, nameInAadhaar);
    }

    public void selectGender(String genders) throws Exception {
        click(gender);
        new BasePage().clickByText(genders);
    }

    public void enterAadhaar(String aadhaarNo) {
        sendKeys(aadhaarNumber, aadhaarNo);
    }

    public void scrollDownToNameInAadhaar() throws Exception {
        scrollToElement(nameInAadhaar, "down", aadhaarNumberScroll);
    }

    public void enterOTPSelfCard(String otp) {
        sendKeys(otpSelfCard, otp);
    }

    public void enterMobileOTPKidsPAN() {
        sendKeys(otpKidsPan, "111111");
    }

    public void enterEmailOTPKidsPAN() {
        String otp = otpEmailTextKidsPan.getText();
        sendKeys(otpEmailKidsPan, otp);
    }

}
