Feature: As a user I want to view DHL Home Page

  Scenario: User access DHL Home Page

    Given User access DHL Home Page in browser
    Then  DHL Home Page should be loaded in browser

  Scenario: User access Express menu content

    Given User access DHL Home Page in browser
    When  User access Express menu
    Then  Express menu contents should be displayed

  Scenario Outline: User navigates number tabs in Home Page

    Given User access DHL Home Page in browser
    When  User navigate <number> tab
    Then  Home_<number>.png should be displayed

    Examples:
      | number |
      |   1    |
      |   2    |
      |   3    |
      |   4    |
      |   5    |
      |   6    |
      |   7    |
      |   8    |
      |   9    |

  Scenario Outline: User chooses location from dropdown

    Given User access DHL Home Page in browser
    When  User selects <location> from dropdown
    Then  Home Page should be displayed in <language> for <location>

    Examples:
      | location | language |
      | China, People's Republic | cn |
      | Japan | jp |