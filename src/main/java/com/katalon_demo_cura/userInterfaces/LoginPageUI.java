package com.katalon_demo_cura.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class LoginPageUI  {
    public static final Target LBL_USERNAME = Target.the("Enter user")
            .located(By.id("txt-username"));
    public static final Target LBL_PASSWORD = Target.the("Enter password")
            .located(By.id("txt-password"));
    public static final Target BTN_LOGIN = Target.the("Click on the button")
            .located(By.id("btn-login"));
}
