package com.katalon_demo_cura.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {

    public static Target BTN_MAKEAPPOINTMENT = Target.the("Click on the button")
            .located(By.id("btn-make-appointment"));
}
