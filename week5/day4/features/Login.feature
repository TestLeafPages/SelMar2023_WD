Feature: Login to LeafTaps Applications

#Background:
#Given Launch Browser and load the Url and maximize Screen

@smoke @testleaf
Scenario: Login to Positive Data
And Enter the username as 'DemoCsr'
And Enter the password as 'crmsfa'
When Click on LoginButton
Then Verify my page successfully login

@regression
Scenario: Login to Negative Data

And Enter the username as 'Demo123'
And Enter the password as 'crmsfa'
When Click on LoginButton
But Verify my page not successfully login


@testleaf
Scenario Outline: Both  positive and negative 
And Enter the username as <username>
And Enter the password as <password>
When Click on LoginButton
Then Verify my page successfully login
But Verify my page not successfully login

Examples:
|username|password|
|Demosalesmanager|crmsfa|
|demo@123|crmsfa|










