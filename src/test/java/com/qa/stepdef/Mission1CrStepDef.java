package com.qa.stepdef;

import com.qa.pages.Mission1CrPage;
import com.qa.pages.MutualFundPage;
import com.qa.utils.GlobalParams;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Mission1CrStepDef {

    GlobalParams globalParams = new GlobalParams();

    @And("user selects monthly SIP date {string}")
    public void userSelectsMonthlySIDDate(String date) throws Exception {
        new Mission1CrPage().selectMonthlySIPDate(date);
    }

    @And("user click on Let's Calculate")
    public void userClickOnLetSCalculate() {
        new Mission1CrPage().clickLetsCalculate();
    }

    @And("user scroll to view become a crorepati")
    public void userScrollToViewBecomeACrorepati() throws Exception {
        new Mission1CrPage().scrollToBecomeACrorePatiBanner();
    }

    @When("user click on become a crorepati")
    public void userClickOnBecomeACrorepati() {
        new Mission1CrPage().clickBecomeACrorePati();
    }

    @And("user scroll to view where I should invest")
    public void userScrollToViewWhereIShouldInvest() throws Exception {
        new Mission1CrPage().scrollToViewWhereIShouldInvest();
    }

    @And("user verify default value number of years I want to invest for this goal")
    public void userVerifyDefaultValueNumberOfYearsIWantToInvestForThisGoal() {
        Assert.assertTrue(new Mission1CrPage().verifyNumberOfYearsIWantToInvest());
    }

    @And("user verify default value invest per month")
    public void userVerifyDefaultValueInvestPerMonth() {
        Assert.assertTrue(new Mission1CrPage().verifyInvestPerMonth());
    }

    @And("user verify default value Every year I will increase my investment by")
    public void userVerifyDefaultValueEveryYearIWillIncreaseMyInvestmentBy() {
        Assert.assertTrue(new Mission1CrPage().verifyIncreaseInvestmentEveryYear());
    }

    @And("user verify default value Expected annual rate of return on investment")
    public void userVerifyDefaultValueExpectedAnnualRateOfReturnOnInvestment() {
        Assert.assertTrue(new Mission1CrPage().verifyAnnualRateOfReturn());
    }

    @When("user change the default value of number of years I want to invest to {string}")
    public void userChangeTheDefaultValueOfNumberOfYearsIWantToInvestTo(String year) throws Exception {
        new Mission1CrPage().enterNumberOfYearsInvest(year);
    }

    @And("user click on invest for this goal")
    public void userClickOnInvestForThisGoal() {
        new Mission1CrPage().clickInvestForThisGoal();
    }

    @And("user verify the minimum SIP amount for {string} fund is {string}")
    public void userVerifyTheMinimumSIPAmountForIs(String bankName, String amount) throws Exception {
        Assert.assertTrue(new Mission1CrPage().verifyBankWithMinSIPAmount(bankName, amount));
    }

    @And("user scroll to view AuthenticateAndSave")
    public void userScrollToViewAuthenticateAndSave() throws Exception {
        new Mission1CrPage().scrollToAuthenticateAndSave();
    }

    @And("user verify default SIP duration is two hundred forty months")
    public void userVerifyDefaultSIPDurationIsMonths() {
        Assert.assertTrue(new Mission1CrPage().verifyDefaultSIPDuration());
    }

    @When("user enters invalid otp for invest mission oneCr")
    public void userEntersInvalidOtpForInvestMissionCr() throws Exception {
        new MutualFundPage().enterInvalidPurchaseOtp();
    }

    @And("user enter otp for invest mission oneCrore")
    public void userEnterOtpForInvestMissionOneCrore() throws Exception {
        new MutualFundPage().enterPurchaseOtp();
    }

    @And("user verify SIP status for {string} fund  is {string}")
    public void userVerifySIPStatusForFundIs(String fundName, String status) throws Exception {
        Assert.assertTrue(new Mission1CrPage().verifyFundWithStatus(fundName, status));
    }

    @And("user verify SIP status for {string} fund  is Success")
    public void userVerifySIPStatusForFundIsSuccess(String status) throws Exception {
        Assert.assertTrue(new Mission1CrPage().verifyAdityaBirlaFundWithStatus(status));
    }

    @Then("user verify expected maturity amount is {string}")
    public void userVerifyExpectedMaturityAmountIs(String text) throws Exception {
        new Mission1CrPage().verifyExpectedMaturityAmount(text);
    }

    @And("user verify my investment amount is {string}")
    public void userVerifyMyInvestmentAmountIs(String text) throws Exception {
        new Mission1CrPage().verifyMyInvestedAmount(text);
    }

    @And("user verify interest earned is {string}")
    public void userVerifyInterestEarnedIs(String text) throws Exception {
        new Mission1CrPage().verifyInterestEarnedAmount(text);
    }

    @And("user go back from investment maturity screen")
    public void userGoBackFromInvestmentMaturityScreen() {
        new Mission1CrPage().clickBackIconInInvestmentMaturityScreen();
    }

    @And("user go back from mission oneCr screen")
    public void userGoBackFromMissionCrScreen() {
        new Mission1CrPage().clickBackIconInMissionScreenScreen();
    }

    @And("user click on Calculate")
    public void userClickOnCalculate() {
        new Mission1CrPage().clickOnCalculate();
    }

    @When("user change the default value of invest per month to {string}")
    public void userChangeTheDefaultValueOfInvestPerMonth(String text) throws Exception {
        new Mission1CrPage().enterInvestmentOfPerMonth(text);
    }

    @When("user change the default value of every year increase investment to {string}")
    public void userChangeTheDefaultValueOfEveryYearIncreaseInvestment(String text) {
        new Mission1CrPage().enterEveryYearIncreaseOfInvestment(text);
    }

    @When("user change the default value of expected annual rate of return investment to {string}")
    public void userChangeTheDefaultValueOfExpectedAnnualRateOfReturnInvestment(String text) {
        new Mission1CrPage().enterExpectedAnnualRateIncome(text);
    }

    @When("user clicks on start now button")
    public void userClicksContinueButton() throws Exception {
        new Mission1CrPage().clickStartNow();
    }

    @And("user do payment")
    public void userDoPayment() throws Exception {
        new Mission1CrPage().doPayment();
    }

    @When("user change the default value of number of years I want to invest {string}")
    public void userChangeTheDefaultValueOfNumberOfYearsIWantToInvest(String year) throws Exception {
        new Mission1CrPage().enterNumberOfYearsInvests(year);
    }

    @When("user change the default value of number of years I want to invest it {string}")
    public void userChangeTheDefaultValueOfNumberOfYearsIWantToInvestIt(String year) throws Exception {
        new Mission1CrPage().enterNumberOfYearInvest(year);
    }

    @Then("user verify with only two hundred rupees a day")
    public void userVerifyWithOnlyTwoHundredRupeesADay() throws Exception {
        Assert.assertTrue(new Mission1CrPage().verifyWithOnly200());
    }

    @When("user close is not available for transaction pop up")
    public void userCloseIsNotAvailableForTransactionPopUp() throws Exception {
        new Mission1CrPage().closeNotAvaTra();
    }
}