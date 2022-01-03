package com.wolox.certification.demoblaze.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.wolox.certification.demoblaze.userinterface.LoginPage.WELCOME_MESSAGE;

public class GetTheWelcome implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return WELCOME_MESSAGE.resolveFor(actor).getText();
    }

    public static GetTheWelcome message() {
        return new GetTheWelcome();
    }
}
