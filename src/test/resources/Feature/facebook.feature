
#Two data with header or Two data list
#
#Feature: To validate or verify login functionality of facebook application       
#Scenario: To verify the invalid login page
#Given humanbeing facebook login page
#When humanbeing given datas username and password
#|username|password|
#|vanajajagan@gmail.com|86658795|
#|Archa@gmail.com|7457658|
#|vanjamilaajajagan@gmail.com|54356|
#|shoba@gmail.com|809009|
#And humanbeing submit the button
#Then humanbeing go to unwanted page
#
#---------------------------------------------------------------------------------------------------
#one data with header or one data list
#
#Feature: To validate or verify login functionality of facebook application
#Scenario: To verify the invalid login page
#Given person facebook login page
#When person given datas username and password
#|username|vanajajagan@gmail.com|
#|password|86658795|
#And person submit the button
#Then person go to unwanted page
#
#--------------------------------------------------------------------------------------------
#Two data without header or Two data list

#Feature: To validate or verify login functionality of facebook application
#Scenario: To verify the invalid login page
#Given human facebook login page
#When human given datas username and password
#|vanajajagan@gmail.com|86658795|
#|jagan|987|
#|vanaja|967798|
#|max|5365|
#And human submit the button

#-------------------------------------------------------------------------------------------
#one data without header or one data list

Feature: To validate or verify login functionality of facebook application
Background:
Given user facebook login page

Scenario: To verify the invalid login page
When user given datas username and password
And user submit the button
Then user go to unwanted page

Scenario: To verify the valid login page
When user given datas username "56r78698" and password "54365476587"
And user submit the button
Then user go to unwanted page




#------------------------------------------------------------------------------------------
#Run multiple values using exampls
#
#Feature:To validate or verify login functionality of facebook application
#Scenario Outline:To verify the invalid login page
#Given user enter facebook login page
#When user give datas "<username>" and "<password>"
#And user submit login button
#Then user navigate unwanted page
#Examples:
#|username|password|
#|vanaja@gmail.com|23425|
#|ivana@gmail.com|vanajabooby123|
#|vanajabooby09@gmail.com|23425|
#|vanajabobby09@gmail.com|vanajabobby123|
#------------------------------------------------------------------------------------
#
#username and password not given the feature files
#
#Feature:To validate or verify login functionality of facebook application
#Scenario:To verify the invalid login page
#Given user inside facebook login page
#When user two datas username and password and password 
#And user enter login button
#Then user navigate another page
#
#----------------------------------------------------------------------------------------
#username and password given in this feature files
#
#Feature:To validate or verify login functionality of facebook application
#Scenario:To verify the invalid login page
#Given user in facebook login page
#When user fill details username and password "vanaja" and password "jagan"
#And user should be enter login button
#Then user navigate login page