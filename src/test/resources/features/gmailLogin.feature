Feature: Feature related to login

@Smoke @Regression
Scenario: For Correct Username and Correct Password For One Username
Given I launch gmail url
When I enter "sarthak.mzn"
And I click on Next button
When I enter "pass1"
And I click on Next button
Then I am able to login

@fail
Scenario: For Incorrect Username
Given I launch gmail url
When I enter "sfsdafsadfsafsad"
Then I am seeing error message

@current1
Scenario Outline: For Correct Username and Correct Password For Six Username
Given I launch gmail url
When I enter "<username>"
And I click on Next button
When I enter "<password>"
And I click on Next button
Then I am able to login
Examples:
	|	username	|	password	|
	|   sarthak1	|   password1	|
	|	sarthak2	|	password2	|
	|	sarthak3	|	password3	|
	|	sarthak4	|	password4	|
	
