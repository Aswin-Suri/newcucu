Feature: Test the skillrary app
 1)valid case
 2)invalid case
  Background:
   Given open browser navigate to the login page
 #Scenario: To test login with valid credentials
    #When Enter username "user"
    #And Enter password "user"
    #And click on login button
    #Then I should see username as "Harry Den" 
 #Scenario: To test login with valid Admin credentials
    #When Enter username "admin"
    #And Enter password "admin"
    #And click on login button
    #Then I should see usernames as "SkillRary Admin"
    #scenario outline to test login with all positve cases
    @PositveTesting
 Scenario Outline:
  When Enter username "<user>"
    And Enter password "<pwd>"
    And click on login button
    Then I should see username as "<username>"
   
  Examples:
  |user|pwd|username|
  |user|user|Harry Den|
  |user|user|Harry Den|
  |admin|admin|SkillRary Admin|
    
    #@stands for tag
    @NegativeTesting
 Scenario: To test login with invalid Admin credentials
    When Enter username "aswin"
    And Enter password "aswin"
    And click on login button
    Then I should navigate to the page "SkillRary Courses"