Feature: To validate and verify the facebook functionality

  Scenario Outline: To validate the invalid register page
    Given user must be in facebook login page.
    When user click the create account button
    And user should be given "<firstname>"and"<lastname>" and  "<ph no>" and "<re pass>"and"<date>"and"<month>"and"<year>"and"<gender>"
    And user must click signup button
    Then user get msg successfully

    Examples: 
      | firstname | lastname | ph no | re pass | date | month | year | gender |
      | veera     | manik    | 90254 | veea    |   12 | Dec   | 2001 | male   |
      | vanaja    | ygr      |  5667 | okiy    |   13 | Feb   | 2000 | female |
      | saki      | iuyt     |  9876 | poiuyt  |   11 | Jan   | 1999 | custom |
      | max       | tkjh     | 23456 | ojhg    |   20 | Dec   | 2001 | male   |
