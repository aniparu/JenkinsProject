@feature1
Feature: To Validate the login functionality of facebook application

Background: 
     Given To launch the browser and max window

  @Smoke
  Scenario: To validate login with valid username and valid password
    When To launch the url of the application
    And To pass vaild username in email field
    
    And To pass vaild password in password field
    And To click the login button
    Then To close the browser

  @Sanity
  Scenario Outline: To validate the positive and negative testcases in login field
    When launch the url of the application
    And pass the positive and negative "<email datas>" in email field
    And pass the positive and negative "<password datas>" in password field
    Then  close the browser

  Examples: 
      | email datas   | password datas |
      | abc@gmail.com | abc123         |
      | def@gmail.com | def1223        |
      | ghi@gmail.com | ghi123         |
      | xyz@gmail.com | xyz123         |
