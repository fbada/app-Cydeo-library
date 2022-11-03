Feature: HiOscar website UI insurance selection verification
  User story: The user should be able to select specifics from a set of dropdown menus to customize insurance

  @HiOscar
  Scenario Outline: Network Search selection verification for Oscar
    Given the user is on the homepage
    When the user clicks search Networks
    And from Coverage year dropdown Select "<year>" option
    And from Coverage access dropdown Select "<coverage>" option
    And  from Network partner dropdown Select "<partner>" option
    And from Coverage area dropdown Select "<area>"
    And Clicks Continue button
    Then Verify title contains "<title>"

    Examples:
      | year | coverage           | partner | area       | title |
      | 2023 | Employer-provided  | Oscar   | New Jersey | Oscar |
     # | 2022 | Medicare Advantage | Oscar   | Texas      | Oscar |
     # | 2022 | Medicare Advantage | Oscar   | Florida    | Oscar |

