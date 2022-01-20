Feature: Login to the website

  As a user of the page
  I want to login
  So check that you login correctly

  Scenario: Login to the website
  Given the user is on the demoblaze login page
  When you log in with the username REGISTERED_USER and the password REGISTERED_PASSWORD
  Then verify that the text Welcome is displayed on the screen
