

Feature: To validate or verify login page for orange application
Scenario Outline: To verify login fuctionality with valid credential
Given user should be in login page
When user fill the values "<username>" and password "<password>"
And user should click login button
Then user should navigated valid home page

Examples:
|username|password|
|vanaja@gmail.com|76568|
|Admin|admin123|
|jaganvanaja|543475|
