package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.GlobalParams;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class DigitalGoldStepDef {

    GlobalParams params = new GlobalParams();

    @When("user clicks on Digital Gold")
    public void userClicksOnDigitalGold() {
        new DigitalGoldPage().clickDigitalGold();
    }

    @And("user enters weight {string}")
    public void userEntersWeight(String weight) {
        new DigitalGoldPage().enterWeight(weight);
    }

    @And("user selects state {string}")
    public void userSelectsState(String state) throws Exception {
        new DigitalGoldPage().selectState(state);
    }

    @And("user selects district {string}")
    public void userSelectsDistrict(String district) throws Exception {
        new DigitalGoldPage().selectDistrict(district);
    }

    @And("user enters value {string}")
    public void userEntersValue(String value) {
        new DigitalGoldPage().enterValue(value);
    }

    @And("user selects Financial Goal {string}")
    public void userSelectsFinancialGoal(String goal) throws Exception {
        new DigitalGoldPage().clickFinancialGoal();
        new DigitalGoldPage().clickMutualGoal(goal);
    }

    @Then("user verify text {string}")
    public void userVerifyText(String text) throws Exception {
        new BasePage().verifyText(text);
    }

    @And("user clicks on ellipsis against {string}")
    public void userClicksOnEllipsisAgainst(String goalType) throws Exception {
        new DigitalGoldPage().clickEllipsisGoal(goalType);
    }

    @And("user enters PIN Code {string}")
    public void userEntersPINCode(String pinCode) {
        new DigitalGoldPage().enterPINCode(pinCode);
    }

    @And("user enters Full Name {string}")
    public void userEntersFullName(String fullName) {
        new DigitalGoldPage().enterFullName(fullName);
    }

    @And("user enters Mobile Number {string}")
    public void userEntersMobileNumber(String mobileNumber) {
        new DigitalGoldPage().enterMobileNumber(mobileNumber);
    }

    @And("user enters Area PIN Code {string}")
    public void userEntersAreaPINCode(String pinCode) throws Exception {
        new DigitalGoldPage().enterAreaPINCode(pinCode);
    }

    @And("user verify partial text {string}")
    public void userVerifyPartialText(String text) throws Exception {
        new BasePage().verifyPartialText(text);
    }

    @And("user move to goal {string}")
    public void userMoveToGoal(String goalName) throws Exception {
        new DigitalGoldPage().clickMoveTo();
        new BasePage().clickByTextContains(goalName);
    }

    @And("user wait for {string} milli second")
    public void userWainForMinute(String waitInSec) throws InterruptedException {
        Thread.sleep(Integer.parseInt(waitInSec));
    }

    @And("user enters email in first time investor {string}")
    public void userEntersEmailInFirstTimeInvestor(String email) throws Exception {
        new DigitalGoldPage().enterEmailFirstTimeInvestor(email);
    }

    @And("user enters OTP for Sell Gold")
    public void userEntersOTPForSellGold() {
        new DigitalGoldPage().enterOTPSellGold();
    }

    @And("user change the interval for {string}")
    public void userChangeTheIntervalFor(String mobileNumber) {
        new DigitalGoldPage().changeTheIntervalFor(mobileNumber);
    }

    @And("user click on View details transaction")
    public void userClickOnViewDetailsTransaction() throws Exception {
        new DigitalGoldPage().clickView();
    }

    @And("user scroll to view Account for Receiving Money")
    public void userScrollToViewAccountForReceivingMoney() throws Exception {
        new DigitalGoldPage().ScrollToAccountFor();
    }

    @And("user selects Account for Receiving Money")
    public void userSelectsAccountForReceivingMoney() throws Exception {
        new DigitalGoldPage().selectAccountFor();
    }

    @And("user selects Transaction Type as {string}")
    public void userSelectsTransactionTypeAs(String transactionType) throws Exception {
        new DigitalGoldPage().clickTransactionType();
        new BasePage().clickByText(transactionType);
    }

    @And("user click on simulate success")
    public void userClickOnSimulateSuccess() {
        new DigitalGoldPage().clickSimulateSuccess();
    }

    @And("user select Financial Goal to Debit as {string}")
    public void userSelectFinancialGoalToDebitAs(String goalType) throws Exception {
        new DigitalGoldPage().clickFinancialGoalToDebit();
        new DigitalGoldPage().scrollToLiquidFundsGoalInFinancialGoalToDebitBox();
        new BasePage().clickByText(goalType);
    }

    @And("user select SIP start date as {string}")
    public void userSelectSIPStartDateAs(String sipStartDate) throws Exception {
        new DigitalGoldPage().clickSIPStartDate();
        new BasePage().clickByText(sipStartDate);
        if (new BasePage().isElementExist("//*[@text='This is a Sunday. Please choose another date']")) {
            new BasePage().clickByText(Integer.toString(Integer.parseInt(sipStartDate) + 1));
        }
        new BasePage().clickByText("Confirm");
    }

    @And("user set SIP duration as {string}")
    public void userSetSIPDurationAs(String sipDuration) {
        new DigitalGoldPage().setSipDuration(sipDuration);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
        else{
            new BasePage().pressEnter();
        }
    }

    @And("user enters investment amount {string}")
    public void userEntersInvestmentAmount(String investmentAmount) {
        new DigitalGoldPage().setInvestmentAmount(investmentAmount);
    }

    @And("user selects Financial Goal to Debit {string}")
    public void userSelectsFinancialGoalToDebit(String goalName) throws Exception {
        new DigitalGoldPage().clickFinancialGoalToDebit();
        new BasePage().clickByTextContains(goalName);
    }

    @And("user verify static text {string}")
    public void userVerifyStaticText(String text) throws Exception {
        new BasePage().verifyStaticText(text);
    }

    @And("user click static text {string}")
    public void userClickStaticText(String text) throws Exception {
        new BasePage().clickStaticText(text);
    }

    @And("user click on Netbanking All Indian banks")
    public void userClickOnNetbankingAllIndianBanks() {
        new DigitalGoldPage().clickNetBanking();
    }

    @And("user click on ICICI")
    public void userClickOnICICI() {
        new DigitalGoldPage().clickICICI();
    }

    @And("user click on Pay Now")
    public void userClickOnPayNow() {
        new DigitalGoldPage().clickPayNow();
    }

    @And("user click on Success")
    public void userClickOnSuccess() {
        new DigitalGoldPage().clickSuccess();
    }

    @And("user verify partial static text {string}")
    public void userVerifyPartialStaticText(String text) throws Exception {
        new BasePage().verifyPartialStaticText(text);
    }

    @And("user scroll to view Gold")
    public void userScrollToViewGold() throws Exception {
        new DigitalGoldPage().ScrollToViewGold();
    }

    @And("user click on Buy in grams")
    public void userClickOnBuyInGrams() {
        new DigitalGoldPage().clickBuyInGrams();
    }

    @And("user click on Buy in Rupees")
    public void userClickOnBuyInRupees() {
        new DigitalGoldPage().clickBuyInRupees();
    }

    @And("user click on Sell in Grams")
    public void userClickOnSellInGrams() {
        new DigitalGoldPage().clickSellInGrams();
    }

    @And("user click on Sell in RS")
    public void userClickOnSellInRS() {
        new DigitalGoldPage().clickSellIn();
    }

    @And("user selects Account for Receiving Money for another value")
    public void userSelectsAccountForReceivingMoneyForAnotherValue() throws Exception {
        new DigitalGoldPage().clickAmountReceivingMoney();
    }

    @And("user click on Gift in Grams")
    public void userClickOnGiftInGrams() {
        new DigitalGoldPage().clickGiftInGrams();
    }

    @And("user click on Gift in RS")
    public void userClickOnGiftInRS() {
        new DigitalGoldPage().clickGiftInRS();
    }

    @And("user selects Goal Type as {string}")
    public void userSelectsGoalTppeAs(String portofolio) throws Exception {
        new DigitalGoldPage().clickPortfolio();
        new BasePage().clickByText(portofolio);
    }

    @And("user verify Buyer name")
    public void userVerifyBuyerName() {
        String xpath;
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[@text='Puneet Naik']";
        } else {
            xpath = "//XCUIElementTypeStaticText[@name='Puneet Naik']";
        }
        Assert.assertTrue(new DigitalGoldPage().verifyBuyerName());

    }

    @And("user scroll to Through Net Banking")
    public void userScrollToThroughNetBanking() throws Exception {
        new DigitalGoldPage().scrollToThroughNetBanking();
    }

    @And("user click weekly SIP")
    public void userClickWeeklySIP() {
        new DigitalGoldPage().clickWeeklySIP();
    }

    @When("user click arrow against my systematic plan")
    public void userClickArrowAgainstMySystematicPlan() {
        new DigitalGoldPage().clickArrowIconForSystematicPlan();
    }

    @And("user scroll to view invest for jewellery")
    public void userScrollToViewInvestForJewellery() throws Exception {
        new DigitalGoldPage().scrollToJewellery();
    }

    @And("user click on invest for jewellery")
    public void userClickOnInvestForJewellery() {
        new DigitalGoldPage().clickOnInvestForJewellery();
    }

    @And("user click on menu option")
    public void userClickOnMenuOption() {
        new MutualFundPage().clickMenuOption();
    }

    @And("user remove coin from add to cart")
    public void userRemoveCoinFromAddToCart() throws Exception {
        new DigitalGoldPage().clickRemoveButton();
    }

    @And("user verify order date")
    public void userVerifyOrderDate() {

    }

    @Then("verify below in Gold Delivery History")
    public void verifyBelowGoldDeliveryHistory(DataTable dataTable) throws Exception {
        new DigitalGoldPage().verifyGoldOrderHis(dataTable);
    }

    @Then("verify below transaction History")
    public void verifyBelowTransactionHistory(DataTable dataTable) throws Exception {
        new DigitalGoldPage().verifyGoldBuyHis(dataTable);
    }

    @When("user scroll to faq section")
    public void userScrollToFaqSection() throws Exception {
        new DigitalGoldPage().scrollFaqSec();
    }

    @And("user scroll to view twentyFour percent extra")
    public void userScrollToViewTwentyFourPercentExtra() throws Exception {
        new DigitalGoldPage().scrollTwentyFourExtra();
    }

    @And("user scroll to view when is extra")
    public void userScrollToViewWhenIsExtra() throws Exception {
        new DigitalGoldPage().scrollWhenIsExtra();
    }

    @Then("user verify below sip history")
    public void userVerifyBelowSipHistory() throws Exception {
        new DigitalGoldPage().scrollWhenIsExtra();
    }

    @Then("verify below transaction History for gift gold")
    public void verifyBelowTransactionHistoryForGiftGold(DataTable dataTable) throws Exception {
        new DigitalGoldPage().verifyGoldGiftHis(dataTable);
    }


    @Then("user edit shipping address")
    public void userEditShippingAddress() throws Exception {
        new DigitalGoldPage().editShippingAdd();
    }

    @And("user reedit shipping address")
    public void userReeditShippingAddress() throws Exception {
        new DigitalGoldPage().reeditShippingAdd();
    }

    @And("user click a portfolio")
    public void userClickAPortfolio() {
        new DigitalGoldPage().clickOnePortFo();
    }

    @And("user selects monthly SIP date for digital gold as {string}")
    public void userSelectsMonthlySIPDateForDigitalGold(String str) throws Exception {
        new DigitalGoldPage().selectMonthlySIPDate(str);
    }

    @And("user enters invest amount for monthly SIP for gold {string}")
    public void userEntersInvestAmountForMonthlySIPForGold(String str) {
        new DigitalGoldPage().enterMonthlyInv(str);
    }

    @And("user select Financial for digital gold as {string}")
    public void userSelectFinancialForDigitalGold(String goalName) throws Exception {
        new DigitalGoldPage().selectFinancialGoalDi(goalName);
    }

    @And("user see the total amount")
    public void userSeeTheTotalAmount() throws InterruptedException {
        new DigitalGoldPage().seeTotalAmount();
    }

    @And("user click on Wealth goal")
    public void userClickOnWealthGoal() {
        new DigitalGoldPage().clickOnWealthGoal();
    }
}

