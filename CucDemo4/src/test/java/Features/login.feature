Feature: Testing Login to the PL site
  

  Scenario: Testing login to the bbc site
    Given user is in home page
    When user clicks Sign in 
    And  user enter "abmherangika@yahoo.com" and "bbcforme1"
    And user clicks Sign in button
    Then user is logged in to the system
  