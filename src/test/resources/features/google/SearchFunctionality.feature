Feature: Testing Google Search Functionality
   #is a general description
  Scenario: Happy Path(positive) Testing for Search
    #is a test case
    Given User navigates to the Google
    When User searches for Codefish
    Then User gets more than ten links on the first page

    Scenario: Happy Path(positive) Testing Result from Search
    Given User navigates to the Google
    When User searches for Kyrgyz food in the USA
    Then User validate the result

    Scenario: Happy Path(positive) Testing Result from Search
    Given User navigates to the Google
    When User searches for Turkish Baklava
    Then User validates search is done less one second



