Feature: Login to LeafTaps Application

Scenario Outline:
Given enter the username as <username>
And enter the password as <password>
When click on LoginButton

Examples:
|username|password|
|DemoCsr|crmsfa|
|Demo123|crmsfa|