Feature: Login to the website

  As a user of the page
  I want to login
  So check that you login correctly

  Scenario: Login to the website
  Given the user is on the demoblaze login page
  When you log in with the username registeredUser and the password registeredPassword
  Then verify that the text Welcome  is displayed on the screen