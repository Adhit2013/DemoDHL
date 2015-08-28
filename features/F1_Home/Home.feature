Feature: As a user I want to view DHL Home Page

  Scenario: User access DHL Home Page

    Given User access DHL Home Page in browser
    Then  DHL Home Page should be loaded in browser

  Scenario: User access Express menu content

    Given User access DHL Home Page in browser
    When  User access Express menu
    Then  Express menu contents should be displayed