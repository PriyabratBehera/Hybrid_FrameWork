package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;

public class PrePaidCardStepDef {
    @When("user clicks on Card")
    public void userClicksOnCard() {
        new PrepaidCardPage().clickCard();
    }

    @And("user enters below details in Pre-paid Card Screen")
    public void userEntersBelowDetailsInPrePaidCardScreen(List<Map<String, String>> values) throws Exception {
        PrepaidCardPage prepaidCardPage = new PrepaidCardPage();
        for (Map<String, String> value : values) {
            String mobileNo = StringUtils.defaultString(value.get("MobileNo"));
            String emailID = StringUtils.defaultString(value.get("EmailID"));
            String commAddress = StringUtils.defaultString(value.get("CommAddress"));
            String city = StringUtils.defaultString(value.get("City"));
            String state = StringUtils.defaultString(value.get("State"));
            String pinCode = StringUtils.defaultString(value.get("PinCode"));
//            prepaidCardPage.enterEmailID(emailID);
            prepaidCardPage.enterAddress(commAddress);
            prepaidCardPage.enterCity(city);
            prepaidCardPage.selectState(state);
            prepaidCardPage.enterPINCode(pinCode);
        }
    }

    @And("user enters name as in Aadhaar {string}")
    public void userEntersNameAsInAadhaar(String nameAsInAadhaar) {
        new PrepaidCardPage().enterNameAsInAadhaar(nameAsInAadhaar);
    }

    @And("user enters mobile number for kid {string}")
    public void userEntersMobileNumberForKid(String mobileNo) {
        new PrepaidCardPage().enterMobileNo(mobileNo);
    }

    @And("user enters email id for kid {string}")
    public void userEntersEmailIdForKid(String emailID) {
        new PrepaidCardPage().enterEmailID(emailID);
    }

    @And("user selects gender {string}")
    public void userSelectsGender(String gender) throws Exception {
        new PrepaidCardPage().selectGender(gender);
    }

    @And("user enters aadhaar number {string}")
    public void userEntersAadhaarNumber(String aadhaarNo) {
        new PrepaidCardPage().enterAadhaar(aadhaarNo);
    }

    @And("user enters communication address {string}")
    public void userEntersCommunicationAddress(String address) {
        new PrepaidCardPage().enterAddress(address);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        new PrepaidCardPage().enterCity(city);
    }

    @And("user selects state as {string}")
    public void userSelectsStateAs(String state) throws Exception {
        new PrepaidCardPage().selectState(state);
    }

    @And("user scroll down to Name in Aadhaar")
    public void userScrollDown() throws Exception {
        new PrepaidCardPage().scrollDownToNameInAadhaar();
    }

    @And("user enters otp for self card {string}")
    public void userEntersOtpForSelfCard(String otp) {
        new PrepaidCardPage().enterOTPSelfCard(otp);
    }

    @And("user enters below details in Pre-paid Card Screen for Kids")
    public void userEntersBelowDetailsInPrePaidCardScreenForKids(List<Map<String, String>> values) throws Exception {
        PrepaidCardPage prepaidCardPage = new PrepaidCardPage();
        for (Map<String, String> value : values) {
            String mobileNo = StringUtils.defaultString(value.get("MobileNo"));
            String emailID = StringUtils.defaultString(value.get("EmailID"));
            String commAddress = StringUtils.defaultString(value.get("CommAddress"));
            String city = StringUtils.defaultString(value.get("City"));
            String state = StringUtils.defaultString(value.get("State"));
            String pinCode = StringUtils.defaultString(value.get("PinCode"));
            prepaidCardPage.enterMobileNo(mobileNo);
            prepaidCardPage.enterEmailID(emailID);
            prepaidCardPage.enterAddress(commAddress);
            prepaidCardPage.enterCity(city);
            prepaidCardPage.selectState(state);
            prepaidCardPage.enterPINCode(pinCode);
        }
    }

    @And("user enters mobile otp for kid's PAN")
    public void userEntersMobileOtpForKidSPAN() {
        new PrepaidCardPage().enterMobileOTPKidsPAN();
    }

    @And("user enters email otp for kid's PAN")
    public void userEntersEmailOtpForKidSPAN() {
        new PrepaidCardPage().enterEmailOTPKidsPAN();
    }
}
