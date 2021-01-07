
Feature: login feature
  I want to login to my website

  @tag1
  Scenario: login with valid data
    Given enetred  valid email
    And enetered valid password
    When I click login action
    Then I logged in successfuly 
 

