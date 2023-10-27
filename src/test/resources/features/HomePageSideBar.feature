Feature: HomePage sidebar

  @SideBar
  Scenario: Verify user clicks on side bar button
    Given user is on retial website
    When user clicks on side bar option
    Then below info should be listed in side bar option
      | Electronics | Computers | Smart Home | Sports | Automative |
