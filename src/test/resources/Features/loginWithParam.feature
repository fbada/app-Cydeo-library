Feature: Login with parameters

  Background:
    Given user is on the login page

  @librarianParam
  Scenario: Login as librarian 49
    When the user enters username "librarian49@library"
    And the user enters password "8l9bsLAN"
    And the user enters clicks the sign in button
    Then there should be 1309 users

  @multiUserLogin
  Scenario Outline: Login as user and verify the name in dashboard
    When the user enters "<username>" and "<password>"
    Then the user should see their "<name>" in the dashboard

    @students
    Examples:
      | username          | password | name            |
      | student27@library | E1uZrsAu | Test Student 27 |
      | student28@library | tJ93UQS3 | Test Student 28 |
      | student29@library | g8EyNm9B | Test Student 29 |
      | student30@library | QX6FWzj6 | Test Student 30 |

    @librarians
    Examples:
      | username            | password | name              |
      | librarian13@library | YCJCbmU3 | Test Librarian 13 |
      | librarian14@library | bWN7YaaB | Test Librarian 14 |
      | librarian15@library | YLu0ZIMj | Test Librarian 15 |
      | librarian16@library | MnG7Xy72 | Test Librarian 16 |
      | librarian17@library | adE5UAha | Test Librarian 17 |

