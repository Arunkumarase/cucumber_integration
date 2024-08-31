Feature: User Login

Scenario: Successful login with valid credentials
  Given the user is on the login page
  When the user enters a valid username and password
  Then the user should be logged in

@avoid
@ignore
Scenario: Unsuccessful login with invalid credentials
  Given the user is on the login page
  When the user enters a invalid username and password
  Then the user should see an error message