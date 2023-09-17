package com.katalon_demo_cura.questions;

import com.katalon_demo_cura.userInterfaces.AppointmentConfirmationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
public class ValidateAppointmentConfirmation implements Question<Boolean> {
    private String confirmationMessage;
    public ValidateAppointmentConfirmation(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Validate_Confirmation = Text.of(AppointmentConfirmationUI.TXT_VALIDATE).viewedBy(actor).asString();
        if(confirmationMessage.equals(Validate_Confirmation)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public static ValidateAppointmentConfirmation validate(String confirmationMessage){
        return new ValidateAppointmentConfirmation (confirmationMessage);
    }
}
