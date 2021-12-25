# Created by FATOS at 24.12.2021

Feature: Sign Up Page Test

  Background:
    Given navigate to website

  @possitive
  Scenario: Success Sign Up
    And click account button
    When sign up with "ciceksepeti.146@hotmail.com" and "146bootcamp"
    Then verify registration ok message

  @negative
  Scenario: Sign Up With Null Email And Password
    And click account button
    When sign up with "" and ""
    Then verify null email and password message

