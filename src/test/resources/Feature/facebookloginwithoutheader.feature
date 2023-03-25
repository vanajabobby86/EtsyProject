Feature: To validate the login page of facebook application
Scenario: To verify the login page with invalid credential
Given user go to the login functionality
When user give the datas username and password
     |vanaja|vanajabobby|
And user click the button
Then navigate the invalid page