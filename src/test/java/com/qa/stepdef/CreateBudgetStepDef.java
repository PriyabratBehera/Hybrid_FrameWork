package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.CreateBudgetPage;
import com.qa.pages.SetGoalsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateBudgetStepDef {

    @And("user clicks on Budget")
    public void userClicksOnBudget() throws Exception {
        new CreateBudgetPage().clickBudget();
    }

    @And("user scroll to view Utility")
    public void userScrollToViewUtility() throws Exception {
        new CreateBudgetPage().ScrollToViewUtility();
    }

    @And("user click on medical budget card")
    public void userClickOnMedicalBudget() {
        new CreateBudgetPage().clickMedicalBudget();
    }

    @Given("user clean up the app data for {string}")
    public void userCleanUpTheAppDataFor(String mobileNumber) {
        new CreateBudgetPage().userCleanUpTheAppDataFor(mobileNumber);
    }

    @And("user click by text {string}")
    public void userClickByText(String text) throws Exception {
        new BasePage().clickByText(text);
    }

    @And("user go back from my budget screen")
    public void userGoBackFromMyBudgetScreen() {
        new CreateBudgetPage().clickBackButtonOnMyBudgetScreen();
    }

    @When("user enter budget fund as {string}")
    public void userEnterBudgetFundAs(String text) {
        new CreateBudgetPage().enterFirstBudgetAmount(text);
    }

    @Then("verify validation error {string}")
    public void verifyValidationError(String error) throws Exception {
        Assert.assertEquals(new SetGoalsPage().getValidationError(error), error);
    }

    @And("user go back from create budget screen")
    public void userGoBackFromCreateBudgetScreen() {
        new CreateBudgetPage().clickBackButtonOnCreateBudgetBudgetScreen();
    }

    @When("user enter budget amount as more than available funds")
    public void userEnterBudgetAmountAsMoreThanAvailableFunds() {
        new CreateBudgetPage().enterMoreThanAvailableFunds();
    }

    @And("user go back from second page of create budget screen")
    public void userGoBackFromSecondPageOfCreateBudgetScreen() {
        new CreateBudgetPage().clickBackIconOfSecondPageOfCreateBudget();
    }

    @And("user enter save and invest amount as {string}")
    public void userEnterSaveAndInvestAmountAs(String text) {
        new CreateBudgetPage().enterSaveAndInvestAmount(text);
    }

    @And("user enter home rant amount as {string}")
    public void userEnterHomeRantAmountAs(String text) {
        new CreateBudgetPage().enterHomeRentAmount(text);
    }

    @And("user enter for loan amount as {string}")
    public void userEnterForLoanAmountAs(String text) {
        new CreateBudgetPage().enterPayForLoanAmount(text);
    }

    @And("user enter utility bills as {string}")
    public void userEnterUtilityBillsAs(String text) {
        new CreateBudgetPage().enterUtilityLoanAmount(text);
    }

    @When("user click on Add more")
    public void userClickOnAddMore() {
        new CreateBudgetPage().clickAddMore();
    }

    @When("user click on I am done")
    public void userClickOnIAmDone() {
        new CreateBudgetPage().clickIAmDone();
    }

    @And("user verify Report")
    public void userVerifyReport() {
        Assert.assertTrue(new CreateBudgetPage().verifyReport());
    }

    @And("user verify Select")
    public void userVerifySelect() {
        Assert.assertTrue(new CreateBudgetPage().verifySelect());
    }

    @And("user verify percent tab")
    public void userVerifyPercentTab() {
        Assert.assertTrue(new CreateBudgetPage().verifyPercentTab());
    }

    @And("user click on select")
    public void userClickOnSelect() {
        new CreateBudgetPage().clickSelect();
    }

    @And("user scroll to view education")
    public void userScrollToViewEducation() throws Exception {
        new CreateBudgetPage().ScrollToViewEducation();
    }

    @When("user select spend category as {string}")
    public void userSelectSpendCategoryAs(String text) throws Exception {
        new BasePage().clickByText(text);
    }

    @Then("user verify medical category in create budget screen")
    public void userVerifyMedicalCategoryInCreateBudgetScreen() {
        Assert.assertTrue(new CreateBudgetPage().verifyMedicalCategory());
    }

    @And("user select fifty percentage tab")
    public void userSelectFiftyPercentageTab() {
        new CreateBudgetPage().clickFiftyPercentTab();
    }

    @And("user enter amount as {string} for medical spend category")
    public void userEnterAmountAsForMedicalSpendCategory(String text) {
        new CreateBudgetPage().enterSpendAmountForMedicalCategory(text);
    }

    @And("user verify Edit")
    public void userVerifyEdit() {
        new CreateBudgetPage().verifyEdit();
    }

    @When("user click on edit budget")
    public void userClickOnEditBudget() {
        new CreateBudgetPage().clickEditBudget();
    }

    @When("user click on information icon")
    public void userClickOnInformationIcon() {
        new CreateBudgetPage().clickInformationIcon();
    }

    @And("user enter amount as {string} for edit budget")
    public void userEnterAmountAsForEditBudget(String text) {
        new CreateBudgetPage().enterEditBudgetAmount(text);
    }

    @When("user clicks on Save Budget button")
    public void userClicksOnSaveBudgetButton() {
        new CreateBudgetPage().clickSaveBudget();
    }

    @And("user click delete icon in edit budget screen")
    public void userClickDeleteIconInEditBudgetScreen() {
        new CreateBudgetPage().clickDeleteIcon();
    }

    @When("user click on report")
    public void userClickOnReport() {
        new CreateBudgetPage().clickReport();
    }

    @And("user swipe to next page")
    public void userScrollToViewBudget() throws Exception {
        new CreateBudgetPage().swipeToBudget();
    }

    @And("user select seventy percentage tab")
    public void userSelectSeventyPercentageTab() {
        new CreateBudgetPage().clickSeventyFivePercentTab();
    }

    @And("user close the popup")
    public void userCloseThePopup() {
        new CreateBudgetPage().clickClosePopupButton();
    }

    @And("user click on yes button")
    public void userClickOnYesButton() throws Exception {
        new CreateBudgetPage().clickYesButton();
    }

    @And("user verify Investment in second page")
    public void userVerifyInvestment() {
        Assert.assertTrue(new CreateBudgetPage().verifyInvestmentInSecondScreen());
    }

    @And("user verify LoanRepayment")
    public void userVerifyLoanRepayment() {
        Assert.assertTrue(new CreateBudgetPage().verifyLoanRepaymentInReportScreen());
    }

    @And("user verify Investment in third page")
    public void userVerifyInvestmentInThirdPage() {
        Assert.assertTrue(new CreateBudgetPage().verifyInvestmentInThirdScreen());
    }

    @And("user close you already have this popup")
    public void userCloseYouAlreadyHaveThisPopup() {
        new CreateBudgetPage().clickYouAlreadyPopupCloseIcon();
    }

    @When("user go back from review budget screen")
    public void userGoBackFromReviewBudgetScreen() {
        new CreateBudgetPage().clickBackInReviewSc();
    }

    @And("user go back from edit budget screen")
    public void userGoBackFromEditBudgetScreen() {
        new CreateBudgetPage().clickBackInEditBudSc();
    }

    @When("user click on information icon in edit budget screen")
    public void userClickOnInformationIconInEditBudgetScreen() {
        new CreateBudgetPage().clickInformIconInEditBudSc();
    }

    @And("user close popup in edit budget screen")
    public void userClosePopupInEditBudgetScreen() {
        new CreateBudgetPage().closeInforIconEditBudSc();
    }

    @When("user go back from my financial report screen")
    public void userGoBackFromMyFinancialReportScreen() {
        new CreateBudgetPage().clickBackIconFinancialSc();
    }

    @When("user scroll to view medical")
    public void userScrollToViewMedical() throws Exception {
        new CreateBudgetPage().scrollToMedical();
    }
}
