#Autor: Luis Fernando Moreno

@stories
Feature: Academy Choucair
  as a user, I want to create a new user record on the uTest website

  @scenario1
  Scenario: Create a new user record
    Given than luis wants to create a new record in uTest
    When he enter the information corresponding to the record
    |strFirstName|strLastName|strEmail            |strMonth|strDay|strYear|strCity |strPostalCode|strPasword    |
    |Luis        |Moreno     |Luismoreno@gmail.com|August  |7     |1997   |Medellín|050044       |LuisMoreno2020|
    Then He will have a registered user within the uTest page
    |strText                                             |
    |Welcome to the world's largest community of testers.|