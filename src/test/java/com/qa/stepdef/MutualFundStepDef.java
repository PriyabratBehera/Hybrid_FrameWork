package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.DigitalGoldPage;
import com.qa.pages.MutualFundPage;
import com.qa.utils.GlobalParams;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Date;
import java.util.Objects;

public class MutualFundStepDef {

    GlobalParams params = new GlobalParams();
    MutualFundPage mutualFundPage = new MutualFundPage();

    @When("user clicks on Mutual Funds")
    public void userClicksOnMutualFunds() {
        mutualFundPage.clickMutualFunds();
    }

    @And("user search for mutual fund {string}")
    public void userSearchForMutualFund(String mutualFundName) throws Exception {
        mutualFundPage.enterMutualFund(mutualFundName);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickReturnIosKeyboard();
        }
        else{
            new BasePage().pressEnter();
        }
    }

    @And("user enters invest amount for One Time {string}")
    public void userEntersInvestAmountForOneTime(String investmentAmount) {
        mutualFundPage.enterInvestmentAmountForOneTime(investmentAmount);
    }

    @And("user select SIP Duration as {string} from Recommended Duration Box")
    public void userSelectSIPDurationAsFromRecommendedDuration(String text) throws Exception {
        mutualFundPage.selectRecommenedDuration(text);
    }

    @And("user select investment amount as {string} from Suggested Amount box")
    public void userSelectInvestmentAmountAsFromSuggestedAmountBox(String text) throws Exception {
        mutualFundPage.selectInvestmentAmount(text);
    }

    @And("user selects monthly SIP date as {string}")
    public void userSelectsMonthlySIPDateAs(String sipDate) throws Exception {
        mutualFundPage.clickMonthlySIPDate();
        new BasePage().clickByText(sipDate);
    }

    @And("user enters SIP Duration as {string}")
    public void userEntersTenure(String sipDuration) {
        mutualFundPage.enterSIPDuration(sipDuration);
    }

    @And("user scroll to view Add External Folios")
    public void userScrollToViewAddExternalFolios() throws Exception {
        mutualFundPage.scrollToAddExternalFolio();
    }

    @When("user search invalid categories name as {string}")
    public void userSearchInvalidCategoriesName(String name) {
        mutualFundPage.enterInvalidName(name);
    }

    @And("user scroll to view Lockin Period")
    public void userScrollToViewLockinPeriod() throws Exception {
        mutualFundPage.scrollToLockinPeriod();
    }

    @When("user enters Amount for investment amount as {string}")
    public void userEntersAmountForInvestmentAmountAs(String text) {
        mutualFundPage.enterInvestAmount(text);
    }

    @When("user click view in purchase screen")
    public void userClickViewInPurchaseScreen() {
        mutualFundPage.viewLink();
    }

    @When("user click view in MutualFund Schemes screen")
    public void userClickViewInMutualFundSchemesScreen() {
        mutualFundPage.viewLink();
    }

    @And("user click Select Button on MutualFund scheme")
    public void userClickSelectButtonOnMutualFundScheme() throws Exception {
        mutualFundPage.clickSelectButton();
    }

    @When("user click Add to Cart for Aditya Birla")
    public void userClickAddToCart() throws Exception {
        mutualFundPage.clickAddMFForAdityaBirla();
    }

    @And("user click Add to Cart")
    public void userClickAddMutualfund() {
        mutualFundPage.clickOneMF();
    }

    @And("user verify monthly sip")
    public void userVerifyMonthlySip() {
        Assert.assertTrue(mutualFundPage.verifyMonthlySip());
    }

    @And("user verify one time")
    public void userVerifyOneTime() {
        mutualFundPage.clickOneTime();
    }

    @And("user scroll to value oriented")
    public void userScrollToValueOriented() throws Exception {
        mutualFundPage.scrollToValueOriented();
    }

    @And("user scroll to others")
    public void userScrollToOthers() throws Exception {
        mutualFundPage.scrollToOthers();
    }

    @And("user enter investment amount as {string}")
    public void userEnterInvestmentAmountAs(String amt) {
        mutualFundPage.enterAmtInCalSc(amt);
    }

    @And("user click on 5Y Duration box")
    public void userClickOn5YDurationBox() {
        mutualFundPage.clickDurationBox();
    }

    @And("user click on 3Y Duration box")
    public void userClickOn3YDurationBox() {
        mutualFundPage.click3YDurationBox();
    }

    @And("user click on close icon in Returns Calculator")
    public void userClickOnCloseIconInReturnsCalculator() {
        mutualFundPage.clickCloseIconOfReturnsScreen();
    }

    @And("user selects Goal {string}")
    public void userSelectsGoal(String goalName) throws Exception {
        mutualFundPage.SelectGoal(goalName);
    }

    @And("user click {string} check box")
    public void userClickIWeHaveReadTheRelatedSchemeCheckBox(String text) throws Exception {
        mutualFundPage.clickIWeHaveReadTheRelatedSchemeCheckBox(text);
    }

    @And("user enter otp for purchase MF Scheme")
    public void userEnterOtpForPurchaseMFScheme() throws Exception {
        mutualFundPage.enterPurchaseOtp();
    }

    @And("user enters invalid otp for purchase MF Scheme")
    public void userEntersInvalidOtpForPurchaseMFScheme() throws Exception {
        mutualFundPage.enterInvalidPurchaseOtp();
    }

    @And("user search invalid AMC as {string}")
    public void userSearchInvalidAMC(String AmcName) {
        mutualFundPage.enterInvalidName(AmcName);
    }

    @When("user click on refresh icon in History Screen")
    public void userClickOnRefreshIconInHistoryScreen() {
        mutualFundPage.clickRefreshHistory();
    }

    @And("user go back from {string} screen")
    public void userGoBackFromScreen(String text) throws Exception {
        mutualFundPage.goBackFromScreen(text);
    }

    @When("user click three dot icon in My SIP Screen")
    public void userClickThreeDotIconInMySIPScreen() throws Exception {
        mutualFundPage.clickThreeDotInMySip();
    }

    @When("user enter folio number as {string}")
    public void userEnterFolioNumberAs(String FolioNo) throws Exception {
        mutualFundPage.enterFolioNo(FolioNo);
    }

    @When("user enter folio number {string}")
    public void userEnterFolioNumber(String folioNo) throws Exception {
        mutualFundPage.enterFolioNumberOneByOne(folioNo);
    }

    @When("user click on refresh icon in Mutual Funds Screen")
    public void userClickOnRefreshIconInMutualFundsScreen() {
        mutualFundPage.clickRefreshInMutualFundScreen();
    }

    @And("user click Add to Cart for different schemes")
    public void userClickAddToCartForDifferentSchemes() throws InterruptedException {
        mutualFundPage.clickAddToCartForDifferentSchemes();
    }

    @And("user click Add to Cart icon in Mutual Fund schemes screen")
    public void userClickAddToCartIconInMutualFundSchemesScreen() {
        mutualFundPage.clickAddToCartIconInMutualFundSchemesScreen();
    }

    @And("user select One Time radio button")
    public void userSelectOneTimeRadioButton() {
        mutualFundPage.clickOneTime();
    }

    @And("user select Monthly SIP radio button")
    public void userSelectMonthlySIPRadioButton() {
        mutualFundPage.unCheckMonthlySip();
    }

    @And("user enter monthly sip amount as {string} for Aditya Birla Sun Life Forntline Equity Fund")
    public void userEnterMonthlySipAmountAsForAdityaBirlaSunLifeForntlineEquityFundG(String amount) {
        mutualFundPage.enterMonthlyAmountForAdityaBirla(amount);
    }

    @And("user click button text {string}")
    public void userClickButtonText(String text) throws Exception {
        mutualFundPage.clickButtonTypeText(text);
    }

    @And("user click plus button for HDFC Mid Cap")
    public void userClickPlusButtonForHDFCMidCap() {
        mutualFundPage.clickPlusButtonHDFC();
    }

    @And("user enters invest amount for monthly SIP {string}")
    public void userEntersInvestAmountForMonthlySIP(String amount) {
        mutualFundPage.enterInvestmentAmountForMonthlySIP(amount);
    }

    @And("user select {string} check box")
    public void userSelectCheckBox(String text) throws Exception {
        mutualFundPage.selectCheckBox(text);
    }

    @And("user scroll to view Calculate")
    public void userScrollToViewCalculate() throws Exception {
        mutualFundPage.scrollToIWeHaveCheckBox();
    }

    @Then("user clicks on Cancel button")
    public void userClicksOnCancelButton() throws Exception {
        mutualFundPage.clickCancelButton();
    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() throws Exception {
        mutualFundPage.clickContinueButton();
    }

    @And("user click on three dot icon in wealth screen")
    public void userClickOnThreeDotIconInWealthScreen() {
        mutualFundPage.clickThreeDotIconInWealthScreen();
    }

    @And("user click successful invested transaction history")
    public void userClickSuccessfulInvestedTransactionHistory() throws InterruptedException {
        mutualFundPage.clickSuccessfulTransactionHistory();
    }

    @And("user click processed transaction history")
    public void userClickProcessedTransactionHistory() throws InterruptedException {
        mutualFundPage.clickProcessTransactionHistory();
    }

    @And("user click refreshIcon in Fund Transaction History screen")
    public void userClickRefreshIconInFundTransactionHistoryScreen() {
        mutualFundPage.refreshFundTransactionHistory();
    }

    @And("user remove stop SIP popup")
    public void userRemoveStopSIPPopup() {
        mutualFundPage.clickCloseIconOfStopSIP();
    }

    @And("user remove all Schemes from One Click Invest screen")
    public void userRemoveAllSchemesFromOneClickInvestScreen() throws Exception {
        mutualFundPage.clickCloseIconForAllSchemes();
    }

    @And("user enter partial funds amount as {string}")
    public void userEnterPartialFundsAmount(String partialAmount) throws Exception {
        mutualFundPage.enterPartialFundAmount(partialAmount);

    }

    @And("user enter otp for redeem partial funds")
    public void userEnterOtpForRedeemPartialFunds() throws Exception {
        mutualFundPage.enterPurchaseOtp();
    }

    @When("user enter partial units as {string}")
    public void userEnterPartialUnitsAs(String units) {
        mutualFundPage.enterPartialUnits(units);
    }

    @And("user enter otp for redeem partial units")
    public void userEnterOtpForRedeemPartialUnits() throws Exception {
        mutualFundPage.enterPurchaseOtp();
    }

    @And("user click on in Process transaction view")
    public void userClickOnInProcessTransactionHistory() {
        mutualFundPage.clickMfInProcessView();
    }

    @And("user click skipped instalment history")
    public void userClickSkippedInstalmentHistory() throws InterruptedException {
        mutualFundPage.clickSkippedInstalmentHistory();
    }

    @And("user select folio number")
    public void userEnterFolioNumber() throws Exception {
        String folioNumber1 = "3WMYZFJ4OB5I5";
        String folioNumber2 = "3WMYZFJ4OB5I5";
//        mutualFundPage.clickFolioNumberBox();
//        Thread.sleep(4000);
        mutualFundPage.selectFolioNumber(folioNumber1, folioNumber2);

    }

    @And("user click on  Netbanking via Bank account and Netbanking details")
    public void userClickOnNetbankingViaBankAccountAndNetbankingDetails() {
        mutualFundPage.clickNetBankingViaBankDetails();
    }

    @When("user click the three dot for any goal")
    public void userClickTheThreeDotForAnyGoal() {
        mutualFundPage.clickThreeDotOfAnyGoal();
    }

    @And("user enter amount more than fund value")
    public void userEnterAmountMoreThanFundValue() throws Exception {
        mutualFundPage.enterAmountMoreThanFundValue();
    }

    @And("user wait for visibility of static element {string}")
    public void userWaitForVisibilityOfStaticElement(String text) throws Exception {
        mutualFundPage.waitForVisibilityOfStaticElement(text);
    }

    @And("user click on Invest")
    public void userClickOnInvest() {
        mutualFundPage.clickOnInvest();
    }

    @And("user wait for visibility of element {string}")
    public void userWaitForVisibilityOfElement(String text) {
        mutualFundPage.waitForVisibilityOfElement(text);
    }

    @And("user enter otp for invest in mutualFund")
    public void userEnterOtpForInvestInMutualFund() throws Exception {
        mutualFundPage.enterPurchaseOtp();
    }

    @When("user enter monthly sip amount as {string} in one click invest screen")
    public void userEnterMonthlySipAmountAsInOneClickInvestScreen(String amt) throws Exception {
        mutualFundPage.enterMonthlyInvestInOneCli(amt);
    }

    @And("user click one time")
    public void userClickOneTime() {
        mutualFundPage.clickOneTime();
    }

    @When("user enter one time amount as {string} in one click invest screen")
    public void userEnterOneTimeAmountAsInOneClickInvestScreen(String amt) throws Exception {
        mutualFundPage.enterOneTimeInvestInOneCli(amt);
    }

    @When("user click on explore all mutualfund fund schemes")
    public void userClickOnExploreAllMutualfundFundSchemes() {
        mutualFundPage.clickExploreAllMf();
    }

    @And("user click plus button for Aditya birla")
    public void userClickPlusButtonForAdityaBirla() throws Exception {
        mutualFundPage.clickPlusAditya();
    }

    @When("user clicks on complete KYC")
    public void userClicksOnCompleteKYC() {
        mutualFundPage.clickOnCompleteKYC();
    }

    @When("user go back from categories screen")
    public void userGoBackFromCategoriesScreen() {
        mutualFundPage.backBtnCategorySc();
    }

    @When("user go back from AMC screen")
    public void userGoBackFromAMCScreen() {
        mutualFundPage.goBackAmcSc();
    }

    @When("user close sort by overly screen")
    public void userCloseSortByOverlyScreen() {
        mutualFundPage.closeSortByOverlay();
    }

    @And("user select folio number for Aditya Birla Sun Life Forntline Equity Fund")
    public void userSelectFolioNumberForAdityaBirlaSunLifeForntlineEquityFund() throws Exception {
        mutualFundPage.selectFolioForAditya();
    }

    @And("user close the fund card in one click invest screen")
    public void userCloseTheFundCardInOneClickInvestScreen() throws Exception {
        mutualFundPage.closeFundCardSc();
    }

    @And("user click transaction process drop down")
    public void userClickTransactionProcessDropDown() {
        mutualFundPage.clickTranProcessDrDwn();
    }

    @When("user click transaction skipped drop down")
    public void userClickTransactionSkippedDropDown() {
        mutualFundPage.clickTranSkipDrDwn();
    }

    @When("user click transaction success drop down")
    public void userClickTransactionSuccessDropDown() {
        mutualFundPage.clickTranSuccessDrDwn();
    }

    @When("user click on confirm order")
    public void userClickOnConfirmOrder() {
        mutualFundPage.clickOnConfirmOrder();
    }

    @And("user scroll to view Min. STP Installments \\(Monthly)")
    public void userScrollToViewMinSTPInstallmentsMonthly() throws Exception {
        mutualFundPage.scrollToMinStpInst();
    }

    @And("user scroll to Min SWP Amount \\(Daily)")
    public void userScrollToMinSWPAmountDaily() throws Exception {
        mutualFundPage.scrollToMinSwp();
    }

    @And("user click on three dot icon in aditya birla short term goal")
    public void userClickOnThreeDotIconInAdityaBirlaShortTermGoal() throws Exception {
        mutualFundPage.clickThreeDotSAdiShortTerm();
    }
    @And("user click on three dot icon in aditya birla infrasturcture")
    public void userClickOnThreeDotIconInAdityaBirlaInfrasturcture() throws Exception {
        mutualFundPage.clickThreeDotAsInfrastructure();
    }

    @Then("user scroll to view aditya birla sun life infrastructure fund")
    public void userScrollToViewAdityaBirlaSunLifeInfrastructureFund() throws Exception {
        mutualFundPage.scrollToAdiSunLiInfra();
    }

    @And("user select button of {string} schemes")
    public void userSelectButtonOfSchemes(String schemeName) throws Exception {
        mutualFundPage.selectSchemes(schemeName);
    }

    @When("user remove {string} schemes from swith screen")
    public void userRemoveSchemesFromSwithScreen(String schemeName) throws Exception {
        mutualFundPage.removeSchemeSwiScv(schemeName);

    }

    @Then("user verify bellow switch schemes status")
    public void userVerifyBellowSwitchSchemesStatus(DataTable dataTable) throws Exception {
        mutualFundPage.verifySwitchStatus(dataTable);
    }

    @And("user select Daily STP radio button")
    public void userSelectDailySTPRadioButton() {
        mutualFundPage.selectDailyStp();
    }

    @When("user select stp start date as {string}")
    public void userSelectSTPStartDateAs(String dt) throws Exception {
        mutualFundPage.enterStpStartDt(dt);
    }

    @And("user enter number of transfer as {string}")
    public void userEnterNumberOfTransferAs(String freq) throws Exception {
        mutualFundPage.enterTransferFrequency(freq);
    }

    @And("user enter amount as {string} for stp")
    public void userEnterAmountAsForStp(String stpAmount) throws Exception {
        mutualFundPage.enterStpAmount(stpAmount);
    }

    @And("user verify bellow STP status")
    public void userVerifyBellowSTPStatus(DataTable dataTable) throws Exception {
        mutualFundPage.verifyStpStatus(dataTable);
    }

    @And("user select weekly swp radio button")
    public void userSelectWeeklySwpRadioButton() {
        mutualFundPage.selectWeeklySwp();
    }

    @And("user enter amount as {string} for swp")
    public void userEnterAmountAsForSwp(String amount) throws Exception {
        mutualFundPage.enterSwpAmount(amount);
    }

    @And("user verify bellow SWP status")
    public void userVerifyBellowSWPStatus(DataTable dataTable) throws Exception {
        mutualFundPage.verifySwpStatus(dataTable);
    }

    @When("user select swp start day as {string}")
    public void userSelectSwpStartDayAs(String day) throws Exception {
        mutualFundPage.enterSwpStartDt(day);
    }

    @And("user enter swp duration as {string}")
    public void userEnterSwpDurationAs(String duration) throws Exception {
        mutualFundPage.enterSwpDuration(duration);
    }

    @And("user select one folio number in one click invest screen")
    public void userSelectOneFolioNumberInOneClickInvestScreen() {
        mutualFundPage.chooseOneFolio();
    }

    @Then("number of transfer input box is disappear")
    public void numberOfTransferInputBoxIsDisappear() {
        mutualFundPage.unableToSeeNOTBx();
    }

    @And("user select Monthly STP radio button")
    public void userSelectMonthlySTPRadioButton() {
        mutualFundPage.enterMonthlyStp();
    }

    @And("user verify transaction under process")
    public void userVerifyTransactionUnderProcess() throws Exception {
        mutualFundPage.verifyTransacProcess();
    }

    @And("user verify transaction failed")
    public void userVerifyTransactionFailed() throws Exception {
        mutualFundPage.verifyTransacFailed();
    }

    @When("user click three dot icon for stp")
    public void userClickThreeDotIconForStp() {
        mutualFundPage.clickThreeDotForStp();
    }

    @When("user click three dot icon for swp")
    public void userClickThreeDotIconForSwp() {
        mutualFundPage.clickThreeDotForStp();
    }

    @And("user scroll to I we have read in stp screen")
    public void userScrollToIWeHaveReadInStpScreen() throws Exception {
        mutualFundPage.scrollIWeHave();
    }

    @Then("user scroll to view aditya birla sun life short term fund")
    public void userScrollToViewAdityaBirlaSunLifeShortTermFund() throws Exception {
        mutualFundPage.scrollToAdiShort();
    }

    @When("user add sbi magnum scheme")
    public void userAddSbiMagnumScheme() {
        mutualFundPage.addSbiMagnum();
    }

    @And("user click add SBI contra fund")
    public void userClickAddSBIContraFund() {
        mutualFundPage.addSbiContra();
    }

    @When("user click on refresh icon MF external folios screen")
    public void userClickOnRefreshIconMFExternalFoliosScreen() {
        mutualFundPage.clickRefreshIconexter();
    }

    @And("user check default focused radio button is monthly")
    public void userCheckDefaultFocusedRadioButtonIsMonthly() {
        mutualFundPage.checkMonthlyRadio();
    }

    @And("user check default focused radio button is one time")
    public void userCheckDefaultFocusedRadioButtonIsOneTime() {
        mutualFundPage.checkOneTRadio();
    }

    @And("user search {string} in MF screen")
    public void userSearchInMFScreen(String mutualFundName) throws Exception {
        mutualFundPage.enterMutualFund1(mutualFundName);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickReturnIosKeyboard();
        }
    }

    @When("user enter mobile number as {string} in import funds page")
    public void userEnterMobileNumberAsInImportFundsPage(String mob) {
        mutualFundPage.enterMobForCas(mob);
    }

    @When("user enter otp as {string} for import funds")
    public void userEnterOtpAsForImportFunds(String otp) {
        mutualFundPage.enterOtpImpFun(otp);
    }

    @Then("user unable to see invested amount")
    public void userUnableToSeeInvestedAmount() {
        mutualFundPage.unableToSeeInv();
    }

    @And("user enter investment amount {string}")
    public void userEnterInvestmentAmount(String amt) {
        mutualFundPage.setInvestmentAmount(amt);
    }

    @When("user expand fund card")
    public void userExpandFundCard() {
        mutualFundPage.expandFundCard();
    }
}