@etsy
Feature: To validate or verify etsy login page

  Scenario: To verify login functionality
    Given user be in login page
    When user giver username and password of etsy login page
    When user click signin button
    And user add first product
    And user add second product
    And user add third product
    And Proceed to check out
    And verify product available or not
    And product price list out
    And user remove one product
    And user calculate sum of two product
