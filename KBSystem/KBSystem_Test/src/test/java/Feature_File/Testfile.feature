Feature: Application Login

Background:
When Launch the browser
And Hit the database

@KBSystem @InsuranceCopilot
Scenario: Page Practice default login
Given Landed on the Practice Login Page
When User Login in the Practice login page
| Max |
| ABCD |
| 1234 |
Then Home page is displayed
And Dashboard is visible

Scenario: Admin Page default login

Given Landed on the KB System Login Page
When User Login in the KB-System using "admin" and "1234"
Then Home page is displayed
And Dashboard is visible



Scenario: Admin Page default login
Given Landed on the KB System Login Page
When User Login in the KB-System using "user" and "0987"
Then Home page is displayed
And Dashboard is visible



@KBSystem @SQLQueryGenerator
Scenario Outline: Page default login

Given Landed on the Practice Login Page
When User Login in the KB-System using username "<Username>" and password "<Password>"
Then Home page is displayed
And Dashboard is visible

Examples:
	|	Username	|	Password		|
	|	Admin		|	GenAI@hex#2024	|
	|	Viewer		|	GenAI@hex#2024	|

#//Before->Backgroung->Scenario->After







