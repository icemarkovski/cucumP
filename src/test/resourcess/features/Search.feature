Feature: Search functionality

Scenario: User search for a valid products
Given User opens the application 
When User enters valid product "hp" into search box field
And User clicks on Search button
Then User should get valid product displayed in search results

Scenario: User should search for invalid product
Given User opens the application 
When User enters invalid product "Honda" into search box field
And User clicks on Search button
Then User should get a message about no product matching

Scenario: User search without providing any product
Given User opens the application 
When User dont provid any product name into Search box field
And User clicks on Search button
Then User should get a message about no product matching 









