@MutualFundSchemes @Regression
Feature: Mutual Fund Scenario

  Scenario: Add Mutual Fund Schemes
    Given page load successfully
    When user click on link "Mutual Fund"
    And user click on link "Schemes"
    Then user is in "Schemes" page
    When user click on link "Add Scheme"
    Then user is in "Add Scheme" page
    When user select amc name
    And user enter scheme name as "MF schemes"
    And user select scheme category
    And user select scheme sub category
    And user enter ISIN code as "Ahbh1879"
    And user enter AMFI code as "123mbuy34"
    And user select active now
    And user submit button in add mutual fund scheme page

  Scenario: Edit schemes
    Given page load successfully
    When user click on link "Mutual Fund"
    And user click on link "Schemes"
    Then user is in "Schemes" page
    When user click on edit "MF schemes" schemes
    Then user is in "MF schemes" page
    When user edit amc name
    And user enter scheme name as "RainyDay"
    And user edit scheme category
    And user edit scheme sub category
    And user enter ISIN code as "Aty65456"
    And user enter AMFI code as "wq328hy"
    And user submit button in edit mutual fund scheme page

#  Scenario: Delete schemes
#    Given page load successfully
#    When user click on link "Mutual Fund"
#    And user click on link "Schemes"
#    When user delete "RainyDay" schemes

  Scenario: Edit schemes
    Given page load successfully
    When user click on link "Mutual Fund"
    And user click on link "AMCs"
    And user click on add amcs
    And upload file
    And user wait for "8000" milli second








