Feature: Deal data creation

  Scenario: Adding a deal
    Given User is on deals page
    When user fills the deals form
    Then deal is created