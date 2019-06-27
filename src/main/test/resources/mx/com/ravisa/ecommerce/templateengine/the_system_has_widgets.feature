Feature: Has System any Widgets?
  The system most have widgets to add to pages

  Scenario: The Catalog Wigdets it is not empty
    Given the next list of widgets:
    | login |
    |buying car|
    |list of product|
    When I want to print all list of widgets
    Then I have 3 widgets