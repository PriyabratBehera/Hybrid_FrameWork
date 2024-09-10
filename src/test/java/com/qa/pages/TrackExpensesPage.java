package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TrackExpensesPage extends ProfilePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();
    @AndroidFindBy(xpath = "//*[@text='Transaction']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Transaction\"]")
    private MobileElement addTransaction;
    @AndroidFindBy(xpath = "//*[contains(@text,'Category')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "label ENDSWITH 'category'")
    private MobileElement chooseCategory;
    @AndroidFindBy(xpath = "//*[contains(@text,'How much')]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"₹0\"]/XCUIElementTypeTextField")
    private MobileElement howMuch;
    @AndroidFindBy(xpath = "//*[@text='Spending']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Spending\"]")
    private MobileElement spending;
    @AndroidFindBy(xpath = "(//*[@text='Income'])[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Income'")
    private MobileElement income;
    @AndroidFindBy(xpath = "//*[contains(@text,'Transaction Date')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement transactionDate;
    @AndroidFindBy(xpath = "//*[contains(@text,'Received Date')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement receivedDate;
    @AndroidFindBy(xpath = "//*[@text='1']")
    private MobileElement date;
    @AndroidFindBy(xpath = "//*[@text='2']")
    private MobileElement dateReceived;
    @AndroidFindBy(xpath = "//*[@text='Save Transaction']")
    private MobileElement saveTransaction;
    @AndroidFindBy(xpath = "//*[contains(@text,'Paid From')]/following-sibling::android.view.ViewGroup[1]//android.widget.ImageView")
    private MobileElement paidFrom;
    @AndroidFindBy(xpath = "//*[contains(@text,'Received From')]/following-sibling::android.view.ViewGroup[1]//android.widget.ImageView")
    private MobileElement receivedFrom;
    @AndroidFindBy(xpath = "//*[contains(@text,'Paid To')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText[1]")
    private MobileElement paidTo;
    @AndroidFindBy(xpath = "//*[contains(@text,'Received In')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText[1]")
    private MobileElement receivedIn;
    @AndroidFindBy(xpath = "//*[contains(@text,'Is this monthly recurring')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement monthlyRecurring;
    @AndroidFindBy(xpath = "//*[contains(@text,'Frequency')]/following-sibling::android.view.ViewGroup[1]//android.widget.ImageView")
    private MobileElement frequency;
    @AndroidFindBy(xpath = "//*[contains(@text,'Date')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement datePick;
    @AndroidFindBy(xpath = "//*[contains(@text,'End After')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement endAfter;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private MobileElement deleteTransaction;
    @AndroidFindBy(xpath = "//*[contains(@text,'My Transactions')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement duration;
    @AndroidFindBy(xpath = "//android.widget.EditText")
    private MobileElement search;
    @AndroidFindBy(xpath = "//*[@text='Received From']")
    private MobileElement receivedFromScroll;
    @AndroidFindBy(xpath = "//*[@text='Paid From']")
    private MobileElement paidFromScroll;
    @AndroidFindBy(xpath = "(//*[contains(@text, 'Track')])[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Track'")
    private MobileElement trackExpenses;
    @AndroidFindBy(xpath = "//*[@text='Set Financial Goals']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Financial Goals\"]")
    private MobileElement setFiGoal;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Track Expense\"]")
    @AndroidFindBy(xpath = "//*[@text='Track Expense']")
    private MobileElement trackExpeses;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Select Sub-Category\"]")
    @AndroidFindBy(xpath = "//*[@text='Select Sub-Category']")
    private MobileElement subCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement budAmtBx;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Transaction\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Date of Transaction']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.ImageView")
    private MobileElement dateOfTranBx;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Track Expense\"]")
    @AndroidFindBy(xpath = "//*[@text='Category']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement catBxForFil;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Search\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='Search']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup[1]")
    private MobileElement currentMonth;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Last Month\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Category']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement last30Days;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Last Fiscal Year\"])[1]")
    @AndroidFindBy(xpath = "//*[@text='Category']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement lastFiscalYr;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement calBackwardBtn;

    @AndroidFindBy(xpath = "//*[@text=\"Date of Transaction\"]/following-sibling::android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Transaction\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement datOfTran;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement calForwardBtn;

    @AndroidFindBy(xpath = "//*[@text=' Goals']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement plusIconInDash;
    @AndroidFindBy(xpath = "//*[@text='2023 Oct']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"2023 Oct\"]")
    private MobileElement lastYearMar;
    @AndroidFindBy(xpath = "//*[@text='2023 Jul']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"2023 Jul\"]")
    private MobileElement lastYearJul;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    private MobileElement currentYear;
    @AndroidFindBy(xpath = "//*[@text=\"scroll down\"]/preceding-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll down\"]/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[8]")
    private MobileElement dtPicker;

    @AndroidFindBy(xpath = "//*[@text='Select Category']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Select Category\"])[3]")
    private MobileElement selectCategory;
    @AndroidFindBy(xpath = "//*[@text=\"2023\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll up\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[5]")
    private MobileElement lastyr;
//    @AndroidFindBy(xpath = "//*[@text=\"2023\"]")
//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"2023\"])[1]")
//    private MobileElement dt1998;

    @AndroidFindBy(xpath = "//*[@text=\"Investment\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,\"Investment Equity ₹30,000\")])[21]")
    private MobileElement investmentEquity;

    @AndroidFindBy(xpath = "//*[@text='Edit Transaction']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Edit Transaction\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    private MobileElement deleteexpense;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'Investment Remaining')])[22]")
    @AndroidFindBy(xpath = "//*[@text='Investment']")
    private MobileElement investment;
    public void clickAddTransaction() {
        click(addTransaction);
    }

    public void clickTrackExpenses() throws Exception {
        click(trackExpeses);
    }

    public void clickSpending() {
        click(spending);
    }

    public void clickIncome() throws Exception {
        int count = getElementCount("//*[@text='Income']");
        click(getElement("(//*[@text='Income'])[" + count + "]"));
    }

    public void clickChooseCategory() {
        click(chooseCategory);
    }

    public void enterHowMuch(String amount) {
        GlobalParams params = new GlobalParams();
        sendKeys(howMuch, amount);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            click(spending);
        }
    }

    public void enterSearch(String searchText) {
        sendKeys(search, searchText);
    }

    public void enterDate() {
        click(transactionDate);
        click(date);
    }

    public void enterReceivedDate() {
        click(receivedDate);
        click(dateReceived);
    }

    public void scrollToSaveTransaction() throws Exception {
        andScrollToElementUsingUiScrollable("text", "Save Transaction");
    }

    public void scrollToSaveTransactionReceivedFrom() throws Exception {
        scrollToElement(saveTransaction, "up", receivedFromScroll);
    }

    public void scrollToSaveTransactionPaidFrom() throws Exception {
        scrollToElement(saveTransaction, "up", paidFromScroll);
    }

    public void scrollUpToView(String toElement, String fromElement) throws Exception {
        String toElementXPATh = "//*[@text='" + toElement + "']";
        String fromElementXPATh = "//*[@text='" + fromElement + "']";
        scrollToElement(getElement(toElementXPATh), "up", getElement(fromElementXPATh));
    }

    public void clickPaidFrom() {
        click(paidFrom);
    }

    public void clickReceivedFrom() {
        click(receivedFrom);
    }

    public void enterPaidTo(String toWhom) {
        sendKeys(paidTo, toWhom);
    }

    public void enterReceivedIn(String toWhom) {
        sendKeys(receivedIn, toWhom);
    }

    public void clickMonthlyRecurring() {
        click(monthlyRecurring);
    }

    public void clickFrequency() {
        click(frequency);
    }

    public void clickDatePick() {
        click(datePick);
    }

    public void clickEndAfter() {
        click(endAfter);
    }

    public String getSpendingType(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[2]";
        return getText((getElement(xpath)), "Spending Type: ");
    }

    public String getSpendingAmount(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[1]";
        return getText((getElement(xpath)), "Spending Amount: ");
    }

    public String getPaidFrom(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[6]";
        return getText((getElement(xpath)), "Get Paid From: ");
    }

    public String getPaidTo(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[7]";
        return getText((getElement(xpath)), "Get Paid To: ");
    }

    public void leftSwipeForCategory(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]";
        scrollToElement(getElement(xpath), "left", getElement(xpath));
    }

    public boolean verifyGreaterThan(String trans1, String trans2) throws Exception {
        String trans1Xpath = "//*[contains(@text,'" + trans1 + "')]";
        String trans2Xpath = "//*[contains(@text,'" + trans2 + "')]";
        int trans1YCord = getElement(trans1Xpath).getLocation().getY();
        int trans2YCord = getElement(trans2Xpath).getLocation().getY();
        return trans2YCord > trans1YCord;
    }

    public void clickDuration() {
        click(duration);
    }

    public int errorMessageCount(String errorMessage) throws Exception {
        String xpath = "//*[contains(@text,'" + errorMessage + "')]";
        return getElementCount(xpath);
    }

    public void selectTranType(String trType) throws Exception {
        clickByText(trType);
    }

    public void selectCate(String cateType) throws Exception {
        click(selectCategory);
        clickByText(cateType);

    }

    public void selectSubCate(String subCate) throws Exception {
        if (isVisible(subCategory)) {
            click(subCategory);
            clickByText(subCate);
        }
    }

    public void enterBudAmt(String amt) throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            if(budAmtBx.getText().equals("₹0")){
                sendKeys(budAmtBx, amt);
                clickDoneIosKeyboard();
            }
            else{
                clear(budAmtBx);
                sendKeys(budAmtBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if(budAmtBx.getText().equals("₹0")){
                sendKeys(budAmtBx, amt);
                clickByText("Amount");
            }
            else{
                clear(budAmtBx);
                sendKeys(budAmtBx, amt);
                clickByText("Amount");
            }
        }
    }

    public void dateOfTranCurMon() throws Exception {
        click(dateOfTranBx);
        clickByText("OK");
    }

    public void dateOfTranOneMonBac() throws Exception {
        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime lastMonth = now.minusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM / yyyy");
        String formattedDate1 = formatter.format(now);
        String xpath=" ";
        click(dateOfTranBx);
        click(calBackwardBtn);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            xpath="(//XCUIElementTypeOther[@name='1'])[2]";
        }
        else{
            xpath="(//*[@text='1'])[2]";
        }
        click(getElement(xpath));
        clickByText("OK");
        if(datOfTran.getText().contains(formattedDate1)){
            click(dateOfTranBx);
            click(calBackwardBtn);
        }
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            xpath="(//*[@text='1'])[1]";
        }
        else{
            xpath="(//XCUIElementTypeOther[@name='1'])[1]";
        }
        click(getElement(xpath));
        clickByText("OK");

    }

    public void dateOfTranLastYear() throws Exception {
        click(dateOfTranBx);
        click(currentYear);
        if(! isVisible(lastyr)){
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "2023");
                click(lastyr);
            } else {
                scrollToElement(lastyr, "up", dtPicker, 20000, 10);
                click(lastyr);
            }
        }
        else{
            click(lastyr);
        }
        for (int i = 0; i < 25; i++) {
            if (!isVisible(lastYearMar)) {
                click(calForwardBtn);
            } else {
                break;
            }
        }
        clickByText("1");
        clickByText("OK");
    }

    public void dateOfTranLastYearJul() throws Exception {
        click(dateOfTranBx);
        click(currentYear);
        if(! isVisible(lastyr)){
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "2023");
                click(lastyr);
            } else {
                scrollToElement(lastyr, "up", dtPicker, 20000, 10);
                click(lastyr);
            }
        }
        else{
            click(lastyr);
        }
        for (int i = 0; i < 25; i++) {
            if (!isVisible(lastYearJul)) {
                click(calForwardBtn);
            } else {
                break;
            }
        }

        clickByText("1");
        clickByText("OK");

    }
    public void selCatForFil() throws Exception {
        click(catBxForFil);
        clickByText("Salary");
        clickByText("Continue");
    }
    public void selectLastMonth(String duration) throws Exception {
        click(currentMonth);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            if(! isElementExist("(//XCUIElementTypeOther[@name='"+duration+"'])[2]")){
//                swipe(88, 423, 123, 264, 100);
//                swipeElementByCoordinate(insurancePlanner,incomeTaxPlan,onetimeInvest);

                clickByText(duration);
            }
            else{
                clickByText(duration);
            }
        }
        else{
            if(! isElementExist("//*[@text='"+duration+"']")){
                andScrollToElementUsingUiScrollable("text",duration);
                clickByText(duration);
            }
            else{
                clickByText(duration);
            }
        }


    }
    public void clickInvEquity(){
        click(investmentEquity);
    }
    public void clickDeleteExpense(){
        click(deleteexpense);
    }
    public boolean unableToSeeEquityTran(){
        return isVisible(investmentEquity);
    }
    public void clickLastFiscalYear() throws Exception {
        click(currentMonth);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            swipe(88, 423, 123, 264, 100);

        }
        else{
            swipe(88, 423, 123, 264, 100);
        }
        clickByText("Last Fiscal Year");
    }
    public void clickPlusIconDash(){
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            tapOn(213,860);
        }
        else{
            click(plusIconInDash);
        }

    }
    public void verifyBudgetTransaction(String text) throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyPartialText(text);
        }
        else{
            verifyText(text.split(" ")[0]);
        }
    }
    public void verifyBudgetIncome() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Budgeted Income Yet to Receive:  ₹4,72,000 Received ₹28,000 of ₹5,00,000 5%");
        }
        else{
            verifyText("Received ₹28,000 of ₹5,00,000");
        }
    }
    public void verifyInvestBudget() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Investment Remaining ₹5,65,000  Spent ₹35,000 of ₹6,00,000 5.83%");
        }
        else{
            verifyText("Spent ₹35,000 of ₹6,00,000");
        }
    }
    public void verifyHouseHoldBudget() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Household Remaining ₹0  Spent ₹1,000 of ₹1,000 100.00%");
        }
        else{
            verifyText("Spent ₹1,000 of ₹1,000");
        }
    }
    public void verifyPersonalBudget() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Personal Exceeded the limit by ₹200 Spent ₹500 of ₹300 166.67%");
        }
        else{
            verifyText("Spent ₹500 of ₹300");
        }
    }
    public void verifyTotalBudgetCard() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Total Spending Budget Remaining ₹2,91,800 Spent ₹40,500 of ₹3,32,300 12%");
        }
        else{
            verifyText("Spent ₹40,500 of ₹3,32,300");
        }
    }
}

