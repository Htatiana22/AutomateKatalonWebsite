package com.katalon_demo_cura.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AppointmentConfirmationUI {

    public static final Target TXT_VALIDATE = Target.the("Display message")
          .located(By.cssSelector("h2"));
}