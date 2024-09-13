Feature: Alerts
    I am a user
    I want to handle Alerts
    To be able to accept js

  Scenario: Alert handling
    Given I go to "JavaScript Alerts" on the Main Page
    When I generate JS alert on the JavaScript Alert Page
    And I accept the alert
    Then Success message is displayed on the JavaScript Alert Page
