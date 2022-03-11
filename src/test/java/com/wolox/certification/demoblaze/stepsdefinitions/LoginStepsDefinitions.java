package com.wolox.certification.demoblaze.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.wolox.certification.demoblaze.exceptions.TheTextIsNotOnScreen;
import com.wolox.certification.demoblaze.questions.GetTheWelcome;
import com.wolox.certification.demoblaze.tasks.DoLogin;
import com.wolox.certification.demoblaze.tasks.NavigateToDemoBlazePage;

import static com.wolox.certification.demoblaze.userinterfaces.LoginPage.TAB_LOGIN;
import static com.wolox.certification.demoblaze.utils.constants.EnvironmentVariables.getVariable;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefinitions {

    @Given("^the (.*) is on the demoblaze login page")
    public void theUserIsOnTheDemoblazeLoginPage(String userName) {
        theActorCalled(userName);
        theActorInTheSpotlight().wasAbleTo(NavigateToDemoBlazePage.toGoToTheTab(TAB_LOGIN));
    }

    @When("^the user login with role (.*)")
    public void theUserLogInWithRole(String role) {
        theActorInTheSpotlight().attemptsTo(
                DoLogin.withCredentials(
                        getVariable(role.toUpperCase().concat("_USER")),
                        getVariable(role.toUpperCase().concat("_PASSWORD"))));
        theActorInTheSpotlight().remember("userName", getVariable(role.toUpperCase().concat("_USER")));
    }

    @Then("^the user verify that the text (.*) is displayed on the screen$")
    public void theUserVerifyThatTheTextIsDisplayedOnTheScreen(String message) {
        theActorInTheSpotlight().should(
                seeThat(GetTheWelcome.message(), equalTo(message + " " + theActorInTheSpotlight().recall("userName")))
                        .orComplainWith(TheTextIsNotOnScreen.class, TheTextIsNotOnScreen.WELCOME_MESSAGE_EXCEPTION));
    }
}
