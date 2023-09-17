package com.katalon_demo_cura.stepDefinitions;

import com.katalon_demo_cura.interactions.AppointmentConfirmation;
import com.katalon_demo_cura.questions.ValidateAppointmentConfirmation;
import com.katalon_demo_cura.tasks.HomePageTask;
import com.katalon_demo_cura.tasks.LoginPageTask;
import com.katalon_demo_cura.tasks.MakeAppointmentTask;
import com.katalon_demo_cura.tasks.Opens;
import com.katalon_demo_cura.utils.UrlPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.katalon_demo_cura.utils.Constants.ACTOR_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BookAppointmentStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver browser;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME).can(BrowseTheWeb.with(browser));
    }
    @Given("^That the user enters the katalon-demo-cura page$")
    public void thatTheUserEntersTheKatalonDemoCuraPage() {
        theActorInTheSpotlight().wasAbleTo(
                Opens.Browser(UrlPage.URLPAGE)
        );
    }
    @When("^User clicks the Request Appointment button and enters the credentials to log in$")
    public void userClicksTheRequestAppointmentButtonAndEntersTheCredentialsToLogIn() {
        theActorInTheSpotlight().attemptsTo(
                HomePageTask.on(),
                LoginPageTask.login()
        );
    }
    @When("^The user selects the information and confirms the appointment$")
    public void theUserSelectsTheInformationAndConfirmsTheAppointment() {
        theActorInTheSpotlight().attemptsTo(
                MakeAppointmentTask.select()
        );
    }
    @Then("^The user validates if the appointment was confirmed$")
    public void theUserValidatesIfTheAppointmentWasConfirmed(List<AppointmentConfirmation> confirmation) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateAppointmentConfirmation.validate(confirmation.get(0).getConfirmationMessage()))
        );
    }
}
