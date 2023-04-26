Feature: Login to LeafTaps Applications

Scenario: Login to Positive Data

Given Launch Browser and load the Url and maximize Screen
And Enter the username as 'DemoCsr'
And Enter the password as 'crmsfa'
When Click on LoginButton
Then Verify my page successfully login
When Click on CRMSFA link
And Click on Leads link