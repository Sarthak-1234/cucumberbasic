Feature: Related to homepage

Scenario: Check Title of Gmail page
Given I launch gmail url
Then I verify title of gmail page

Scenario: Check components of gmail homepage
Given I launch gmail url
Then I verify below components 


Scenario Outline: Check components of gmail homepage
Given I launch gmail url
Then I verify below components "<component>"
Examples:
			|	component	|
			|	GoogleLogo	|
			|SignIn Text|
			|Continue to gmail text|
			|email textbox|
			|forget email|
			|learn more|
			|create account|
			|next button|
			|language|
			|help|
			|privacy|
			|term|
			
	
@dataset		
Scenario: Check components of gmail homepage
Given I launch gmail url
Then I verify below components of gmail homepage
			|				GoogleLogo				|
			|				SignIn Text				|
			|Continue to gmail text|
			|email textbox|
			|forget email|
			|learn more|
			|create account|
			|next button|
			|language|
			|help|
			|privacy|
			|term|










