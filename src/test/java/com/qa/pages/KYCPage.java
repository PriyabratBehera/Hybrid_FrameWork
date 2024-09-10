package com.qa.pages;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

import java.util.Objects;

public class KYCPage extends ProfilePage {
    GlobalParams globalParams = new GlobalParams();
    @AndroidFindBy(xpath = "//*[@text='Mobile No']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile No\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement mobileNumber;
    @AndroidFindBy(xpath = "//*[@text='Email ID']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email ID\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement emailAddress;
    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement mobileVerificationOTPText;
    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement emailVerificationOTP;
    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[1]")
    private MobileElement mobileOTP1;
    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[2]")
    private MobileElement mobileOTP2;
    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[3]")
    private MobileElement mobileOTP3;
    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[4]")
    private MobileElement mobileOTP4;
    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[1]")
    private MobileElement emailOTP1;
    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[2]")
    private MobileElement emailOTP2;
    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[3]")
    private MobileElement emailOTP3;
    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[4]")
    private MobileElement emailOTP4;
    @AndroidFindBy(xpath = "//*[@text='Budgeting']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Please enter the following text in the box below:\"]/preceding-sibling::XCUIElementTypeTextField")
    private MobileElement aadhaarNumber;
    @AndroidFindBy(xpath = "//*[@text=\"About Me\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ About Me\"])[3]")
    private MobileElement completePersonalDetailPage;
    @AndroidFindBy(xpath = "//*[@text=\"Occupation\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ Occupation\"])[3]")
    private MobileElement occupationTab;
    @AndroidFindBy(xpath = "//*[@text=\"About Me\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ About Me\"])[3]")
    private MobileElement aboutMeTab;
    @AndroidFindBy(xpath = "//*[@text=\"About Me\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1 About Me\"])[3]")
    private MobileElement personalDetailPage;
    @AndroidFindBy(xpath = "//*[@text=\"Father’s Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Father’s Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement fathersName;
    @AndroidFindBy(xpath = "//*[@text=\"Father’s Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PAN\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement panNum;
    @AndroidFindBy(xpath = "//*[@text=\"Mother’s Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mother’s Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement mothersName;
    @AndroidFindBy(xpath = "//*[@text=\"Place of Birth\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Place of Birth\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private MobileElement PlaceOfBirth;

    @AndroidFindBy(xpath = "//*[@text=\"Place of Birth\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Place of Birth\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement PlaceOfBirthAfterclear;
    @AndroidFindBy(xpath = "//*[@text=\"Place of Birth\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Marital Status\"]")
    private MobileElement maritalStatus;
    @AndroidFindBy(xpath = "//*[@text=\"Spouse Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Spouse Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement nameCanNotEmpty;
    @AndroidFindBy(xpath = "//*[@text=\"PAN\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PAN\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement pan;
    @AndroidFindBy(xpath = "//*[@text=\"Aadhaar\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Aadhaar\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement aadhaar;
    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[2]")
    private MobileElement politicallyExposedPersonNo;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uDB80\uDD56\"])[2]")
    private MobileElement closeCamera;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uDB80\uDD56\"])[2]")
    private MobileElement capPhoto;

    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[8]")
    private MobileElement politicallyExposedPersonYes;
    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[4]")
    private MobileElement relatedPoliticallyExposedPersonNo;
    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[10]")
    private MobileElement relatedPoliticallyExposedPersonYes;
    @AndroidFindBy(xpath = "//*[@text='Retired']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Retired\"])[2]")
    private MobileElement occupationTypeSelfEmployed;
    @AndroidFindBy(xpath = "//*[@text=\"Professional\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Professional\"])[2]")
    private MobileElement occupationTypeProfessional;
    @AndroidFindBy(xpath = "//*[@text='Rental']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Rental\"])[2]")
    private MobileElement mainSourceIncomeRental;
    @AndroidFindBy(xpath = "//*[@text='Others']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Others\"])[2]")
    private MobileElement mainSourceIncomeOthers;
    @AndroidFindBy(xpath = "//*[@text='Main Source of Income']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Main Source of Income\"]")
    private MobileElement mainSourceOfIncome;
    @AndroidFindBy(xpath = "//*[@text='Annual Income']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Annual Income\"]")
    private MobileElement annualIncome;
    @AndroidFindBy(xpath = "//*[@text='1-5 Lakhs']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1-5 Lakhs\"])[2]")
    private MobileElement annualIncomeOneToFiveLacks;
    @AndroidFindBy(xpath = "//*[@text='5-10 Lakhs']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"5-10 Lakhs\"])[2]")
    private MobileElement annualIncomeFiveToTenLacks;
    @AndroidFindBy(xpath = "//*[@text=\"Account Number (Must be Savings Account)\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Account Number (Must be Savings Account)\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement accountNumberTextBox;
    @AndroidFindBy(xpath = "//*[@text=\"IFSC Code\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"IFSC Code\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement ifscCodeTextBox;
    @AndroidFindBy(xpath = "//*[@text=\"Bank Name\"]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bank Name\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement bankNamedropDown;
    @AndroidFindBy(xpath = "//*[@text=\"My name in bank account matches with the name on PAN Card  \"]/parent::android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My name in bank account matches with the name on PAN Card  \"]/XCUIElementTypeOther")
    private MobileElement nameMatchWithPanCheckBox;
    @AndroidFindBy(xpath = "//*[@text='Bank of Baroda']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Bank of Baroda\"])[2]")
    private MobileElement axisBank;
    @AndroidFindBy(xpath = "//*[@text='UCO Bank']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"UCO Bank\"])[2]")
    private MobileElement ucoBank;
    @AndroidFindBy(xpath = "//*[@text='Continue']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Continue\"])[2]")
    private MobileElement continueBtn;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee's Date of Birth\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee's Date of Birth\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement nomineeDob;
    @AndroidFindBy(xpath = "//*[@text=\"Guardian is nominee’s\"]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian is nominee’s\"]")
    private MobileElement guardianIsNomineesDropDwn;
    @AndroidFindBy(xpath = "//*[@text=\"Guardian’s Date of Birth (Must be adult)\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Date of Birth (Must be adult)\"]")
    private MobileElement guardianDobDtPic;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee is my\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee is my\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement nomineeIsMyTxtBox;
    @AndroidFindBy(xpath = "//*[@text=\"Get OTP\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Get OTP\"])[2]")
    private MobileElement getOTP;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee Name\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement nomineeNameTxtBox;
    @AndroidFindBy(xpath = "//*[@text=\"Guardian Name\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Date of Birth (must be adult)\"]")
    private MobileElement guardianNameTxtBox;
    @AndroidFindBy(xpath = "//*[@text='Upload PAN']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Upload PAN (jpeg or png)\"]")
    private MobileElement uploadPan;
    @AndroidFindBy(xpath = "//*[@text='Upload Photo']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Upload Photo (jpeg or png)\"]")
    private MobileElement uploadPhoto;
    @AndroidFindBy(xpath = "//*[@text='Upload Signature']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Upload Signature (jpeg or png)\"]")
    private MobileElement uploadS;
    @AndroidFindBy(xpath = "//*[@text='A Sample Image of signature']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"A Sample Image of signature\"]")
    private MobileElement sampleSign;

    @AndroidFindBy(xpath = "//*[@text='Upload Signature']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Upload Signature (jpeg or png)\"]")
    private MobileElement uploadSign;
    @AndroidFindBy(xpath = "//*[@text='Only this time']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow While Using App\"]")
    private MobileElement allowLocation;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uDB80\uDD56  \"])[12]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    private MobileElement captureBtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uDB80\uDD56  \"])[12]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement takePhoto;
    @AndroidFindBy(xpath = "(//*[@text='Resend OTP'])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Resend OTP\"])[2]")
    private MobileElement resendOtpMail;
    @AndroidFindBy(xpath = "//*[@text='Start New Application']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start New Application\"]")
    private MobileElement startNewApplication;
    @AndroidFindBy(xpath = "//*[@text='Re-start Onboarding?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Re-start Onboarding?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    private MobileElement closeStartNewAppli;
    @AndroidFindBy(xpath = "//*[@text='Yes, I want to Restart']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes, I want to Restart\"])[2]")
    private MobileElement wantToRestart;
    @AndroidFindBy(xpath = "//*[@text='Don’t allow']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Don’t allow\"]")
    private MobileElement dontAllow;
    @AndroidFindBy(xpath = "//*[@text='Only this time']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OK\"]")
    private MobileElement onlyThisTime;
    @AndroidFindBy(xpath = "//*[@text='Yes']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Yes\"]")
    private MobileElement yesButton;
    @AndroidFindBy(xpath = "//*[@text=' File size should be 2KB to 2MB only']/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Yes\"]")
    private MobileElement signSamplePopup;
    @AndroidFindBy(xpath = "//*[@text='File size should be 2KB to 2MB only']/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"File size should be 2KB to 2MB only You should sign on a white paper, take a photo and crop it as shown in above sample image\"])[4]/XCUIElementTypeOther[1]")
    private MobileElement closeSamSignPop;
    @AndroidFindBy(xpath = "//*[@text='Tahaliprasad, FATHER']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Tahaliprasad, FATHER\"])[4]")
    private MobileElement tahaliprasadNominee;


    public void enterMobileNumber() {
        mobileNumber.clear();
        String phNumber = generateRandomMobileNumber();
        sendKeys(mobileNumber, phNumber);
    }

    public void enterEmailAddress(String emailId) {
        emailAddress.clear();
        sendKeys(emailAddress, emailId);
    }

    public void enterInvalidMobileNumber(String emailId) throws Exception {
        mobileNumber.clear();
        sendKeys(mobileNumber, emailId);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            clickDoneIosKeyboard();
        }
        else{
            clickStaticText("Contact Detail");
        }
    }

    public void enterInvalidEmailAddress(String emailId) throws Exception {
        emailAddress.clear();
        sendKeys(emailAddress, emailId);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            clickDoneIosKeyboard();
        }
        else{
            clickStaticText("Contact Detail");
        }

    }

    public void enterInvalidMobileOTP() throws Exception {
        String invalidEmailOTP = "1234";
        mobileOTP1.clear();
        sendKeys(mobileOTP1, invalidEmailOTP);
    }

    public void enterInvalidEmailOTP() throws Exception {
        String invalidMobOTP = "1234";
        emailOTP1.clear();
        sendKeys(emailOTP1, invalidMobOTP);
    }

    public void enterValidMobileOTP() throws Exception {
        String mobileOTP = mobileVerificationOTPText.getText().split("OTP - ")[1].trim();
        mobileOTP1.clear();
        sendKeys(mobileOTP1, mobileOTP);
    }

    public void enterValidEmailOTP() throws Exception {
        String emailOTP = emailVerificationOTP.getText().split("OTP - ")[1].trim();
        emailOTP1.clear();
        sendKeys(emailOTP1, emailOTP);
    }

    public void enterInvalidAadhaarNumber() {
        String invalidAadhaarNo = "123456789087";
        aadhaarNumber.clear();
        sendKeys(aadhaarNumber, invalidAadhaarNo);
    }

    public void personalDetailScreen() {
        if (isVisible(completePersonalDetailPage)) {
            click(completePersonalDetailPage);
        } else if (isVisible(personalDetailPage)) {
            click(personalDetailPage);
        }
    }

    public void doNotEnterFathersName() throws Exception {
        click(fathersName);
        clear(fathersName);
        clickStaticText("Title");

    }

    public void doNotEnterMothersName() throws Exception {
        click(mothersName);
        clear(mothersName);
        clickStaticText("Title");
    }

    public void doNotEnterPlaceOfBirth() throws Exception {
        click(PlaceOfBirth);
        clear(PlaceOfBirth);
        clickStaticText("Title");
    }

    public void scrollToMaritalSta() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Marital Status");
        } else {
            iOSScrollToElementByName(maritalStatus, "up", "Marital Status");
        }
    }

    public void scrollToSpouseName() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(nameCanNotEmpty, "up", maritalStatus);
        } else {
            andIosScroll(nameCanNotEmpty, "up", maritalStatus);
        }
    }

    public void enterFathersName(String fatherName) throws Exception {
        clear(fathersName);
        sendKeys(fathersName, fatherName);
        clickStaticText("Title");
    }

    public void verifySpouseName() {
        isVisible(nameCanNotEmpty);
    }

    public void enterMothersName(String motherName) throws Exception {
        clear(mothersName);
        sendKeys(mothersName, motherName);
        clickStaticText("Title");
    }

    public void enterPlaceOfBirth(String placeOfBirth) throws Exception {
        clear(PlaceOfBirthAfterclear);
        clickStaticText("Title");
        click(PlaceOfBirthAfterclear);
        sendKeys(PlaceOfBirthAfterclear, placeOfBirth);
        clickStaticText("Title");
    }

    public void enterPanNumber() throws Exception {
        clear(pan);
        sendKeys(pan, "FWLPB2941D");
        clickStaticText("PAN");
    }

    public void enterAadhaarNumber() throws Exception {
        clear(aadhaar);
        sendKeys(aadhaar, "500633989586");
        clickStaticText("Aadhaar");
    }

    public void selectPoliticalExposedPersonNo() {
        click(politicallyExposedPersonNo);
    }

    public void closeCamera() throws Exception {
        if (isVisible(closeCamera)) {
            click(closeCamera);
        }
    }


    public void selectPoliticalExposedPersonYes() {
        click(politicallyExposedPersonYes);
    }

    public void selectRelatedPoliticalExposedPersonNo() {
        click(relatedPoliticallyExposedPersonNo);
    }

    public void selectRelatedPoliticalExposedPersonYes() {
        click(relatedPoliticallyExposedPersonYes);
    }

    public void selectOccupationTypeSelfEmploy() {
        click(occupationTypeSelfEmployed);
    }

    public void selectOccupationTypeProfessional() {
        click(occupationTypeProfessional);
    }

    public void selectMainSourceOfIncomeOthers() {
        click(mainSourceIncomeOthers);
    }

    public void selectMainSourceOfIncomeRental() {
        click(mainSourceIncomeRental);
    }

    public void selectAnnualIncomeOneToFive() {
        click(annualIncomeOneToFiveLacks);
    }

    public void selectAnnualIncomeFiveToTen() {
        click(annualIncomeFiveToTenLacks);
    }

    public void scrollToAnnualIncome() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Annual Income");
        } else {
            scrollToElement(annualIncome, "up", mainSourceOfIncome, 3000, 10);
        }
    }

    public void clearAccountNumber() throws Exception {
        clear(accountNumberTextBox);
        clickStaticText("IFSC Code");
    }

    public void enterAccountNumber(String accountNo) {
        clear(accountNumberTextBox);
        sendKeys(accountNumberTextBox, accountNo);
    }

    public void clearIfscCode() throws Exception {
        clear(ifscCodeTextBox);
        clickStaticText("IFSC Code");
    }

    public void enterIfscCode(String ifscCode) {
        clear(ifscCodeTextBox);
        sendKeys(ifscCodeTextBox, ifscCode);
    }

    public void scrollDownSelectBank() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
//                swipe(170, 607, 163, 506, 100);
            swipe(170, 607, 191, 231, 100);
            if (isVisible(ucoBank)) {
                break;
            }
        }
    }

    public void selectBankName(String bankName) throws Exception {
        click(bankNamedropDown);
        scrollDownSelectBank();
        clickByText(bankName);
    }

    public void clickCheckBoxInBackAcScreen() throws Exception {
        if (!nameMatchWithPanCheckBox.isSelected()) {
            click(nameMatchWithPanCheckBox);
        }
    }

    public void clickOnContinue() {
        click(continueBtn);
    }

    public void selectDobOfNominee(String dob) throws Exception {
        click(nomineeDob);
        clickByText(dob);
        clickByText("OK");
        clickStaticText("Nominee Name");
    }

    public void scrollGuardiansDOB() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
//            andScrollToElementUsingUiScrollable("text", "Guardian’s Date of Birth (must be adult)");
            andIosScroll(guardianDobDtPic, "up", guardianIsNomineesDropDwn);
        } else {
            scrollToElement(guardianDobDtPic, "up", guardianIsNomineesDropDwn, 3000, 10);
        }
    }

    public void clickOnOccupationTab() {
        click(occupationTab);
    }

    public void clickAboutTab() {
        click(aboutMeTab);
    }

    public void clickHeaderTab(String tabName) throws Exception {
        String tab = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            tab = "//*[@text='" + tabName + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            tab = "(//XCUIElementTypeOther[@name='✓ " + tabName + "'])[3]";
        }
        clickIfExist(getElement(tab));
    }

    public void selectNomineeRelationship() throws Exception {
        click(nomineeIsMyTxtBox);
        clickByText("Brother");
    }

    public void enterNomineeName() throws Exception {
        sendKeys(nomineeNameTxtBox, "Avishek Samal");
        clickStaticText("Nominee Detail");
    }

    public void clickPhotoTab() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            clickByText("Photo");
        }
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickByText("5 Photo");
        }
    }

    public void uploadPan() throws Exception {
        click(captureBtn);
        click(closeCamera);
        clickByText("Yes");
    }

    public void uploadPhoto() throws InterruptedException {
//        click(uploadPhoto);
        click(captureBtn);
        Thread.sleep(10000);
        click(takePhoto);
    }

    public void uploadSignature() {
        click(uploadSign);
        click(captureBtn);
        click(takePhoto);
    }

    public void keepPANAsEmpty() throws Exception {
        clear(panNum);
        clickStaticText("PAN");

    }

    public void clickResendOTPEmail() {
        click(resendOtpMail);
    }

    public void clickStartNewApplication() throws Exception {
        if (isVisible(startNewApplication)) {
            click(startNewApplication);
            click(closeStartNewAppli);
            click(startNewApplication);
            click(wantToRestart);
            Thread.sleep(2000);
            clickByText("Start Onboarding");
        } else {
            clickByText("Start Onboarding");
        }

    }

    public void clickUploadPan() {
        click(uploadPan);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            if (isVisible(onlyThisTime)) {
                click(onlyThisTime);
            }
        }
    }

    public void clickUploadPhoto() {
        click(uploadPhoto);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            if (isVisible(onlyThisTime)) {
                click(onlyThisTime);
            }
        }
    }

    public void clickUploadSign() {
        click(uploadSign);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            if (isVisible(onlyThisTime)) {
                click(onlyThisTime);
            }
        }
    }

    public void giveLocation() {
        if (isVisible(allowLocation)) {
            click(allowLocation);
        }
    }

    public void closeSignPopup() {
        click(closeSamSignPop);
    }

    public void scrollToViewSampleSign() throws Exception {
        andIosScroll(sampleSign, "up", uploadS);
    }

    public void selectNomineeAsFather() throws Exception {
        click(nomineeIsMyTxtBox);
        clickByText("Father");
    }

    public void verifyTahaliPrasadNominee() throws Exception {
        Assert.assertTrue(isVisible(tahaliprasadNominee));
    }

    public void clickNoForNetBanking() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='No']";
        } else {
            xpath = "//*[@text='No']";
        }
        if (isElementExist(xpath)) {
            click(getElement(xpath));
        }
    }
    public void clickGetOTP(){
        click(getOTP);
    }
}
