package com.katalon_demo_cura.tasks;

import com.katalon_demo_cura.userInterfaces.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class HomePageTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageUI.BTN_MAKEAPPOINTMENT)
        );
    }
    public static HomePageTask on(){
        return instrumented(HomePageTask.class);
    }
}
