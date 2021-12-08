# Created by FATOS at 6.12.2021

Feature: Search Box Test

  Background:
    Given navigate to website

  @positive
  Scenario: Product search in the search box
    When enter product name "parfüm"
    And click search button
    Then verify search result "ürün listeleniyor"

  @negative
  Scenario Outline: Product search with alphanumeric characters and special characters in the search box
    When enter product name "<productName>"
    And click search button
    Then verify failed search result "için sonuç bulunamamıştır."
    Examples:
      | productName |
      | 1234q5w6    |
      | ..,-*/      |

  @positive
  Scenario: Clearing the entered product name
    When enter product name "oje"
    And click reset button
    Then verify that the entered product name is deleted






