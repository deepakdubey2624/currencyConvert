Feature: Saving the user information in the app

  Scenario Outline: Successful in saving user informaion
    Given I input the username as "<username>"
    And provide the password as "<password>"
    And provide the confirm password as "<confirmPassword>"
    And provide the email as "<email>"
    And provide the postal address as "<postalAddress>"
    And provide the street as "<street>"
    And provide the zipcode as "<zipcode>"
    And provide the city as "<city>"
    And provide the country as "<country>"
    And provide the dob as "<dob>"
    And I am able to save the information
    
	Examples:
		| username  | password  | confirmPassword | email               | postalAddress | street  | zipcode | city    | country   | dob        |
		| Deepak dwivedi | Deepakd@92 | Deepakd@92       | deepakdubey2624@gmail.com | VikasNagar			  | Chinhat | 226022  | Lucknow | INDIA     | 2000-03-01 |
		| deepakd | Deepakd@92 | Deepakd@92       | deepakd@gmail.com | VikasNagar			  | VikasNagar | 226022  | Lucknow | INDIA     | 2000-03-01 |
		| deepakd | Deepakd@92 | Deepakd@92       | deepakd92@gmail.com | VikasNagar			  | VikasNagar | 226022  | Lucknow | INDIA     | 2000-03-01 |