Feature: Free CRM Login Feature

     #  Hard code values
 # Scenario: Free CRM Login Test Scenario
#    Given User is already on login page
#    When Title of login page is free CRM
#    And User enters username and password
#    Then user clicks on Login Button
#   Then user is on home page

#  Without Examples Keyword
#    Given User is already on login page
#    When Title of login page is free CRM
#    And User enters "cucumber11" and "test123"
#    Then user clicks on Login Button
#   Then user is on home page

#    With  Examples Keyword
#   use Scenario outline instead of Scenario:

  Scenario Outline: Free CRM Login Test Scenario
    Given User is already on login page
    When Title of login page is free CRM
    And User enters "<username>" and "<password>"
    Then user clicks on Login Button
    Then user is on home page
    And User is on new contact page
    And user enters "<first>" and "<last>" and "<position>"
    Then click on save button
    Then close the Browser


    Examples:
      | username | password | first | last | position |
      |cucumber11 | test123 | firstFN | firstLN | QAfirst |
      |cucumber12 | test123 | secondFN  | secondLN | QAsecond |
