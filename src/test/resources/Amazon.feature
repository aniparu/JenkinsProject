@feature2
Feature: To Validate the login functionality for amazon


  @Regression
  Scenario: To validate the login with invalid username and invalid password
    Given To launch the chrome browser and max the browser
    When To launch the amazon url
    And To pass the invalid username or phoneNo in email field
      # one dimentional map
      #key            value
      | username1 | abc@gmail.com |
      | username2 | def@gmil.com |
      | username3 | xyz@gmail.com |
    And To click the Continue button
    And To pass the invalid password in password field
      # two dimentional map
      | password1 | password2    | password3 |
      | abc@123   | def@123      | xyz@123   |
      | py@123    | cucumber@123 | fg@123    |
      | vc@123    | lmn@123      | jhg@123f  |
    And To click the signin button
    Then To close the browser
