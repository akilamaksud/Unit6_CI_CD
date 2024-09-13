Feature: Tables
    I am a user
    I want to count it's columns
    To be able to check it's content

Scenario: count sum of columns
    Given I go to "Sortable Data Tables" on the Main Page
    Then The sum of the Due column is 251.0
