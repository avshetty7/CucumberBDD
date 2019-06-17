Feature: Deal data creation

  Scenario: Adding a deal with Mapping feature
    Given User is already on login page
    When Title of login page is free CRM
    And User enters username and password
      | username | password |
      | cucumber11 | test123 |
    Then user clicks on Login Button
    Then user is on home page
    And User moves to deals page
    And user enters deals details
      | title | amount  | probability | commission |
      | testdeal1 | 1000 | 50 | 10 |
      | testdeal2 | 2000 | 60 | 20 |
      | testdeal3 | 3000 | 70 | 30 |
#    Then click on save button
    Then close the Browser


