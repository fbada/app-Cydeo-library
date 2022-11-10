@smoke
Feature: A Search functionality on the users page
  As a user, when I login as a librarian and I go to Users page, then table should have following columns:
  • Actions
  • UserID
  • Full Name
  • Email
  • Group
  • Status


  Scenario: Table columns names
    Given user is on the login page
    And user logs in as a librarian
    And clicks on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |