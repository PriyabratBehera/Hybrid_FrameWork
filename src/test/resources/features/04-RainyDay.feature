#@Regression @RainyDaysRegression
Feature: Rainy Day Scenario

  Scenario: Verify rainy day banner is functional in home screen
    Given user login with user "9123789980 | 9123789980"
    And application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    Then user verify static text "Planning for Rainy Day"
    And user verify partial static text "Rainy Day Funds will take care"

  @Validation @RainyDaysValidation
  Scenario: Verify validation when user enter monthly expenses
#    Given user login with user "9123789980 | 9123789980"
    And application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user wait for "5000" milli second
    When user enter monthly expenses amount as "9999"
    And user click static text "My monthly expenses"
    And user click by text "Continue"
    Then verify validation error "Minimum amount should be ₹10,000"
    When user enter monthly expenses amount as "100000000"
    And user click static text "My monthly expenses"
    And user click by text "Continue"
    Then verify validation error "Maximum amount should be ₹99,99,999"
    When user go back from "Household Expenses" screen
    Then user verify static text "Planning for Rainy Day"

  @Validation @RainyDaysValidation
  Scenario: Verify validation when user enter total emi amount in a month
    Given application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹25,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user click by text "₹5,000"
    And user click by text "Continue"
    And user click by text "₹90,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user enter rainy day saving amount as "999"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    Then verify validation error "Minimum amount should be ₹1000"
    And user enter rainy day saving amount as "qwe"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    Then verify validation error "Invalid deposit amount"
    And user enter rainy day saving amount as "100000000"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    Then verify validation error "Maximum amount should be ₹1.80 L"
    When user go back from "Plan Rainy Day Savings" screen
    Then user verify static text "Recommended Savings"

  Scenario: Verify user invest in rainy day fund without having emi
    Given application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹20,000"
    And user click by text "Continue"
    When user click by text "No"
    And user click by text "₹60,000"
    And user click by text "Continue"
    When user click by text "No"
    And user click by text "Continue"
    Then user verify static text "₹60,000"
    When user click by text "6 months"
    Then user verify static text "₹9,800 monthly"
    When user click by text "1 year"
    And user verify static text "₹4,800 monthly"
    And user click by text "1st"
    When user click by text "Start Investment"
    And user wait for "3000" milli second
    And user click on I  We have read the related Scheme Document of the selected fund before investing check box
    When user click by text "Save Investment Plan"
    And user click by text contains "ICIC"
    And user wait for "20000" milli second
    And user do payment
    And user wait for "20000" milli second
    And user enter otp for investment Goal
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    And user verify static text "SIP Created Successfully"
    And user verify static text "SIP Status"
    When user verify static text "Success"
#    When user click static text "View SIPs"
#    And user wait for "2000" milli second
#    Then user verify static text "SIP Amount  ₹7,350"

#  @Smoke @RainyDaysSmoke
  Scenario: Verify user invest in rainy day fund having emi
#    Given user login with user "9123789980 | 9123789980"
    And user wait for "20000" milli second
    And application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹25,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user click by text "₹5,000"
    And user click by text "Continue"
    And user click by text "₹1,20,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user enter rainy day saving amount as "1000"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
#    And user verify static text "₹89,000"
    When user click by text "1 year"
#    And user verify static text "₹7,200 monthly"
    And user wait for "8000" milli second
    And user scroll to view twentyEight
    And user click by text "20th"
    When user click by text "Start Investment"
    And user click on I  We have read the related Scheme Document of the selected fund before investing check box
    When user click by text "Save Investment Plan"
    And user click by text contains "ICIC"
    And user wait for "20000" milli second
    And user do payment
    And user wait for "20000" milli second
    And user enter otp for investment Goal
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    And user verify static text "SIP Created Successfully"
    And user verify static text "SIP Status"
    When user click static text "View SIPs"
    Then user verify static text "SIP Amount  ₹4,800"

  Scenario: Verify the congratulation massage when user enter existing saving amount more than fund amount
    Given application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹25,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user click by text "₹5,000"
    And user click by text "Continue"
    And user click by text "₹90,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user enter rainy day saving amount as "100000"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    Then user verify static text "Congratulations!"

  @Validation @RainyDaysValidation
  Scenario: Verify the validation when user invest after getting you are well prepared massage
    Given application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹25,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user click by text "₹5,000"
    And user click by text "Continue"
    And user click by text "₹90,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user enter rainy day saving amount as "100000"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    Then user verify static text "Congratulations!"
    And user click by text "Yes"
    And user further invest as "3000"
    And user click static text "I want to invest now"
    And user click by text "Continue"
    And verify validation error "Minimum amount should be ₹5,000"
    And user further invest as "100000000"
    And user click static text "I want to invest now"
    And user click by text "Continue"
    And verify validation error "Maximum amount should be ₹24.00 L"
    When user click by text "No"
    And user click by text "Home"
    Then user verify partial static text "Hello"

#  @Smoke @RainyDaysSmoke
  Scenario: Verify the user invest after getting You are well prepared for your rainy days
    Given application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹25,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user click by text "₹5,000"
    And user click by text "Continue"
    And user click by text "₹90,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user enter rainy day saving amount as "100000"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    Then user verify static text "Congratulations!"
    And user click by text "Yes"
    And user further invest as "10000"
    And user click static text "I want to invest now"
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user select schemes in rainy day saving screen
    And user scroll to I we have read the related schemes
    And user click on I  We have read the related Scheme Document of the selected fund before investing check box
    And user click by text "Pay Now"
    And user wait for "5000" milli second
    And user enter otp for investment Goal
    And user click by text "Confirm Order"
    And user wait for "8000" milli second
    And user do payment
    And user wait for "8000" milli second
    And user verify static text "Order Submitted"


  Scenario: Verify UI of create monthly investment screen
    Given application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹25,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user click by text "₹5,000"
    And user click by text "Continue"
    And user click by text "₹90,000"
    And user click by text "Continue"
    When user click by text "Yes"
    And user enter rainy day saving amount as "1000"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    When user click by text "1 year"
    And user verify static text "₹7,200 monthly"
    And user scroll to view twentyEight
    And user click by text "20th"
    When user click by text "Start Investment"
    Then user verify static text "Create Monthly Investment"
    And user verify static text "Goal Amount"
    And user verify static text "Time to achieve the goal"
    And user verify static text "Total Monthly investment"
    And user verify static text "Investment Date"
    And user verify static text "Schemes to invest"
    And user click by text "Scheme Detail"
    And user wait for "2000" milli second
    And user verify static text "Scheme Detail"
    And user go back from "Scheme Detail" screen
    And user verify static text "Schemes to invest"

  @Validation @RainyDaysValidation
  Scenario: Verify user can not invest monthly less than 3000
    Given application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    When user enter monthly expenses amount as "1000"
    And user click static text "My monthly expenses"
    And user click by text "Continue"
    Then verify validation error "Minimum amount should be ₹10,000"
    And user go back from household expenses screen
    And user click by text "Get Started"
    When user enter monthly expenses amount as "150000000"
    And user click static text "My monthly expenses"
    And user click by text "Continue"
    Then verify validation error "Maximum amount should be ₹99,99,999"
    And user click by text "₹25,000"
    And user click by text "Continue"
    And user click by text "No"
    And user click by text "₹1,00,000"
    When user click by text "Continue"
    When user click by text "No"
    And user click by text "Continue"
    When user click by text "3 years"
    And user click by text "2nd"
    When user click by text "Start Investment"
    Then user verify partial static text "Minimum monthly investment required"
    And user click static text "Do you want to continue?"
    And user clicks on Cancel button
    And user click by text "Start Investment"
    When user clicks on continue button
    And user verify static text "Create Monthly Investment"
    And user verify static text "₹3,000"

  @Validation @RainyDaysValidation
  Scenario: Verify user invest goal amount without KYC
    Given user login with user "9191787806 | 9191787806"
    And application launched successfully
    And user wait for "3000" milli second
    And user click on rainy day on home screen
    And user click by text "Get Started"
    And user click by text "₹20,000"
    And user click by text "Continue"
    And user click by text "Yes"
    And user click by text "₹5,000"
    When user click by text "Continue"
    And user click by text "₹75,000"
    When user click by text "Continue"
    When user click by text "Yes"
    And user enter rainy day saving amount as "1000"
    And user click partial static text "I have an existing savings"
    And user click by text "Continue"
    And user verify static text "Plan Rainy Day Savings"
    And user verify static text "Rainy Day Savings Goal"
    And user verify static text "I wish to achieve this goal in"
    When user click by text "6 months"
    And user click by text "1st"
    When user click by text "Start Investment"
    Then user verify static text "Create Monthly Investment"
    And user click on I  We have read the related Scheme Document of the selected fund before investing check box
    When user click by text "Save Investment Plan"
    Then user verify partial static text "You have not completed"
    When user click Complete KYC
    Then user verify static text "KYC"
    And user verify static text "Onboarding Process:"

