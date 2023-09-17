package com.katalon_demo_cura.tasks;

import com.katalon_demo_cura.userInterfaces.LoginPageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.ArrayList;
import java.util.Map;

import static com.katalon_demo_cura.userInterfaces.LoginPageUI.LBL_PASSWORD;
import static com.katalon_demo_cura.userInterfaces.LoginPageUI.LBL_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.katalon_demo_cura.utils.EnterData;

public class LoginPageTask implements Task {
    private static ArrayList<Map<String, String>> data= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(EnterData.extractTo().get(0).get("Username")).into(LBL_USERNAME),
                Enter.theValue(EnterData.extractTo().get(0).get("Password")).into(LBL_PASSWORD),
                Click.on(LoginPageUI.BTN_LOGIN)

        );
    }public static LoginPageTask login(){
        return instrumented(LoginPageTask.class);
    }
}
