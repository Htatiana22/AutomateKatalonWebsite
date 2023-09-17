package com.katalon_demo_cura.tasks;

import com.katalon_demo_cura.userInterfaces.MakeAppointmentUI;
import com.katalon_demo_cura.utils.EnterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Map;

import static com.katalon_demo_cura.userInterfaces.MakeAppointmentUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakeAppointmentTask implements Task {

    private static ArrayList<Map<String, String>> data= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_FACILITY),
                Click.on(MakeAppointmentUI.BTN_NONE),
                Enter.theValue(EnterData.extractTo().get(0).get("Visit Date")).into(LBL_CALENDAR).thenHit(Keys.ENTER),
                //Click.on(MakeAppointmentUI.CALENDAR_LIST),
                Enter.theValue(EnterData.extractTo().get(0).get("Comment")).into(LBL_COMMENT),
                Click.on(MakeAppointmentUI.BTN_BOOKAPPOINTMENT)
        );
    }
    public static MakeAppointmentTask select(){
        return instrumented(MakeAppointmentTask.class);
    }
}
