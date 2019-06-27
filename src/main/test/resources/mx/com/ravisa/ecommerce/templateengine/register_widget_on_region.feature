Feature: The user admin store can add a widget on the region

  Scenario: The Catalog Wigdets enables to add to my page on the region X
    Given the next list of widgets enables of my site:
    |login |
    |buying car|
    |list of product|

    When In my regions:
    |1|empty|
    |2|empty|
    |3|empty|
    Then I register 'login' on the '1' region so my regions is modified