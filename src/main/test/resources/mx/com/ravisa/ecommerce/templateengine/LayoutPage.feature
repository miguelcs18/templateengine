Feature: Choose a Layout to my page


  Scenario: The page Home I can choose a Layout to be used for my page
    Given My page 'Home' and can I choose someone of the next list of Layout to add to my page:
     |1|first,this_is_my_first_layout_test,linktraditional,true|
     |2|twice_this_is_my_twice_layout_test_linktwice_true|
    When I choose the '1' Layout
    Then The layout is added to my page 'Home'