package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;
import java.util.Random;

public class LoginPage extends BasePage {
    TestUtils utils = new TestUtils();
    GlobalParams params = new GlobalParams();
    String mob="";
    @AndroidFindBy(xpath = "//*[@text='Financial Goals']/ancestor::android.widget.HorizontalScrollView/following-sibling::android.view.ViewGroup[6]/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Financial Goals\"]/following::XCUIElementTypeOther[29]")
    private MobileElement rightSwipe1;
    @AndroidFindBy(xpath = "//*[@text='Nation Pension (NPS)']/ancestor::android.widget.HorizontalScrollView/following-sibling::android.view.ViewGroup[6]/android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nation Pension (NPS)\"]/ancestor::XCUIElementTypeOther[2]/following::XCUIElementTypeOther[25]")
    private MobileElement rightSwipe2;
    @AndroidFindBy(xpath = "//*[@text='Mutual Funds']/ancestor::android.widget.HorizontalScrollView/following-sibling::android.view.ViewGroup[6]/android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Opt for Readymade Portfolios\n" +
            "or personalise it yourself\"]/ancestor::XCUIElementTypeOther[2]/following::XCUIElementTypeOther[20]")
    private MobileElement rightSwipe3;
    @AndroidFindBy(xpath = "//*[@text='Expense Tracking']/ancestor::android.widget.HorizontalScrollView/following-sibling::android.view.ViewGroup[6]/android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Expense Tracking\"]/following::XCUIElementTypeOther[15]")
    private MobileElement rightSwipe4;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='GETSTARTED']/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"GETSTARTED\"]")
    private MobileElement getStartedButton;
    @AndroidFindBy(xpath = "//*[@text='+91 9000000000']")
    @iOSXCUITFindBy(xpath ="(//XCUIElementTypeOther[@name=\"+91 9000000000\"])[3]/XCUIElementTypeTextField")
    private MobileElement phoneNumber;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Continue\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Continue']")
    private MobileElement continueButton;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your mobile number\"]")
    private MobileElement phoneNumbers;
    @AndroidFindBy(xpath = "//android.widget.TextView[4]")
    private MobileElement enterValidNumberError;
    @AndroidFindBy(xpath = "//*[@text='Submit']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Submit\"]")
    private MobileElement submitButton;
    @AndroidFindBy(xpath = "//*[@text='While using the app']")
    private MobileElement whileUsingAppPermission;
    @AndroidFindBy(xpath = "//*[@text='Allow']")
    private MobileElement allowPermission;
    @AndroidFindBy(xpath = "//*[@text='OK']")
    private MobileElement okSecurityAlert;
    @AndroidFindBy(xpath = "//*[contains(@text,'OTP Verification ')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'OTP Verification ')]")
    private MobileElement getOTPText;
    @AndroidFindBy(accessibility = "OTPinput")
    private MobileElement setOtp;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value, 'your OTP is')]/following:: XCUIElementTypeTextField[1]")
    private MobileElement setOtp1;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Enter OTP received on ')]/following-sibling::XCUIElementTypeOther")
    private MobileElement setOtpBx;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value, 'your OTP is')]/following:: XCUIElementTypeTextField[2]")
    private MobileElement setOtp2;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value, 'your OTP is')]/following:: XCUIElementTypeTextField[3]")
    private MobileElement setOtp3;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[6]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value, 'your OTP is')]/following:: XCUIElementTypeTextField[4]")
    private MobileElement setOtp4;
    @AndroidFindBy(xpath = "//*[@text='Invalid OTP']")
    private MobileElement invalidOTP;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Name\"]")
    private MobileElement newUserName;
    @AndroidFindBy(xpath = "//android.widget.Switch[@content-desc=\"Switch\"]")
    private MobileElement referralCode;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]")
    private MobileElement emulatorFrontPage;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Enter your name\"]")
    private MobileElement enterYourName;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Select State\"]/XCUIElementTypeOther")
    private MobileElement selectState;
    @AndroidFindBy(xpath = "//*[@text='Personalize Your App']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personalize Your App\"]")
    private MobileElement personalizeYourApp;
    @AndroidFindBy(xpath = "//*[@text='Skip to Login']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip to Login\"]")
    private MobileElement skipToLogin;
    @AndroidFindBy(xpath = "//*[@text='My Name']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Name\"]")
    private MobileElement myName;

    @AndroidFindBy(xpath = "//*[@text='My Name']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement profileNameBx;
    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"HAMBURGER\"]/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"HAMBURGER\"]")
    private MobileElement hamburger;

    @AndroidFindBy(xpath="//*[@text='App is not useful']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uE836 App is not useful\"])[2]")
    private MobileElement appIsNotUseful;

    public LoginPage() {

    }

    public LoginPage getStarted(String phNumber) throws InterruptedException {
        Thread.sleep(1000);
        click(rightSwipe1, "Left Swipe 1");
        click(rightSwipe2, "Left Swipe 2");
        click(rightSwipe3, "Left Swipe 3");
        click(rightSwipe4, "Left Swipe 4");
        click(getStartedButton);
        sendKeys(phoneNumber, phNumber);
        click(continueButton);
        waitForVisibility(getOTPText);
        String str = getOTPText.getText();
        String[] arrOfStr = str.split("s ");
        String sendOtp = arrOfStr[1];
        sendKeys(setOtp, sendOtp);
        click(submitButton);
        click(whileUsingAppPermission);
        click(allowPermission);
        Thread.sleep(5000);
        return this;
    }

    public LoginPage clickGetStarted() throws InterruptedException {
//        click(rightSwipe1, "Left Swipe 1");
//        click(rightSwipe2, "Left Swipe 2");
//        click(rightSwipe3, "Left Swipe 3");
//        click(rightSwipe4, "Left Swipe 4");
//        clickIfExist(getStartedButton);
        click(skipToLogin);
        return this;
    }
    public LoginPage clickSkip() {
        String xpath="";
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            xpath="//XCUIElementTypeStaticText[@name=\"Skip to Login\"]";
        }
        else{
            xpath="//*[@text='Skip to Login']";
        }
        if(isElementExist(xpath)){
            click(skipToLogin);
        }
        return this;
    }

    public LoginPage enterPhoneNumber(String phNumber) throws Exception {
        if (phNumber.trim().isEmpty()) {
            GlobalParams params = new GlobalParams();
            phNumber = params.getMobileNumber();
            sendKeys(phoneNumber, phNumber, "Enter mobile number: " + phNumber);
        }
        if (phNumber.contains(" ")) {
            String arr[] = phNumber.split(" ");
            if (Objects.equals(params.getPlatformName(), "iOS")) {
                sendKeys(phoneNumber, arr[2], "Enter mobile number: " + phNumber);
            } else if (Objects.equals(params.getPlatformName(), "Android")) {
                sendKeys(phoneNumber, arr[0], "Enter mobile number: " + phNumber);
            }
        }
        if (Objects.equals(params.getPlatformName(), "iOS")) {
//            click(phoneNumbers);
            clickDoneIosKeyboard();
        }
        return this;
    }

    public LoginPage enterOTP(String otp) {
        if (otp.trim().isEmpty()) {
            waitForVisibility(getOTPText);
            String str = getOTPText.getText();
            otp = str.split("OTP Verification ")[1];
            sendKeys(setOtpBx, otp);
        } else {
            sendKeys(setOtp, otp, "Entering otp");
        }
        return this;
    }

    public LoginPage clickContinue() {
        click(continueButton, "Click continue button");
        return this;
    }


    public HomePage clickSubmit() {
        click(submitButton, "Click submit button");
        return new HomePage();
    }

    public HomePage allowPermission() {
//        click(whileUsingAppPermission);
        click(allowPermission);
        return new HomePage();
    }

    public void clickOkSecurityAlert() {
        click(okSecurityAlert);
    }


    public String getMobileNoErrorText() {
        String err = getText(enterValidNumberError, "Error message is: ");
        return err;
    }

    public String getOTPError() {
        String err = getText(invalidOTP, "Error message is: ");
        return err;
    }

    public HomePage login(String phNumber, String otp) throws Exception {
        clickGetStarted();
        Thread.sleep(3000);
        enterPhoneNumber(phNumber);
        clickContinue();
        enterOTP(otp);
        Thread.sleep(30000);
        clickSubmit();
//        allowPermission();
        return new HomePage();
    }

    public HomePage loginWithoutPermission(String phNumber, String otp) throws Exception {
        clickGetStarted();
        Thread.sleep(3000);
        enterPhoneNumber(phNumber);
        clickContinue();
        enterOTP(otp);
        clickSubmit();
        return new HomePage();
    }
    public HomePage loginWithThisUser(String phNumber, String otp) throws Exception {
        clickSkip();
        Thread.sleep(3000);
        enterPhoneNumber(phNumber);
        clickContinue();
        enterOTP(otp);
        clickSubmit();
        return new HomePage();
    }

    public HomePage loginWithNewUser(String phNumber, String otp) throws Exception {
        clickGetStarted();
        Thread.sleep(3000);
        enterPhoneNumber(phNumber);
        clickContinue();
        enterOTP(otp);
        enterNewUserName();
        return new HomePage();
    }

    public void enterNewUserName() throws Exception {
        new BasePage().clickByText("SUBMIT");
        sendKeys(newUserName, "Litan");
        new BasePage().clickByText("Next");
        click(referralCode);
        new BasePage().clickByText("SUBMIT");
    }

    public void waitTillEmulatorGetStabled() throws InterruptedException {
        while (!isVisible(emulatorFrontPage)) {
            Thread.sleep(2000);
        }
    }
    public String generateNuwNumber() {
        Random random = new Random();
        int firstDigit = random.nextInt(4) + 6;
        long remainingDigits = (long)(random.nextDouble() * 1_000_000_000L);
        mob=firstDigit + String.format("%09d", remainingDigits);
        return firstDigit + String.format("%09d", remainingDigits);
    }
    public void enterNewNum() throws Exception {
        sendKeys(phoneNumber,generateNuwNumber());
        if (Objects.equals(params.getPlatformName(), "iOS")) {
//            click(phoneNumbers);
            clickDoneIosKeyboard();
        }
    }

    public void loginNewUser(String otp) throws Exception {
        if(isVisible(skipToLogin)){
            clickGetStarted();
        }
        Thread.sleep(3000);
        enterNewNum();
        clickContinue();
        enterOTP(otp);
        clickSubmit();
        while(! isVisible(myName)){
            new HomePage().logoutForNewUser();
            clickGetStarted();
            Thread.sleep(3000);
            enterNewNum();
            clickContinue();
            enterOTP(otp);
            clickSubmit();
        }
    }
    public void enterProfileName(String name) throws Exception {
        sendKeys(profileNameBx,name);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            clickDoneIosKeyboard();
        }
    }
    public void deleteNewUser() throws Exception {
//        new MutualFundPage().goBackFromScreen("My Transactions");
        click(hamburger);
        clickByText("Delete My Account");
        click(appIsNotUseful);
        clickStaticText("Once I delete my account, all my account related data with Floatr will be deleted completely and it can’t be restored. I consent to delete my account.  ");
        clickByText("Continue");
        clickByText("Yes- I want to delete");
    }
}






