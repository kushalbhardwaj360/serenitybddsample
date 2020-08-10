Feature: Mississauga
As a new resident of Mississauga
I want to explore the search
attempt to login with credentials

Scenario: Mississauga search and invalid credential login
Given I want to search Mississauga
When I want to search for 'I love Mississauga'
Then I click on login
And I enter Credentials 'Kushal' and 'thismypassword'
And I get error message
