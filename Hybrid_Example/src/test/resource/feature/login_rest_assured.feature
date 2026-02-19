Feature: To test the Login page application


Scenario: Succesful Login

Given user launch the browser using baseURI "https://demoqa.com"
When user enters the user name as "xavier" and password as "Saravana@123"
Then user receives the vaild token
And user fethes a list of books using the vaild token

Scenario: To Check all the responses

Then user returns status code 200 and a non-empty token
And books API returns status code 200
And response contains at least one book with the title field present


