package com.qa.adminpages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class ManageAdminPage extends WebBasePage {
    WebBasePage basePage = new WebBasePage();
    TestUtils utils = new TestUtils();
    @FindBy(xpath = "//a[@id='transaction_history']")
    private WebElement amcs;
    @FindBy(xpath = "//img[@id='logofile']")
    private WebElement fileUpload;
    @FindBy(xpath = "//a[contains(span, 'Users')]")
    private WebElement User;
    @FindBy(id = "kycmodule")
    private WebElement User_KYC;
    public void isDisplayPageTitle(String PgTitle) throws InterruptedException {
        Assert.assertEquals(PgTitle, basePage.getPageTitle());
    }

    public void clickAmcs() {
        click(amcs);
    }

    public void fileUpload() throws IOException, InterruptedException {
        click(fileUpload);
        Thread.sleep(3000);
        Runtime.getRuntime().exec("/Users/litanbehera/Downloads/amclogo.png");
    }

    public void Click_Users() throws InterruptedException {
       Thread.sleep(8000);
        click(User);
    }

    public void Click_KYC(){
        click(User_KYC);
    }

}
