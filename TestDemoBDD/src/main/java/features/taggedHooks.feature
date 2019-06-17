Feature: Test Tagged hooks
  @First
 Scenario: This is first test
   Given This is step1
   When This is step2
   Then This is step3

 @Second
  Scenario: This is second test
    Given This is step1
    When This is step2
    Then This is step3

  @Third
  Scenario: This is third test
    Given This is step1
    When This is step2
    Then This is step3