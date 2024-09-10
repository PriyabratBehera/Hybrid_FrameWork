package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.MutualFundPage;
import com.qa.pages.RainyDayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RainyDayStepDef {
    @And("user click on rainy days banner")
    public void userClickOnRainyDayBanner() {
        new RainyDayPage().clickRainyDayBanner();
    }

    @When("user enter rainy day saving amount as {string}")
    public void userEnterRainyDaySavingAmountAs(String amount) throws Exception {
        new RainyDayPage().enterRainyDaySavingAmount(amount);
    }

    @And("user click partial static text {string}")
    public void userClickPartialStaticText(String text) throws Exception {
        new BasePage().clickPartialStaticText(text);
    }

    @And("user enter otp for investment Goal")
    public void userEnterOtpForInvestmentGoal() throws Exception {
        new MutualFundPage().enterPurchaseOtp();
    }

    @When("user go back from my account screen")
    public void userGoBackFromMyAccountScreen() {
        new RainyDayPage().clickBackIconInMaAccountScreen();
    }

    @And("user swipe to you are ready for rainy day banner")
    public void userSwipeToSetYourFinancialGoalBanner() throws Exception {
        new RainyDayPage().swipeToSetFinancialGoal();
    }

    @And("user click on set your financial goal")
    public void userClickOnSetYourFinancialGoal() {
        new RainyDayPage().clickSetFinancialGoalBanner();
    }

    @And("user verify are you ready for the rainy days banner")
    public void userVerifyAreYouReadyForTheRainyDaysBanner() {
        Assert.assertTrue(new RainyDayPage().verifyAryYouReadyForRainyDay());
    }

    @And("user click on I  We have read the related Scheme Document of the selected fund before investing check box")
    public void userClickOnIWeHaveReadTheRelatedSchemeDocumentOfTheSelectedFundBeforeInvestingCheckBox() {
        new RainyDayPage().clickIWeHaveCheckBox();
    }

    @When("user click Complete KYC")
    public void userClickCompleteKYC() {
        new RainyDayPage().clickCompleteKyc();
    }

    @When("user enter monthly expenses amount as {string}")
    public void userEnterMonthlyExpensesAmountAs(String amount) throws Exception {
        new RainyDayPage().enterMonthlyExpensesAmount(amount);
    }

    @When("user enter total loan EMI in a month amount as {string}")
    public void userEnterTotalLoanEMIInAMonthAmountAs(String amount) {
        new RainyDayPage().enterTotalEmiLoanInAMonthAmount(amount);
    }

    @And("user go back from plan rainy days saving screen")
    public void userGoBackFromPlanRainyDaysSavingScreen() {
        new RainyDayPage().clickBackButtonInPlanRainyDaysSavingScreen();
    }

    @And("user go back from loan and liabilities screen")
    public void userGoBackFromLoanAndLiabilitiesScreen() {
        new RainyDayPage().clickBackButtonInLoanAndLiabilitiesScreen();
    }

    @And("user go back from household expenses screen")
    public void userGoBackFromHouseholdExpensesScreen() {
        new RainyDayPage().clickBackButtonInHouseHoldExpensesScreen();
    }

    @And("user further invest as {string}")
    public void userFurtherInvestAs(String amt) throws Exception {
        new RainyDayPage().enterInvestsAmount(amt);
    }

    @And("user scroll to view twentyEight")
    public void userScrollToViewTh() throws Exception {
        new RainyDayPage().scroll28th();
    }

    @And("user select schemes in rainy day saving screen")
    public void userSelectSchemesInRainyDaySavingScreen() throws Exception {
        new RainyDayPage().selectFund();
    }

    @And("user click on rainy day on home screen")
    public void userClickOnRainyDayOnHomeScreen() {
        new RainyDayPage().clickRainyDayBan();
    }

    @And("user scroll to I we have read the related schemes")
    public void userScrollToIWeHaveReadTheRelatedSchemes() throws Exception {
        new RainyDayPage().scrollIWeHaveCheckBox();
    }
}
