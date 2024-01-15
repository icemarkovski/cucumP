Feature: Register

Scenario: User creates account only with mandatory fields
Given User navigates to Register account page
When User enters only mandatory fields
|firstName  |Ice               |
|lastName   |Markovski         |
|Telephone  |123456789         |
|Password   |12345             |
|confirmPass|12345             |
And User select Privacy Policy
And User clicks on Continue button
Then User account should create successfully

Scenario: User creates account with all fields
Given User navigates to Register account page
When User enters only mandatory fields
|firstName  |Ice               |
|lastName   |Markovski         |
|Telephone  |123456789         |
|Password   |12345             |
|confirmPass|12345             |
And User selects Yes for newsletter
And User select Privacy Policy
And User clicks on Continue button
Then User account should create successfully

Scenario: User creates duplicate account
Given User navigates to Register account page
When User enters only mandatory fields duplicate account
|firstName  |Ice             |
|lastName   |Markovski       |
|email			|Ice1bt@gmail.com|
|Telephone  |123456789       |
|Password   |12345           |
|confirmPass|12345           |
And User selects Yes for newsletter
And User select Privacy Policy
And User clicks on Continue button
Then User should get propper warning message about duplicate email

Scenario: User creates account without filling any details
Given User navigates to Register account page
When User dont enter any details into manfdatory fields 
And User clicks on Continue button
Then User should get propper warning message for any mandatory field







        