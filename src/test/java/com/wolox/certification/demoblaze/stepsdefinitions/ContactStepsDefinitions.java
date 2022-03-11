package com.wolox.certification.demoblaze.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.wolox.certification.demoblaze.tasks.NavigateToDemoBlazePage;
import com.wolox.certification.demoblaze.questions.MenuContact;
import com.wolox.certification.demoblaze.tasks.CompleteTheForm;

import static com.wolox.certification.demoblaze.userinterfaces.ContactPage.TAB_CONTACT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ContactStepsDefinitions {

    @Given("^the (.*) is on the demoblaze contact page")
    public void theUserIsOnTheDemoblazeContactPage(String userName) {
        theActorCalled(userName);
        theActorInTheSpotlight().wasAbleTo(NavigateToDemoBlazePage.toGoToTheTab(TAB_CONTACT));
    }

    @When("^the user sends the message with (.*) ,(.*) and (.*)")
    public void theUserSendsTheMessageWithData(String contactEmail, String contactName, String message) {
        theActorInTheSpotlight().attemptsTo(CompleteTheForm.withData(contactEmail, contactName, message));
    }

    @Then("the user verify that the menu is displayed again")
    public void theUserVerifyThatTheMenuIsDisplayedAgain() {
        theActorInTheSpotlight().should(
                seeThat(MenuContact.isVisible(), equalTo(true)));
    }

}
