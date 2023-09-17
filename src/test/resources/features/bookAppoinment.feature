@Stories
  Feature: Book an appointment on the katalon-demo-cura page
    As a user
    Want to enter the katalon-demo-cura page
    To book a medical appointment

@scenario
  Scenario: Book a medical appointment
    Given That the user enters the katalon-demo-cura page
    When User clicks the Request Appointment button and enters the credentials to log in
    And The user selects the information and confirms the appointment
    Then The user validates if the appointment was confirmed
      | confirmationMessage      |
      | Appointment Confirmation |