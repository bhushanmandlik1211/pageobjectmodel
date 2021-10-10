Feature: facebook login page
 Scenario: check facebook login 
    Given launch chrome browser
    When enter facebook url
    And pass username and password
    Then click on login button
   