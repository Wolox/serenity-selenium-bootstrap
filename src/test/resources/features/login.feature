Feature: Login to the website

  As a user of the page
  I want to login
  So check that you login correctly

  @loginTest
  Scenario: Login to the website
    Given the user is on the demoblaze login page
    When the user login with role admin
    Then the user verify that the text Welcome is displayed on the screen
