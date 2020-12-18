Feature: Account Page feature

Background:
Given user has already logged in to the application
|username		|password			|
|dec2020secondbatch@gmail.com |Selenium@12345 |

Scenario: Account page title
Given user is on the account page
When user gets the title of the page
Then page title should be "My account - My Store"


Scenario:
Given user is on the account page
Then user gets account section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And account section count should be 6