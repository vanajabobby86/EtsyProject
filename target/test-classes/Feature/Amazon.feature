Feature: To validate or verify amazon login page
Scenario: To verify login functionality
Given user be in login page
When user giver username and password of amazon login page
When user click amazon signin button
And user add first product from amazon
And user add second product from amazon
And user add third product from amazon
And user add fourth product from amazon
And user add fifth product from amazon
And user verify products add or not inside amazon
And product price list out from selecting product
And user remove one product from the list
And user calculate selected item and sum of two product 