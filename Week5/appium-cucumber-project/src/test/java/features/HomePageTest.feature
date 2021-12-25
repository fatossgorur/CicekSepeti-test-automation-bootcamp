# Created by FATOS at 24.12.2021

Feature: Home Page Test

  Background:
    Given navigate to website

    @possitive
  Scenario: Success Search Product
      When search product name "kahve makinesi"
      Then verify product name "kahve makinesi" and page title

  @possitive
  Scenario: Success Page Redirect
    When search product name "kahve makinesi"
    Then verify product name "kahve makinesi" and redirected page title

