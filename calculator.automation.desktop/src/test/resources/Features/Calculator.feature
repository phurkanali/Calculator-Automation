@Calculator
Feature: Calculator

@SimpleAddition
Scenario: Make a simple addition sum on the calculator

Given I am on the calculator application
When I input two numbers to add
Then The numbers will be added together

@FailedCalculation
Scenario: 1 plus 1 equals 3

Given I am on the calculator application
When I calculate 1 plus 1
Then The answer will be 3