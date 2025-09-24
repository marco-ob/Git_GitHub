Feature: Application Login

  Background:
    Given setup the entries in database
    And launch the browser from config variables
    And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page default Login

 Given User is on Netbanking landing page
 When User login into application with "admin" and paswword "1234"
  Then  Home Page is displayed
  And Card are displayed

  #Reusable
  @MobileTest
  Scenario: Admin Page default Login
    Given User is on Netbanking landing page
    When User login into application with "user" and paswword "0953"
    Then  Home Page is displayed
    And Card are displayed


    @SmokeTest@RegressionTest
  Scenario Outline: User Page default login
    Given User is on Netbanking landing page
    When User login into application with <Username> and paswword "<Password>"
    Then  Home Page is displayed
    And Card are displayed

    Examples:
    | Username | Password |
    | debituser | hello12 |
    | credituser | lpo213 |

  @SmokeTest
  Scenario: Admin Page default Login
    Given User is on Practice landing page
    When User signup into application
    | rahul |
    | shetty |
    | marcoobregon@gmail.com |
    | 991236975              |
    Then  Home Page is displayed
    And Card are displayed