Feature: Login User shopdemoqa

  Scenario: Admin successful login into web HRM
    Given Admin open browser and url
    When Admin enter valid username
    And Admin enter valid password
    And Admin click button login
    Then Admin sukses Login