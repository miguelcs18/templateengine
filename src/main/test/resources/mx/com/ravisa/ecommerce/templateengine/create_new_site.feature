Feature: Create a new Site on the system


  Scenario: I am an Admin site and I want to create my site
    Given the platform to create a new site
    When I create a new site called 'My Site'
    Then I will have my site information