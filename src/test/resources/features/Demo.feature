Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: The user want change to change notifications popup

    Given The user is logged: <email>, <password>
    When the user access to settings funcionality
    And  the user clicks the button show notifications
    Then verify that the state of the button is <buttonStatus>



    @Dem
    Examples:
      | email                       | password    | buttonStatus|
      | cfernandezpando30@gmail.com | norepetiras | false       |

Scenario Outline: the user add a task
  Given The user is logged: <email>, <password>
  When the user click in proyects
  And the user add a <task>
  Then verify that the task <task> is added

  @Demo
  Examples:
    | email                       | password    | task|
    | cfernandezpando30@gmail.com | norepetiras |  tarea5   |
