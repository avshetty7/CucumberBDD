@FunctionalTest

Feature: Application testing

  @SmokeTest @RegressionTest
  Scenario: login with valid username and password
    Given  User enters valid username and password
    When User clicks on login button
    Then Valid login message is displayed

  @RegressionTest
  Scenario: login with invalid username and password
    Given User enters valid username and password
    When User clicks on login button
    Then InValid login message is displayed

  @SmokeTest
  Scenario: login with invalid username and invalid password
    Given User enters valid username and password
    When User clicks on login button
    Then InValid login message is displayed

  @SmokeTest @RegressionTest
  Scenario: Create contact
      Given User enters contact details
      When User clicks on Save button
      Then  Contact should be created

  @SmokeTest
  Scenario: Create deals
    Given User enters deal details
    When User clicks on Save button
    Then Deals should be created


  @RegressionTest
  Scenario: Create tasks
    Given User enters task details
    When  User clicks on Save button
    Then Tasks should be created


  @SmokeTest @RegressionTest
  Scenario: Create case
    Given  User enters case details
    When User clicks on Save button
    Then Case should be created

  @SmokeTest
  Scenario: Search case test
    Given User searches for case details
    When User clicks on search button
    Then Case should be searchable

  @SmokeTest @EndToEndTest
  Scenario: Search tasks test
    Given User searches for task details
    When User clicks on search button
    Then Tasks should be searchable

  @SmokeTest @EndToEndTest
  Scenario: Search email test
    Given User searches for email details
    When User clicks on search button
    Then email should be searchable

  @SmokeTest @EndToEndTest
  Scenario: Search docs test
    Given User searches for docs details
    When User clicks on search button
    Then docs should be searchable

  @EndToEndTest
  Scenario: Search forms test
    Given User searches for forms details
    When User clicks on search button
    Then Forms should be searchable

  @EndToEndTest
  Scenario: Application logout
    Given User is on homepage
    When User clicks on logout button
    Then User should be logged out

