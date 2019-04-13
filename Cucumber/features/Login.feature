@smoke
Feature: Leaftaps Login

Background:
Given Open the Browser
And Max Browser
And Set the Timeouts
And Load the URL
@smoke @regression 
Scenario Outline: Positive Flow For Login
Given Enter the Username as <username>
And Enter the Password as <password>
When Click On the Login Button
Then Verify Login Successful

Examples:
	|username|password|
	|DemoSalesManager|crmsfa|
	|DemoCSR|crmsfa|	

Scenario: Negative Flow For Login
Given Enter the Username as DemoCSR1
And Enter the Password as crmsfa
When Click On the Login Button
But Verify Login Failed











