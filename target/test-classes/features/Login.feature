Feature: Login into application

Scenario Outline: Positive test validating of login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And click on login link in homepage to land on secure signin page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And close browsers


Examples:
|username               |password|
|swetha.aedama@yahoo.in |Tapasya@23|
|test99@gmail.com       |123456|
