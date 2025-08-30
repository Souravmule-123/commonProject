@All
Feature: This feature is to validate test scenario

  @Test1
  Scenario: To validate the naukari page
    Given I launch "Naukari" Application
    And I enter the Login credential "Username" and "Pwd"

  @Amazon
  Scenario: assert Equal Method and assert true method
    Given I launch "Amazon" Application
    And I verify the Text using assert equal using String operation
    Then I verify Best Seller Text
    Then I verify the "Fresh" text on homePage
    And I verify the "Fresh" text is present in amazon UI verify Not Equal Operator