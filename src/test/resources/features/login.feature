
@login
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials. And dashboard should be displayed.


  Background:
    Given user is on the login page


  Scenario: Login as user

    When user enters the user information
    Then user should be able to login and see "Dashboard" as a title