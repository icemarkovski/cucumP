Feature: Login function

Scenario: Login with valid credentials
Given User navigates to Login page
When User enters valid email address "Ice1bt@hotmail.com" into email field
And User enters valid password "12345" into password field 
And User clicks on Login button
Then User should successfully Login

Scenario: Login with invaid credentials
Given User navigates to Login page
When User enters invalid email address into email field
And User enter invalid password "112233" into password field
And User clicks on Login button
Then User should get propper warning message about credentials missmatch

Scenario: Login with valid email and invalid password
Given User navigates to Login page
When User enters valid email address "Ice1bt@hotmail.com" into email field
And User enter invalid password "112233" into password field
And User clicks on Login button
Then User should get propper warning message about credentials missmatch

Scenario: Login with invalid email and valid password
Given User navigates to Login page
When User enters invalid email address into email field
And User enters valid password "12345" into password field
And User clicks on Login button
Then User should get propper warning message about credentials missmatch

Scenario: Login with not providing any credentials
Given User navigates to Login page
When User not provide any credentials
And User clicks on Login button
Then User should get propper warning message about credentials missmatch

