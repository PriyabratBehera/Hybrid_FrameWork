package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import io.cucumber.datatable.DataTable;
import org.testng.Assert;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.lang.String.valueOf;
import static org.testng.Assert.assertTrue;


public class NpsInvestmentPage extends ProfilePage {
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"NPS\n" +
            "Investment\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='NPS\n" +
            "Investment']")
    private MobileElement npsInvestment;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Register\n" +
            "for NPS']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeImage")
    @AndroidFindBy(xpath = "//*[@text='Register\n" +
            "for NPS']/parent::android.view.ViewGroup/preceding-sibling::android.widget.HorizontalScrollView")
    private MobileElement slidingBanner;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Register\n" +
            "for NPS']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeImage)[1]")
    @AndroidFindBy(xpath = "//*[@text='Register\n" +
            "for NPS']/parent::android.view.ViewGroup/preceding-sibling::android.widget.HorizontalScrollView/descendant::android.view.ViewGroup[2]/android.widget.ImageView")
    private MobileElement financialSecurity;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Register\n" +
            "for NPS']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeImage)[2]")
    @AndroidFindBy(xpath = "//*[@text='Register\n" +
            "for NPS']/parent::android.view.ViewGroup/preceding-sibling::android.widget.HorizontalScrollView/descendant::android.view.ViewGroup[3]/android.widget.ImageView")
    private MobileElement saveIncomeTx;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Register\n" +
            "for NPS']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeImage)[3]")
    @AndroidFindBy(xpath = "//*[@text='Register\n" +
            "for NPS']/parent::android.view.ViewGroup/preceding-sibling::android.widget.HorizontalScrollView/descendant::android.view.ViewGroup[3]/android.widget.ImageView")
    private MobileElement zeroTaxes;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tax Benefits on NPS']")
    @AndroidFindBy(xpath = "//*[@text='Tax Benefits on NPS']")
    private MobileElement taxBenefitsNPS;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='More About NPS']")
    @AndroidFindBy(xpath = "//*[@text='More About NPS']")
    private MobileElement moreAboutNps;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Auto Choice of Investment\"]")
    @AndroidFindBy(xpath = "//*[@text='Auto Choice of Investment']")
    private MobileElement autoChoiceInvest;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Active Choice of Investment\"]")
    @AndroidFindBy(xpath = "//*[@text='Active Choice of Investment']")
    private MobileElement activeChoiceInvest;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Tax Saving Account\"]")
    @AndroidFindBy(xpath = "//*[@text='Tax Saving Account']")
    private MobileElement taxSavingAccount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Features Portfolio\"]")
    @AndroidFindBy(xpath = "//*[@text='Features Portfolio']")
    private MobileElement feature;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NPS Advantage\"]")
    @AndroidFindBy(xpath = "//*[@text='NPS Advantage']")
    private MobileElement npsAdvantages;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NPS FAQ’s\"]")
    @AndroidFindBy(xpath = "//*[@text='NPS FAQ’s']")
    private MobileElement npsFaq;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"When can I start getting pension?\"]")
    @AndroidFindBy(xpath = "//*[@text='When can I start getting pension?']")
    private MobileElement whenIStartGetPension;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Financial Goals\"]")
    @AndroidFindBy(xpath = "//*[@text='Set Financial Goals']")
    private MobileElement setFinancialGoal;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Invest For Your Goals & Buy Insurance\"]")
    @AndroidFindBy(xpath = "//*[@text='Invest For Your Goals & Buy Insurance']")
    private MobileElement buyInsurance;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" My Retirement Savings Plan\"]")
    @AndroidFindBy(xpath = "//*[@text=' My Retirement Savings Plan']")
    private MobileElement retirementSavingPlan;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My current age is\"]")
    @AndroidFindBy(xpath = "//*[@text='At today’s value, I need a \n" +
            "monthly retirement income of']")
    private MobileElement currentAge;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"At today’s value, I need a \n" +
            "monthly retirement income of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='At today’s value, I need a \n" +
            "monthly retirement income of']/following-sibling::android.widget.EditText[1]")
    private MobileElement monthlyRetirementIncomeTxtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"At today’s value, I need a \n" +
            "monthly retirement income of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='At today’s value, I need a \n" +
            "monthly retirement income of']/following-sibling::android.widget.SeekBar[1]")
    private MobileElement monthlyRetirementIncomeTxtBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My current age is\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='My current age is']/following-sibling::android.widget.EditText[1]")
    private MobileElement currentAgeTxtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My current age is\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='My current age is']/following-sibling::android.widget.SeekBar[1]")
    private MobileElement currentAgeTxtBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"I will retire at the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='I will retire at the age of']/following-sibling::android.widget.EditText[1]")
    private MobileElement retirementAgeTxtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"I will retire at the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='I will retire at the age of']/following-sibling::android.widget.SeekBar[1]")
    private MobileElement retirementAgeTxtBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"After retirement, I need\n" +
            "income till the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='After retirement, I need\n" +
            "income till the age of']/following-sibling::android.widget.EditText[1]")
    private MobileElement incomeAfterRetirement;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"After retirement, I need\n" +
            "income till the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='After retirement, I need\n" +
            "income till the age of']/following-sibling::android.widget.SeekBar[1]")
    private MobileElement incomeAfterRetirementBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Till I retire, I will invest at\n" +
            "an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Till I retire, I will invest at\n" +
            "an annual interest rate of']/following-sibling::android.widget.EditText[1]")
    private MobileElement investTillRetire;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Till I retire, I will invest at\n" +
            "an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Till I retire, I will invest at\n" +
            "an annual interest rate of']/following-sibling::android.widget.SeekBar[1]")
    private MobileElement investTillRetireBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Post-Retirement, I will invest\n" +
            "at an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Post-Retirement, I will invest\n" +
            "at an annual interest rate of']/following-sibling::android.widget.EditText[1]")
    private MobileElement investPostRetire;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Post-Retirement, I will invest\n" +
            "at an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Post-Retirement, I will invest\n" +
            "at an annual interest rate of']/following-sibling::android.widget.SeekBar[1]")
    private MobileElement investPostRetireBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corpus\"]")
    @AndroidFindBy(xpath = "//*[@text='Corpus']")
    private MobileElement corpus;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ Corp\n" +
            "Detail\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Corp\n" +
            "Detail']")
    private MobileElement corpDetailThick;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1 Corp\n" +
            "Detail\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Corp\n" +
            "Detail']")
    private MobileElement corpDetail;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Company Name\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Company Name']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement compSearchBx;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Search Company & Select\"])[4]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Search Company & Select\"]")
    private MobileElement compSearchSelect;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Employee Number\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Employee Number']/following-sibling::android.widget.EditText")
    private MobileElement empNumber;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Joining the Company\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Date of Joining the Company']/following-sibling::android.view.ViewGroup")
    private MobileElement compJoinDt;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"5 Invest\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Invest']")
    private MobileElement investTab;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Register as Corporate Subscriber\"]")
    @AndroidFindBy(xpath = "//*[@text='Register as Corporate Subscriber']")
    private MobileElement corporateSub;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start New Application\"]")
    @AndroidFindBy(xpath = "//*[@text='Start New Application']")
    private MobileElement startNewApplication;
    @iOSXCUITFindBy(xpath = "\uE836 Corporate Subscriber")
    @AndroidFindBy(xpath = "//*[@text='Corporate Subscriber']")
    private MobileElement corpSubscriber;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pension Fund Manager (PFM)\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Pension Fund Manager (PFM)']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup")
    private MobileElement pensionFundManager;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Alternative Fund (A) - Upto 5%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Alternative Fund (A) - Upto 5%']/following-sibling::android.widget.EditText[1]")
    private MobileElement alternativeFund;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Alternative Fund (A) - Upto 5%\"])[1]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Alternative Fund (A) - Upto 5%']/following-sibling::android.widget.EditText[1]")
    private MobileElement alterFundAfterClear;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Equity (E) - Upto 75%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Equity (E) - Upto 75%']/following-sibling::android.widget.EditText[1]")
    private MobileElement equityFund;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Equity (E) - Upto 75%\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Equity (E) - Upto 75%']/following-sibling::android.widget.EditText[1]")
    private MobileElement equityFundAftClear;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Govt. Securities (G) - Upto 100%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Govt. Securities (G) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement govtSecurity;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Govt. Securities (G) - Upto 100%\"])[1]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Govt. Securities (G) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement govtSecurityAftClear;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Corporate Bond (C) - Upto 100%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Corporate Bond (C) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement corporateBnd;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Corporate Bond (C) - Upto 100%\"])[1]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Corporate Bond (C) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement corporateBndAftClear;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee Name\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement nomineeNameTxtBox;
    @AndroidFindBy(xpath = "//*[@text=\"Guardian is nominee’s\"]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian is nominee’s\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement guardianIsMyTxtBox;
    @AndroidFindBy(xpath = "//*[@text=\"NPS E-E-E Benefits\"]/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NPS E-E-E Benefits\"]/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    private MobileElement youtubeVideo;
    @AndroidFindBy(xpath = "//*[contains(@text,'NPS FAQ')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"NPS FAQ\")]")
    private MobileElement existAndWithdraw;
    @AndroidFindBy(xpath = "//*[@text='Life Cycle Fund Type']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Life Cycle Fund Type\"]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeImage")
    private MobileElement lifeCycleFundType;
    @AndroidFindBy(xpath = "//*[@text='Auto Investment Choice']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Auto Investment Choice\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement closeBtnAutoInvest;
    @AndroidFindBy(xpath = "//*[@text=\"Can I change my scheme preference?\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Can I change my scheme preference?\"])[2]\n")
    private MobileElement canIChange;
    @AndroidFindBy(xpath = "//*[@text=\"What are the tax benefits in NPS account\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"What are the tax benefits in NPS account\"])[1]")
    private MobileElement whatAreTax;
    @AndroidFindBy(xpath = "//*[@text=\"Pension Fund Manager (PFM)\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pension Fund Manager (PFM)\"]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther")
    private MobileElement pfmDropDwn;
    @AndroidFindBy(xpath = "//*[@text=\"SBI PENSION FUNDS PRIVATE LIMITED\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"SBI PENSION FUNDS PRIVATE LIMITED\"])[2]")
    private MobileElement sbiPFM;
    @AndroidFindBy(xpath = "//*[@text=\"Choose Asset Allocation (Total should be 100%)\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Choose Asset Allocation (Total should be 100%)\"]")
    private MobileElement choiceAssertAlo;
    @AndroidFindBy(xpath = "//*[@text=\"Portfolio Option\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Portfolio Option\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther")
    private MobileElement portFoOpt;
    @AndroidFindBy(xpath = "//*[@text=\"Investment\n" +
            "Choices\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ Investment\n" +
            "Choices\"])[3]")
    private MobileElement investChoice;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ Nominee\"])[3]")
    private MobileElement nominee;
    @AndroidFindBy(xpath = "//*[@text=\"Guardian’s Date of Birth (Must be adult)\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Date of Birth (Must be adult)\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement guardianDOB;
    @AndroidFindBy(xpath = "//*[@text=\"scroll down\"]/preceding-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll down\"]/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[8]")
    private MobileElement dtPicker;
    @AndroidFindBy(xpath = "//*[@text=\"2002\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"2002\"])[1]")
    private MobileElement dt1995;
    @AndroidFindBy(xpath = "//*[@text=\"1997\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement dt1998;
    @AndroidFindBy(xpath = "//*[@text=\"scroll up\"]/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll up\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[4]")
    private MobileElement currYr;
    @AndroidFindBy(xpath = "//*[@text=\"Father\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Father\"])[2]")
    private MobileElement father;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    private MobileElement currentYear;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Guardian’s Name\"]/following-sibling::android.widget.EditText")
    private MobileElement guardianName;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"DEF Technologies (DEF Enterprises)\"])[3]")
    @AndroidFindBy(xpath = "(//*[contains(@text,'DEF Technologies')])[2]")
    private MobileElement defTechnologies;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"ABC Technologies (ABC Tek)\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='ABC Technologies (ABC Tek)']")
    private MobileElement abcTecno;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Hombale Films (KGF 3)\"])[3]")
    @AndroidFindBy(xpath = "(//*[contains(@text,'Hombale Films (KGF 3)')])[2]")
    private MobileElement hombalFilms;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Original Valuefloat Technologies Pvt Ltd (Floatr)']")
    @AndroidFindBy(xpath = "//*[@text='Original Valuefloat Technologies Pvt Ltd (Floatr)']")
    private MobileElement originalValueFloatr;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Financial Goals\"]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[@text='Set Financial Goals']/preceding-sibling::android.widget.HorizontalScrollView/descendant::android.widget.ImageView[1]")
    private MobileElement investInNpsBan;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Life Cycle Fund Type\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Life Cycle Fund Type\"]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement lifCycleFundDropDw;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"IFSC Code\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"IFSC Code\"]/following-sibling::android.widget.EditText")
    private MobileElement ifscCode;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Account Number (Must be Savings Account)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Account Number (Must be Savings Account)\"]/following-sibling::android.widget.EditText[1]")
    private MobileElement accountNumber;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bank Name\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Bank Name\"]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement bankNameDrpDwn;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Submit Application\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Submit Application']")
    private MobileElement submitApplication;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contribution Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Contribution Amount\"]/following-sibling::android.widget.EditText")
    private MobileElement contributionAmt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Tier 2\"]")
    @AndroidFindBy(xpath = "//*[@text='Tier 2']")
    private MobileElement tire2Acc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Tier 1\"]")
    @AndroidFindBy(xpath = "//*[@text='Tier 1']")
    private MobileElement tire1Acc;
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Search...\"")
    @AndroidFindBy(xpath = "//*[@text='Select Bank']/parent::android.view.View/parent::android.view.View/following-sibling::android.view.View[1]")
    private MobileElement bankName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Test Bank\"]")
    @AndroidFindBy(xpath = "//*[@text='Test Bank']")
    private MobileElement testBank;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,\"Make Payment for ₹\")]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Make Payment for ₹')]")
    private MobileElement makeAPayment;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"BillDesk\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "(//*[@text='Select'])[2]")
    private MobileElement selectTrType;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Success\"]")
    @AndroidFindBy(xpath = "//*[@text='Success']")
    private MobileElement success;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Failure\"]")
    @AndroidFindBy(xpath = "//*[@text='Failure']")
    private MobileElement failure;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
    @AndroidFindBy(xpath = "//*[@text='Submit']")
    private MobileElement submitBtn;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Home\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Home']")
    private MobileElement homeBtn;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"NPS\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[@text='NPS']/following-sibling::android.view.ViewGroup")
    private MobileElement historyIcon;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"NPS\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[@text='NPS']/following-sibling::android.view.ViewGroup[2]")
    private MobileElement homeHistoryIcon;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"NPS\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='NPS']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement infoIcon;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"NPS\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='MY PRAN DETAIL']/preceding-sibling::android.view.ViewGroup/child::android.widget.ImageView")
    private MobileElement closeMyPranDet;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Create NPS Account\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Create NPS Account']")
    private MobileElement createNpsAcc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Reasons of Failure\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Reasons of Failure']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement closeIconFailureScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Corporate Subscriber\"]")
    @AndroidFindBy(xpath = "//*[@text='Corporate Subscriber']")
    private MobileElement corporateSubRadioBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Individual Subscriber\"]")
    @AndroidFindBy(xpath = "//*[@text='Individual Subscriber']")
    private MobileElement individualSubRadioBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Portfolio Option\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Portfolio Option\"]/following-sibling::android.view.ViewGroup")
    private MobileElement portfolioOpt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Re-start NPS Application\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Re-start NPS Application\"]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement closeIconRestartPopup;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Select Nominee\")]/following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[contains(@text,\"Select Nominee\")]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement oneNominee;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Select Nominee\")]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[contains(@text,\"Select Nominee\")]/following-sibling::android.view.ViewGroup[2]")
    private MobileElement twoNominee;
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"100 %\"")
    @AndroidFindBy(xpath = "//*[@text='100 %']")
    private MobileElement hundredPer;
    @iOSXCUITFindBy(iOSNsPredicate = "value == '50 %'")
    @AndroidFindBy(xpath = "//*[@text='50 %']")
    private MobileElement fiftyPer;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum 3 banks\n" +
            "are allowed']")
    @AndroidFindBy(xpath = "//*[@text='Maximum 3 banks\n" +
            "are allowed']")
    private MobileElement threeBankAllowed;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Maximum 3 banks\n" +
            "are allowed']/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Maximum 3 banks\n" +
            "are allowed']/preceding-sibling::android.view.ViewGroup/android.widget.ImageView")
    private MobileElement addingBankPopup;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"KOTAK MAHINDRA PENSION FUND LIMITED\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='KOTAK MAHINDRA PENSION FUND LIMITED']")
    private MobileElement kotakMahindra;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Bank\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Select Bank']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement bankAcc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Invest\n" +
            "in NPS\"]")
    @AndroidFindBy(xpath = "//*[@text='Invest\n" +
            "in NPS']")
    private MobileElement investInNPS;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Open NPS Account\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Open NPS Account']")
    private MobileElement openNpsAcc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Subscriber Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Subscriber Name']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement subscriberName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Subscriber Name']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement Name;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Number\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Number']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement pranNumber;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Status\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView")
    private MobileElement pranStatus;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView")
    private MobileElement Pran;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView")
    private MobileElement sector;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Status\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement pranStatus1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Corporate Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Corporate Name']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView")
    private MobileElement corporateName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Acknowledgement\n" +
            "Number']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Acknowledgement\n" +
            "Number']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement acknowledgeNo;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee's Date of Birth\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee's Date of Birth\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement nomineeDob;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee's Date of Birth\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Investment Option\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    private MobileElement investmentOpt;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement calBackwardBtn;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement calForwardBtn;
    @AndroidFindBy(xpath = "//*[@text=\"Moderate (LC-50)\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement moderateLC50;
    @AndroidFindBy(xpath = "//*[@text=\"Aggressive (LC-75)\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement aggressiveLC75;
    @AndroidFindBy(xpath = "//*[@text=\"Conservative (LC-25)\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement conservativeLC25;
    @AndroidFindBy(xpath = "//*[@text='Enter value upto 5 % ']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter value upto 5 % \"]")
    private MobileElement enterValue5per;
    @AndroidFindBy(xpath = "//*[@text=\"NPS E-E-E Benefits\"]/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement npsEeeVideo;
    @AndroidFindBy(xpath = "//*[@text='Exit at Maturity(60 years)']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement exitMaturity;
    @AndroidFindBy(xpath = "//*[@text='Exit on Death']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement exitOnDeath;
    @AndroidFindBy(xpath = "//*[@text='Partial Withdrawal']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement partialWithdral;
    @AndroidFindBy(xpath = "//*[@text='Check PRAN Status']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Check PRAN Status\"]/following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeTextField")
    private MobileElement pranInputBx;
    @AndroidFindBy(xpath = "//*[@text='PRAN Check Successful']/preceding-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PRAN Check Successful\"]/preceding-sibling::XCUIElementTypeOther[2]")
    private MobileElement closePranStaPopup;
    @AndroidFindBy(xpath = "//*[@text='Corporate Bond (C) - Upto 100%']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate Bond (C) - Upto 100\"]")
    private MobileElement corporateBond;
    @AndroidFindBy(xpath = "//*[@text='Internet Banking']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Internet Banking\"]")
    private MobileElement internetBanking;
    @AndroidFindBy(xpath = "//*[@text='Registration Failed']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Registration Failed\"]")
    private MobileElement registrationFailed;
    @AndroidFindBy(xpath = "//*[@text='Shift\n" +
            "My PRAN']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Shift\n" +
            "My PRAN\"]")
    private MobileElement shiftMyPran;
    @AndroidFindBy(xpath = "//*[@text='Individual']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Individual\"]")
    private MobileElement indRadioBtn;
    @AndroidFindBy(xpath = "//*[@text='Corporate']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Corporate\"]")
    private MobileElement corRadioBtn;
    @AndroidFindBy(xpath = "//*[@text='Current POP-SP Code']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Current POP-SP Code\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement popSpCdInBx;
    @AndroidFindBy(xpath = "//*[@text='Current CBO Code']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Current CBO Code\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement cboCdInBx;
    @AndroidFindBy(xpath = "//*[@text='PRAN Number']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PRAN Number\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement pranNumInBx;
    @AndroidFindBy(xpath = "//*[@text='Full Name (Must match with name in PRAN)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Full Name (Must match with name in PRAN)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement renameSubscriberName;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP to Confirm')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Enter OTP to Confirm')]")
    private MobileElement pranShiftOtp;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,\"Enter OTP received \")]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private MobileElement pranShiftOtp1;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,\"Enter OTP received \")]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private MobileElement pranShiftOtp2;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,\"Enter OTP received \")]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    private MobileElement pranShiftOtp3;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,\"Enter OTP received \")]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    private MobileElement pranShiftOtp4;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"NPS\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    private MobileElement informationIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name='Delete']")
    private MobileElement iOsDeleteButton;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='HDFC Pension Management Company Limited Scheme G - Tier I']")
    private MobileElement scemeGTire;
    @AndroidFindBy(xpath = "//*[@text='Contribution Amount']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contribution Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private MobileElement increaseRegiAmt;

    @AndroidFindBy(xpath = "//*[@text='From']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"From\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement fromBxNpsStat;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"To\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement toBxNpsStat;
    @AndroidFindBy(xpath = "//*[@text='\uE314']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE314\"]")
    private MobileElement backBtnCal;
    @AndroidFindBy(xpath = "//*[@text='\uE315']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE315\"]")
    private MobileElement nextBtnCal;

    @AndroidFindBy(xpath = "//*[@text='History']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"History\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    private MobileElement downloadLink;

    @AndroidFindBy(xpath = "//*[contains(@text,'Enter OTP received on')]/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"QLOverlayDoneButtonAccessibilityIdentifier\"]")
    private MobileElement doneBtnNpsSt;


    @AndroidFindBy(xpath = "//*[@text='Full Name (Must match with name in PRAN)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Full Name (Must match with name in PRAN)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement fullNmaeInPranShi;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Employee Number']/following-sibling::android.widget.EditText")
    private MobileElement corporateMail;
    @AndroidFindBy(xpath = "//*[@text='Full Name (Must match with name in PRAN)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Auto Choice\n" +
            " \"]")
    private MobileElement autoChoice;


    public void scrollToNpsInvestment() throws Exception {
        if (!isVisible(npsInvestment)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andIosScroll(buyInsurance, "up", setFinancialGoal);
            } else {
                scrollToElement(buyInsurance, "up", setFinancialGoal, 3000, 10);
            }
        }
    }

    public void scrollToMoreAboutNps() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "More About NPS");
        } else {
            scrollToElement(moreAboutNps, "up", taxBenefitsNPS, 3000, 10);
        }
    }

    public void scrollToAutoChoice() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
//            andScrollToElementUsingUiScrollable("text","Auto Choice of Investment");
            andIosScroll(autoChoiceInvest, "up", npsAdvantages, 4000);
        } else {
            scrollToElement(autoChoiceInvest, "up", npsAdvantages, 5000, 10);
        }
    }

    public void scrollToActiveChoice() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(activeChoiceInvest, "up", npsAdvantages, 5000);
        } else {
            scrollToElement(activeChoiceInvest, "up", npsAdvantages, 3000, 10);
        }
    }

    public void scrollToTaxSavingAccount() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Tax Saving Account");
        } else {
            scrollToElement(taxSavingAccount, "up", npsAdvantages, 3000, 10);
        }
    }

    public void scrollToNpsFaq() throws Exception {
        scrollToElement(npsFaq, "up", autoChoiceInvest, 3000, 10);
    }

    public void scrollToFaq() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "What are the investment choices available in NPS?");
        } else {
            scrollToElement(whenIStartGetPension, "up", existAndWithdraw, 3000, 10);
        }
    }

    public void scrollToExistWithdraw() throws Exception {
        scrollToElement(npsFaq, "up", autoChoiceInvest, 3000, 10);
    }

    public void scrollToWhatAreTax() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "What are the tax benefits in NPS account");
        } else {
            scrollToElement(whatAreTax, "up", canIChange, 3000, 10);
        }
    }

    public void clickNpsInvestment() {
        if (!isVisible(npsInvestment)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "NPS\n" +
                        "Investment");
            } else {
                iOSScrollToElementByName(npsInvestment, "up", "NPS\n" +
                        "Investment");
            }
        }
        click(npsInvestment);
    }

    public void verifySlidingBanner() {
        isVisible(slidingBanner);
    }

    public void scrollToCurrentAge() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(currentAge, "down", retirementSavingPlan);

        } else {
            scrollToElement(currentAge, "down", retirementSavingPlan, 3000, 10);

        }
    }

    public void scrollToCorpus() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Corpus");
        } else {
            scrollToElement(corpus, "up", retirementSavingPlan, 3000, 10);
        }
    }

    public void enterMonRetirementIncome(String incomeAmt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(monthlyRetirementIncomeTxtBx);
            clear(monthlyRetirementIncomeTxtBx);
            sendKeys(monthlyRetirementIncomeTxtBar, incomeAmt);
        } else {
            click(monthlyRetirementIncomeTxtBx);
            clear(monthlyRetirementIncomeTxtBx);
            sendKeys(monthlyRetirementIncomeTxtBx, valueOf(incomeAmt.charAt(0)));
            sendKeys(monthlyRetirementIncomeTxtBx, valueOf(incomeAmt.charAt(1)));
        }
    }

    public void enterCurrentAge(String incomeAmt) throws Exception {
//
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(currentAgeTxtBx);
            clear(currentAgeTxtBx);
            sendKeys(currentAgeTxtBar, incomeAmt);
            clickStaticText("My current age is");
        } else {
            click(currentAgeTxtBx);
            clear(currentAgeTxtBx);
            sendKeys(currentAgeTxtBx, valueOf(incomeAmt.charAt(0)));
            sendKeys(currentAgeTxtBx, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterRetirementAge(String incomeAmt) throws Exception {

        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(retirementAgeTxtBx);
            clear(retirementAgeTxtBx);
            sendKeys(retirementAgeTxtBar, incomeAmt);
            clickStaticText("My current age is");
        } else {
            click(retirementAgeTxtBx);
            clear(retirementAgeTxtBx);
            sendKeys(retirementAgeTxtBx, valueOf(incomeAmt.charAt(0)));
            sendKeys(retirementAgeTxtBx, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterIncomeAfterRetire(String incomeAmt) throws Exception {

        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(incomeAfterRetirement);
            clear(incomeAfterRetirement);
            sendKeys(incomeAfterRetirementBar, incomeAmt);
            clickStaticText("My current age is");
        } else {
            click(incomeAfterRetirement);
            clear(incomeAfterRetirement);
            sendKeys(incomeAfterRetirement, valueOf(incomeAmt.charAt(0)));
            sendKeys(incomeAfterRetirement, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterInvestTillRetire(String incomeAmt) throws Exception {

        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            int retireAge = Integer.parseInt(incomeAmt);
            int twice = retireAge * 2;
            String str = Integer.toString(twice);
            click(investTillRetire);
            clear(investTillRetire);
            sendKeys(investTillRetireBar, str);
            clickStaticText("My current age is");
        } else {
            click(investTillRetire);
            for (int i = 0; i < 3; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(investTillRetire, valueOf(incomeAmt.charAt(0)));
            click(investTillRetire);
            sendKeys(investTillRetire, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterInvestPostRetire(String incomeAmt) throws Exception {

        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            int retireAge = Integer.parseInt(incomeAmt);
            int twice = retireAge * 2;
            String str = Integer.toString(twice);
            click(investPostRetire);
            clear(investPostRetire);
            sendKeys(investPostRetireBar, str);
            clickStaticText("My current age is");
        } else {
            click(investPostRetire);
            for (int i = 0; i < 2; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(investPostRetire, valueOf(incomeAmt.charAt(0)));
            click(investTillRetire);
            sendKeys(investPostRetire, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterInvestPostRetirement(String incomeAmt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            int retireAge = Integer.parseInt(incomeAmt);
            int twice = retireAge * 2;
            String str = Integer.toString(twice);
            click(investPostRetire);
            clear(investPostRetire);
            sendKeys(investPostRetireBar, "60");
            clickStaticText("My current age is");
        } else {
            clear(investPostRetire);
            click(investPostRetire);
            Thread.sleep(5000);
            sendKeys(investPostRetire, incomeAmt);
            clickStaticText("My current age is");
        }
    }

    public void searchCompanyName(String compName) throws Exception {
        click(compSearchBx);
        sendKeys(compSearchSelect, compName);
        Thread.sleep(1000);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        }
    }

    public void clickCorpDetail() {
        if (isVisible(corpDetailThick)) {
            click(corpDetailThick);
        } else {
            click(corpDetail);
        }
    }

    public void enterEmpNum(String EmpNum) throws Exception {
        click(empNumber);
        clear(empNumber);
        sendKeys(empNumber, EmpNum);
        clickStaticText("Employee Number");
    }

    public void enterCompJoinDt(String date) throws Exception {
        click(compJoinDt);
        clickByText(date);
        clickByText("OK");
//        clickButtonTextDone();
        clickStaticText("Date of Joining the Company");
    }

    public boolean verifyInvestTab() {
        return isVisible(investTab);
    }

    public void clickCorpSub() throws Exception {
        if (isVisible(corporateSub)) {
            click(corporateSub);
        } else {
            click(startNewApplication);
            click(corpSubscriber);
            clickByText("Continue");
        }
    }

    public void clickPFMDropDwn() throws Exception {
        click(pensionFundManager);
    }

    public void scrollD0wn() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(enterValue5per, "up", corporateBond);
        } else {
            iOSScrollToElementByName(enterValue5per, "Up", "Enter value upto 5 % ");
        }
    }

    public void enterAlterFund(String fund) throws Exception {
        clear(alternativeFund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
        click(alterFundAfterClear);
        sendKeys(alterFundAfterClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void enterEquityFund(String fund) throws Exception {
        click(equityFund);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            for (int i = 0; i < 3; i++) {
                clickTypeKeyDelete();
            }
        } else {
            clear(equityFund);
        }
        sendKeys(equityFundAftClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void oenterGovtSecurity(String fund) throws Exception {
        click(govtSecurity);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            for (int i = 0; i < 3; i++) {
                clickTypeKeyDelete();
            }
        } else {
            clear(govtSecurity);
        }
        sendKeys(govtSecurityAftClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void enterCorporateBnd(String fund) throws Exception {
        click(corporateBnd);
        clear(corporateBnd);
        clickStaticText("Choose Asset Allocation Total should be 100%");
//        clickStaticText("Choose Asset Allocation (Total should be 100%)");
        click(corporateBndAftClear);
        sendKeys(corporateBndAftClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void enterNomineeName(String name) throws Exception {
        clear(nomineeNameTxtBox);
        sendKeys(nomineeNameTxtBox, name);
        clickStaticText("Nominee Name");
    }

    public void selectGuardianRelationship() throws Exception {
        click(guardianIsMyTxtBox);
        click(father);
    }

    public void enterGuardianName(String name) throws Exception {
        clear(guardianName);
        clickStaticText("Guardian Detail");
        sendKeys(guardianName, name);
        clickStaticText("Guardian Detail");
    }

    public void scrollNpsVideo() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            scrollInAndroid(npsEeeVideo, 868, 1733, 237, 1733);

        } else {
            swipe(410, 695, 32, 697, 1000);
        }
    }

    public void clickVideo() {
        click(youtubeVideo);
    }

    public void scrollToExistAndWithDraw() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "NPS FAQ’s");
        } else {
            scrollToElement(existAndWithdraw, "up", npsAdvantages, 3000, 10);
        }
    }

    public void clickModerateFifty() {
        click(lifeCycleFundType);
    }

    public void closeAutoChoiceInvest() {
        click(closeBtnAutoInvest);
    }

    public void scrollToExitOnDeath() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(exitOnDeath, "left", exitMaturity);
        } else {
            swipe(407, 814, 45, 806, 5000);
        }
    }

    public void scrollToPartialWithdral() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(partialWithdral, "left", exitOnDeath);
        } else {
            swipe(407, 814, 45, 806, 5000);
        }
    }

    public void verifyIsPFMClickable() throws Exception {
        click(pfmDropDwn);
        Assert.assertFalse(isVisible(sbiPFM));
    }

    public void verifyActiveChoice() throws Exception {
        clickByText("Active Choice");
        Assert.assertFalse(isVisible(choiceAssertAlo));
    }

    public void verifyAutoChoice() throws Exception {
        clickByText("Auto Choice");
        Assert.assertFalse(isVisible(portFoOpt));
    }

    public void verifyPortFoOpt() throws Exception {
        click(portFoOpt);
        Assert.assertFalse(isVisible(choiceAssertAlo));
    }

    public void clickInvestChoice() {
        click(investChoice);
    }

    public void clickNominee() {
        click(nominee);
    }

    public void enterNomineeDOBGT18() {
        click(guardianDOB);

    }

    public void enterGuardianDob() throws Exception {
        click(guardianDOB);
        click(currentYear);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "2002");
            click(dtPicker);
        } else {
            scrollToElement(dt1998, "up", dtPicker, 20000, 10);
            click(dt1998);
        }
        clickByText("1");
        clickByText("OK");
    }

    public void enterNomineDob() throws Exception {
        click(nomineeDob);
        clickByText("Cancel");
        click(nomineeDob);
        click(calBackwardBtn);
        click(calForwardBtn);
        click(currentYear);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "2002");
            click(dtPicker);
        } else {
            scrollToElement(dt1998, "up", dtPicker, 20000, 10);
            click(dt1998);
        }
        clickByText("1");
        clickByText("OK");
    }

    public void enterBelow18GuDob() throws Exception {
        click(guardianDOB);
        click(currentYear);
        click(currYr);
        clickByText("1");
        clickByText("OK");
    }

    public void clickDefTechnologies() {
        click(defTechnologies);
    }

    public void clickInvInNpsBan() {
        click(investInNpsBan);
    }

    public void swipeToSaveIncTxBan() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(saveIncomeTx, "left", financialSecurity);
        } else {
            scrollToElement(saveIncomeTx, "left", financialSecurity, 3000, 10);
        }
    }

    public void swipeToZeroTax() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(zeroTaxes, "left", saveIncomeTx);
        } else {
            scrollToElement(zeroTaxes, "left", saveIncomeTx, 3000, 10);
        }
    }

    public void selectModerateLCF() {
        click(lifCycleFundDropDw);
        click(moderateLC50);

    }

    public void selectConservativeLCF() {
        click(lifCycleFundDropDw);
        click(conservativeLC25);
    }

    public void selectAggressiveLCF() {
        click(lifCycleFundDropDw);
        click(aggressiveLC75);
    }

    public void enterIfscCode(String IFSCCode) throws Exception {
        clear(ifscCode);
        sendKeys(ifscCode, IFSCCode);
        clickStaticText("IFSC Code");
    }

    public void enterAccNo(String ACCNo) {
        clear(accountNumber);
        sendKeys(accountNumber, ACCNo);
    }

    public void selectBankName(String bankName) throws Exception {
        click(bankNameDrpDwn);
        Thread.sleep(3000);
        clickByText(bankName);
    }

    public void verifySubmitApplication() {
        assertTrue(isVisible(submitApplication));
    }

    public void clickSubmitApplication() {
        click(submitApplication);
    }

    public void enterContributionAmt(String amt) throws Exception {
        clear(contributionAmt);
        sendKeys(contributionAmt, amt);
        clickStaticText("Contribution Amount");
    }

    public void deleteNps(String mobileNumber) {
        String[] mobNo = mobileNumber.split(" ");
        try {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString("{  \n" +
                                "    \"type\" :\"token\",\n" +
                                "     \"contact\":\"" + mobNo[0] + "\",\n" +
                                "     \"pan\":\"CBFJG5746H\",\n" +
                                "     \"account_number\":\"3553533\",\n" +
                                "     \"account_type\": \"Personal\",\n" +
                                "     \"firstname\": \"Nishath\",\n" +
                                "      \"middlename\": \"Khanum\",\n" +
                                "      \"lastname\": \"S\"\n" +
                                "}"))
                        .build();
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String[] arr = response.body().split("\"token\":\"");
                String[] responce = arr[1].split("\"}}");
                HttpRequest request1 = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/nps/delete"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Authorization", responce[0])
                        .DELETE()
                        .build();
                HttpClient client1 = HttpClient.newBuilder().build();

                HttpResponse<String> resp = client1.send(request1, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } else {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString("{  \n" +
                                "    \"type\" :\"token\",\n" +
                                "     \"contact\":\"" + mobNo[2] + "\",\n" +
                                "     \"pan\":\"CBFJG5746H\",\n" +
                                "     \"account_number\":\"3553533\",\n" +
                                "     \"account_type\": \"Personal\",\n" +
                                "     \"firstname\": \"Nishath\",\n" +
                                "      \"middlename\": \"Khanum\",\n" +
                                "      \"lastname\": \"S\"\n" +
                                "}"))
                        .build();
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String[] arr = response.body().split("\"token\":\"");
                String[] responce = arr[1].split("\"}}");


                HttpRequest request1 = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/nps/delete"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Authorization", responce[0])
                        .DELETE()
                        .build();
                HttpClient client1 = HttpClient.newBuilder().build();

                HttpResponse<String> resp = client1.send(request1, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickTire2Acc() {
        click(tire2Acc);
    }

    public void clickTire1Acc() {
        click(tire1Acc);
    }

    public void selectBank() {
        click(bankName);
        click(testBank);

    }

    public void clickMakePayment() {
        click(makeAPayment);
    }

    public void doPaymentForNps() throws Exception {
        if (!isVisible(internetBanking)) {
            waitForVisibility(internetBanking, 120);
        }
        clickStaticText("Internet Banking");
        click(bankName);
        click(testBank);
        click(makeAPayment);
        click(selectTrType);
        click(success);
        click(submitBtn);

    }

    public void clickHome() {
        click(homeBtn);
    }

    public void clickHistoryIcon() {
        click(historyIcon);
    }

    public void clickHistoryIconInHome() {
        click(homeHistoryIcon);
    }

    public void paymentFailForNps() throws Exception {
        if (!isVisible(internetBanking)) {
            waitForVisibility(internetBanking, 120);
        }
        clickStaticText("Internet Banking");
        click(bankName);
        click(testBank);
        click(makeAPayment);
        click(selectTrType);
        click(failure);
        click(submitBtn);
    }

    public void closeFailureScreen() {
        click(closeIconFailureScreen);
    }

    public String getCurrentDat() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = today.format(formatter);
        return formattedDate;
    }

    public void verifySuccessTransaction(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            verifyText("Tier 1");
            verifyText(getCurrentDat() + " • ");
            verifyText(" Buy");
            verifyText(amount);
        } else {
            verifyPartialText("Tier 1 " + getCurrentDat() + " •  Buy " + amount);
        }
    }

    public void verifySuccessContribution(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            verifyText("Tier 1");
            verifyText(getCurrentDat() + " • ");
            verifyText(" Buy");
            verifyText(amount);
        } else {
            verifyPartialText("Tier 1 " + getCurrentDat() + " •  " + amount);

        }
    }

    public void verifyFailureTransaction(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            verifyText("Tier 1");
            verifyText(getCurrentDat() + " • ");
            verifyText(" Buy");
//            verifyText("₹535.40");
            verifyText(amount);
        } else {
            verifyPartialText("Tier 1 " + getCurrentDat() + " •  " + amount);
        }
    }

    public void clickHombal() {
        click(hombalFilms);
    }

    public void clickOriginalValueFloatr() {
        click(originalValueFloatr);
    }

    public void deleteBankDetail(String accNo) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
//                    .header("x-tenant-id","floatr")
                    .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                            "    \"type\" : \"bankaccount\", \n" +
                            "    \"account_number\":\"" + accNo + "\",\n" +
                            "    \"account_type\": \"Personal\"\n" +
                            "} "))
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response Body: " + response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickCorporateSub() {
        click(corporateSubRadioBtn);
    }

    public void clickIndividualSub() {
        click(individualSubRadioBtn);
    }

    public void selectPortfolioOpt(String portFName) throws Exception {
        click(portfolioOpt);
        clickByText(portFName);
    }

    public void closeRestartNpsScreen() {
        click(closeIconRestartPopup);
    }

    public void chooseOneNominee() {
        click(oneNominee);
    }

    public void chooseTwoNominee() {
        click(twoNominee);
    }

    public void verify100PercentNominee() {
        assertTrue(isVisible(hundredPer));
    }

    public void verify50PercentNominee() {
        assertTrue(isVisible(fiftyPer));
    }

    public void verifyAddLimitBank() {
        assertTrue(isVisible(threeBankAllowed));
    }

    public void closeAddingBankPopup() {
        click(addingBankPopup);
    }

    public void selectPFM(String name) throws Exception {
        click(pfmDropDwn);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "KOTAK MAHINDRA PENSION FUND");
        } else {
            iOSScrollToElementByName(kotakMahindra, "up", name);
        }
        clickByText(name);

    }

    public void selectBankInBankAccSc() {
        click(bankAcc);
    }

    public void clickRegisterNps() {
        click(openNpsAcc);
    }

    public void scrollCorporateName() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Corporate Name");
        } else {
            scrollToElement(corporateName, "up", pranStatus, 3000, 10);
        }

    }

    public void verifyAppliStatus(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String subscribername = userMap.get(0).get("Subscriber Name");
        Assert.assertEquals(subscriberName.getText(), subscribername);
        String pranstatus = userMap.get(0).get("PRAN Status");
        Assert.assertEquals(pranStatus1.getText(), pranstatus);
        String corporatename = userMap.get(0).get("Corporate Name");
        Assert.assertEquals(corporateName.getText(), corporatename);
        String pranNo = getText(pranNumber, "PRAN Number: ");
        utils.log().info("PRAN Number: " + pranNo);
        String acckNo = getText(acknowledgeNo, "Acknowledgement Number: ");
        utils.log().info("Acknowledgement Number: " + acckNo);
    }

    public void verifyNPSAppliStatus(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String subscribername = userMap.get(0).get("Subscriber Name");
        Assert.assertEquals(subscriberName.getText(), subscribername);
        String pranstatus = userMap.get(0).get("PRAN Status");
        Assert.assertEquals(pranStatus.getText(), pranstatus);
        String pranNo = getText(pranNumber, "PRAN Number: ");
        utils.log().info("PRAN Number: " + pranNo);
        String acckNo = getText(acknowledgeNo, "Acknowledgement Number: ");
        utils.log().info("Acknowledgement Number: " + acckNo);
    }

    public void verifyPranDetails(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String name = userMap.get(0).get("Name");
        Assert.assertEquals(Name.getText(), name);
        String pran = userMap.get(0).get("PRAN");
        Assert.assertEquals(Pran.getText(), pran);
        String Sector = getText(sector, "Sector");
        Assert.assertEquals(sector.getText(), Sector);
        String investOption = getText(investmentOpt, "Investment Option: ");
        utils.log().info("Investment Option: " + investOption);
    }

    public void enterPranNumber(String pranNuber) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clear(pranInputBx);
            sendKeys(pranInputBx, pranNuber);
            clickDoneIosKeyboard();
        }
        else{
            clear(pranInputBx);
            sendKeys(pranInputBx, pranNuber);
            pressEnter();
        }
    }

    public void closePranStaPopup() {
        click(closePranStaPopup);
    }

    public void clickAbcTec() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(abcTecno);
        } else {
            click(abcTecno);
        }
    }

    public void clickInvestInNps() {
        click(investInNPS);
    }

    public void waitForPaymentScreen() {
        waitForVisibility(homeBtn, 120);
    }

    public void verifyRegiHis() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            verifyText("Tier 1");
            verifyText(getCurrentDat() + " • ");
            verifyText(" Buy");
            verifyText("₹1,057.40");
        } else {
            verifyText("Tier 1 " + getCurrentDat() + " •   Buy ₹10,057.40");
        }
    }

    public void verifyRetireAgeValidation() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            verifyStaticText("Retirement Age must be smaller than 75");
        }
    }

    public void verifyCurrentAgeValidation() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            verifyStaticText("Current Age must be smaller than 65");
        }
    }

    public void runBatchApi() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://s.finprim.com/api/auth/admin/login"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .header("x-tenant-id", "floatr")
                    .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                            "    \"email\": \"amit@floatr.in\",\n" +
                            "    \"password\": \"sbXTnJZ#KyPauq7sa\"\n" +
                            "}"))
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

//            System.out.println("Response Body: " + response.body());
            String[] arr = response.body().split("\"token\":\"");
            String[] responce = arr[1].split("\"}");
            System.out.println(responce[0]);


            HttpRequest request1 = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/nps/batchprocessing"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Authorization", "Bearer  " + responce[0]).build();
//                    .POST(HttpRequest.BodyPublishers.ofString("")).build();

            HttpClient client1 = HttpClient.newBuilder().build();

            HttpResponse<String> resp = client1.send(request1, HttpResponse.BodyHandlers.ofString());
            System.out.println("Floatr API Status Code: " + resp.statusCode());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickShiftMyPran() {
        click(shiftMyPran);
    }

    public void clickIndRadioBtn() {
        click(indRadioBtn);
    }

    public void clickCorRadioBtn() {
        click(corRadioBtn);
    }

    public void enterPopSpCode(String popSpCd) throws Exception {
        click(popSpCdInBx);
        clear(popSpCdInBx);
        sendKeys(popSpCdInBx, popSpCd);
        clickStaticText("Current POP-SP Code");

    }

    public void enterCboCode(String cboCode) throws Exception {
        click(cboCdInBx);
        clear(cboCdInBx);
        sendKeys(cboCdInBx, cboCode);
        clickStaticText("Current CBO Code");
    }

    public void enterPranNum(String pranNum) throws Exception {
        click(pranNumInBx);
        clear(pranNumInBx);
        sendKeys(pranNumInBx, pranNum);
        clickStaticText("PRAN Number");

    }

    public void renameSubscriberName(String subscriberName) throws Exception {
        click(renameSubscriberName);
        clear(renameSubscriberName);
        clickStaticText("PRAN Number");
        click(renameSubscriberName);
        sendKeys(renameSubscriberName, subscriberName);
        clickStaticText("PRAN Number");

    }

    public void enterOTPForPranShift() {
        String text = pranShiftOtp.getText();
        String[] str = text.split("Enter OTP to Confirm ");
        String pranOTP = str[1];
        sendKeys(pranShiftOtp1, valueOf(pranOTP.charAt(0)));
        sendKeys(pranShiftOtp2, valueOf(pranOTP.charAt(1)));
        sendKeys(pranShiftOtp3, valueOf(pranOTP.charAt(2)));
        sendKeys(pranShiftOtp4, valueOf(pranOTP.charAt(3)));
    }

    public void enterWrongOTPForPranShift() {
        sendKeys(pranShiftOtp1, "1");
        sendKeys(pranShiftOtp2, "2");
        sendKeys(pranShiftOtp3, "3");
        sendKeys(pranShiftOtp4, "4");
    }

    public void clickInformationIcon() {
        click(informationIcon);
    }

    public void clickOnPoint(int xPoint, int yPoint) {
        clickOnAPoint(xPoint, yPoint);
    }

    public void scrollToScemeG() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "HDFC Pension Management Company Limited Scheme G - Tier I");
        } else {
            iOSScrollToElementByName(scemeGTire, "up", "HDFC Pension Management Company Limited Scheme G - Tier I");
        }
    }

    public void verifyRegiIncreaseAmt() {
        String increaseAmt = increaseRegiAmt.getText();
        if (increaseAmt.contains("600")) {
            assertTrue(increaseAmt.contains("600"));
        } else if (increaseAmt.contains("600.1")) {
            assertTrue(increaseAmt.contains("600.1"));
        } else if (increaseAmt.contains("600.2")) {
            assertTrue(increaseAmt.contains("600.2"));
        } else if (increaseAmt.contains("600.3")) {
            assertTrue(increaseAmt.contains("600.3"));
        } else if (increaseAmt.contains("600.4")) {
            assertTrue(increaseAmt.contains("600.4"));
        }

        getText(increaseRegiAmt, "Registration amount of this register: " + increaseAmt);
    }

    public void downloadNpsTran() throws Exception {
        click(downloadLink);
        click(fromBxNpsStat);
        click(backBtnCal);
        clickByText("1");
        clickByText("OK");
        clickByText("Download");
        verifyStaticText("This field is required");
        clickByText("Tier-1");
        clickByText("Download");
        Thread.sleep(5000);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            clickByText("Just once");
        }
//        click(doneBtnNpsSt);
    }

    public void clickDoneBtnNpsRecipt() {
        click(doneBtnNpsSt);
    }

    public void enterFullNameInPranShi(String name) throws Exception {
        click(fullNmaeInPranShi);
        sendKeys(fullNmaeInPranShi, name);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            clickDoneIosKeyboard();
        }
        else{
            pressEnter();
        }
    }

    public void clickInfoIcon() {
        click(infoIcon);
    }

    public void closeMyPranSc() {
        if(Objects.equals(globalParams.getPlatformName(),"Android")) {
            click(closeMyPranDet);
        }
        else{
            tapOn(186,138);
        }
    }

    public void enterOTP() throws Exception {
        new MutualFundPage().enterPurchaseOtp();
    }

    public void clickOnCreateNpsAcc() {
        click(createNpsAcc);
    }
    public void verifyAutoCh() {
        click(autoChoice);
    }
    public void enterCorporateEmail(String email) {
        sendKeys(corporateMail,email);
    }
//    public void selectPortfolioOpt(String portOpt) throws Exception {
//        click(portfolioOpt);
//        clickByText(portOpt);
//    }
}
