Feature: clickup demo21
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Login
@uida1985858627
@set21
@test001
Scenario Outline: Verify the user is able to login
Given I have access to Clickup application
When I entered Work Email in login as '<Work Email>'
And I entered Password in login as '<Password>'
And I selected Log In in login
Then '<page>' is displayed with '<content>'

Examples:
|SlNo.|Work Email|Password|page|content|
|1|WorkEmail1|Password1|Login|NA|


#Total No. of Test Cases : 1

