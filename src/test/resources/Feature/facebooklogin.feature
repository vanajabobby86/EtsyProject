
Feature:To validate or verify login functionality of facebook application
Scenario:To verify the invalid login page
Given user should be in facebook login page
When user fill username and password "81484276" and password "ivanamax23"
And user should be click login button
Then user navigate the invalid login page
