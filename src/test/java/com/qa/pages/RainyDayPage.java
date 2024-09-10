package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

import java.util.Objects;

public class RainyDayPage extends ProfilePage {
    GlobalParams globalParams = new GlobalParams();
    TestUtils testUtils = new TestUtils();

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My existing savings for this goal']/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='My existing savings for this goal']//preceding-sibling::android.view.ViewGroup[3]/android.widget.EditText")
    private MobileElement rainySavingAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='KYC']/preceding::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='KYC']/preceding-sibling::android.view.ViewGroup")
    private MobileElement backButtonMyAccountScreen;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Vertical scroll bar, 2 pages'])[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "(//*[@text='Spendings']/ancestor::android.view.ViewGroup[2]/following-sibling::android.widget.HorizontalScrollView/descendant::android.widget.ImageView[1])[1]")
    private MobileElement setFinancialGoalBanner;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Essential Goals']/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Essential Goals']//preceding-sibling::android.view.ViewGroup")
    private MobileElement areYouReadyForTheRainyDays;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I / We have read the related Scheme Document of the selected fund before investing']")
    @AndroidFindBy(xpath = "//*[@text='I / We have read the related Scheme Document of the selected fund before investing']/preceding-sibling::android.view.ViewGroup")
    private MobileElement iWeHaveCheckBox;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Complete KYC'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Complete KYC']")
    private MobileElement completeKyc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My monthly expenses']/preceding-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='My monthly expenses']/preceding-sibling::android.view.ViewGroup/android.widget.EditText")
    private MobileElement monthlyExpensesAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My total loan EMI in a month']/preceding-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='My total loan EMI in a month']//preceding-sibling::android.view.ViewGroup/android.widget.EditText")
    private MobileElement totalLoanEmiInAMonthBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name='Delete']")
    private MobileElement deleteButtonOfIos;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Plan Rainy Day Savings']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Plan Rainy Day Savings']/preceding-sibling::android.view.ViewGroup")
    private MobileElement backIconSavingScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Loans & Liabilities']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Loans & Liabilities']/preceding-sibling::android.view.ViewGroup")
    private MobileElement backIconLiabilitiesScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Household Expenses']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Household Expenses']/preceding-sibling::android.view.ViewGroup")
    private MobileElement backIconHouseholdExpensesScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount I want to invest\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Household Expenses']/preceding-sibling::android.view.ViewGroup")
    private MobileElement investAmtInCon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My monthly investment date\"]")
    @AndroidFindBy(xpath = "//*[@text='My monthly investment date']")
    private MobileElement monthlyInvestDt;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Rainy Days\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='\" Rainy Days\"']")
    private MobileElement rainyDayBanner;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Goal Based Investing\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Goal Based Investing\"]")
    private MobileElement goalBasedInv;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I want to invest now\"]/following::XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@text='I want to invest now']/following-sibling::android.view.ViewGroup[3]/android.widget.EditText")
    private MobileElement investFurther;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"28th\"]")
    @AndroidFindBy(xpath = "//*[@text='28th']")
    private MobileElement twentyEight;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment Amount\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Min ₹')]")
    private MobileElement schemes;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rainy Days\"]")
    @AndroidFindBy(xpath = "//*[@text='Rainy Days']")
    private MobileElement rainyDayBan;

    public void clickRainyDayBanner() {
        click(rainyDayBanner);
    }

    public void enterRainyDaySavingAmount(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOs")) {
            click(rainySavingAmountBox);
            for (int i = 0; i < 10; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(rainySavingAmountBox, amount);
        } else {
            clear(rainySavingAmountBox);
            sendKeys(rainySavingAmountBox, amount);
        }

    }

    public void clickBackIconInMaAccountScreen() {
        click(backButtonMyAccountScreen);
    }

    public void swipeToSetFinancialGoal() throws Exception {

    }

    public void clickSetFinancialGoalBanner() {
        click(setFinancialGoalBanner);
    }

    public boolean verifyAryYouReadyForRainyDay() {
        return isVisible(areYouReadyForTheRainyDays);
    }

    public void clickIWeHaveCheckBox() {
        click(iWeHaveCheckBox);
    }

    public void clickCompleteKyc() {
        click(completeKyc);
    }

    public void enterMonthlyExpensesAmount(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOs")) {
            click(monthlyExpensesAmountBox);
            for (int i = 0; i < 10; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(monthlyExpensesAmountBox, amount);
        } else {
            clear(monthlyExpensesAmountBox);
            sendKeys(monthlyExpensesAmountBox, amount);
        }

    }

    public void enterInvestsAmount(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOs")) {
            click(investFurther);
            for (int i = 0; i < 10; i++) {
                clickTypeKeyDelete();
            }
        } else {
            clear(investFurther);
            sendKeys(investFurther, amount);
        }
    }

    public void enterTotalEmiLoanInAMonthAmount(String amount) {
        sendKeys(totalLoanEmiInAMonthBox, amount);
    }

    public void clickBackButtonInPlanRainyDaysSavingScreen() {
        click(backIconSavingScreen);
    }

    public void clickBackButtonInLoanAndLiabilitiesScreen() {
        click(backIconLiabilitiesScreen);
    }

    public void clickBackButtonInHouseHoldExpensesScreen() {
        click(backIconHouseholdExpensesScreen);
    }

    public void scroll28th() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "28th");
        } else {
            scrollToElement(twentyEight, "up", monthlyInvestDt, 1000,10);
        }
    }

    public void selectFund() throws Exception {
        click(schemes);
    }

    public void clickRainyDayBan() {
        if (!isVisible(rainyDayBan)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Rainy Days");
            } else {
                iOSScrollToElementByName(rainyDayBan, "up", "Rainy Days");
            }
        }
        click(rainyDayBan);
    }

    public void scrollIWeHaveCheckBox() throws Exception {
        andIosScroll(iWeHaveCheckBox, "up", schemes);
    }
}

