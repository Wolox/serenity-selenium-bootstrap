package com.wolox.certification.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.wolox.certification.demoblaze.userinterfaces.ContactPage.TAB_CONTACT;

public class MenuContact implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return TAB_CONTACT.isVisibleFor(actor);
    }

    public static MenuContact isVisible() {
        return new MenuContact();
    }
}
