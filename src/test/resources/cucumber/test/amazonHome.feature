Feature: Customer Home Navigation
  As a customer,
  I want to view items availale for purchase
  so tht I can decide which items I would like to purchase

Scenario: Validate Page

Scenario: Validate Page Search
  Given I Navigates to Amazon
  And I query for "Tennis Shoes"
  When I click to search icon
  Then I will be viewing "Tennis Shoes"
