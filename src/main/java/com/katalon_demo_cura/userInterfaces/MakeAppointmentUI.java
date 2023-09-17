package com.katalon_demo_cura.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class MakeAppointmentUI {
    public static final Target LBL_FACILITY = Target.the("Select the location of the medical appointment")
            .locatedBy("//option[@value='Seoul CURA Healthcare Center']");
    public static final Target BTN_NONE = Target.the("Select health care program")
            .located(By.id("radio_program_none"));
    public static final Target LBL_CALENDAR = Target.the("Select the appointment date")
           .located(By.id("txt_visit_date"));
    public static final Target LBL_COMMENT = Target.the("Enter comment")
            .located(By.id("txt_comment"));
    public static final Target BTN_BOOKAPPOINTMENT = Target.the("Click on the book appointment button")
            .located(By.id("btn-book-appointment"));

}
