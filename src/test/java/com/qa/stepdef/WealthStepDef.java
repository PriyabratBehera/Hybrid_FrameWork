package com.qa.stepdef;

import com.qa.pages.HomePage;
import com.qa.pages.ProfilePage;
import com.qa.pages.WealthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;

public class WealthStepDef {


    @When("^user clicks on Wealth from homepage$")
    public void clickOnWealth(){
        new HomePage().clickOnWealth();
    }

    @When("^click on Digital Gold & Silver in Save & Invest screen$")
    public void clickOnDigitalGoldOrSilverInSaveAndInvestScreen(){
        new WealthPage().clickOnDigitalGoldTile();
    }


    @And("^verify Buy Now button is enabled")
    public void verifyBuyNowIsEnabled(){
        new WealthPage().verifyBuyNowButtonIsEnabled();
    }

    @And("^provide all the required details to buy digital gold")
    public void provideDetailsToBuyDigitalGold(List<Map<String, String>> values){
        for (Map<String, String> value : values) {
            String metal = StringUtils.defaultString(value.get("metal"));
            String gms = StringUtils.defaultString(value.get("gms"));
            new WealthPage().validateUserBuyGoldOrSilver(metal, gms);
        }
    }


}
