Feature: Test the makemytrip application

Scenario: Test the one way route
Given user is on landingpage
And user closes the popup appaears
When user select a oneway trip
And use select the From and To cities
And user selects date
Then user checks and prints the message in the consol