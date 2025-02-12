Feature: MStock Login functionality

Scenario: To Validate the Mstock Login with valid credentials
  Given the user is on the login page
  When the user enters username and password
  And the user clicks on the login button
  Then the user should be Redirect on OTP page
  And  the user is able to see the 2FA Security page.
  When the User Entering the OTP in Input field
  Then the Risk Discloures page Should be open and able to click on continue button
  Then User Should be redirect on Landing page
  



 