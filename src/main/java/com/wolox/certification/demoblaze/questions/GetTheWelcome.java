package com.wolox.certification.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wolox.certification.demoblaze.userinterfaces.LoginPage.WELCOME_MESSAGE;

public class GetTheWelcome implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(WELCOME_MESSAGE, WebElementStateMatchers.isVisible()));
        return WELCOME_MESSAGE.resolveFor(actor).getText();
    }

    public static GetTheWelcome message() {
        return new GetTheWelcome();
    }
}
