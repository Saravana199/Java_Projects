Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Let's Shop"

Scenario: Forget password link
Given user is on login page
Then registration link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "balajisaravana1996@gmail.com"
And user enters password "Viratmahi@100"
And user click on login button
Then user gets the title of the home page
And home page title should be "Automation"
