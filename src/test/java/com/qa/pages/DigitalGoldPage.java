

package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.datatable.DataTable;
import org.testng.Assert;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DigitalGoldPage extends ProfilePage {

    TestUtils utils = new TestUtils();
    GlobalParams params = new GlobalParams();
    String TotalAmount=" ";

    @AndroidFindBy(xpath = "//*[@text='24K Gold\n" +
            "& Silver']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"24K Gold\n" +
            "& Silver\"]")
    private MobileElement digitalGold;

    @AndroidFindBy(xpath = "//*[@text='Personal Financial Planners']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personal Financial Planners\"]")
    private MobileElement personalFinancialPlanners;

    @AndroidFindBy(xpath = "//*[@text='Goal Based Investing']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Goal Based Investing\"]")
    private MobileElement goalBasedInvesting;

    @AndroidFindBy(xpath = "//*[@text='Set Financial Goals']")
    private MobileElement setFinancialGoal;

    @AndroidFindBy(xpath = "//*[@text='Buy in grams']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Buy in grams']")
    private MobileElement buyInGrams;
    @AndroidFindBy(xpath = "//*[@text='Sell in Grams']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Sell in Grams']")
    private MobileElement sellInGrams;

    @AndroidFindBy(xpath = "//*[@text='Sell in ₹']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Sell in ₹']")
    private MobileElement sellIn;

    @AndroidFindBy(xpath = "//*[@text='Buy in rupees']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Buy in rupees']")
    private MobileElement buyInRupees;

    @AndroidFindBy(xpath = "//*[@text='Netbanking ...']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingAllBanks;

    @AndroidFindBy(xpath = "//*[@text='Netbanking']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingAllBanks1;

    @AndroidFindBy(xpath = "//*[@text='Netbanking - ICICI Bank']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Netbanking - ICICI Bank\"]")
    private MobileElement netBankingIccBank;
    @AndroidFindBy(xpath = "//*[contains(@text, 'ICICI')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'ICICI'")
    private MobileElement ICICI;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Pay Now')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Pay Now'")
    private MobileElement payNow;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Success')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Success'")
    private MobileElement success;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Min. ₹51']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Min. ₹51')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement enterWeight;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Min. ₹51']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Min. ₹51')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement enterValue;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Receiver's State\"]/following-sibling::XCUIElementTypeOther//XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Receiver's State\"]//following-sibling::android.view.ViewGroup[1]")
    private MobileElement state;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'District')]/following-sibling::XCUIElementTypeOther//XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[contains(@text,'District')]//following-sibling::android.view.ViewGroup[1]")
    private MobileElement district;

    @AndroidFindBy(xpath = "//*[contains(@text,'Name Your Financial Goal')]//following-sibling::android.view.ViewGroup[1]/descendant::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Name Your Financial Goal']//following-sibling::XCUIElementTypeOther")
    private MobileElement financialGoal;

    @AndroidFindBy(xpath = "//*[@text='Area PIN Code']//following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Area PIN Code']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement pinCode;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Full Name']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Full Name')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement fullName;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Receiver Mobile Number']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Receiver Mobile Number']/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement mobileNumber;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Area Pin Code']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Area Pin Code')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement areaPINCode;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Sell Price')]/preceding-sibling::android.widget.EditText[1]")
    private MobileElement sendGiftOTP;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Sell Price')]/preceding-sibling::android.widget.EditText[2]")
    private MobileElement sendGiftOTP2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[3]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Sell Price')]/preceding-sibling::android.widget.EditText[3]")
    private MobileElement sendGiftOTP3;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[4]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Sell Price')]/preceding-sibling::android.widget.EditText[4]")
    private MobileElement sendGiftOTP4;

    @AndroidFindBy(xpath = "//*[contains(@text,'Verification Code')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Verification Code')]")
    private MobileElement sellGoldOTPText;

    @AndroidFindBy(xpath = "//*[contains(@text,'ICIC')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='ICIC XXXX 4743']")
    private MobileElement accountReceivingMoneys;

    @AndroidFindBy(xpath = "//*[contains(@text,'Move to')]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Move to']//following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[3]")
    private MobileElement moveTo;

    @AndroidFindBy(xpath = "//*[@text='Email ID']//following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Email ID']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement emailFirstTimeInvestor;

    @AndroidFindBy(xpath = "//*[contains(@text,'How do you want to authorise')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='How do you want to authorise']")
    private MobileElement authorise;

    @AndroidFindBy(xpath = "//*[contains(@text,'Investment Amount')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment Amount']")
    private MobileElement investAmount;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Account for Receiving')]")
    private MobileElement accountFor;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Gift in Grams']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Gift in Grams')]")
    private MobileElement giftInGrams;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Gift in ₹']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Gift in ₹')]")
    private MobileElement giftIn₹;

    @AndroidFindBy(xpath = "//*[contains(@text,'Bank Account for')]/following-sibling::android.view.ViewGroup[1]//android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Select Account']")
    private MobileElement accountForArrow;

    @AndroidFindBy(xpath = "//*[contains(@text,'Transaction Type')]/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Transaction Type']//following-sibling::XCUIElementTypeOther")
    private MobileElement selectTransactionType;

    @AndroidFindBy(xpath = "//*[contains(@text,'Portfolio')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Portfolio']//following-sibling::XCUIElementTypeOther")
    private MobileElement selectPortofolio;

    @AndroidFindBy(xpath = "(//*[contains(@text,'Financial Goal to Debit')]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Financial Goal to Debit']//following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    private MobileElement selectFinancialGoalDebit;

    @AndroidFindBy(xpath = "//*[contains(@text,'SIP Start Date')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SIP Start Date']//following-sibling::XCUIElementTypeOther")
    private MobileElement sipStartDate;

    @AndroidFindBy(xpath = "//*[contains(@text,'SIP Duration')]/following-sibling::android.view.ViewGroup[2]//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SIP Duration']//following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement sipDuration;

    @AndroidFindBy(xpath = "//*[@text='Investment amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement investmentAmount;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Weekly']")
    @AndroidFindBy(xpath = "//*[@text='Weekly']")
    private MobileElement weeklySIP;

    @AndroidFindBy(xpath = "//*[@text='My Systematic Plan (SIP)']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='My Systematic Plan (SIP)'])[2]/XCUIElementTypeOther")
    private MobileElement arrowAgainstMySystematicPlan;

    @AndroidFindBy(xpath = "//*[@text='SHORT TERM SAVING']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SHORT TERM SAVING']/ancestor::XCUIElementTypeOther[4]/child::XCUIElementTypeOther[5]")
    private MobileElement investForJewellery;

    @AndroidFindBy(xpath = "//*[@text='My Systematic Plan (SIP)']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'My Systematic Plan (SIP)')]")
    private MobileElement mySystematicPlan;

    @AndroidFindBy(xpath = "//*[@text='View']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='View']")
    private MobileElement viewInTransactionHistory;

    @AndroidFindBy(xpath = "//*[@text='Your Products']//following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Products']//following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[7]/child::XCUIElementTypeOther[1]")
    private MobileElement removeCoinFromAddToCart;

    @AndroidFindBy(xpath = "//*[@text='Your Products']//following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[3]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Products']//following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[7]/child::XCUIElementTypeStaticText")
    private MobileElement numberOfCoinsInCartSummaryScreen;

    @AndroidFindBy(xpath = "//*[@text='Mission 1 Crore']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Mission 1 Crore']")
    private MobileElement mission1Crore;

    @AndroidFindBy(xpath = "//*[@text='Liquid FundsGoal 123']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Liquid FundsGoal 123']")
    private MobileElement liquidFundsGoal123;

    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Unplanned\"])[2]")
    private MobileElement unplanned;

    @AndroidFindBy(xpath = "//*[@text='Wealth']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Wealth\"])[8]")
    private MobileElement wealth;

    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select All']")
    private MobileElement selectAll;

    @AndroidFindBy(xpath = "//*[@text='Unplanned']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Cut']")
    private MobileElement cut;

    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Done'")
    private MobileElement done;

    @AndroidFindBy(xpath = "//*[@text='Buyer Details']/following-sibling::android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement buyerName;

    @AndroidFindBy(xpath = "//*[@text='Your Cart is Empty']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Cart is Empty']")
    private MobileElement cartIsEmpty;

    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Simulate Success']")
    private MobileElement simulateSuccess;

    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[1]")
    private MobileElement transactionfor;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[2]")
    private MobileElement transactionamount;
    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"24K Silver\"])[1]")
    private MobileElement sipfor;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[3]")
    private MobileElement transactiontype;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[4]")
    private MobileElement transactionamount1;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[2]")
    private MobileElement transactiondate;
    @AndroidFindBy(xpath = "//*[@text='In process']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement transactionstatus;
    @AndroidFindBy(xpath = "(//*[@text='Add New']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup/android.widget.TextView)[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add New\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[2]")
    private MobileElement editBtnShippingAdd;

    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Locker\n" +
            "(Sell & Gift)\"]")
    private MobileElement lockerShellGift;

    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Floatr offers gold & silver\")]")
    private MobileElement faqSection;
    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"104% Extraaaa with\n" +
            "weekly SIP\"]")
    private MobileElement hundredFourPerExtra;
    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "24% Extraaaa with\n" +
            "monthly SIP")
    private MobileElement twentyFourExtra;
    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"When is extra\n" +
            "amount credited\"]")
    private MobileElement whenIsExtra;
    @AndroidFindBy(xpath = "//*[@text='State']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement stateInShippAdd;
    @AndroidFindBy(xpath = "//*[@text='District / City']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement districtInShippAdd;
    @AndroidFindBy(xpath = "//*[@text='Area PIN Code']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement areaPinCodeShippAdd;
    @AndroidFindBy(xpath = "//*[@text='Shipping Address']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement shippSdd;


    @AndroidFindBy(xpath = "//*[@text='My Portfolio']/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Portfolio\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement onePortFo;


@AndroidFindBy(xpath = "//*[@text='Shipping Address']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bike\"]")
private MobileElement bikeGoal;
    @AndroidFindBy(xpath = "//*[@text='Shipping Address']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SIP Start Date']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement monthlySIPDate;
    @AndroidFindBy(xpath = "//*[@text='Shipping Address']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment amount\"]/parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther")
    private MobileElement monthlyInv;

    @AndroidFindBy(xpath = "//*[@text='Name your financial goal']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Name your financial goal']//following-sibling::XCUIElementTypeOther")
    private MobileElement selectFiGoBx;
    @AndroidFindBy(xpath = "//*[@text='Total Amount']/following-sibling::android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Total Amount\"]/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement totalAmount;
    @AndroidFindBy(xpath = "(//*[contains(@text,'Wealth')])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Total Amount\"]/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement wealthGoal;

    @AndroidFindBy(xpath = "(//*[@text='View'])[1]/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"View\"])[1]/preceding-sibling::XCUIElementTypeStaticText")
    private MobileElement amountInHisPage;

    public void clickEllipsisGoal(String goalType) throws Exception {
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[@name='" + goalType + "'])[1]/descendant::XCUIElementTypeOther[5]";
        } else {
            xpath = "//*[contains(@text,'" + goalType + "')]/following-sibling::android.view.ViewGroup[1]";
        }
        click(getElement(xpath));
    }

    public void clickSIPStartDate() {
        click(sipStartDate);
    }

    public void clickNetBanking() {
        if (isVisible(netBankingAllBanks)){
            click(netBankingAllBanks);
    }
        else{
            click(netBankingAllBanks1);
        }
    }

    public void clickICICI() {
        if (isVisible(ICICI)) {
            click(ICICI);
        }
    }

    public void clickPayNow() {
        click(payNow);
    }

    public void clickSuccess() {
        click(success);
    }

    public void clickFinancialGoalToDebit() {
        click(selectFinancialGoalDebit);
    }

    public void scrollToLiquidFundsGoalInFinancialGoalToDebitBox() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS") && !isVisible(liquidFundsGoal123)) {
            iOSScrollToElementByName(liquidFundsGoal123, "down", "Liquid FundsGoal 123");
        } else {
            while (!isVisible(liquidFundsGoal123)) {
                new BasePage().scrollToElement(liquidFundsGoal123, "up", mission1Crore);
            }
        }
    }

    public void scrollToUnplannedInFinancialGoalToDebitBox() throws Exception {
       click(bikeGoal);
    }

    public void scrollDown() throws InterruptedException {
        swipe(175, 887, 183, 780, 100);
    }

    public void clickDigitalGold() {
        if (! isVisible(digitalGold)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "24K Gold\n" +
                        "& Silver");
            } else {
                iOSScrollToElementByName(digitalGold, "up", "24K Gold\n" +
                        "& Silver");
            }
        }
        click(digitalGold);
    }


    public void enterWeight(String weight) {
        clear(enterWeight);
        sendKeys(enterWeight, weight);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void setSipDuration(String duration) {
        clear(sipDuration);
        sendKeys(sipDuration, duration);
    }

    public void setInvestmentAmount(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void enterPINCode(String pINCode) {
        clear(pinCode);
        sendKeys(pinCode, pINCode);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void selectState(String states) throws Exception {
        click(state);
        Thread.sleep(2000);
        new BasePage().clickByText(states);
    }

    public void selectDistrict(String districts) throws Exception {
        Thread.sleep(3000);
        click(district);
        Thread.sleep(2000);
        new BasePage().clickByText(districts);
    }

    public void enterValue(String value) {
        clear(enterValue);
        sendKeys(enterValue, value);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void clickFinancialGoal() {
        click(financialGoal);
    }

    public void enterFullName(String fullNames) {
        sendKeys(fullName, fullNames);
    }

    public void enterMobileNumber(String mobileNumbers) {
        clear(mobileNumber);
        sendKeys(mobileNumber, mobileNumbers);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new HomePage().clickDone();
        }
    }

    public void enterAreaPINCode(String pinCode) throws Exception {
        clear(areaPINCode);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            if (isVisible(done)) {
                new HomePage().clickDone();
            } else {
                clickStaticText("State");
            }
            sendKeys(areaPINCode, pinCode);
            if (Objects.equals(params.getPlatformName(), "iOS")) {
                if (isVisible(done)) {
                    new HomePage().clickDone();
                } else {
                    clickStaticText("State");
                }
            }
        }
    }

    public void changeTheIntervalFor(String mobileNumber) {
        String[] mobNo = mobileNumber.split(" ");
        if (Objects.equals(params.getPlatformName(), "Android")) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{  \"type\" : \"changeinterval\",\n" +
//                        "    \"contact\": \"9585034203\",\n" +
                            "    \"contact\": \"" + mobNo[0] + "\",\n" +
                            "    \"account_type\": \"Personal\"\n" +
                            "}"))
                    .build();
            HttpClient client = HttpClient.newBuilder().build();
            try {
                HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{  \"type\" : \"changeinterval\",\n" +
                            "    \"contact\": \"" + mobNo[2] + "\",\n" +
                            "    \"account_type\": \"Personal\"\n" +
                            "}"))
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

    public void enterOTPSellGold() {
        String otp = sellGoldOTPText.getText().split("Verification Code")[1].trim();
        sendKeys(sendGiftOTP, otp);
//        sendKeys(sendGiftOTP2, String.valueOf(otp.charAt(1)));
//        sendKeys(sendGiftOTP3, String.valueOf(otp.charAt(2)));
//        sendKeys(sendGiftOTP4, String.valueOf(otp.charAt(3)));
    }

    public void clickMoveTo() {
        click(moveTo);
    }

    public void clickTransactionType() {
        click(selectTransactionType);
    }

    public void clickPortfolio() {
        click(selectPortofolio);
    }

    public void enterEmailFirstTimeInvestor(String email) throws Exception {
        clear(emailFirstTimeInvestor);
        sendKeys(emailFirstTimeInvestor, email);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDoneIosKeyboard();
        }
    }

    public void ScrollToAccountFor() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            iOSScrollToElementByName(accountFor, "down", "Select");
        } else {
            scrollToElement(accountFor, "up", accountFor);
            scrollToElement(sellInGrams, "up", accountFor);
        }
    }

    public void ScrollToViewGold() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            if (!isVisible(digitalGold)) {
                iOSScrollToElementByName(goalBasedInvesting, "down", "Goal Based Investing");
//                new TouchAction(new DriverManager().getDriver()).longPress(PointOption.point(204, 793)).moveTo(PointOption.point(201, 252)).release().perform();
            }
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
            if (!isVisible(digitalGold)) {
//                scrollElement(goalBasedInvesting, "up", setFinancialGoal);
                new TouchAction(new DriverManager().getDriver()).longPress(PointOption.point(204, 793)).moveTo(PointOption.point(201, 252)).release().perform();

            }
        }
    }

    public void clickBuyInGrams() {
        click(buyInGrams);
    }

    public void clickBuyInRupees() {
        click(buyInRupees);
    }

    public void selectAccountFor() throws Exception {
        click(accountForArrow);
        new BasePage().clickByTextContains("ICIC");
    }

    public void clickView() throws Exception {
        new BasePage().click(viewInTransactionHistory);
    }

    public void clickSellInGrams() {
        click(sellInGrams);
    }

    public void clickSellIn() {
        click(sellIn);
    }

    public void clickAmountReceivingMoney() throws Exception {
        click(accountReceivingMoneys);
        new BasePage().clickByTextContains("ICIC");

    }

    public void clickGiftInGrams() {
        click(giftInGrams);
    }

    public void clickGiftInRS() {
        click(giftIn₹);
    }

    public void scrollToThroughNetBanking() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
//            scrollInAndroid(investAmount, 204, 793, 201, 252);
            andScrollToElementUsingUiScrollable("text","Investment Amount");

        } else {
//            new BasePage().scrollToElement(investAmount, "up", authorise);
            iOSScrollToElementByName(investAmount,"up","Investment Amount");
        }
    }

    public void clickMutualGoal(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text, '" + text + "')]";
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name, '" + text + "')])[last()]";
        }
        getElement(xpath).click();
    }

    public void click(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text, '" + text + "')]";
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name, '" + text + "')])[last()]";
        }
        getElement(xpath).click();
    }

    public void clickWeeklySIP() {
        click(weeklySIP);
    }

    public void clickArrowIconForSystematicPlan() {
        click(arrowAgainstMySystematicPlan);
    }

    public void clickOnInvestForJewellery() {
        click(investForJewellery);
    }

    public void scrollToJewellery() throws Exception {

//
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            andIosScroll(investForJewellery, "up", mySystematicPlan);
        }
        else{
            new BasePage().scrollToElement(investForJewellery, "up", mySystematicPlan);
        }
    }

    public void clickRemoveButton() throws Exception {
        if (isVisible(cartIsEmpty)) {
            new MutualFundPage().goBackFromScreen("Cart Summary");
        } else {
            String numberOfCoins = new BasePage().getText(numberOfCoinsInCartSummaryScreen, "number of coins in ad to cart is : ");
            int nocOfCoins = Integer.parseInt(numberOfCoins);
            while (isVisible(removeCoinFromAddToCart)) {
                for (int i = 0; i < nocOfCoins + 1; i++) {
                    clickIfExist(removeCoinFromAddToCart);
                }
            }
            new MutualFundPage().goBackFromScreen("Cart Summary");
        }
    }

    public boolean verifyBuyerName() {
        return isVisible(buyerName);
    }

    public void clickSimulateSuccess() {
        click(simulateSuccess);
    }
    public String verifyTransactionSta() throws Exception {
        clickByText("View");
        return transactionstatus.getText();
    }
    public void reeditShippingAdd() throws Exception {
        click(editBtnShippingAdd);
        click(stateInShippAdd);
        clickStaticText("Andaman and Nicobar");
        click(districtInShippAdd);
        clickStaticText("Nicobar");
        clear(areaPinCodeShippAdd);
        sendKeys(areaPinCodeShippAdd,"500084");
        clickStaticText("Area PIN Code");


    }
    public void editShippingAdd() throws Exception {
        click(editBtnShippingAdd);
        click(stateInShippAdd);
        clickStaticText("Andhra Pradesh");
        click(districtInShippAdd);
        clickStaticText("Anantapur");
        clear(areaPinCodeShippAdd);
        sendKeys(areaPinCodeShippAdd,"943476");
        clickStaticText("Area PIN Code");

    }
    public void verifyGoldOrderHis(DataTable dataTable) throws Exception {
        Thread.sleep(10000);
        List<Map<String,String>> userMap=dataTable.asMaps(String.class,String.class);
        String transactionFor=userMap.get(0).get("TransactionFor");
        Assert.assertEquals(transactionfor.getText(),transactionFor+" ");
        String transactionType=userMap.get(0).get("TransactionType");
        Assert.assertEquals(transactiontype.getText(),transactionType);
//        String transactionAmount=userMap.get(0).get("TransactionAmount");
//        Assert.assertEquals(transactionamount.getText(),transactionAmount);
        String transactionDate=transactiondate.getText();
        Assert.assertEquals(transactionDate,getCurrentDate());
        String transactionStatus=userMap.get(0).get("TransactionStatus");
        Assert.assertEquals(transactionStatus,verifyTransactionSta());
    }
    public void verifyGoldBuyHis(DataTable dataTable) throws Exception {
//        Thread.sleep(10000);
        List<Map<String,String>> userMap=dataTable.asMaps(String.class,String.class);
        String transactionFor=userMap.get(0).get("TransactionFor");
        Assert.assertEquals(transactionfor.getText(),transactionFor+" ");
        String transactionType=userMap.get(0).get("TransactionType");
        Assert.assertEquals(transactiontype.getText(),transactionType);
//        String transactionAmount=userMap.get(0).get("TransactionAmount");
//        System.out.println(amountInHisPage.getText());
//        System.out.println(TotalAmount);
//        Assert.assertEquals(TotalAmount,amountInHisPage.getText());
        String transactionDate=transactiondate.getText();
        Assert.assertEquals(transactionDate,getCurrentDate());

    }
    public void verifyGoldGiftHis(DataTable dataTable) throws Exception {
        Thread.sleep(10000);
        List<Map<String,String>> userMap=dataTable.asMaps(String.class,String.class);
        String transactionFor=userMap.get(0).get("TransactionAmount");
        Assert.assertEquals(transactionamount1.getText(),transactionFor);
        String transactionType=userMap.get(0).get("TransactionType");
        Assert.assertEquals(transactiontype.getText(),transactionType);
//        String transactionAmount=userMap.get(0).get("TransactionAmount");
//        Assert.assertEquals(transactionamount.getText(),transactionAmount);
        String transactionDate=transactiondate.getText();
        Assert.assertEquals(transactionDate,getCurrentDate());

    }
    public void scrollFaqSec() throws Exception {
        scrollToElement(faqSection,"up",lockerShellGift,3000,10);
    }
    public void scrollTwentyFourExtra() throws Exception {
        scrollToElement(twentyFourExtra,"up",hundredFourPerExtra,3000,10);
    }
    public void scrollWhenIsExtra() throws Exception {
        scrollToElement(whenIsExtra,"up",twentyFourExtra,3000,10);
    }

    public void clickOnePortFo()  {
        click(onePortFo);
    }
    public void selectMonthlySIPDate(String str) throws Exception {
        click(monthlySIPDate);
        clickByText(str);
        clickByText("Confirm");
    }
    public void enterMonthlyInv(String str) {
        sendKeys(monthlyInv,str);
    }
    public void selectFinancialGoalDi(String text) throws Exception {
        click(selectFiGoBx);
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text, '" + text + "')]";
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name, '" + text + "')])[last()]";
        }
        getElement(xpath).click();
    }
    public void seeTotalAmount() throws InterruptedException {
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            TotalAmount=totalAmount.getAttribute("text");
        }

    }
    public void clickOnWealthGoal(){
        click(wealthGoal);
    }
}
