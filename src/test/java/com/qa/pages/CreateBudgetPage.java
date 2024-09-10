package com.qa.pages;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Objects;

public class CreateBudgetPage extends ProfilePage {
    GlobalParams globalParams = new GlobalParams();
    @AndroidFindBy(xpath = "//*[@text='Budget']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Budget\"]")
    private MobileElement budget;
    @AndroidFindBy(xpath = "//*[@text='Investment']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Investment\"])[2]")
    private MobileElement investmentR;
    @AndroidFindBy(xpath = "//*[@text='Set Financial Goals']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Financial Goals\"]")
    private MobileElement setFiGoal;
    @AndroidFindBy(xpath = "//*[@text='This Month']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"This Month\"])[2]")
    private MobileElement thisMonth;
    @AndroidFindBy(xpath = "//*[@text='Utility']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'Utility Remaining')])[22]")
    private MobileElement utility;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'Investment Remaining')])[22]")
    @AndroidFindBy(xpath = "//*[@text='Investment']")
    private MobileElement investment;
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Medical'")
    @AndroidFindBy(xpath = "//*[@text='Medical']")
    private MobileElement medical;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My Budget']/ancestor::XCUIElementTypeOther[5]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@text='My Budget']/ancestor::android.view.ViewGroup[2]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    private MobileElement backIconOfMyBudgetScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Create Budget']/ancestor::XCUIElementTypeOther[8]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@text='Create Budget']/ancestor::android.view.ViewGroup[3]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    private MobileElement backIconOfCreateBudgetScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Available Funds')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Available Funds')]")
    private MobileElement availableFunds;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IPBDCB2AMT']")
    @AndroidFindBy(xpath = "//*[@text='How much will you save or invest?']/following-sibling::android.widget.EditText")
    private MobileElement saveAndInvestAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='₹0']/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='How much do you pay for home rent?']/following-sibling::android.widget.EditText")
    private MobileElement homeRentAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IPBDCB4AMT']")
    @AndroidFindBy(xpath = "//*[@text='How much do you pay for loans?']/following-sibling::android.widget.EditText")
    private MobileElement payForLoanAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IPBDCB5AMT']")
    @AndroidFindBy(xpath = "//*[@text='How much do you pay for utility bills?']/following-sibling::android.widget.EditText")
    private MobileElement utilityAmountBox;
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Add more'")
    @AndroidFindBy(xpath = "//*[@text='Add more']")
    private MobileElement addMore;
    @AndroidFindBy(xpath = "//*[@text='I am done']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'I am done'")
    private MobileElement iAmDone;
    @AndroidFindBy(xpath = "//*[@text='Report']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Report'")
    private MobileElement report;
    @AndroidFindBy(xpath = "//*[@text='Select']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Select'")
    private MobileElement select;
    @AndroidFindBy(xpath = "//*[@text='90%']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == '90%'")
    private MobileElement ninetyPercentTab;
    @AndroidFindBy(xpath = "//*[@text='Education']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Education']")
    private MobileElement education;
    @AndroidFindBy(xpath = "//*[@text='payout']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='payout']")
    private MobileElement payout;
    @AndroidFindBy(xpath = "//*[@text='Medical']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Medical'")
    private MobileElement medicalCategory;
    @AndroidFindBy(xpath = "//*[@text='50%']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == '50%'")
    private MobileElement fiftyPercentTab;
    @AndroidFindBy(xpath = "//*[@text='75%']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == '75%'")
    private MobileElement seventyFivePercentTab;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IPBDAMAMT']")
    @AndroidFindBy(xpath = "//*[@text='₹0']")
    private MobileElement medicalSpendAmountBox;
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Edit'")
    @AndroidFindBy(xpath = "//*[@text='Edit']")
    private MobileElement editBudget;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'Available Funds: ₹')]/XCUIElementTypeOther/XCUIElementTypeOther)[18]/descendant::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Available Funds')]//following-sibling::android.view.ViewGroup[1]/child::android.view.ViewGroup")
    private MobileElement informationIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='How much do you want to spend?']//following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='How much do you want to spend?']/following-sibling::android.widget.EditText")
    private MobileElement editBudgetAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name='Delete']")
    @AndroidFindBy(xpath = "//*[@text='Delete'")
    private MobileElement deleteButtonOfIos;
    @AndroidFindBy(xpath = "//*[@text='Save']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Save'")
    private MobileElement saveBudget;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='How much will you earn this month?']//following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='How much will you earn this month?']//following-sibling::android.widget.EditText")
    private MobileElement budgetEssentialAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Create Budget']/ancestor::XCUIElementTypeOther[7]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@text='Create Budget']/ancestor::android.view.ViewGroup[3]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    private MobileElement backButtonOfSecondPageOfCreateBudget;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Edit Budget']/ancestor::XCUIElementTypeOther[6]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[9]")
    @AndroidFindBy(xpath = "//*[@text='Edit Budget']/ancestor::android.view.ViewGroup[3]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[5]")
    private MobileElement deleteIonInEditBudgetScreen;
    @AndroidFindBy(xpath = "//*[contains(@text,'Amount available to create a budget')]/following-sibling::android.view.ViewGroup")
    private MobileElement closeInformationPopup;
    @AndroidFindBy(xpath = "//*[contains(@text,' You already have this category budget')]/following-sibling::android.view.ViewGroup")
    private MobileElement closeYouAlreadyHaveBudgetPopup;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Investment'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Investment']")
    private MobileElement investmentInSecondScreen;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Investment'])[3]")
    @AndroidFindBy(xpath = "//*[@text='Investment']")
    private MobileElement investmentInThirdScreen;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='LoanRepayment'])[2]")
    @AndroidFindBy(xpath = "//*[@text='LoanRepayment']")
    private MobileElement loanRepaymentInReportScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Review Budget']/ancestor::XCUIElementTypeOther[8]/descendant::XCUIElementTypeOther[9]")
    @AndroidFindBy(xpath = "//*[@text='Review Budget']/ancestor::android.view.ViewGroup[2]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    private MobileElement backIconOfReviewScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Edit Budget']/ancestor::XCUIElementTypeOther[8]/descendant::XCUIElementTypeOther[7]")
    @AndroidFindBy(xpath = "//*[@text='Edit Budget']/ancestor::android.view.ViewGroup[2]/parent::android.widget.ScrollView/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    private MobileElement backIconOfEditBudScreen;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'Actual Spend: ₹')]/XCUIElementTypeOther/XCUIElementTypeOther)[18]/descendant::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Actual Spend')]//following-sibling::android.view.ViewGroup[1]/child::android.view.ViewGroup")
    private MobileElement informationIconInEditBudSc;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'Actual Spend: ₹')]/XCUIElementTypeOther/XCUIElementTypeOther)[18]/descendant::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Your updated income should be more than your actual spend for the month']/following-sibling::android.view.ViewGroup")
    private MobileElement closeInformIconPopup;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My Financial Report']/ancestor::XCUIElementTypeOther[8]/descendant::XCUIElementTypeOther[12]")
    @AndroidFindBy(xpath = "//*[@text='My Financial Report']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    private MobileElement backIconFinancialScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Budgeting\"]")
    @AndroidFindBy(xpath = "//*[@text='Budgeting']")
    private MobileElement budgeting;

    public void clickBudget() throws Exception {
//        if (! isVisible(budgeting)) {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(budgeting, "up", setFiGoal);
        } else {
//                iOSScrollToElementByName(budgeting, "up", "Budgeting");
            scrollToElement(budgeting, "up", setFiGoal, 5000,10);
        }
//        }
        click(budgeting);
    }

    public void ScrollToViewUtility() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(utility, "up", investment);
        } else {
            scrollToElement(utility, "up", investment);
        }
    }

    public void clickMedicalBudget() {
        click(medical);
    }

    public void clickBackButtonOnMyBudgetScreen() {
        click(backIconOfMyBudgetScreen);
    }

    public void clickBackButtonOnCreateBudgetBudgetScreen() {
        click(backIconOfCreateBudgetScreen);
    }

    public void enterMoreThanAvailableFunds() {
        String availableAmount = new BasePage().getText(availableFunds, "available funds is: ");
        String[] arr = availableAmount.split("Available Funds: ₹");
        String str = arr[1].replace(",", "");
        int bAmount = Integer.parseInt(str) + 1;
        String amount = Integer.toString(bAmount);
        sendKeys(saveAndInvestAmountBox, amount);
    }

    public void enterSaveAndInvestAmount(String text) {
        saveAndInvestAmountBox.clear();
        sendKeys(saveAndInvestAmountBox, text);
    }

    public void enterHomeRentAmount(String text) {
        sendKeys(homeRentAmountBox, text);
    }

    public void enterPayForLoanAmount(String text) {
        sendKeys(payForLoanAmountBox, text);
    }

    public void enterUtilityLoanAmount(String text) {
        sendKeys(utilityAmountBox, text);
    }

    public void clickAddMore() {
        click(addMore);
    }

    public void clickIAmDone() {
        click(iAmDone);
    }

    public boolean verifyReport() {
        return isVisible(report);
    }

    public boolean verifySelect() {
        return isVisible(select);
    }

    public boolean verifyPercentTab() {
        return isVisible(ninetyPercentTab);
    }

    public void clickSelect() {
        click(select);
    }

    public void ScrollToViewEducation() throws Exception {
        scrollToElement(education, "up", payout);
    }

    public boolean verifyMedicalCategory() {
        return isVisible(medicalCategory);
    }

    public void clickFiftyPercentTab() {
        click(fiftyPercentTab);
    }

    public void clickSeventyFivePercentTab() {
        click(seventyFivePercentTab);
    }

    public void enterSpendAmountForMedicalCategory(String text) {
        sendKeys(medicalSpendAmountBox, text);
    }

    public boolean verifyEdit() {
        return isVisible(editBudget);
    }

    public void clickEditBudget() {
        click(editBudget);
    }

    public void clickInformationIcon() {
        click(informationIcon);
    }

    public void enterEditBudgetAmount(String text) {
        editBudgetAmount.clear();
        sendKeys(editBudgetAmount, text);
    }

    public void clickSaveBudget() {
        click(saveBudget);
    }

    public void enterFirstBudgetAmount(String amount) {
        budgetEssentialAmountBox.clear();
        sendKeys(budgetEssentialAmountBox, amount);
    }

    public void clickBackIconOfSecondPageOfCreateBudget() {
        click(backButtonOfSecondPageOfCreateBudget);
    }

    public void clickDeleteIcon() {
        click(deleteIonInEditBudgetScreen);
    }

    public void clickReport() {
        click(report);
    }

    public void swipeToBudget() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            swipe(364,394,46,376,2000);
        } else if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(investmentR, "left", thisMonth);
        }
    }

    public void clickClosePopupButton() {
        click(closeInformationPopup);
    }

    public void clickYesButton() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='Yes']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='Submit Button']";
        }
        getElement(xpath).click();
    }

    public void userCleanUpTheAppDataFor(String mobileNumber) {
        String[] mobNo = mobileNumber.split(" ");
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/deleteall"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{ \"mobile\": \"" + mobNo[0] + "\" }"))
                    .build();

            HttpClient client = HttpClient.newBuilder().build();
            try {
                HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/deleteall"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{ \"mobile\": \"" + mobNo[2] + "\" }"))
                    .build();

            HttpClient client = HttpClient.newBuilder().build();
            try {
                HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean verifyInvestmentInSecondScreen() {
        return isVisible(investmentInSecondScreen);
    }

    public boolean verifyInvestmentInThirdScreen() {
        return isVisible(investmentInThirdScreen);
    }

    public boolean verifyLoanRepaymentInReportScreen() {
        return isVisible(loanRepaymentInReportScreen);
    }

    public void clickYouAlreadyPopupCloseIcon() {
        click(closeYouAlreadyHaveBudgetPopup);
    }

    public void clickBackInReviewSc() {
        click(backIconOfReviewScreen);
    }

    public void clickBackInEditBudSc() {
        click(backIconOfEditBudScreen);
    }

    public void clickInformIconInEditBudSc() {
        click(informationIconInEditBudSc);
    }

    public void closeInforIconEditBudSc() {
        click(closeInformIconPopup);
    }

    public void clickBackIconFinancialSc() {
        click(backIconFinancialScreen);
    }

    public void scrollToMedical() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(medical, "up", investment);
        } else {
            scrollToElement(medical, "up", investment);
        }
    }

}
