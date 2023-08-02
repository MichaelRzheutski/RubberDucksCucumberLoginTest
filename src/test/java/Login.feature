Feature: Login

  Background:
    Given user is on main page

  Scenario Outline: login with valid credentials
    When user types <email> in email field
    And user types <password> in password field
    And user clicks login button
    Then the <message> message appears

    Examples:
      | email                    | password             | message                                                        |
      | "michael.test@gmail.com" | "30203050"           | "You are now logged in as Michał Ržavucki."                    |

  Scenario Outline: login with invalid credentials
    When user types <email> in email field
    And user types <password> in password field
    And user clicks login button
    Then the <message> message appears

    Examples:
      | email                    | password             | message                                                        |
      | "incorrect@gmail.com"    | "incorrect password" | "Wrong password or the account is disabled, or does not exist" |