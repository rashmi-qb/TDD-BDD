Feature - Password Validation
Scenario: Password is not Null
Given User can enter Password
When user enter Password as "test@123"
Then the Password strength is strong.