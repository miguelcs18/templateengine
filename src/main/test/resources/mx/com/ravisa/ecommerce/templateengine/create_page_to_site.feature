Feature: I'm a user admin store and I want to register a new page on my site


  Scenario: I can register a new page on mi site
    Given the next list of pages on the site:
    |home|
    |about|
    When I want to register 'register' page
    Then The page is register on the site