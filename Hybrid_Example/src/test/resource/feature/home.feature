Feature: Home page feature
Background:
Given user has already logged in to the application
|username|password|
|balajisaravana1996@gmail.com|Viratmahi@100|

Scenario: Count the no.of products in the home page
Given user is on the home page
When user counts the no.of products in the home page
Then user displays the no.of products

Scenario: Adding a product to the cart
Given user is on the home page
When user views the product using view icon
And user add the product to the cart using Add to cart icon
Then user checks the cart icon was updated

