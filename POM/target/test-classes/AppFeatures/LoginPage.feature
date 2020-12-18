Feature: Login page feature

Scenario: Login page title
Given User is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot password link
Given User is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given User is on login page
When user enter username as "dec2020secondbatch@gmail.com"
And user enter password as "Selenium@12345"
And user clicks on the login button
Then user gets the title of the page
And page title should be "My account - My Store"