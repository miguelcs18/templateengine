Feature: Has the site any pages?
  The site can have none or more pages

  Scenario: The site can list pages
    Given The site 'mySite' has list of pages
    |home|
    |about|
    |contact|
    When I request 'mySite'
    Then I print all pages of my site