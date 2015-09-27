Feature: As a user I want to use DHL Capability Tool to get rate and time quote

  Scenario Outline: User is able to enter origin details

    Given User access DHL Home Page in browser
    And User clicks on DCT link
    When User selects <origin country>
    And User types the <origin zip> and selects <origin zip>,<origin city>
    Then <origin city> and <origin suburb> should be populated

    Examples:
     |       origin country         | origin zip | origin city | origin suburb |
     |        INDIA (IN)            |    412101  |    PUNE     |               |
     |     UNITED KINGDOM (GB)      |      IG1   |   ILFORD    |               |
     | UNITED STATES OF AMERICA (US)|    06901   |   STAMFORD  |               |