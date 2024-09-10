package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;
import org.testng.Assert;

import java.util.List;
import java.util.Map;


public class TrackExpensesStepDef {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    @When("user clicks on Track Expenses")
    public void userClicksOnTrackExpenses() throws Exception {
        new TrackExpensesPage().clickTrackExpenses();
    }

    @And("user click on add Transaction")
    public void userClickOnAddTransaction() {
        new TrackExpensesPage().clickAddTransaction();
    }

    @And("user enters amount {string}")
    public void userEntersAmount(String amount) {
        new TrackExpensesPage().enterHowMuch(amount);
    }

    @And("user click on Spending")
    public void userClickOnSpending() {
        new TrackExpensesPage().clickSpending();
    }


    @And("user selects category {string} --> {string}")
    public void userSelectsCategory(String mainCategory, String subCategory) throws Exception {
        new BasePage().clickByText(mainCategory);
        new BasePage().clickByText(subCategory);
    }

    @And("user enters Transaction Date")
    public void userEntersDate() {
        new TrackExpensesPage().enterDate();
        new LoginPage().clickOkSecurityAlert();
    }

    @And("user scroll to view Save Transaction")
    public void userScrollToViewSaveTransactionPaidFrom() throws Exception {
        new TrackExpensesPage().scrollToSaveTransaction();
    }

    @And("user click on Choose category")
    public void userClickOnChooseCategory() {
        new TrackExpensesPage().clickChooseCategory();
    }

    @And("user selects paid from {string}")
    public void userSelectsPaidFrom(String paidFrom) throws Exception {
        new TrackExpensesPage().clickPaidFrom();
        new BasePage().clickByText(paidFrom);
    }

    @And("users enters paid to as {string}")
    public void usersEntersPaidToAs(String paidTo) {
        new TrackExpensesPage().enterPaidTo(paidTo);
    }

    @And("user selects monthly recurring")
    public void userSelectsMonthlyRecurring() {
        new TrackExpensesPage().clickMonthlyRecurring();
    }

    @And("user selects frequency as {string}")
    public void userSelectsFrequencyAs(String frequency) throws Exception {
        new TrackExpensesPage().clickFrequency();
        new BasePage().clickByText(frequency);
    }

    @And("user selects date from date picker")
    public void userSelectsDateFromDatePicker() {
        new TrackExpensesPage().clickDatePick();
        new LoginPage().clickOkSecurityAlert();
    }

    @And("user selects end after {string}")
    public void userSelectsEndAfter(String endAfter) throws Exception {
        new TrackExpensesPage().clickEndAfter();
        new BasePage().clickByText(endAfter);
    }

    @Then("verify below in My Transaction Screen")
    public void verifyBelowInMyTransactionScreen(List<Map<String, String>> values) throws Exception {
        for (Map<String, String> value : values) {
            String spendingType = StringUtils.defaultString(value.get("SpendingType"));
            String spendingAmount = StringUtils.defaultString(value.get("SpendingAmount"));
            String paidFrom = StringUtils.defaultString(value.get("PaidFrom"));
            String paidTo = StringUtils.defaultString(value.get("PaidTo"));
            String category = spendingType.split(" ")[0];
            String subCategory = spendingType.split(" ")[1];
            TrackExpensesPage trackExpensesPage = new TrackExpensesPage();
            Assert.assertEquals(trackExpensesPage.getSpendingType(category), subCategory);
            Assert.assertEquals(trackExpensesPage.getSpendingAmount(category), spendingAmount);
            Assert.assertEquals(trackExpensesPage.getPaidFrom(category), paidFrom);
            Assert.assertEquals(trackExpensesPage.getPaidTo(category), paidTo);
        }
    }

    @And("user left swipe to select category for {string}")
    public void userLeftSwipeToSelectCategoryFor(String category) throws Exception {
        new TrackExpensesPage().leftSwipeForCategory(category);
    }

    @And("user click on Income")
    public void userClickOnIncome() throws Exception {
        new TrackExpensesPage().clickIncome();
    }

    @And("user enters Received Date")
    public void userEntersReceivedDate() {
        new TrackExpensesPage().enterReceivedDate();
        new LoginPage().clickOkSecurityAlert();
    }

    @And("user selects received from {string}")
    public void userSelectsReceivedFrom(String receivedFrom) throws Exception {
        new TrackExpensesPage().clickReceivedFrom();
        new BasePage().clickByText(receivedFrom);
    }

    @And("users enters received in as {string}")
    public void usersEntersReceivedInAs(String receivedIn) {
        new TrackExpensesPage().enterReceivedIn(receivedIn);
    }

    @Then("verify below in Income My Transaction Screen")
    public void verifyBelowInIncomeMyTransactionScreen(List<Map<String, String>> values) throws Exception {
        for (Map<String, String> value : values) {
            String spendingType = StringUtils.defaultString(value.get("IncomeType"));
            String spendingAmount = StringUtils.defaultString(value.get("IncomeAmount"));
            String paidFrom = StringUtils.defaultString(value.get("ReceivedFrom"));
            String paidTo = StringUtils.defaultString(value.get("ReceivedIn"));
            String category = spendingType.split(" ")[0];
            String subCategory = spendingType.split(" ")[1];
            TrackExpensesPage trackExpensesPage = new TrackExpensesPage();
            Assert.assertEquals(trackExpensesPage.getSpendingType(category), subCategory);
            Assert.assertEquals(trackExpensesPage.getSpendingAmount(category), spendingAmount);
            Assert.assertEquals(trackExpensesPage.getPaidFrom(category), paidFrom);
            Assert.assertEquals(trackExpensesPage.getPaidTo(category), paidTo);
        }
    }

    @Then("verify {string} > {string}")
    public void verify(String trans1, String trans2) throws Exception {
        Assert.assertTrue(new TrackExpensesPage().verifyGreaterThan(trans1, trans2));
    }

    @And("user select duration as {string}")
    public void userSelectDurationAs(String duration) throws Exception {
        new TrackExpensesPage().clickDuration();
        new BasePage().clickByText(duration);
    }

    @And("user enters transaction type {string}")
    public void userEntersTransactionType(String transactionType) {
        new TrackExpensesPage().enterSearch(transactionType);
    }

    @Then("Verify error message {string} count as {string}")
    public void verifyErrorMessageCountAs(String errorMessage, String count) throws Exception {
        Assert.assertEquals(new TrackExpensesPage().errorMessageCount(errorMessage), Integer.parseInt(count));
    }


    @And("user scroll to view Save Transaction Paid From")
    public void userScrollToViewSaveTransactionPaisFrom() throws Exception {
        new TrackExpensesPage().scrollToSaveTransactionPaidFrom();
    }

    @And("user select transaction type as {string}")
    public void userSelectTransactionTypeAs(String transType) throws Exception {
        new TrackExpensesPage().selectTranType(transType);
    }

    @And("user choose transaction done for {string}")
    public void userChooseTransactionDoneFor(String tranDone) throws Exception {
        new TrackExpensesPage().selectCate(tranDone);
    }

    @And("user select sub category as {string}")
    public void userSelectSubCategoryAs(String subCate) throws Exception {
        new TrackExpensesPage().selectSubCate(subCate);
    }

    @And("user enters amount {string} in add transaction screen")
    public void userEntersAmountInAddTransactionScreen(String amt) throws Exception {
        new TrackExpensesPage().enterBudAmt(amt);
    }

    @And("user select date of transaction as today")
    public void userSelectDateOfTransactionAsToday() throws Exception {
        new TrackExpensesPage().dateOfTranCurMon();
    }

    @And("user select date of transaction as one month back")
    public void userSelectDateOfTransactionAsOneMonthBack() throws Exception {
        new TrackExpensesPage().dateOfTranOneMonBac();
    }

    @And("user select date of transaction as last year")
    public void userSelectDateOfTransactionAsLastYear() throws Exception {
        new TrackExpensesPage().dateOfTranLastYear();
    }

    @And("user select date of transaction as last year as jul")
    public void userSelectDateOfTransactionAsLastYearAsJul() throws Exception {
        new TrackExpensesPage().dateOfTranLastYearJul();
    }

    @And("user selects category for filter")
    public void userSelectsCategoryForFilter() throws Exception {
        new TrackExpensesPage().selCatForFil();
    }

    @When("user filter {string} of expense")
    public void userFilterOfExpense(String duration) throws Exception {
        new TrackExpensesPage().selectLastMonth(duration);
    }

    @And("user click on Investment Equity")
    public void userClickOnInvestmentEquity() {
        new TrackExpensesPage().clickInvEquity();
    }

    @And("user click on delete icon in track expense screen")
    public void userClickOnDeleteIconInTrackExpenseScreen() {
        new TrackExpensesPage().clickDeleteExpense();
    }

    @Then("user unable to see investment in equity transaction")
    public void userUnableToSeeInvestmentInEquityTransaction() {
        Assert.assertFalse(new TrackExpensesPage().unableToSeeEquityTran());
    }

    @When("user click last fiscal year")
    public void userClickLastFiscalYear() throws Exception {
        new TrackExpensesPage().clickLastFiscalYear();
    }

    @When("user click plus icon in dashboard")
    public void userClickPlusIconInDashboard() {
        new TrackExpensesPage().clickPlusIconDash();
    }

    @Then("user enter fund as {string}")
    public void userEnterFundAs(String amount) {
        new CreateBudgetPage().enterSpendAmountForMedicalCategory(amount);
    }

    @Then("user can see the budget transaction as {string}")
    public void userCanSeeTheBudgetTransactionAs(String text) throws Exception {
        new TrackExpensesPage().verifyBudgetTransaction(text);
    }

    @And("user verify budget income card")
    public void userVerifyBudgetIncomeCard() throws Exception {
        new TrackExpensesPage().verifyBudgetIncome();
    }

    @And("user verify investment remaining budget card")
    public void userVerifyInvestmentRemainingBudgetCard() throws Exception {
        new TrackExpensesPage().verifyInvestBudget();
    }

    @And("user verify personal exceeded limit card")
    public void userVerifyPersonalExceededLimitCard() throws Exception {
        new TrackExpensesPage().verifyPersonalBudget();
    }

    @Then("user verify household remaining")
    public void userVerifyHouseholdRemaining() throws Exception {
        new TrackExpensesPage().verifyHouseHoldBudget();

    }

    @And("user verify total spending budget card")
    public void userVerifyTotalSpendingBudgetCard() throws Exception {
        new TrackExpensesPage().verifyTotalBudgetCard();
    }

    @When("user scroll to view personal")
    public void userScrollToViewPersonal() {

    }
}

