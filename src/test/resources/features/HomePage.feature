Feature: Home Page

  Background: Given user is on retail website
							When user click on sign in button
  @homePage
  Scenario: Verify user login into tek retail website
    
    And user enter email 'david.john@gmail.com' password 'David123$'
    And user click on log in button
    Then user is logged in
    
    
   #Rigester
   @Rigester
   Scenario: Verify user can register with tek retail website
   	When user click on create new account button
   	Then user enter information below 
   	|name|email|password|confirmPassword|
   	|David|david2221@gmail.com|Best123@|Best123@|
   	And user click on sign up button
   	Then user should be logged in
