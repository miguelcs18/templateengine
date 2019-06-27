Feature: I'm a user admin store and I want to register a new widget


  Scenario: I can register a new widget
    Given the next list of widgets on the site:
    |Login|
    |Text|
    |List of Product|
    When I want to register 'Payment' widget
    Then The widget is register on the list of widgets