@Calculator
Feature: Calculator

@SimpleAddition
Scenario: Make a simple addition sum on the calculator

Given I am on the calculator application
When I input two numbers to add
Then The numbers will be added together