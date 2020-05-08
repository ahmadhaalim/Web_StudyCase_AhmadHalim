@Web @Modifier
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "halimprabowo@gmail.com" on backoffice login page
    And User input password "mokahalim1234" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click create modifier
    And User input the modifier name
    And User click Add or Manage Options
    And User click the add options button
    And User input option name "Option 1"
    And User input option price
    And User click save on the add option dialog
    And User click save on the modifier page
    Then User see the new modifier