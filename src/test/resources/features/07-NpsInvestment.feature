#@Regression @NPSRegression
Feature: NPS Scenario

  @Validation @NPSValidation
  Scenario: User Unable to Register NPS Account Without Completing KYC
    Given user login with user "9191787806 | 9191787806"
    And application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    And user go back from "KYC" screen
    And user click on NPS Investment
    And user click by text "Invest in NPS"
    And user go back from "KYC" screen
    And user click on NPS Investment
    And user click by text "Shift My PRAN"
    And user go back from "KYC" screen
    And user click on NPS Investment

  Scenario: Validate UI Elements on NPS Landing Page
    And application launched successfully
    And user click on NPS Investment
    And user verify static text "Tax Benefits on NPS"
    And user verify static text "Income Tax Saving of upto ₹62,400"
    And user verify static text "Zero Tax on Maturity Amount"
    And user verify static text "Tax Exemption on Employer Contribution"
    When user scroll to view more about NPS
    And user verify partial static text "Floatr (as Valuefloat Technologies) is a PFRDA Registered POPSE"
    And user scroll nps investment video
    And user click the video

  Scenario: Verify Information in "More about NPS" Section
    Given application launched successfully
    Then user click on NPS Investment
    When user scroll to view more about NPS
    And user click by text "More About NPS"
    Then user verify static text "NPS Advantage"
    And user verify static text "How NPS works"
    And user verify static text "Accumulation Phase"
    And user verify static text "Government Sponsored & Regulated"
    And user verify static text "Wide Age Eligibility"
    And user verify static text "Flexibility"
    And user verify static text "Better Returns than Traditional Options"
    And user scroll to tax saving account
    And user verify static text "Unique way to Reduce Risk"
    And user verify static text "Types of NPS Accounts"

  Scenario: Verify Functionality of NPS Account Types - Tier-1 and Tier-2
    Given application launched successfully
    Then user click on NPS Investment
    When user scroll to view more about NPS
    And user click by text "More About NPS"
    And user wait for "2000" milli second
    And user scroll to view auto choice of investment
    And user click by text "Tier - 2"
    Then user verify static text "Investment Account"
    And user verify static text "Available for only Tier-1 account holders"
    And user verify static text "Free to withdraw anytime, no exit load"
    And user verify static text "No minimum balance"
    And user verify static text "Can transfer fund from Tier-2 to Tier-1 account"
    When user click by text "Tier - 1"
    And user verify static text "Tax Saving Account"
    And user verify static text "Tier 1 account mandatory to join NPS"
    And user verify static text "Investment is locked-in until the age of 60."
    And user verify static text "Early withdrawals are conditional."
    And user verify static text "Tax benefits can be claimed."

  Scenario: Verify Functionality of Portfolio Link on NPS Screen
    Given application launched successfully
    Then user click on NPS Investment
    And user scroll to view more about NPS
    When user click by text "More About NPS"
    And user wait for "2000" milli second
    And user scroll to view active choice of investment
    Then user verify static text "Investment in pre-defined portfolio of NPS asset classes"
    And user verify static text "Portfolio risk (i.e. equity exposure) reduces with age"
    And user verify static text "Can choose portfolio based on risk appetite"
    And user verify static text "Portfolio options- Aggressive (LC-75), Moderate (LC-50) and Conservative (LC-25)"
    And user click by text "Portfolio"
    And user verify static text "Auto Investment Choice"
    And user verify static text "Allocation automatically gets adjusted with the age of the subscriber as shown in the chart below:"
    And user verify static text "Life Cycle Fund Type"
    And user verify static text "Age"
    And user verify static text "Equity"
    And user verify static text "Corp. Bonds"
    And user verify static text "Govt. bonds"
    And user verify static text "Upto 35y"
    And user verify static text "36 years"
#    When user select life cycle fund type as moderate LC fifty
#    Then user verify static text "50%"
#    When user select life cycle fund type as conservative LC twentyFive
#    Then user verify static text "25%"
#    When user select life cycle fund type as moderate LC seventyFive
#    And user verify static text "75%"
    When user close the auto choice investment screen
    Then user verify static text "Features"

  Scenario: Verify Functionality of View All Link on NPS Screen
    Given application launched successfully
    And user click on NPS Investment
    And user wait for "5000" milli second
    And user scroll to view more about NPS
    And user click by text "More About NPS"
    And user wait for "3000" milli second
    And user scroll to view exist and withdraw
    Then user verify static text "Exit at Maturity(60 years)"
    And user verify static text "Up to 60% of corpus can be withdrawn Tax-Free"
    And user verify static text "Minimum 40% to be invested in annuity for monthly pension."
    And user verify static text "If corpus ≤ to Rs. 5 lakhs, you can withdraw full amount. Buying annuity is optional."
    And user scroll to exit on death
    And user verify static text "On death 100% of the pension wealth amount will be payable to the nominee of the subscriber"
    And user verify static text "The Nominee/ Legal heir shall have the option to purchase annuities being offered upon exit, if they so desire"
    And user scroll to view nps faq
    And user verify static text "NPS FAQ’s"
    When user click by text "What is NPS?"
    Then user verify partial static text "National Pension System (NPS) is"
    When user click by text "View All"
    Then user verify static text "NPS FAQ’s"
    When user click by text "What is NPS?"
    Then user verify partial static text "National Pension System (NPS) is a voluntary, defined"
    And user click by text "What is NPS?"
    When user click by text "Who can join NPS?"
    Then user verify partial static text "Any individual citizen of India (both resident and Non-resident)"
    And user click by text "Who can join NPS?"
    When user click by text "What is the lockin period in NPS?"
    Then user verify partial static text "Investments done in NPS Tier-1 account has a lockin upto the"
    And user click by text "What is the lockin period in NPS?"
    When user click by text "When does my NPS account mature?"
    Then user verify partial static text "The NPS Tier 1 account matures once you reach the age of 60 "
    And user click by text "When does my NPS account mature?"
    When user click by text "When can I start getting pension?"
    Then user verify partial static text "At the age of 60 years subscribers can close the NPS account"
    And user click by text "When can I start getting pension?"
    When user click by text "What are the investment choices available in NPS?"
    Then user verify partial static text "NPS offers you two approaches to invest in your account:"
    And user click by text "What are the investment choices available in NPS?"
    When user click by text "What is meant by Scheme preference change?"
    Then user verify partial static text "Scheme preference change is the option given to the Non"
    And user click by text "What is meant by Scheme preference change?"
    When user click by text "Can I change my scheme preference?"
    Then user verify partial static text "Yes, you can change scheme preferences twice in a financial "
    And user click by text "Can I change my scheme preference?"
    When user click by text "How do I select the Pension Fund Manager?"
    Then user verify partial static text "Selection of Pension Fund Manager is mandatory while filling up"
    And user click by text "How do I select the Pension Fund Manager?"
    And user scroll to what are the tax benefits in NPS account
    When user click by text "Can I change my Pension Fund Manager?"
    Then user verify partial static text "Yes. You can change your fund manager "
    And user click by text "Can I change my Pension Fund Manager?"
    When user click by text "Where does my money get invested in NPS?"
    Then user verify partial static text "Following assets classes are available for investment under"
    And user click by text "Where does my money get invested in NPS?"
    When user click by text "How are the returns calculated?"
    Then user verify partial static text "The contribution remitted in Subscriber"
    And user click by text "How are the returns calculated?"
    When user click by text "What is Net Asset Value (NAV)?"
    Then user verify partial static text "Net Asset Value is also known as NAV. This is the price of one"
    And user click by text "What is Net Asset Value (NAV)?"
    When user click by text "What is NPS Tier II account?"
    Then user verify partial static text "NPS provides you two types of accounts: Tier I and Tier II"
    And user click by text "What is NPS Tier II account?"
    When user click by text "What are the benefits of Tier II account?"
    Then user verify partial static text "Below are few significant benefits of Tier II NPS Account:"
    And user click by text "What are the benefits of Tier II account?"
    When user click by text "Who can open a Tier II Account?"
    Then user verify partial static text "Subscriber who has an active Tier I account can activate a Tier II"
    And user click by text "Who can open a Tier II Account?"
    When user click by text "Do I need to re-open NPS account when I change my Job or location?"
    Then user verify partial static text "No, there is no need to re-open NPS account when you change"
    And user click by text "Do I need to re-open NPS account when I change my Job or location?"
    When user click by text "What are the tax benefits in NPS account"
    Then user verify partial static text "The account helps you save tax at the time of investment and at"
    And user click by text "What are the tax benefits in NPS account"
    When user go back from "Frequently Asked Questions" screen
    And user click by text "View All"
    And user click by text "Expand All"
    Then user verify partial static text "National Pension System (NPS) is a voluntary, defined"
    And user verify partial static text "The NPS Tier 1 account matures once you reach the age of 60"

  Scenario: Calculate Retirement Plan
    Given application launched successfully
    Then user click on NPS Investment
    And user scroll to view more about NPS
    And user click by text "Plan My Retirement"
    When user click by text "Calculate"
    Then user verify static text "₹6,16,66,458"
    And user verify partial static text "Corpus Needed"
    And user verify static text "How to achieve this goal?"
    And user scroll to my current age is
    And user wait for "4000" milli second
    When user enter monthly retirement income needed as "40"
    And enter current age as "28"
    And enter retirement age as "62"
    And user enter income till age of "87" after retirement
    And user invest at annual interest of "13" till retire
    And user invest at annual interest of "11" post retirement
    And user click by text "Calculate"
    And user wait for "6000" milli second
    Then user verify static text "₹3,50,21,383"
    And user scroll to corpus
    When user go back from "Retirement Planner" screen
    And user click by text "Plan My Retirement"
    When user enter monthly retirement income needed as "50"
    And enter current age as "38"
    And user invest at annual interest of "20" till retire
    And user click by text "Calculate"
    And user wait for "2000" milli second
    Then user verify static text "₹2,68,75,113"

  @Validation @NPSValidation
  Scenario: Validate Retirement Plan Calculation
    And application launched successfully
    Then user click on NPS Investment
    And user scroll to view more about NPS
    And user click by text "Plan My Retirement"
    When enter current age as "15"
    And enter retirement age as "77"
    And user click by text "Calculate"
    Then verify validation error "Current Age must be greater than 18"
    Then user verify Retirement Age must be smaller than seventyFive
    When enter current age as "50"
    And enter retirement age as "45"
    And user click by text "Calculate"
    And verify validation error "Retirement Age must be greater than 50"
    When enter current age as "53"
    And enter retirement age as "55"
    And user click by text "Calculate"
    And verify validation error "Retirement age should be 5 year more than current age"
    When enter current age as "66"
    And enter retirement age as "71"
    And user enter income till age of "74" after retirement
    And user invest at annual interest of "05" till retire
    And user invest at annual interest of "05" post retirement
    And user click by text "Calculate"
    Then verify Current Age must be smaller than sixtyFive
    And verify validation error "Life expectancy should be 5 year more than Retirement Age"
    And verify validation error "Pre-Retirement should be minimum of 6%"
    And verify validation error "Post-Retirement should be minimum of 6%"
    When enter current age as "40"
    And enter retirement age as "50"
    And user enter income till age of "54" after retirement
    And user click by text "Calculate"
    And verify validation error "Life Expectency Age must be greater than 55"

  Scenario: Verify behaviour of ABC Technologies company
    Given user login with user "7009008009 | 7009008009"
    And application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    And user wait for "4000" milli second
    When user click by text "Complete Pending Application"
    And user click on crop details
    Then user verify static text "Personal Detail"
    When user search company name as "ABC Technologies" in company name screen
    And user click ABC Technologies (ABC Tek)
    And user enter employee number as "DE0024"
    And user enter company joining date as "2"
    And user click by text "Continue"
    And user wait for "2000" milli second
    Then user not able to see invest tab
    And user not able to select investment fund manager
    And user verify text "Moderate (LC-50)"
    And user not able to select active choice
    And user not able to select portfolio option
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"
    Then user verify text "Create NPS Account"

  Scenario: Verify behaviour of DEF Technologies company
    Given application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    When user click by text "Complete Pending Application"
    And user click on crop details
    Then user verify static text "Personal Detail"
    When user search company name as "DEF Technologies" in company name screen
    And user click on DEF technologies
    And user enter employee number as "HR9987"
    And user enter company joining date as "2"
    And user click by text "Continue"
    And user wait for "2000" milli second
    Then user verify invest tab
    And user verify text "HDFC PENSION FUND"
    And user not able to select investment fund manager
    And user verify static text "Choose Asset Allocation Total should be 100%"
    And user not able to select auto choice
    And user verify static text "Equity (E) - Upto 75%"
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"

  @Validation @NPSValidation
  Scenario: Validate in Investment Choice Screen
#    Given user login with user "7272727272 | 7272727272"
    Given application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    And user click by text "Complete Pending Application"
    And user click on crop details
    When user search company name as "Hombale Films (KGF 3)" in company name screen
    And user click on hombale technologies
    And user enter employee number as "FSR12D4"
    And user enter company joining date as "2"
    And user click by text "Continue"
    And user click on pension fund manager drop down
    Then user click by text "SBI PENSION FUND"
    And user wait for "2000" milli second
    And user enter alternative fund (A) as "15"
    And user click by text "Continue"
    When user scroll down
    Then verify validation error "Enter value upto 5 % "
    And user enter alternative fund (A) as "4"
    When user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter alternative fund (A) as "0"
    And user enter equity (E) as "80"
    And user click by text "Continue"
    Then verify validation error "Enter value upto 75 % "
    When user enter equity (E) as "75"
    And user enter govt security as "20"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter govt security as "200"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter govt security as "10"
    And user enter corporate bond as "20"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter corporate bond as "200"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user go back from "Investment Choices" screen
    Then user verify static text "Personal Detail"

  @Validation @NPSValidation
  Scenario: Validate In Nomination Screen
#    Given user login with user "7272727272 | 7272727272"
    Given application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    And user wait for "4000" milli second
    When user click by text "Complete Pending Application"
    And user wait for "2000" milli second
    And user click on nominee
    And user wait for "2000" milli second
#    And user click by text "CHANDAN, FATHER"
    And user click by text "AKSHA, BROTHER"
#    Then verify validation error "Maximum 2 nominees allowed"
    When user click static text "Add New Nominee"
    And user click by text "Continue"
    Then verify validation error "Relationship cannot be empty "
    And verify validation error "Name cannot be empty"
    And verify validation error "Dob cannot be empty"
    When user select relation with nominee
    And enter nominee name as "Hari123"
    And user select nomination DOB  as "1"
    Then verify validation error "Invalid characters in name"
    When enter nominee name as "Priyabrat"
    Then verify validation error "Matching with Investor Name"
    When enter nominee name as "Ni"
    Then verify validation error "Name should be at least 3 characters long"
    And user select relation with guardians
    And user scroll to view guardians DOB
    When user enter guardians name as "Ram12"
    And user enter guardian DOB greater than eighteen
    Then verify validation error "Invalid characters in name"
    And verify validation error "Invalid characters in name"
    When enter nominee name as "Manas"
    And user select nomination DOB  as "1"
    And user select relation with guardians
    And user scroll to view guardians DOB
    And user enter guardians name as "Prakash"
    And user enter guardian DOB below eighteen
    Then verify validation error "Guardian age must be greater than 18"
    When user go back from "Nomination" screen
    And user go back from "Nomination" screen
    Then user verify static text "Investment Choices"

  @Validation @NPSValidation
  Scenario: Validate In Bank Account Screen
    Given application launched successfully
    Then user click on NPS Investment
    When user click on open nps account
    And user wait for "2000" milli second
    And user click by text "Complete Pending Application"
    And user click static text "Add New Bank Account"
    And user click by text "Continue"
    Then verify validation error "Account number is required."
    And verify validation error "IFSC code is required"
    And verify validation error "Bank name cannot be empty"
    When user enter account number in bank as "198765476" account screen
    And user enter ifsc code as "UC2354"
    And user Select bank name as "Axis Bank"
    Then user verify text "Axis Bank"
    When user click by text "Continue"
    Then verify validation error "Account number should have at least 10 digits."
    And verify validation error "Invalid IFSC code"
    When user enter ifsc code as "98709123432"
    Then verify validation error "Invalid IFSC code"
    When user enter ifsc code as "UCBAQWERTYU"
    Then verify validation error "Invalid IFSC code"
    When user go back from "Bank Account" screen
    And user go back from "Bank Account" screen
    Then user verify static text "Nomination"

  Scenario: Verify UI Of Initial Contribution Screen
    Given application launched successfully
    Then user click on NPS Investment
    When user click on open nps account
    And user click by text "Complete Pending Application"
    And user click by text "Continue"
    And user enter contribution amount as "501"
    When user click by text "Continue"
    Then user verify static text "Contribution Fees"
    And user verify static text "GST on contribution Fees, @18%"
    And user verify static text "Subscriber Registration Fees"
    And user verify partial static text "Amount"
    And user verify static text "GST @18%"
    And user verify static text "₹30.00"
    And user verify static text "₹5.40"
    And user verify static text "₹400.00"
    And user verify static text "₹72.00"
    And user verify static text "Total Payable"
    And user verify partial static text "₹1,008."
    When user enter contribution amount as "400"
    And user click static text "Declaration under the Prevention of Money Laundering Act 2002  "
    And user click by text "Continue"
    Then user verify partial static text "Amount should not be less than 600"

  @Validation @NPSValidation
  Scenario: Validate in Crop detail screen
    Given user login with user "8528528522 | 8528528522"
    And application launched successfully
    Then user click on NPS Investment
    When user click on open nps account
    And user wait for "3000" milli second
    And user click by text " Register as Corporate Subscriber"
    And user click by text "Continue"
    Then verify validation error "Company Name cannot be empty"
    And verify validation error "Employee Number cannot be empty"
    And verify validation error "Dob cannot be empty"
    When user enter employee number as "FRe$%^"
    Then verify validation error "Invalid characters in field"

  @Validation @NPSValidation
  Scenario: Limit on Adding More than Three Banks
    Given user login with user "9498098098 | 9498098098"
    And user delete bank account as "123456789124"
    And application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    And user wait for "5000" milli second
    When user click static text "Start New Application"
    Then user verify static text "Re-start NPS Application"
    And user verify static text "Select Subscriber Category"
    And user verify static text "Once you start new application, the partially filled application will be discarded"
    When user close restart nps application screen
    Then user click static text "Start New Application"
    When user select corporate subscriber
    And user click by text "Continue"
    And user wait for "3000" milli second
    When user click by text "Continue"
    Then verify validation error "Company Name cannot be empty"
    And verify validation error "Employee Number cannot be empty"
    And user verify static text "Dob cannot be empty"
    And user search company name as "Hombale Films (KGF 3)" in company name screen
    And user click on hombale technologies
    And user enter employee number as "FRS163"
    And user enter company joining date as "2"
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user select one nominee
    Then user verify 100 percent
    When user select two nominee
    Then user verify 50 percent
    And user click by text "Continue"
    And user wait for "2000" milli second
    When user click static text "Add New Bank Account"
    When user enter account number in bank as "123456789124" account screen
    And user enter ifsc code as "UCBA00011234"
    And user Select bank name as "Axis Bank"
    And user click static text "My name in bank account matches with the name on PAN Card  "
    When user click by text "Continue"
    And user wait for "3000" milli second
    Then user verify partial static text "Net Banking is not active for this bank, you"
    When user click by text "Yes"
    Then user verify static text "Account Number (Must be Savings Account)"
    When user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "No"
    And user go back from "Initial Contribution" screen
    When user click static text "Add New Bank Account"
    Then user verify validation maximum three banks are allowed
    When user close adding bank popup
    Then user verify static text "Add New Bank Account"

  Scenario: Add Nominee to NPS Account
    And application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    When user click static text "Start New Application"
    Then user select corporate subscriber
    And user select individual subscriber
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user select pension fund manager as "KOTAK MAHINDRA PENSION FUND"
    And user click by text "Auto Choice"
    And user select Portfolio option as "Moderate (LC-50)"
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click static text "Add New Nominee"
    And user select relation with nominee
    When enter nominee name as "Tahaliprasad"
    And user select nomination DOB
    And user click by text "Continue"
    And user wait for "3000" milli second
    Then user verify text "Tahaliprasad, BROTHER"

#  @Smoke @NPSSmoke
  Scenario: Registration as Corporate Subscriber For NPS Account
    Given user delete nps account "8199995555 | 8199995555"
    And user login with user "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user wait for "3000" milli second
    And user click on open nps account
    And user wait for "5000" milli second
    And user click by text " Register as Corporate Subscriber"
    When user search company name as "ABC Technologies" in company name screen
    And user click by text "ABC Technologies (ABC Tek)"
    And user enter employee number as "FR12G34"
    And user enter company joining date as "2"
    And user enter corporate email as "test@gmail.com"
    And user click by text "Continue"
    And user wait for "5000" milli second
    And user click by text "Continue"
    And user select one nominee
    And user click by text "Continue"
#    And user wait for "5000" milli second
    And user select bank account
    And user on create nps account
    And user enter OTP for in NPS screen
    And user click on submit application
    And user wait for "5000" milli second
    Then user verify static text "NPS Application Successful"
    And user verify static text "Your PRAN is generated successfully"
    And user verify partial static text "Once your employer verified your account, your PRAN"
    And user verify partial static text "You will be able to do further contribution after your"
    And user scroll to view corporate name
    And user verify bellow corporate nps application status
      | Subscriber Name  | PRAN Status | Corporate Name   |
      | PRIYABRAT BEHERA | Active      | ABC Technologies |
    When user click on home button
    And user wait for "6000" milli second
    And user verify static text "PRAN"
    And user verify static text "Current Value"
    And user verify static text "Invested Amount"
    And user verify static text "Growth"
    When user click on info icon on NPS dashboard
    Then user verify static text "MY PRAN DETAIL"
    And user verify static text "Name"
    And user verify static text "Sector"
    And user verify static text "Investment Option"
    And user verify static text "Company"
    And user verify static text "PRIYABRAT BEHERA"
    And user verify static text "4000 4005 6779"
    And user verify static text "Corporate"
    And user verify Auto choice
    And user verify static text "ABC Technologies"
    When user close my pran detail screen
    Then user click history icon in nps home screen
    Then user verify static text "No RecordS Found"

  @Validation @NPSValidation
  Scenario: User shifts a PRAN already mapped to an existing PRAN
#    Given user login with user "9812121212 | 9812121212"
    Given application launched successfully
    Then user click on NPS Investment
    And user wait for "3000" milli second
    And user click by text "Shift My PRAN"
    When user search company name as "ABC Technologies" in company name screen
    And user click by text "ABC Technologies (ABC Tek)"
#    And user click ABC Technologies (ABC Tek)
    And user enter employee number as "EF0024"
    And user enter company joining date as "2"
    And user click by text "Continue"
    Then verify validation error "You are already mapped with this company"

  Scenario: Unsuccessful Registration as Individual Subscriber for NPS Account
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user wait for "3000" milli second
    And user click on open nps account
    And user wait for "4000" milli second
    And user click by text "Register as Individual Subscriber"
    And user select pension fund manager as "KOTAK MAHINDRA PENSION FUND"
    When user enter equity (E) as "70"
    And user enter govt security as "15"
    And user enter corporate bond as "10"
    And user enter alternative fund (A) as "5"
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user select one nominee
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user select bank account
    And user wait for "2000" milli second
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user enter contribution amount as "650"
    And user click static text "Declaration under the Prevention of Money Laundering Act 2002  "
    And user click by text "Continue"
#    And user wait for "15000" milli second
    When user do payment fail for nps contribution
    And user wait for "5000" milli second
    Then user verify static text "Registration Failed"
    When user click static text "Know More"
    Then user verify static text "Reasons of Failure"
    And user verify static text "payment_authorization_error"
    When user close reason of failure screen
    And user click on home button
    When user click on open nps account
    Then user click by text "Complete Pending Application"

#  @Smoke @NPSSmoke
  Scenario: Registration as Individual Subscriber for NPS Account
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user click on open nps account
    And user wait for "7000" milli second
    And user click by text "Register as Individual Subscriber"
    And user wait for "3000" milli second
    And user select pension fund manager as "KOTAK MAHINDRA PENSION FUND"
    And user click by text "Active Choice"
    When user enter equity (E) as "70"
    And user enter govt security as "15"
    And user enter corporate bond as "10"
    And user enter alternative fund (A) as "5"
    And user click by text "Continue"
    And user wait for "3000" milli second
    Then user select one nominee
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user select bank account
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user verify increasing registration amount
    And user enter contribution amount as "650"
    And user click static text "Declaration under the Prevention of Money Laundering Act 2002  "
    And user click by text "Continue"
#    And user wait for "15000" milli second
    And user do payment for nps contribution
    And user wait for "8000" milli second
    Then user verify static text "NPS Application Successful"
    And user verify static text "Your PRAN is generated successfully"
    And user verify partial static text "Initial Contribution"
    And user verify partial static text "Initial investment usually takes upto 3 to 5 working days"
    And user verify bellow individual nps registration status
      | Subscriber Name  | PRAN Status |
      | PRIYABRAT BEHERA | Active      |
    When user click on home button
    And user wait for "2000" milli second
    When user click history icon in nps home screen
    Then user verify successful nps registration transaction as "₹1,157.4"
    And user can see nps transaction statement

#  @Smoke @NPSSmoke
  Scenario: User makes a contribution to ABC Technologies NPS
    Given application launched successfully
    Then user click on NPS Investment
    And user wait for "3000" milli second
    When user click by text "Invest in NPS"
    And user click tire two account type
    Then verify validation error "Tier 2 account has not opened"
    And user click tire one account type
    And user enter contribution amount as "499"
    And user click by text "Continue"
    And user enter contribution amount as "10000"
    And user verify static text "Minimum ₹500"
    And user verify static text "Contribution Fees                    :"
    And user verify static text "GST @18%                                :"
    And user verify static text "₹50.00"
    And user verify static text "₹9.00"
    And user verify static text "Total Payable"
    And user verify static text "₹10,059.00"
    And user click by text "Continue"
    And user do payment for nps contribution
    And user wait for "8000" milli second
    Then user verify static text "Payment Successful"
    And user verify partial static text "Contribution of ₹10,059.00 is submitted"
    When user click static text "Download Reciept"
    And user wait for "4000" milli second
    And user click close the nps recipt page
#    And user run the batch api
    When user click on home button
    And user wait for "2000" milli second
    Then user verify text "Invest in NPS"
    When user click history icon in nps home screen
    Then user verify successful nps contribution transaction as "₹10,059.00"

  Scenario: User fail the invest in nps
    Given application launched successfully
    Then user click on NPS Investment
    And user wait for "3000" milli second
    When user click by text "Invest in NPS"
    And user enter contribution amount as "5543"
    And user click by text "Continue"
    And user do payment fail for nps contribution
    And user wait for "6000" milli second
    Then user verify static text "Contribution Failed"
    When user click static text "Know More"
    Then user verify static text "Reasons of Failure"
    And user verify static text "payment_authorization_error"
    When user close reason of failure screen
    And user click on home button
    And user click history icon in nps home screen
    When user click by text "Sort By"
    When user click by text "Tier 2"
    Then user verify text "No Records Found"

  Scenario: Reviewing Contribution Transaction History
    Given application launched successfully
    Then user click on NPS Investment
    And user wait for "5000" milli second
    When user click by text "View NPS Portfolio "
    And user click by text "Tier 2"
    And user verify static text "Schemes"
    And user verify static text "| Tier-2 Holding"
    And user verify static text "Current Value"
    And user verify static text "Investment"
    And user verify static text "P&L"
    And user verify static text "HDFC Pension Management Company Limited Scheme E - Tier II"
    And user verify partial static text "Allocation"
    And user verify partial static text "Invested ₹"
    And user verify partial static text "Current"
    And user verify partial static text "Returns"
    And user verify partial static text "Units"
    And user verify partial static text "NAV ₹"
    And user click by text "Tier 1"
    And user verify static text "| Tier-1 Holding"
    And user verify static text "HDFC Pension Management Company Limited Scheme E - Tier I"
    And user scroll to scheme G-Tire
    When user click on information icon in nps screen
    And user verify static text "MY PRAN DETAIL"
    And user verify pran details
      | Name             | PRAN           | Sector                   |
      | PRIYABRAT BEHERA | 4000 4005 6779 | All Citizen (Individual) |
    And user click coordinate of 210 and 120
    And user click history icon in nps screen
    Then user verify text "Sort By"
    And user go back from "History" screen
    When user click by text "Invest in NPS"
    Then user verify static text "Initial Contribution"

#  @Smoke @NPSSmoke
  Scenario: Making a Contribution with an Existing PRAN Number
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user click by text "Invest in NPS"
    When user go back from "NPS Contribution" screen
    And user click by text "Invest in NPS"
    Then user verify static text "Check PRAN Status"
    When user enter pran number as "4000345" for check status
    And user click by text "Verify PRAN"
    Then verify validation error "PRAN should contains exactly 12 digits"
    When user enter pran number as "400090056089" for check status
    And user click by text "Verify PRAN"
    Then user verify static text "PRAN Check Failed"
    And user verify partial static text "We could not verify your PRAN"
    When user click by text "OK"
    When user enter pran number as "400090056026" for check status
    And user click by text "Verify PRAN"
    Then user verify static text "PRAN Check Successful"
    And user verify static text "Continue with your contribution"
    When user close the check pran popup
    And user click by text "Verify PRAN"
    And user wait for "5000" milli second
    When user click by text "Save & Continue"
    And user enter contribution amount as "10000"
    And user click by text "Continue"
    And user do payment for nps contribution
    And user wait for "5000" milli second
    Then user verify static text "Payment Successful"

  Scenario: PRAN shifting after investing
    And application launched successfully
    Then user click on NPS Investment
    And user click by text "Shift My PRAN"
    When user search company name as "Original" in company name screen
    And user click on original value floatr
    And user enter employee number as "FS0032"
    And user enter company joining date as "2"
    And user click by text "Continue"
    Then user verify static text "PRAN Shifting Request"

  Scenario: Verify UI elements of PRAN Shifting screen
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user click by text "Shift My PRAN"
    Then user click static text "PRAN Shifting"
    And user verify static text "Who should apply?"
    And user verify static text "You must have an ‘active’ NPS account"
    And user verify static text "CRA should be NSDL (Protean) or KFIN"
    And user verify static text "You want to map your PRAN to Floatr App"
    And user verify static text "Or, you want to map it to your Employer"
    And user verify static text "What you need for shifting?"
    And user verify static text "PRAN Number"
    And user verify static text "If your account is “Individual” category, then POP-SP code"
    And user verify static text "If your account is “Corporate” category, then CBO code"
    And user verify static text "You can find above information in your latest NPS transaction statement"
    When user go back from "PRAN Shifting" screen
    Then user verify static text "Tax Benefits on NPS"

  Scenario: Verify UI elements of Existing PRAN Detail screen
    And application launched successfully
    Then user click on NPS Investment
    And user click by text "Shift My PRAN"
    Then user click by text "Continue"
    And user go back from "PRAN Shifting Request" screen
    Then user click by text "Continue"
    And user verify static text "Existing PRAN Sector"
    And user verify static text "Existing PRAN Detail"
    And user verify static text "Instructions to fill this section:"
    And user verify static text "You can find these detail in the transaction statement of your NPS account."
    And user verify static text "If your statement shows a POP-SP name, select sector as “Individual”"
    And user verify static text "If your statement shows a CBO name, select sector as “Corporate”"
    When user click by text "Continue"
    Then verify validation error "This field is required"

  @Validation @NPSValidation
  Scenario: Validate in Existing PRAN Detail screen
    And application launched successfully
    Then user click on NPS Investment
    And user click by text "Shift My PRAN"
    Then user click by text "Continue"
    And user wait for "2000" milli second
    And user click individual radio button
    Then user click by text "Continue"
    And verify validation error "This field is required"
    And verify validation error "This field is required"
    And user enter pop-sp code as "1234"
    And user enter pran number as "12345"
    Then user click by text "Continue"
    Then verify validation error "POP-SP contain only 7 digit"
    And verify validation error "PRAN number should be 12 digits long"
    And user enter pop-sp code as "123465$"
    And user enter pran number as "12345876293$"
    Then user click by text "Continue"
    Then verify validation error "POP-SP code can only contain numbers"
    And verify validation error "PRAN number can only contain numbers"
    And user go back from "PRAN Shifting Request" screen
    Then user click by text "Continue"
    And user wait for "2000" milli second
    When user click corporate radio button
    And user click by text "Continue"
    And verify validation error "This field is required"
    And verify validation error "This field is required"
    And user enter current cbo code as "1234"
    And user enter pran number as "1234523"
    Then user click by text "Continue"
    Then verify validation error "CBO contain only 7 digit"
    And verify validation error "PRAN number should be 12 digits long"
    And user enter current cbo code as "123465$"
    And user enter pran number as "12345876293$"
    Then user click by text "Continue"
    Then verify validation error "CBO code can only contain numbers"
    Then verify validation error "PRAN number can only contain numbers"

  @Validation @NPSValidation
  Scenario: Validate in Where to Shift screen
    And application launched successfully
    Then user click on NPS Investment
    And user click by text "Shift My PRAN"
    Then user click by text "Continue"
    And user wait for "2000" milli second
    And user click individual radio button
    And user enter pop-sp code as "1234567"
    And user enter pran number as "123456789123"
    And user enters Full Name as "Priyabrat" in pran shifting request screen
    And user click by text "Continue"
    And user click by text "Continue"
    And verify validation error "This field is required"
    And user click corporate radio button
    When user click by text "Continue"
    Then verify validation error "Company Name cannot be empty"
    And verify validation error "Employee Number cannot be empty"
    And verify validation error "Date Of Joining cannot be empty"

  @Validation @NPSValidation
  Scenario: Validate in Validation on OTP Screen
    Then user click on NPS Investment
    And user click by text "Shift My PRAN"
    Then user click by text "Continue"
    And user wait for "2000" milli second
    And user click individual radio button
    And user enter pop-sp code as "1234567"
    And user enter pran number as "123456789123"
    And user enters Full Name as "Priyabrat" in pran shifting request screen
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click individual radio button
    And user click by text "Continue"
    When user enter invalid pran shifting otp
    And user click by text "Submit Application"
    Then user verify text "Invalid OTP"
    When user click static text "Resend OTP"
    Then user verify text "OTP is sent successfully"

  Scenario: PRAN Shifting from Individual to Individual
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user click by text "Shift My PRAN"
    Then user click by text "Continue"
    And user wait for "2000" milli second
    And user click individual radio button
    Then user click by text "Continue"
    And user enter pop-sp code as "1234567"
    And user enter pran number as "123456789123"
    And user enters Full Name as "Priyabrat" in pran shifting request screen
    And user verify partial static text "Enter PRAN associated with PAN"
    And user verify static text "Full Name (Must match with name in PRAN)"
    And user rename subscriber name as "Priyabrat Behera"
    And user verify static text "Date of birth as per your KYC"
    And user click by text "Continue"
    And user verify static text "Where to Shift?"
    And user verify static text "Instructions to fill this section:"
    And user verify static text "If you are shifting to map your PRAN to a company, select target sector as “Corporate”"
    And user verify static text "Otherwise select target sector as “Individual”"
    And user verify static text "Target PRAN Sector"
    When user click individual radio button
    And user click by text "Continue"
    And user verify static text "Things to know:"
    And user verify static text "With this shifting, your fund manager and investment preference does not change"
    And user verify static text "Once shifting is completed, you will receive email confirmation from KFINTECH"
    And user verify partial static text "Enter OTP received on"
    And user enter pran shifting otp
    And user click by text "Submit Application"
    Then user verify static text "Shifting Request Submitted"
    And user verify partial static text "PRAN : 123456789123"
    And user verify partial static text "Acknowledgement No:"
    When user click by text "Home"
    Then user verify static text "PRAN"
    And user verify partial static text "Acknowledgement No:"
    And user verify partial static text "Application submitted on"
    When user click by text "Invest in NPS"
    Then user verify static text "Your PRAN shifting is under process"

#  @Smoke @NPSSmoke
  Scenario: PRAN Shifting from individual to corporate
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    When user click by text "Shift My PRAN"
    Then user click by text "Continue"
    And user click individual radio button
    And user enter pop-sp code as "1234567"
    And user enter pran number as "123456789123"
    And user enters Full Name as "Priyabrat" in pran shifting request screen
    And user click by text "Continue"
    And user wait for "2000" milli second
    When user click corporate radio button
    When user search company name as "Original" in company name screen
    And user click on original value floatr
    And user enter employee number as "FS0032"
    And user enter company joining date as "2"
    And user click by text "Continue"
    Then user verify static text "You are applying to map your PRAN to"
    And user verify static text "Original Valuefloat Technologies Pvt Ltd (Floatr)"
    And user verify static text "Ensure you are an employee of this company, else your application will be rejected"
    And user verify static text "With this shifting, your fund manager and investment preference does not change in either Tier-1 or Tier-2 account"
    And user enter pran shifting otp
    And user click by text "Submit Application"
    Then user verify static text "Shifting Request Submitted"
    And user verify static text "PRAN : 123456789123"
    And user verify partial static text "Acknowledgement No:"
    When user click by text "Home"
    When user click by text "Shift My PRAN"
    Then user verify static text "Your PRAN shifting is under process"

  Scenario: PRAN Shifting from corporate to individual
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    When user click by text "Shift My PRAN"
    Then user click by text "Continue"
    And user wait for "2000" milli second
    And user click corporate radio button
    And user enter current cbo code as "1234567"
    And user enter pran number as "123456789123"
    And user enters Full Name as "Priyabrat" in pran shifting request screen
    And user click by text "Continue"
    And user wait for "2000" milli second
    When user click individual radio button
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user enter pran shifting otp
    And user click by text "Submit Application"
    Then user verify static text "Shifting Request Submitted"

#  @Smoke @NPSSmoke
  Scenario: PRAN Shifting from corporate to corporate
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    When user click by text "Shift My PRAN"
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click corporate radio button
    And user enter current cbo code as "1234567"
    And user enter pran number as "123456789123"
    And user enters Full Name as "Priyabrat" in pran shifting request screen
    And user click by text "Continue"
    And user wait for "2000" milli second
    When user click corporate radio button
    When user search company name as "Original" in company name screen
    And user click on original value floatr
    And user enter employee number as "FSR12D4"
    And user enter company joining date as "2"
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user enter pran shifting otp
    And user click by text "Submit Application"
    Then user verify static text "Shifting Request Submitted"
