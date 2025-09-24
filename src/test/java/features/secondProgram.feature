Feature: Application Login

Background:
  When launch the browser from config variables
  And hit the home page url of banking site
  #// Before  -> Background  -> Scenario -> After

  #Reusable
  @RegressionTest @NetBanking
  Scenario: Admin Page default Login
    Given User is on Netbanking landing page
    When User login into application with "user" and paswword "0953"
    Then  Home Page is displayed
    And Card are displayed


    @SmokeTest @RegressionTest @Mortgage
  Scenario Outline: User Page default login
    Given User is on Netbanking landing page
    When User login into application with <Username> and paswword "<Password>"
    Then  Home Page is displayed
    And Card are displayed

    Examples:
    | Username | Password |
    | debituser | hello12 |
    | credituser | lpo213 |

