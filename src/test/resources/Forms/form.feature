
@tag
Feature: Form feature

  @Smoke
  Scenario: To validate simple form and all textboxes present
    Given  user opens chrome browser and enters simpleform url
    And textbox should be Enabled or Not
    When user can enter text in this fields firstname, lastname, Emailid, mobileno, textbox
    And after entering valid_datas user can ablle to click a submit button
    Then user can able to see pop window is display or not
    

  
