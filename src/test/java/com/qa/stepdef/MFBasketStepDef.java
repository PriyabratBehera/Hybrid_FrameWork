package com.qa.stepdef;

import com.qa.pages.MFBasketPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MFBasketStepDef {
    MFBasketPage mfBasketPage = new MFBasketPage();

    @When("user click on gift yourself basket")
    public void WhenUserClickOnGiftYourselfBasket() throws Exception {
        mfBasketPage.clickGiftYorSelfMFB();
    }
    @When("user click on automation testing basket")
    public void WhenUserClickOnAutomationTestingBasket() throws Exception {
        mfBasketPage.clickAutomationTestingMFB();
    }

    @And("user scroll to view Disclaimer")
    public void userScrollToViewDisclaimer() throws Exception {
        mfBasketPage.scrollToDisclaimer();
    }

    @And("user enter goal name in name of my goal input box as {string}")
    public void userEnterGoalNameInNameOfMyGoalInputBoxAs(String goalName) throws Exception {
        mfBasketPage.enterGoalName(goalName);
    }

    @And("user enter target goal amount as {string}")
    public void userEnterTargetGoalAmountAs(String goalAmt) throws Exception {
        mfBasketPage.enterTargetAmt(goalAmt);
    }

    @And("user enter existing savings for this goal as {string}")
    public void userEnterExistingSavingsForThisGoalAs(String savingGoalAmt) throws Exception {
        mfBasketPage.enterExistingAmt(savingGoalAmt);
    }

    @And("user enter number of years to achieve this goal as {string}")
    public void userEnterNumberOfYearsToAchieveThisGoalAs(String achieveGoalByYr) throws Exception {
        mfBasketPage.enterNoYrAchieveGoal(achieveGoalByYr);
    }

    @And("user enter MF basket invest amount lower than minimum amount")
    public void userEnterMFBasketInvestAmountLowerThanMinimumAmount() throws Exception {
        mfBasketPage.enterLowerThanMinEnvAmt();
    }

    @And("verify validation error Amount is required in personal financial goal screen")
    public void verifyValidationErrorAmountIsRequiredInPersonalFinancialGoalScreen() {
        Assert.assertTrue(mfBasketPage.verifyValidAmtReq());
    }

    @When("user close investment needed for this goal screen")
    public void userCloseInvestmentNeededForThisGoalScreen() {
        mfBasketPage.closeInvNeedForGoal();
    }

    @And("user click on basket which have monthly investment options")
    public void userClickOnBasketWhichHaveMonthlyInvestmentOptions() throws Exception {
        mfBasketPage.clickMonthlyInvBasket();
    }

    @Then("verify validation error Amount must be greater than or equal to min amount")
    public void verifyValidationErrorAmountMustBeGreaterThanOrEqualToMinAmount() throws Exception {
        mfBasketPage.verifyLowerMinValida();
    }

    @When("user enter MF basket invest amount higher than minimum amount")
    public void userEnterMFBasketInvestAmountHigherThanMinimumAmount() throws Exception {
        mfBasketPage.enterHigherThanMinEnvAmt();
    }

    @And("user select first investment date")
    public void userSelectFirstInvestmentDate() throws Exception {
        mfBasketPage.selectFirstInvDt();
    }

    @And("user select goal for invest gifting goal")
    public void userSelectGoalForInvestGiftingGoal() throws Exception {
        mfBasketPage.selectGoalForInvMfBas();
    }

    @And("user enter investment duration as {string}")
    public void userEnterInvestmentDurationAs(String duration) throws Exception {
        mfBasketPage.enterInvestmentDuration(duration);
    }

    @And("user delete existing goal")
    public void userDeleteExistingGoal() throws Exception {
        mfBasketPage.verifyGoalExist();
    }

    @And("user select goal for invest tax saving goal")
    public void userSelectGoalForInvestTaxSavingGoal() throws Exception {
        mfBasketPage.selectGoalForInvTaxG();
    }

    @And("user click on more to go mf basket listing page")
    public void userClickOnMoreToGoMfBasketListingPage() throws Exception {
        mfBasketPage.scrollToMoreLink();
    }

    @When("user click on personalize basket")
    public void userClickOnPersonalizeBasket() {
        mfBasketPage.clickPersonalizeBasket();
    }

    @When("user close personal portfolio model")
    public void userClosePersonalPortfolioModel() {
        mfBasketPage.closePersonPortModel();
    }
}
