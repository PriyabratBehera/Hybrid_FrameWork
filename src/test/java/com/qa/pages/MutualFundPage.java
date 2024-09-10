
package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MutualFundPage extends ProfilePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Mutual\n" +
            "Funds\"])[2]")
//    @AndroidFindBy(xpath = "(//*[contains(@text,'Mutual')])[2]")
    @AndroidFindBy(xpath="//*[@text='Mutual\n" +
            "Funds']")
    private MobileElement mutualFunds;
    @AndroidFindBy(xpath = "//*[contains(@text,'Search scheme name')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Search scheme name']")
    private MobileElement searchMutualFund;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Add to Cart'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Add to Cart']")
    private MobileElement firstMF;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='2'])[2]/XCUIElementTypeOther")
    private MobileElement cartIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE837 Monthly SIP']")
    @AndroidFindBy(xpath = "//*[@text='Monthly SIP']")
    private MobileElement checkedMonthlySip;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Monthly SIP']")
    @AndroidFindBy(xpath = "//*[@text='Monthly SIP']")
    private MobileElement uncheckedMonthlySip;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Daily']")
    @AndroidFindBy(xpath = "//*[@text='Daily']")
    private MobileElement uncheckedDailySTp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Monthly']")
    @AndroidFindBy(xpath = "//*[@text='Monthly']")
    private MobileElement uncheckdMonthlySTp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Weekly']")
    @AndroidFindBy(xpath = "//*[@text='Weekly']")
    private MobileElement uncheckedWeeklySdp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 One-Time']")
    @AndroidFindBy(xpath = "//*[@text='One-Time']")
    private MobileElement oneTime;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tax Saver']")
    @AndroidFindBy(xpath = "//*[@text='Tax Saver']")
    private MobileElement taxServer;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Value Oriented / Contra Invest in stocks that are undervalued & potential to grow in long term'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Value Oriented / Contra']")
    private MobileElement valueOriented;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Low Duration Average maturity of the invested bonds is between 6 to 12 months'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Low Duration']")
    private MobileElement lowDuration;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Others']")
    @AndroidFindBy(xpath = "//*[@text='Others']")
    private MobileElement others;
    @AndroidFindBy(xpath = "//*[@text='Investment Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment Amount']/parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement investmentAmount;
    @AndroidFindBy(xpath = "(//*[@text='Mutual Funds'])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment Amount']/parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement mfCard;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Investment Amount Min ₹5,000.00']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Investment Amount')]//following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement investAmount;
    @AndroidFindBy(xpath = "//*[contains(@text,'SIP Date')]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SIP Date']/parent::XCUIElementTypeOther/child::XCUIElementTypeOther")
    private MobileElement monthlySIPDate;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='View'])[2]")
    @AndroidFindBy(xpath = "//*[@text='View']")
    private MobileElement viewLink;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Select\"])[2]")
    @AndroidFindBy(xpath = "(//*[@text='Select'])[1]")
    private MobileElement selectButton;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Scheme Categories\"]")
    @AndroidFindBy(xpath = "//*[@text='Equity']")
    private MobileElement schemeCat;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Tax Saver']")
    @AndroidFindBy(xpath = "//*[@text='Add External Folios']")
    private MobileElement addExternalFolio;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Min. STP Installments']")
    @AndroidFindBy(xpath = "//*[@text='Min. STP Installments']")
    private MobileElement minSipInstall;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Read Scheme Information Document']")
    @AndroidFindBy(xpath = "//*[@text='Read Scheme Information Document']")
    private MobileElement readSchemeInformation;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Fund Information\"]")
    @AndroidFindBy(xpath = "//*[@text='Fund Information']")
    private MobileElement fundInf;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Min. STP Installments (Monthly)\"]")
    @AndroidFindBy(xpath = "//*[@text='Min. STP Installments (Monthly)']")
    private MobileElement minStpInstMon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Testing Purpose Equity Fund Scheme\"]")
    @AndroidFindBy(xpath = "//*[@text='Testing Purpose Equity Fund Scheme']")
    private MobileElement adityaBirTestingPur;

    //    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Aditya Birla Sun Life Frontline Equity Fund(G)\"]")
//    @AndroidFindBy(xpath = "//*[@text='Testing Purpose Equity Fund Scheme']")
//    private MobileElement adityaBirTestingPur;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH\"]")
    @AndroidFindBy(xpath = "//*[@text='ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH']")
    private MobileElement adityaBirInfStr;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH\"]")
    @AndroidFindBy(xpath = "//*[@text='ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH']")
    private MobileElement adityaBirInfShort;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Invest\"])[8]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "(//*[@text='SBI Magnum Ultra Short Duration Fund (G)'])[2]/following-sibling::android.view.ViewGroup[2]")
    private MobileElement MagnumScPlusBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Min SWP Amount (Daily)\"]")
    @AndroidFindBy(xpath = "//*[@text='Min SWP Amount (Daily)']")
    private MobileElement minSwpDai;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='View All']")
    @AndroidFindBy(xpath = "//*[@text='View All']")
    private MobileElement viewAll;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Min. Switch-in']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Min. Switch-in')]")
    private MobileElement minSwitch;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Search'])[2]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Search')]")
    private MobileElement invalidNameForCategory;
    @AndroidFindBy(xpath = "(//*[@text='Investment Amount'])[1]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Investment Amount']/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement investmentAmountBox;
    @AndroidFindBy(xpath = "//*[@text='Duration']/following-sibling::android.view.ViewGroup[1]/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='5Y']")
    private MobileElement durationBox5Y;
    @AndroidFindBy(xpath = "//*[@text='Duration']/following-sibling::android.view.ViewGroup[1]/descendant::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='3Y']")
    private MobileElement durationBox3Y;
    @AndroidFindBy(xpath = "//*[@text='Returns Calculator']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Returns Calculator']/XCUIElementTypeOther[2]")
    private MobileElement closeIconInReturnsScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Suggested Amount']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Suggested Amount')]")
    private MobileElement suggestAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[contains(@text,'I / We have read the related Scheme Document')]/preceding-sibling::android.view.ViewGroup")
    private MobileElement calculate;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment Amount\"]")
    @AndroidFindBy(xpath = "//*[@text='Investment Amount']")
    private MobileElement folioNum;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transactions\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[@text='Transactions']/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[3]/android.widget.TextView[5]\n")
    private MobileElement mfInProcess;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='History'])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='History']//following-sibling::android.view.ViewGroup/child::android.widget.ImageView")
    private MobileElement refreshIconInHistoryScreen;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name, 'Last updated ')])[19]/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[contains(@text,'Last updated a few seconds')]//following-sibling::android.view.ViewGroup[1]")
    private MobileElement refreshIconInMutualFundsScreen;
    @AndroidFindBy(xpath = "//*[@text=\"Gold & Silver\"]/ancestor::android.view.ViewGroup[3]/parent::android.widget.HorizontalScrollView/parent::android.view.ViewGroup/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[5]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Aditya Birla Sun Life Frontline Equity Fund (G)\"])[1]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement threeDotInMySipsScreen;
    @AndroidFindBy(xpath = "//*[contains(@text,\"Installments\")]/preceding-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(*//XCUIElementTypeStaticText[contains(@name,'Installments')])[1]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[4]")
    private MobileElement threeDtIcnForTwoIns;
    @AndroidFindBy(xpath = "//*[contains(@text,\"Installments\")]/preceding-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(*//XCUIElementTypeStaticText[contains(@name,'Installments')])[1]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[4]")
    private MobileElement threeDtIcnForSTP;

    @AndroidFindBy(xpath = "//*[@text=\"Installments  2/36\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Installments  2/36\"]")
    private MobileElement twoInstallmentDone;
    @AndroidFindBy(xpath = "//*[@text='MFID: 1466']/preceding-sibling::android.view.ViewGroup[2]/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='MFID: 1466']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[4]/child::XCUIElementTypeOther[2]")
    private MobileElement threeDotInMySipsScreens;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Instalments  2/36')]")
    @AndroidFindBy(xpath = "//*[@text='Instalments  2/36']")
    private MobileElement firstInstallmentSIP;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='MFID: 1466']")
    @AndroidFindBy(xpath = "//*[@text='MFID: 1466']")
    private MobileElement sipIdFor9696Number;
    @AndroidFindBy(xpath = "(//*[@text='Folio Number']//following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Folio Number']//following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    private MobileElement folioNumberBox;
    @AndroidFindBy(xpath = "//*[@text='Folio Number']//following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Folio Number\"]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement folioNumberBoxAddExScreen;
    @AndroidFindBy(xpath = "(//*[contains(@text,'SIP Duration')]/following-sibling::android.view.ViewGroup//android.widget.EditText)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SIP Duration']/ancestor::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[2]/descendant::XCUIElementTypeTextField")
    private MobileElement sipDuration;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mutual Fund Schemes']/ancestor::XCUIElementTypeOther[3]/descendant::XCUIElementTypeOther[7]")
    @AndroidFindBy(xpath = "//*[@text='Mutual Fund Schemes']//following-sibling::android.view.ViewGroup")
    private MobileElement addToCartIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Minimum ₹\")]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Minimum ₹')]/following-sibling::android.widget.EditText")
    private MobileElement MonthlySipAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"One of the existing folios\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='One of the existing folios']/following-sibling::android.view.ViewGroup")
    private MobileElement folioNumBxOneCliInv;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Folio Number\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//*[@text='Select Folio Number']/following-sibling::android.view.ViewGroup[2]/descendant::android.widget.TextView[1]")
    private MobileElement oneFolioNum;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Invest'])[2]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "(//*[@text='SBI Magnum Ultra Short Duration Fund (G)'])[1]/following-sibling::android.view.ViewGroup[2]")
    private MobileElement plusButtonForHDFCMidCap;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Invest\"])[5]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "(//*[@text='SBI Contra Fund - Direct Plan (G)'])[1]/following-sibling::android.view.ViewGroup[2]")
    private MobileElement plusButtonForHDFCMidCap1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"|MF Holding\"]/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='|MF Holding']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement refreshIconExterF;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SIP Date']")
    @AndroidFindBy(xpath = "(//*[@text='Aditya Birla Sun Life Frontline Equity Fund (G)'])[2]/following-sibling::android.view.ViewGroup[1]/android.view.ViewGroup")
    private MobileElement sipDate;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment Amount']")
    @AndroidFindBy(xpath = "(//*[@text='Aditya Birla Sun Life Frontline Equity Fund (G)'])[2]/following-sibling::android.view.ViewGroup[1]/android.view.ViewGroup")
    private MobileElement invAmount;


    //    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Invest'])[2]/XCUIElementTypeOther[1]")
//    @AndroidFindBy(xpath = "(//*[@text='Invest'])[1]/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup[2]")
//    private MobileElement plusButtonForHDFCMidCap;
    @AndroidFindBy(xpath = "//*[contains(@text,'You can add only 4 schemes')]")
    private MobileElement youCanAdd4OnlySchemesPopup;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,\"Aditya Birla Sun Life Frontline Equity Fund (G)\")])[1]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Aditya Birla Sun Life Frontline Equity Fund (G)']/following-sibling::android.view.ViewGroup[1]/android.view.ViewGroup")
    private MobileElement threeDotIconInWealthScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'SIP 1/36')]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='SIP 1/36']/following-sibling::android.view.ViewGroup[1]/descendant::android.view.ViewGroup[1]")
    private MobileElement successfulTransactionHistory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'SIP 1/36')]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='01 Jun 2023']/following-sibling::android.view.ViewGroup[2]/descendant::android.view.ViewGroup[1]")
    private MobileElement successfulTransaction9696;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'SIP 2/36')]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='SIP 2/36']/following-sibling::android.view.ViewGroup[1]/descendant::android.view.ViewGroup[1]")
    private MobileElement skippedInstalmentHistory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'SIP 1/12')]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='SIP 1/12']/following-sibling::android.view.ViewGroup[1]/descendant::android.view.ViewGroup[1]")
    private MobileElement skippedInstalment9696Number;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Action']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Action']/parent::android.view.ViewGroup/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[7]")
    private MobileElement processTransactionHistory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Fund Transaction History']/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Fund Transaction History']/following-sibling::android.view.ViewGroup/android.widget.ImageView")
    private MobileElement refreshIconInFundTransactionHistory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='This SIP cannot be stopped']//preceding-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='This SIP cannot be stopped']/preceding-sibling::android.view.ViewGroup/android.widget.ImageView")
    private MobileElement closeStopSIPPopup;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mode of Investment']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeScrollView/descendant::XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='Mode of Investment']/ancestor::android.view.ViewGroup[1]/following-sibling::android.widget.ScrollView/descendant::android.widget.ImageView[2]")
    private MobileElement mfSchemeCloseIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
    private MobileElement DoneButtonInIOS;
    @AndroidFindBy(xpath = "//*[@text='Amount']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement partialFundAmountBox;
    @AndroidFindBy(xpath = "//*[@text='Number of Units']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Number of Units']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement partialUnitBox;
    @AndroidFindBy(xpath = "//*[contains(@text,'NAV')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'NAV')]")
    private MobileElement nav;
    @AndroidFindBy(xpath = "//*[@text='Instalment skipped']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Instalment skipped']")
    private MobileElement skippedInstalment;
    @AndroidFindBy(xpath = "//*[@text='Netbanking']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingViaBankDetails;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,'ID')])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[4]/descendant::XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "(//*[contains(@text,'ICIC XXXX')]/preceding-sibling::android.view.ViewGroup[2])[1]/android.view.ViewGroup")
    private MobileElement threeDotOfAnyGoal;
    @AndroidFindBy(accessibility = "HAMBURGER")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='HAMBURGER']")
    private MobileElement hamburger;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Fund Value')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Fund Value')]")
    private MobileElement fundValueInRedeemScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mode of Investment']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeScrollView/descendant::XCUIElementTypeOther[16]")
    @AndroidFindBy(xpath = "//*[@text='Mode of Investment']/parent::android.view.ViewGroup/following-sibling::android.widget.ScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    private MobileElement deleteSchemeIcon;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Invest'])[3]")
    @AndroidFindBy(xpath = "//*[@text='Invest']")
    private MobileElement investButton;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP to Confirm')]/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Enter OTP to Confirm']/following-sibling::XCUIElementTypeStaticText)[1]")
    private MobileElement purchaseOTPText;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Resend OTP']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/ancestor::android.view.ViewGroup[2]/descendant::android.widget.EditText[1]")
    private MobileElement purchaseOTP;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Resend OTP']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField[2]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/ancestor::android.view.ViewGroup[2]/descendant::android.widget.EditText[2]")
    private MobileElement purchaseOTP2;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Resend OTP']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField[3]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/ancestor::android.view.ViewGroup[2]/descendant::android.widget.EditText[3]")
    private MobileElement purchaseOTP3;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Resend OTP']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField[4]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/ancestor::android.view.ViewGroup[2]/descendant::android.widget.EditText[4]")
    private MobileElement purchaseOTP4;
    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select All']")
    private MobileElement selectAll;
    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Cut']")
    private MobileElement cut;
    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Monthly SIP Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement monthlyInv;
    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"One-Time Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement oneTimeInv;
    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Explore All Mutual Fund Schemes Pick a fund on your own & invest\"]")
    private MobileElement exploreAllMf;
    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Invest\"])[2]/XCUIElementTypeOther[1]")
    private MobileElement plusForAdBi;
    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"One-Click Invest\"]")
    private MobileElement oneClickInv;
    @AndroidFindBy(xpath = "//*[@text='Complete KYC']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Complete KYC\"])[2]")
    private MobileElement completeKYC;
    @AndroidFindBy(xpath = "//*[contains(@text,'Categories (')]/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Categories (')]/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    private MobileElement backBtnCategoriesSc;
    @AndroidFindBy(xpath = "//*[contains(@text,'Asset Management Companies (')]/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Asset Management Companies (')]/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    private MobileElement backBtnAmcSc;
    @AndroidFindBy(xpath = "//*[contains(@text,'Asset Management Companies (')]/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sort by']/parent::XCUIElementTypeOther/descendant::XCUIElementTypeOther")
    private MobileElement closeSortBy;
    @AndroidFindBy(xpath = "//*[@text='Folio Number']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sort by']/parent::XCUIElementTypeOther/descendant::XCUIElementTypeOther")
    private MobileElement folioBxAdi;
    @AndroidFindBy(xpath = "//*[contains(@text,'You can add only 4 schemes')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You can add only 4 schemes')]")
    private MobileElement youCanAdd4Sch;
    @AndroidFindBy(xpath = "//*[@text='7/36']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You can add only 4 schemes')]")
    private MobileElement transProcess;
    @AndroidFindBy(xpath = "//*[@text='2/36']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You can add only 4 schemes')]")
    private MobileElement transSkipp;
    @AndroidFindBy(xpath = "//*[@text='1/36']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You can add only 4 schemes')]")
    private MobileElement transSuccess;
    @AndroidFindBy(xpath = "//*[@text='Installments  2/36']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Installments  2/36']")
    private MobileElement twoInstallmentOf;
    @AndroidFindBy(xpath = "//*[@text='Confirm Order']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Confirm Order']")
    private MobileElement confirmOrder;
    @AndroidFindBy(xpath = "(//*[@text='ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH'])[2]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,\"ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH\")])[2]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement threeDtAdShort;


    @AndroidFindBy(xpath = "(//*[@text='ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH'])[1]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,\"ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH\")])[1]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement threeDtInfeaa;
    @AndroidFindBy(xpath = "//*[@text='Equity']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Equity']")
    private MobileElement equity;
    @AndroidFindBy(xpath = "//*[@text='Source Scheme:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Source Scheme:\"]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement sourceScheme;
    @AndroidFindBy(xpath = "//*[@text='Scheme:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Scheme:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement swpScheme;
    @AndroidFindBy(xpath = "//*[@text='Target Scheme:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Target Scheme:\"]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement targetScheme;
    @AndroidFindBy(xpath = "//*[@text='Amount:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Amount:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement switchingAmount;
    @AndroidFindBy(xpath = "//*[@text='Frequency:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequency:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement stpFrequency;
    @AndroidFindBy(xpath = "//*[@text='Start Date:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Start Date:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement stpDate;
    @AndroidFindBy(xpath = "//*[@text='Date:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Date:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement switchingDate;
    @AndroidFindBy(xpath = "//*[contains(@text,'Start Date')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Date\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement stpStartDate;
    @AndroidFindBy(xpath = "//*[contains(@text,'Start Day')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Day\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement swpStartDate;
    @AndroidFindBy(xpath = "//*[@text='Number of Transfer']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Number of Transfer\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement numOfTransfer;
    @AndroidFindBy(xpath = "//*[@text='SWP Duration']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SWP Duration']/parent::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement swpDuration;
    @AndroidFindBy(xpath = "//*[@text='Amount']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement stpAmtBx;
    @AndroidFindBy(xpath = "//*[@text='Withdrawal Amount']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Withdrawal Amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement swpAmtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Number of Transfer\"]")
    @AndroidFindBy(xpath = "//*[@text='Number of Transfer']")
    private MobileElement numberOfTransfer;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I / We have read the related Scheme Document of the selected fund before investing']")
    @AndroidFindBy(xpath = "//*[@text='I / We have read the related Scheme Document of the selected fund before investing']/preceding-sibling::android.view.ViewGroup")
    private MobileElement iWeHaveCheckBox;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='I / We have read the related Scheme Document of the selected fund before investing  ']/preceding-sibling::android.view.ViewGroup")
    private MobileElement scheBxmeSearch;
    //    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
//    @AndroidFindBy(xpath = "//*[@text='I / We have read the related Scheme Document of the selected fund before investing  ']/preceding-sibling::android.view.ViewGroup")
//    private MobileElement scheBxmeSearch;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Phone Number']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    private MobileElement mobBxImportFu;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText[1]")
    private MobileElement impFunOtp1;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText[2]")
    private MobileElement impFunOtp2;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText[3]")
    private MobileElement impFunOtp3;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText[4]")
    private MobileElement impFunOtp4;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText[5]")
    private MobileElement impFunOtp5;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText[6]")
    private MobileElement impFunOtp6;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Categories\"])[2]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[contains(@text'Invested)']")
    private MobileElement invested;

    public void SelectGoal(String goalName) throws Exception {
        new DigitalGoldPage().clickFinancialGoal();
        new BasePage().clickByText(goalName);
    }

    public String getCurrentDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = today.format(formatter);
        return formattedDate;
    }

    public void clickFolioNumberBox() {
        click(folioNumberBox);
    }

    public void selectFolioNumber(String text1, String text2) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            if (getElement("//*[@text='Folio Number']/following-sibling::android.view.ViewGroup[1]/android.widget.TextView").getText().equals("Select")) {
                clickFolioNumberBox();
            }
            xpath = "//*[contains(@text, '" + text1 + "')]";
        }
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (getElement("//XCUIElementTypeStaticText[@name=\"Folio Number\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText").getText().equals("Select")) {
                clickFolioNumberBox();
                xpath = "(//XCUIElementTypeOther[@name= '" + text1 + "'])[2]";
            }
        }
        getElement(xpath).click();
    }

    public void selectRecommenedDuration(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='" + text + "']";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void selectInvestmentAmount(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='" + text + "']";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void enterPurchaseOtp() throws Exception {
        if (isVisible(purchaseOTPText)) {
            String otp = purchaseOTPText.getText();
            sendKeys(purchaseOTP, otp);
//            sendKeys(purchaseOTP2, String.valueOf(otp.charAt(1)));
//            sendKeys(purchaseOTP3, String.valueOf(otp.charAt(2)));
//            sendKeys(purchaseOTP4, String.valueOf(otp.charAt(3)));
        }
    }

    public void enterInvalidPurchaseOtp() throws Exception {
        String otp = "1234";
        sendKeys(purchaseOTP, otp);
//        sendKeys(purchaseOTP2, String.valueOf(otp.charAt(1)));
//        sendKeys(purchaseOTP3, String.valueOf(otp.charAt(2)));
//        sendKeys(purchaseOTP4, String.valueOf(otp.charAt(3)));
    }

    public void clickDurationBox() {
        click(durationBox5Y);
    }

    public void click3YDurationBox() {
        click(durationBox3Y);
    }

    public void clickCloseIconOfReturnsScreen() {
        click(closeIconInReturnsScreen);
    }

    public void clickMutualFunds() {
        if (!isVisible(mutualFunds)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Mutual\n" +
                        "Funds");
            } else {
                iOSScrollToElementByName(mutualFunds, "up", "Mutual\n" +
                        "Funds");
            }
        }
        click(mutualFunds);
    }


    public void enterMutualFund(String mutualFundName) throws Exception {
        sendKeys(searchMutualFund, mutualFundName);
    }

    public void enterMutualFund1(String mutualFundName) throws Exception {
        click(scheBxmeSearch);
        for (int i = 0; i < 12; i++) {
            clickTypeKeyDelete();
        }
        sendKeys(searchMutualFund, mutualFundName);
    }

    public void enterInvestmentAmountForOneTime(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void enterInvestmentAmountForMonthlySIP(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void clickMonthlySIPDate() {
        click(monthlySIPDate);
    }

    public void enterSIPDuration(String sipDurations) {
        clear(sipDuration);
        sendKeys(sipDuration, sipDurations);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void scrollToAddExternalFolio() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Tax Saver");
        } else {
            scrollToElement(addExternalFolio, "up", schemeCat);
        }
    }

    public void scrollToLockinPeriod() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(readSchemeInformation, "up", minSwpDai);
        } else {
            scrollToElement(readSchemeInformation, "up", minSwpDai);
        }
    }

    public void enterInvalidName(String text) {
        sendKeys(invalidNameForCategory, text);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void enterInvestAmount(String text) {
        clear(investAmount);
        sendKeys(investAmount, text);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void enterFolioNumberOneByOne(String text) throws Exception {
        clear(folioNumberBoxAddExScreen);
        sendKeys(folioNumberBoxAddExScreen, text);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickIfExist(DoneButtonInIOS);
        }
    }

    public void viewLink() {
        click(viewLink);

    }

    public void enterAmtInCalSc(String amt) {
        clear(investmentAmountBox);
        sendKeys(investmentAmountBox, amt);
        click(durationBox5Y);
    }

    public void clickSelectButton() throws Exception {
        click(selectButton);
    }

    public void clickAddMFForAdityaBirla() throws Exception {
        clickIfExist(firstMF);
        Thread.sleep(5000);
        clickIfExist(firstMF);
    }

    public void clickAddToCartForDifferentSchemes() throws InterruptedException {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickIfExist(firstMF);
            Thread.sleep(4000);
            clickIfExist(firstMF);
            clickIfExist(firstMF);
        } else if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            while (!isVisible(youCanAdd4OnlySchemesPopup)) {
                clickIfExist(firstMF);
            }
        }
    }

    public void clickOneMF() {
        clickIfExist(firstMF);
    }

    public void clickOnCartIcon() {
        click(cartIcon);
    }

    public void unCheckMonthlySip() {
        click(uncheckedMonthlySip);
    }

    public boolean verifyMonthlySip() {
        return isVisible(checkedMonthlySip);
    }

    public void clickOneTime() {
        click(oneTime);
    }

    public void scrollToValueOriented() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Value Oriented / Contra");
        } else {
            scrollToElement(valueOriented, "up", taxServer);
        }
    }

    public void scrollToOthers() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Others");
        } else {
            scrollToElement(others, "up", lowDuration);
        }
    }

    public void scrollToIWeHaveCheckBox() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(calculate, "up", folioNum);
        } else {
            scrollToElement(calculate, "up", folioNum);
        }
    }

    public void scrollDown() throws InterruptedException {
        swipe(200, 842, 210, 147, 2000);
    }

    public void clickMfInProcessView() {
        click(mfInProcess);
    }

    public void clickRefreshHistory() {
        click(refreshIconInHistoryScreen);
    }

    public void clickRefreshInMutualFundScreen() {
        click(refreshIconInMutualFundsScreen);
    }

    public void clickThreeDotInMySip() {
        click(threeDtIcnForTwoIns);
    }

    public void enterFolioNo(String text) throws Exception {
        clear(folioNumberBoxAddExScreen);
        sendKeys(folioNumberBoxAddExScreen, text);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (isVisible(DoneButtonInIOS)) {
                click(DoneButtonInIOS);
            } else {
                clickStaticText("Folio Number");
            }
        }
    }

    public void clickAddToCartIconInMutualFundSchemesScreen() {
        clickIfExist(addToCartIcon);

    }

    public void enterMonthlyAmountForAdityaBirla(String text) {
        clear(MonthlySipAmountBox);
        sendKeys(MonthlySipAmountBox, text);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void clickButtonTypeText(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeButton[@name='" + text + "']";
        }
        getElement(xpath).click();
    }

    public void clickPlusButtonHDFC() {
        clickIfExist(plusButtonForHDFCMidCap);
    }
//    public void clickPlusButtonSbiMag() {
//        clickIfExist(plusButtonForHDFCMidCap);
//    }

    public void clickCancelButton() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='Cancel']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='Close Button']";
        }
        getElement(xpath).click();
    }

    public void clickContinueButton() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='Continue']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='Submit Button']";
        }
        getElement(xpath).click();
    }

    public void clickThreeDotIconInWealthScreen() {
        click(threeDotIconInWealthScreen);
    }

    public void clickSuccessfulTransactionHistory() throws InterruptedException {
        if (Objects.equals(globalParams.getMobileNumber(), "8528528522")) {
            while (!isVisible(successfulTransactionHistory)) {
                scrollDown();
            }
            click(successfulTransactionHistory);
            while (!isVisible(nav)) {
                scrollDown();
            }
        } else if (Objects.equals(globalParams.getMobileNumber(), "9696850808")) {
            while (!isVisible(successfulTransaction9696)) {
                scrollDown();
            }
            click(successfulTransaction9696);
            while (!isVisible(nav)) {
                scrollDown();
            }
        }
    }

    public void clickSkippedInstalmentHistory() throws InterruptedException {
        if (Objects.equals(globalParams.getMobileNumber(), "8528528522")) {
            while (!isVisible(skippedInstalmentHistory)) {
                scrollDown();
            }
            click(skippedInstalmentHistory);
            while (!isVisible(skippedInstalment)) {
                scrollDown();
            }
        } else if (Objects.equals(globalParams.getMobileNumber(), "9696850808")) {
            while (!isVisible(skippedInstalment9696Number)) {
                scrollDown();
            }
            click(skippedInstalment9696Number);
            while (!isVisible(skippedInstalment)) {
                scrollDown();
            }
        }
    }

    public void clickProcessTransactionHistory() {
        click(processTransactionHistory);
    }

    public void refreshFundTransactionHistory() {
        click(refreshIconInFundTransactionHistory);
    }

    public void clickCloseIconOfStopSIP() {
        click(closeStopSIPPopup);
    }

    public void clickCloseIconForAllSchemes() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'One-Click Invest')]/preceding-sibling::android.view.ViewGroup";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='One-Click Invest']/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]";
        }
        for (int i = 0; i < 5; i++) {
            Thread.sleep(3000);
            if (isVisible(mfSchemeCloseIcon)) {
                clickIfExist(mfSchemeCloseIcon);
            } else {
                break;
            }
        }
            if (isElementExist(xpath)) {
                goBackFromScreen("One-Click Invest");

            }
        }


    public void enterPartialFundAmount(String amount) throws Exception {
        click(partialFundAmountBox);
        clear(partialFundAmountBox);
        sendKeys(partialFundAmountBox, amount);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        } else {
//            clickByText("How do you wish to redeem");
            pressEnter();

        }
    }

    public void enterAmountMoreThanFundValue() throws Exception {
        String a = new BasePage().getText(fundValueInRedeemScreen, "Fund value is :");
        String text[] = a.split("Fund Value  ₹");
        String replaceComma = text[1].replace(",", "");
        double fundValue = Double.parseDouble(replaceComma) + 50;
        String amount = Double.toString(fundValue);
        click(partialFundAmountBox);
        clear(partialFundAmountBox);
        sendKeys(partialFundAmountBox, amount);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            {
                new BasePage().clickDoneIosKeyboard();
            }
        } else {
//            clickByText("How do you wish to redeem");
            pressEnter();

        }
    }

    public void enterPartialUnits(String units) {
        click(partialUnitBox);
        clear(partialUnitBox);
        sendKeys(partialUnitBox, units);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        } else {
            pressEnter();
        }

    }

    public void clickNetBankingViaBankDetails() {
        click(netBankingViaBankDetails);
    }

    public boolean verifyNeyBanking() {
        return isVisible(netBankingViaBankDetails);
    }

    public void clickThreeDotOfAnyGoal() {
        click(threeDotOfAnyGoal);
    }

    public void clickMenuOption() {
        click(hamburger);
    }

    public void waitForVisibilityOfStaticElement(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name=' " + text + " ']";
        }
        while (!isElementExist(xpath)) {
            try {
                wait(100);
            } catch (Exception e) {

            }
        }
    }

    public void waitForVisibilityOfElement(String text) {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name=' " + text + " ']";
        }
        MobileElement element = (MobileElement) new DriverManager().getDriver().findElementByXPath(String.valueOf(By.xpath("//XCUIElementTypeOther[@name='Categories']")));
        try {
            WebDriverWait wait = new WebDriverWait(new DriverManager().getDriver(), 10);
            wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnInvest() {
        click(investButton);
    }

    public void clickIWeHaveReadTheRelatedSchemeCheckBox(String text) throws Exception {
        String xpath = " ";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']/preceding-sibling::android.view.ViewGroup";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name= '" + text + "']/preceding-sibling::XCUIElementTypeOther";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void goBackFromScreen(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'" + text + "')]/preceding-sibling::android.view.ViewGroup";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='" + text + "']/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void selectCheckBox(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'Choose minimum amount for all schemes')]/preceding-sibling::android.view.ViewGroup";

        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name= '" + text + "']";

        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void enterMonthlyInvestInOneCli(String amt) throws Exception {
        clear(monthlyInv);
        sendKeys(monthlyInv, amt);
        clickStaticText("Monthly SIP Amount");
    }

    public void enterOneTimeInvestInOneCli(String amt) throws Exception {
        clear(oneTimeInv);
        sendKeys(oneTimeInv, amt);
        clickStaticText("One-Time Amount");
    }

    public void clickExploreAllMf() {
        click(exploreAllMf);

    }

    public void clickPlusAditya() throws Exception {
        click(plusForAdBi);
        tapOn(211, 890);
        if (!isVisible(oneClickInv)) {
            click(plusForAdBi);
            clickByText("Review & Confirm Investment");
        }

    }

    public void clickOnCompleteKYC() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(completeKYC);
        } else {
            click(completeKYC);
        }

    }

    public void backBtnCategorySc() {
        click(backBtnCategoriesSc);
    }

    public void goBackAmcSc() {
        click(backBtnAmcSc);
    }

    public void closeSortByOverlay() {
        click(closeSortBy);
    }

    public void selectFolioForAditya() throws Exception {
        click(folioBxAdi);
        clickByText("6WU19XM0PV4UQ");
    }

    public void closeFundCardSc() throws Exception {
        if (isVisible(youCanAdd4Sch)) {
            clickCancelButton();
            clickByText("Review & Confirm Investment");
            clickCloseIconForAllSchemes();
            goBackFromScreen("One-Click Invest");
            if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
                new BasePage().clickReturnIosKeyboard();
            }
            Thread.sleep(3000);
            clickAddMFForAdityaBirla();
        }
    }

    public void clickTranProcessDrDwn() {
        click(transProcess);
    }

    public void clickTranSkipDrDwn() {
        click(transSkipp);
    }

    public void clickTranSuccessDrDwn() {
        click(transSuccess);
    }

    public void clickOnConfirmOrder() {
        if (isVisible(confirmOrder)) {
            click(confirmOrder);
        }
    }

    public void scrollToMinStpInst() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Min. STP Installments (Monthly)");
//            scrollToElement1(minStpInstMon, "up", lockinPeriod, 4000, 10);

        } else {
            scrollToElement(minStpInstMon, "up", minSipInstall, 4000, 10);
//            scrollToElement1(minStpInstMon, "up", lockinPeriod, 4000, 10);
        }
    }

    public void scrollToMinSwp() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(minSwpDai, "up", minStpInstMon);
        } else {
            scrollToElement(minSwpDai, "up", minStpInstMon);
        }
    }

    public void clickThreeDotSAdiShortTerm() throws Exception {
//        andIosScroll(threeDtAdShort, "up", equity);
        click(threeDtAdShort);
    }

    public void clickThreeDotAsInfrastructure() throws Exception {
//        andIosScroll(threeDtAdShort, "up", equity);
        click(threeDtInfeaa);
    }

    public void scrollToAdiSunLiInfra() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(adityaBirInfStr, "up", adityaBirTestingPur);
        } else {
            scrollToElement(adityaBirInfStr, "up", adityaBirTestingPur);
        }
    }

    public void scrollToAdiShort() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(adityaBirInfShort, "up", adityaBirTestingPur);
        } else {
            scrollToElement(adityaBirInfShort, "up", adityaBirTestingPur);
        }
    }

    public void addSbiMagnum() {
        click(MagnumScPlusBtn);
    }

    public void addSbiContra() {
        click(plusButtonForHDFCMidCap1);
    }

    public void clickRefreshIconexter() {
        click(refreshIconExterF);
    }

    public void checkMonthlyRadio() {
        if (!isVisible(uncheckedMonthlySip)) {
            click(uncheckedMonthlySip);
        }
    }

    public void checkOneTRadio() {
        if (isVisible(oneTime)) {
            click(oneTime);
        }
    }

    public void selectSchemes(String schemeName) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
//            xpath = "//*[@text='" + schemeName + "']/following-sibling::android.view.ViewGroup[2]";
            clickByText("Select");
        } else {
            xpath = "//XCUIElementTypeStaticText[@name='" + schemeName + "']/ancestor::XCUIElementTypeOther[3]/following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther";
            click(getElement(xpath));
        }


    }

    public void removeSchemeSwiScv(String schemeName) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + schemeName + "']/preceding-sibling::android.view.ViewGroup";
        } else {
            xpath = "//XCUIElementTypeStaticText[@name='" + schemeName + "']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther";
        }
        click(getElement(xpath));
    }

    public void verifySwitchStatus(DataTable dataTable) throws Exception {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String sourceSch = userMap.get(0).get("Source Scheme");
        Assert.assertEquals(sourceSch, sourceScheme.getText());
        String targetSch = userMap.get(0).get("Target Scheme");
        Assert.assertEquals(targetSch, targetScheme.getText());
        String switchAmount = userMap.get(0).get("Amount");
        Assert.assertEquals(" " + switchAmount, switchingAmount.getText());
        String switchDate = getCurrentDate();
        Assert.assertEquals(" " + switchDate, switchingDate.getText());

    }

    public void verifyStpStatus(DataTable dataTable) throws Exception {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String sourceSch = userMap.get(0).get("Source Scheme");
        Assert.assertEquals(sourceSch, sourceScheme.getText());
        String targetSch = userMap.get(0).get("Target Scheme");
        Assert.assertEquals(targetSch, targetScheme.getText());
        String switchAmount = userMap.get(0).get("Amount");
        Assert.assertEquals(" " + switchAmount, switchingAmount.getText());
        String stpFreq = userMap.get(0).get("Frequency");
        Assert.assertEquals(" " + stpFreq, stpFrequency.getText());
//        String stpDt = userMap.get(0).get("Date");
//        Assert.assertEquals(" " + stpDt, stpDate.getText());

    }

    public void verifySwpStatus(DataTable dataTable) throws Exception {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String sourceSch = userMap.get(0).get("Scheme");
        Assert.assertEquals(sourceSch, swpScheme.getText());
        String switchAmount = userMap.get(0).get("Amount");
        Assert.assertEquals(" " + switchAmount, switchingAmount.getText());
        String stpFreq = userMap.get(0).get("Frequency");
        Assert.assertEquals(" " + stpFreq, stpFrequency.getText());
    }

    public void selectDailyStp() {
        click(uncheckedDailySTp);
    }

    public void selectWeeklySwp() {
        click(uncheckedWeeklySdp);
    }

    public void enterStpStartDt(String date) throws Exception {
        click(stpStartDate);
        new BasePage().clickByText(date);
    }

    public void enterSwpStartDt(String date) throws Exception {
        click(swpStartDate);
        new BasePage().clickByText(date);
    }

    public void enterTransferFrequency(String frequency) throws Exception {
        clear(numOfTransfer);
        sendKeys(numOfTransfer, frequency);
        new BasePage().clickStaticText("Number of Transfer");
    }

    public void enterSwpDuration(String frequency) throws Exception {
        clear(swpDuration);
        sendKeys(swpDuration, frequency);
        new BasePage().clickStaticText("SWP Duration");
    }

    public void enterStpAmount(String stpAmt) throws Exception {
        clear(stpAmtBx);
        sendKeys(stpAmtBx, stpAmt);
        new BasePage().clickStaticText("Amount");
    }

    public void enterSwpAmount(String stpAmt) throws Exception {
        clear(swpAmtBx);
        sendKeys(swpAmtBx, stpAmt);
        new BasePage().clickStaticText("Withdrawal Amount");
    }

    public void chooseOneFolio() {
        click(folioNumBxOneCliInv);
        click(oneFolioNum);
    }

    public void unableToSeeNOTBx() {
        Assert.assertFalse(isVisible(numOfTransfer));
    }

    public void enterMonthlyStp() {
        click(uncheckdMonthlySTp);
    }

    public void verifyTransacProcess() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            String xpath = "(*//XCUIElementTypeOther[contains(@name,'Transaction under process')])[18]";
            Assert.assertTrue(getElement(xpath).isDisplayed());
        } else {
            verifyText("Transaction under process");
        }
    }

    public void verifyTransacFailed() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            String xpath = "(*//XCUIElementTypeOther[contains(@name,'Transaction failed')])[18]";
            Assert.assertTrue(getElement(xpath).isDisplayed());
        } else {
            verifyText("Transaction failed");
        }
    }

    public void clickThreeDotForStp() {
        click(threeDtIcnForSTP);
    }

    public void scrollIWeHave() throws Exception {
        andIosScroll(iWeHaveCheckBox, "up", numberOfTransfer);
    }

    public void enterMobForCas(String mob) {
        clear(mobBxImportFu);
        sendKeys(mobBxImportFu, mob);
        if (Objects.equals(globalParams, "Android")) {
            pressEnter();
        } else {

        }

    }

    public void enterOtpImpFun(String otp) {
        clear(impFunOtp1);
        sendKeys(impFunOtp1, String.valueOf(otp.charAt(0)));
        clear(impFunOtp2);
        sendKeys(impFunOtp2, String.valueOf(otp.charAt(1)));
        clear(impFunOtp3);
        sendKeys(impFunOtp3, String.valueOf(otp.charAt(2)));
        clear(impFunOtp4);
        sendKeys(impFunOtp4, String.valueOf(otp.charAt(3)));
        clear(impFunOtp5);
        sendKeys(impFunOtp5, String.valueOf(otp.charAt(4)));
        clear(impFunOtp6);
        sendKeys(impFunOtp6, String.valueOf(otp.charAt(5)));
        if(Objects.equals(globalParams,"Android")){
            pressEnter();
        }
        else{

        }
    }
    public void unableToSeeInv(){
        Assert.assertFalse(isVisible(invested));
    }
    public void setInvestmentAmount(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }
    public void expandFundCard(){
        click(mfCard);
    }
}













