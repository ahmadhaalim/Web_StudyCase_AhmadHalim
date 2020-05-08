@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "halimprabowo@gmail.com" on backoffice login page
    And User input password "mokahalim1234" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click create categories
    And User input the category name
    And User click save
    Then User see saved category with the same name

    

