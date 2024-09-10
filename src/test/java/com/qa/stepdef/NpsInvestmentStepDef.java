package com.qa.stepdef;

import com.qa.pages.KYCPage;
import com.qa.pages.NpsInvestmentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class NpsInvestmentStepDef {
    NpsInvestmentPage npsInvestmentPage = new NpsInvestmentPage();

    @When("user scroll to NPS investment")
    public void userScrollToNPSInvestment() throws Exception {
        npsInvestmentPage.scrollToNpsInvestment();
    }

    @And("user click on NPS Investment")
    public void userClickOnNPSInvestment() {
        npsInvestmentPage.clickNpsInvestment();
    }

    @And("user verify sliding banner in NPS screen")
    public void userVerifySlidingBannerInNPSScreen() {
        npsInvestmentPage.verifySlidingBanner();
    }

    @And("user scroll to view auto choice of investment")
    public void userScrollToViewAutoChoiceOfInvestment() throws Exception {
        npsInvestmentPage.scrollToAutoChoice();
    }

    @And("user scroll to view nps faqs")
    public void userScrollToViewNpsFaqs() throws Exception {
        npsInvestmentPage.scrollToNpsFaq();
    }

    @And("user scroll to view exist and withdraw")
    public void userScrollToViewExistAndWithdraw() throws Exception {
        npsInvestmentPage.scrollToExistAndWithDraw();
    }

    @When("user scroll to view more about NPS")
    public void userScrollToViewMoreAboutNPS() throws Exception {
        npsInvestmentPage.scrollToMoreAboutNps();
    }

    @And("user scroll to my current age is")
    public void userScrollToMyCurrentAgeIs() throws Exception {
        npsInvestmentPage.scrollToCurrentAge();
    }

    @When("user enter monthly retirement income needed as {string}")
    public void userEnterMonthlyRetirementIncomeNeededAs(String MonthlyIncome) throws Exception {
        npsInvestmentPage.enterMonRetirementIncome(MonthlyIncome);
    }

    @And("enter current age as {string}")
    public void enterCurrentAgeAs(String currentAge) throws Exception {
        npsInvestmentPage.enterCurrentAge(currentAge);
    }

    @And("enter retirement age as {string}")
    public void enterRetirementAgeAs(String retirementAge) throws Exception {
        npsInvestmentPage.enterRetirementAge(retirementAge);
    }

    @And("user enter income till age of {string} after retirement")
    public void userEnterIncomeTillAgeOfAfterRetirement(String age) throws Exception {
        npsInvestmentPage.enterIncomeAfterRetire(age);
    }

    @And("user invest at annual interest of {string} till retire")
    public void userInvestAtAnnualInterestOfTillRetire(String interest) throws Exception {
        npsInvestmentPage.enterInvestTillRetire(interest);
    }

    @And("user invest at annual interest of {string} post retirement")
    public void userInvestAtAnnualInterestOfPostRetirement(String interest) throws Exception {
        npsInvestmentPage.enterInvestPostRetire(interest);
    }

    @And("user scroll to corpus")
    public void userScrollToCorpus() throws Exception {
        npsInvestmentPage.scrollToCorpus();
    }

    @And("user search company name as {string} in company name screen")
    public void userSearchCompanyNameAsInPersonalDetailScreen(String compName) throws Exception {
        npsInvestmentPage.searchCompanyName(compName);
    }

    @And("user click on crop details")
    public void userClickOnCropDetails() {
        npsInvestmentPage.clickCorpDetail();
    }

    @And("user enter employee number as {string}")
    public void userEnterEmployeeNumberAs(String empNum) throws Exception {
        npsInvestmentPage.enterEmpNum(empNum);
    }

    @And("user enter company joining date as {string}")
    public void userEnterCompanyJoiningDateAs(String compJoinDt) throws Exception {
        npsInvestmentPage.enterCompJoinDt(compJoinDt);
    }

    @Then("user not able to see invest tab")
    public void userNotVerifyStaticInvestTab() {
        Assert.assertFalse(npsInvestmentPage.verifyInvestTab());
    }

    @And("user click on Register as Corporate Subscriber")
    public void userClickOnRegisterAsCorporateSubscriber() throws Exception {
        npsInvestmentPage.clickCorpSub();
    }

    @And("user click on pension fund manager drop down")
    public void userClickOnPensionFundManagerDropDown() throws Exception {
        npsInvestmentPage.clickPFMDropDwn();
    }

    @And("user scroll down")
    public void userScrollDown() throws Exception {
        npsInvestmentPage.scrollD0wn();
    }

    @And("user enter alternative fund \\(A) as {string}")
    public void userEnterAlternativeFundAAs(String fund) throws Exception {
        npsInvestmentPage.enterAlterFund(fund);
    }

    @When("user enter equity \\(E) as {string}")
    public void userEnterEuityEAs(String equity) throws Exception {
        npsInvestmentPage.enterEquityFund(equity);
    }

    @And("enter nominee name as {string}")
    public void enterNomineeNameAs(String name) throws Exception {
        npsInvestmentPage.enterNomineeName(name);

    }

    @And("user select relation with guardians")
    public void userSelectRelationWithGuardians() throws Exception {
        npsInvestmentPage.selectGuardianRelationship();
    }

    @And("user enter guardians name as {string}")
    public void userEnterGuardiansNameAs(String name) throws Exception {
        npsInvestmentPage.enterGuardianName(name);
    }

    @And("user scroll nps investment video")
    public void userScrollNpsInvestmentVideo() throws Exception {
        npsInvestmentPage.scrollNpsVideo();
    }

    @And("user click the video")
    public void userClickTheVideo() {
        npsInvestmentPage.clickVideo();
    }

    @When("user select life cycle fund type as moderate LC fifty")
    public void userSelectLifeCycleFundTypeAsModerateLCFiftyFive() {
        npsInvestmentPage.selectModerateLCF();
    }

    @When("user select life cycle fund type as conservative LC twentyFive")
    public void userSelectLifeCycleFundTypeAsConservativeLCTwentyFive() throws Exception {
        npsInvestmentPage.selectConservativeLCF();
    }

    @And("user scroll to tax saving account")
    public void userScrollToTaxSavingAccount() throws Exception {
        npsInvestmentPage.scrollToTaxSavingAccount();
    }

    @When("user select life cycle fund type as moderate LC seventyFive")
    public void userSelectLifeCycleFundTypeAsModerateLCSeventyFive() throws Exception {
        npsInvestmentPage.selectAggressiveLCF();
    }

    @When("user close the auto choice investment screen")
    public void userCloseTheAutoChoiceInvestmentScreen() {
        npsInvestmentPage.closeAutoChoiceInvest();
    }

    @And("user scroll to view nps faq")
    public void userScrollToViewNpsFaq() throws Exception {
        npsInvestmentPage.scrollToFaq();
    }

    @And("user scroll to what are the tax benefits in NPS account")
    public void userScrollToWhatAreTheTaxBenefitsInNPSAccount() throws Exception {
        npsInvestmentPage.scrollToWhatAreTax();
    }

    @And("user scroll to exit on death")
    public void userScrollToExitOnDeath() throws Exception {
        npsInvestmentPage.scrollToExitOnDeath();
    }

    @And("user scroll to partial withdraw")
    public void userScrollToPartialWithdraw() throws Exception {
        npsInvestmentPage.scrollToPartialWithdral();
    }

    @And("user not able to select investment fund manager")
    public void userNotAbleToSelectInvestmentFundManager() throws Exception {
        npsInvestmentPage.verifyIsPFMClickable();
    }

    @And("user not able to select active choice")
    public void userNotAbleToSelectActiveChoice() throws Exception {
        npsInvestmentPage.verifyActiveChoice();
    }

    @And("user not able to select portfolio option")
    public void userNotAbleToSelectPortfolioOption() throws Exception {
        npsInvestmentPage.verifyPortFoOpt();
    }

    @And("user not able to select auto choice")
    public void userNotAbleToSelectAutoChoice() throws Exception {
        npsInvestmentPage.verifyAutoChoice();
    }

    @And("user click on investment choice")
    public void userClickOnInvestmentChoice() {
        npsInvestmentPage.clickInvestChoice();
    }

    @When("user enter govt security as {string}")
    public void userEnterGovtSecurityAs(String rate) throws Exception {
        npsInvestmentPage.oenterGovtSecurity(rate);
    }

    @When("user enter corporate bond as {string}")
    public void userEnterCorporateBondAs(String rate) throws Exception {
        npsInvestmentPage.enterCorporateBnd(rate);
    }

    @And("user click on nominee")
    public void userClickOnNominee() {
        npsInvestmentPage.clickNominee();
    }

    @And("user enter guardian DOB greater than eighteen")
    public void userEnterGuardianDOBGreaterThanEighteen() throws Exception {
        npsInvestmentPage.enterGuardianDob();
    }

    @And("user enter guardian DOB below eighteen")
    public void userEnterGuardianDOBBelowEighteen() throws Exception {
        npsInvestmentPage.enterBelow18GuDob();
    }

    @And("user click on DEF technologies")
    public void userClickOnDEFTechnologies() {
        npsInvestmentPage.clickDefTechnologies();
    }

    @When("user click on invest in nps banner")
    public void userClickOnInvestInNpsBanner() {
        npsInvestmentPage.clickInvInNpsBan();
    }

    @And("user swipe to save income tax banner")
    public void userSwipeToSaveIncomeTaxBanner() throws Exception {
        npsInvestmentPage.swipeToSaveIncTxBan();
    }

    @And("user swipe zero taxes banner")
    public void userSwipeZeroTaxesBanner() throws Exception {
        npsInvestmentPage.swipeToZeroTax();
    }

    @When("user enter account number in bank as {string} account screen")
    public void userEnterAccountNumberInBankAsAccountScreen(String accNo) {
        npsInvestmentPage.enterAccNo(accNo);
    }

    @When("user enter ifsc code as {string}")
    public void userEnterIfscCodeAs(String ifscCode) throws Exception {
        npsInvestmentPage.enterIfscCode(ifscCode);
    }

    @And("select Account number as {string}")
    public void selectAccountNumberAs(String accNo) {
        npsInvestmentPage.enterAccNo(accNo);

    }

    @And("user Select bank name as {string}")
    public void userSelectBankNameAs(String bankName) throws Exception {
        npsInvestmentPage.selectBankName(bankName);
    }

    @And("user verify submit application button")
    public void userVerifySubmitApplicationButton() {
        npsInvestmentPage.verifySubmitApplication();
    }

    @When("user enter contribution amount as {string}")
    public void userEnterContributionAmountAs(String amt) throws Exception {
        npsInvestmentPage.enterContributionAmt(amt);
    }

    @And("user delete nps account {string}")
    public void userDeleteNpsAccount(String mobNo) {
        npsInvestmentPage.deleteNps(mobNo);
    }

    @When("user click tire one account type")
    public void userClickTireAccountType() {
        npsInvestmentPage.clickTire1Acc();
    }

    @When("user click tire two account type")
    public void userClickTireTwoAccountType() {
        npsInvestmentPage.clickTire2Acc();
    }

    @And("user select bank")
    public void userSelectBank() {
        npsInvestmentPage.selectBank();
    }

    @And("user click on make payment")
    public void userClickOnMakePayment() {
        npsInvestmentPage.clickMakePayment();
    }

    @And("user do payment for nps contribution")
    public void userDoPaymentForNpsContribution() throws Exception {
        npsInvestmentPage.doPaymentForNps();
    }

    @When("user click on home button")
    public void userOnHomeButton() {
        npsInvestmentPage.clickHome();
    }

    @When("user click history icon in nps screen")
    public void userClickHistoryIconInNpsScreen() {
        npsInvestmentPage.clickHistoryIcon();
    }

    @And("user do payment fail for nps contribution")
    public void userDoPaymentFailForNpsContribution() throws Exception {
        npsInvestmentPage.paymentFailForNps();
    }

    @When("user close reason of failure screen")
    public void userCloseReasonOfFailureScreen() {
        npsInvestmentPage.closeFailureScreen();
    }

    @And("user verify successful nps registration transaction as {string}")
    public void userVerifySuccessTransaction(String amount) throws Exception {
        npsInvestmentPage.verifySuccessTransaction(amount);
    }

    @And("user verify failure transaction as {string}")
    public void userVerifyFailureTransaction(String amount) throws Exception {
        npsInvestmentPage.verifyFailureTransaction(amount);
    }

    @And("user click on hombale technologies")
    public void userClickOnHombaleTechnologies() {
        npsInvestmentPage.clickHombal();
    }

    @When("user select corporate subscriber")
    public void userSelectCorporateSubscriber() {
        npsInvestmentPage.clickCorporateSub();
    }

    @When("user close restart nps application screen")
    public void userCloseRestartNpsApplicationScreen() {
        npsInvestmentPage.closeRestartNpsScreen();
    }

    @When("user select one nominee")
    public void userSelectOneNominee() {
        npsInvestmentPage.chooseOneNominee();
    }

    @Then("user verify 100 percent")
    public void userVerify100Percent() {
        npsInvestmentPage.verify100PercentNominee();
    }

    @Then("user verify 50 percent")
    public void userVerify50Percent() {
        npsInvestmentPage.verify50PercentNominee();
    }

    @And("user select two nominee")
    public void userSelectTwoNominee() {
        npsInvestmentPage.chooseTwoNominee();
    }

    @Then("user verify validation maximum three banks are allowed")
    public void userVerifyValidationMaximumThreeBanksAreAllowed() {
        npsInvestmentPage.verifyAddLimitBank();
    }

    @When("user close adding bank popup")
    public void userCloseAddingBankPopup() {
        npsInvestmentPage.closeAddingBankPopup();
    }

    @And("user select pension fund manager as {string}")
    public void userSelectPensionFundManagerAs(String pfm) throws Exception {
        npsInvestmentPage.selectPFM(pfm);
    }

    @And("user select bank account")
    public void userSelectBankAccount() {
        npsInvestmentPage.selectBankInBankAccSc();

    }

    @When("user click on submit application")
    public void userClickOnSubmitApplication() {
        npsInvestmentPage.clickSubmitApplication();
    }

    @And("user scroll to view corporate name")
    public void userScrollToViewCorporateName() throws Exception {
        npsInvestmentPage.scrollCorporateName();
    }

    @And("user verify bellow corporate nps application status")
    public void userVerifyBellowCorporateNpsApplicationStatus(DataTable dataTable) {
        npsInvestmentPage.verifyAppliStatus(dataTable);
    }

    @And("user select nomination DOB")
    public void userSelectNominationDOB() throws Exception {
        npsInvestmentPage.enterNomineDob();
    }

    @And("user select individual subscriber")
    public void userSelectIndividualSubscriber() {
        npsInvestmentPage.clickIndividualSub();
    }

    @And("user select Portfolio option as {string}")
    public void userSelectPortfolioOptionAs(String portfolioName) throws Exception {
        npsInvestmentPage.selectPortfolioOpt(portfolioName);
    }

    @When("user click on open nps account")
    public void userClickOnRegisterForNps() {
        npsInvestmentPage.clickRegisterNps();
    }

    @And("user scroll to view active choice of investment")
    public void userScrollToViewActiveChoiceOfInvestment() throws Exception {
        npsInvestmentPage.scrollToActiveChoice();
    }

    @When("user enter pran number as {string} for check status")
    public void userEnterPranNumberFoeCheckStatus(String pranNo) throws Exception {
        npsInvestmentPage.enterPranNumber(pranNo);
    }

    @When("user close the check pran popup")
    public void userCloseTheCheckPranPopup() {
        npsInvestmentPage.closePranStaPopup();
    }

    @And("user click ABC Technologies \\(ABC Tek)")
    public void userClickABCTechnologiesABCTek() throws InterruptedException {
        npsInvestmentPage.clickAbcTec();
    }

    @Then("user verify invest tab")
    public void userVerifyInvestTab() {
        Assert.assertTrue(npsInvestmentPage.verifyInvestTab());
    }

    @And("user verify bellow individual nps registration status")
    public void userVerifyBellowIndividualNpsRegistrationStatus(DataTable dataTable) {
        npsInvestmentPage.verifyNPSAppliStatus(dataTable);
    }

    @And("user click on invest in nps")
    public void userClickOnInvestInNps() {
        npsInvestmentPage.clickInvestInNps();
    }

    @And("user wait for payment failure screen")
    public void userWaitForPaymentFailureScreen() throws InterruptedException {
        npsInvestmentPage.waitForPaymentScreen();
    }

    @And("user invest at annual interest of {string} percent post retirement")
    public void userInvestAtAnnualInterestOfPercentPostRetirement(String amt) throws Exception {
        npsInvestmentPage.enterInvestPostRetirement(amt);
    }

    @Then("user verify registration history")
    public void userVerifyRegistrationHistory() throws Exception {
        npsInvestmentPage.verifyRegiHis();
    }

    @Then("user verify Retirement Age must be smaller than seventyFive")
    public void userVerifyRetirementAgeMustBeSmallerThanSeventyFive() throws Exception {
        npsInvestmentPage.verifyRetireAgeValidation();
    }

    @Then("verify Current Age must be smaller than sixtyFive")
    public void verifyCurrentAgeMustBeSmallerThanSixtyFive() throws Exception {
        npsInvestmentPage.verifyCurrentAgeValidation();
    }

    @And("user run the batch api")
    public void userRunTheBatchApi() {
        npsInvestmentPage.runBatchApi();
    }

    @Then("user click on shift my Pran")
    public void userClickOnShiftMyPran() {
        npsInvestmentPage.clickShiftMyPran();
    }

    @And("user click individual radio button")
    public void userClickIndividualRadioButton() {
        npsInvestmentPage.clickIndRadioBtn();
    }

    @And("user enter pop-sp code as {string}")
    public void userEnterPopSpCodeAs(String popSpCd) throws Exception {
        npsInvestmentPage.enterPopSpCode(popSpCd);
    }

    @And("user enter pran number as {string}")
    public void userEnterPranNumberAs(String pranNum) throws Exception {
        npsInvestmentPage.enterPranNum(pranNum);
    }

    @And("user rename subscriber name as {string}")
    public void userRenameSubscriberNameAs(String subscriberName) throws Exception {
        npsInvestmentPage.renameSubscriberName(subscriberName);
    }

    @And("user enter pran shifting otp")
    public void userEnterPranShiftingOtp() {
        npsInvestmentPage.enterOTPForPranShift();
    }

    @When("user click corporate radio button")
    public void userClickCorporateRadioButton() {
        npsInvestmentPage.clickCorRadioBtn();
    }

    @And("user enter current cbo code as {string}")
    public void userEnterCurrentCboCodeAs(String cboCode) throws Exception {
        npsInvestmentPage.enterCboCode(cboCode);
    }

    @And("user click on original value floatr")
    public void userClickOnOriginalValueFloatr() {
        npsInvestmentPage.clickOriginalValueFloatr();
    }

    @And("user delete bank account as {string}")
    public void userDeleteBankAccount(String accNo) {
        npsInvestmentPage.deleteBankDetail(accNo);
    }

    @And("user enter invalid pran shifting otp")
    public void userEnterInvalidPranShiftingOtp() {
        npsInvestmentPage.enterWrongOTPForPranShift();
    }

    @When("user click on information icon in nps screen")
    public void userClickOnInformationIconInNpsScreen() {
        npsInvestmentPage.clickInformationIcon();

    }

    @And("user verify pran details")
    public void userVerifyPranDetails(DataTable table) {
        npsInvestmentPage.verifyPranDetails(table);
    }

    @And("user click coordinate of {int} and {int}")
    public void userClickCoordinateOfAnd(int xPoint, int yPoint) {
        npsInvestmentPage.clickOnPoint(xPoint, yPoint);
    }

    @Then("user verify successful nps contribution transaction as {string}")
    public void userVerifySuccessfulNpsContributionTransactionAs(String amount) throws Exception {
        npsInvestmentPage.verifySuccessContribution(amount);
    }

    @And("user scroll to scheme G-Tire")
    public void userScrollToSchemeGTire() {
        npsInvestmentPage.scrollToScemeG();
    }

    @And("user verify increasing registration amount")
    public void userVerifyIncreasingRegistrationAmount() {
        npsInvestmentPage.verifyRegiIncreaseAmt();
    }

    @When("user click history icon in nps home screen")
    public void userClickHistoryIconInNpsHomeScreen() {
        npsInvestmentPage.clickHistoryIconInHome();
    }

    @And("user click on abs technologies")
    public void userClickOnAbsTechnologies() {

    }

    @And("user can see nps transaction statement")
    public void userCanSeeNpsTransactionStatement() throws Exception {
        npsInvestmentPage.downloadNpsTran();
    }

    @And("user click close the nps recipt page")
    public void userClickCloseTheNpsReciptPage() {
        npsInvestmentPage.clickDoneBtnNpsRecipt();
    }

    @And("user enters Full Name as {string} in pran shifting request screen")
    public void userEntersFullNameAsInPranShiftingRequestScreen(String name) throws Exception {
        npsInvestmentPage.enterFullNameInPranShi(name);
    }

    @When("user click on info icon on NPS dashboard")
    public void userClickOnInfoIconOnNPSDashboard() {
        npsInvestmentPage.clickInfoIcon();
    }

    @When("user close my pran detail screen")
    public void userCloseMyPranDetailScreen() {
        npsInvestmentPage.closeMyPranSc();
    }

    @And("user enter OTP for in NPS screen")
    public void userEnterOTPForInNPSScreen() throws Exception {
        npsInvestmentPage.enterOTP();
    }

    @And("user on create nps account")
    public void userOnCreateNpsAccount() {
        npsInvestmentPage.clickOnCreateNpsAcc();
    }

    @And("user verify Auto choice")
    public void userVerifyAutoChoice() {
        npsInvestmentPage.verifyAutoCh();
    }

    @And("user enter corporate email as {string}")
    public void userEnterCorporateEmailAs(String email) {
        npsInvestmentPage.enterCorporateEmail(email);
    }

//    @When("user select portfolio options as {string}")
//    public void userSelectPortfolioOptionsAs(String portOpt) {
//        npsInvestmentPage.selectPortfolioOpt(portOpt);
//    }
}
