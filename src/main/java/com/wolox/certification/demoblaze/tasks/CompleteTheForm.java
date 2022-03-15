package com.wolox.certification.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wolox.certification.demoblaze.userinterfaces.ContactPage.EMAIL_FIELD;
import static com.wolox.certification.demoblaze.userinterfaces.ContactPage.NAME_FIELD;
import static com.wolox.certification.demoblaze.userinterfaces.ContactPage.MESSAGE_FIELD;
import static com.wolox.certification.demoblaze.userinterfaces.ContactPage.BTN_SEND_MESSAGE;

public class CompleteTheForm implements Task {

    private final String contactEmail;
    private final String contactName;
    private final String message;

    public CompleteTheForm(String contactEmail, String contactName, String message) {
        this.contactEmail = contactEmail;
        this.contactName = contactName;
        this.message = message;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(contactEmail).into(EMAIL_FIELD),
                Enter.theValue(contactName).into(NAME_FIELD),
                Enter.theValue(message).into(MESSAGE_FIELD),
                Click.on(BTN_SEND_MESSAGE));
    }

    public static Performable withData(String contactEmail, String contactName, String message) {
        return Tasks.instrumented(CompleteTheForm.class, contactEmail, contactName, message);
    }
}
