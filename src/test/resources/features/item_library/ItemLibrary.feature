@Web @ItemLibrary
Feature: Item Library
  Scenario: Create item with only name
    Given User open moka backoffice login page
    And User input email "halimprabowo@gmail.com" on backoffice login page
    And User input password "mokahalim1234" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    When User click create item button
    And User input the item name
    And User click the save button
    Then User see the new item

  Scenario: Create item with name and price
    Given User open moka backoffice login page
    And User input email "halimprabowo@gmail.com" on backoffice login page
    And User input password "mokahalim1234" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    When User click create item button
    And User input the item name
    And User input the item price
    And User input the item SKU
    And User click the save button
    Then User see the new item
#    And User see the same item price

