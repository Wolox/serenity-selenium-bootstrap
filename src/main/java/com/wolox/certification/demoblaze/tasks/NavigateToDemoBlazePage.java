package com.wolox.certification.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import static com.wolox.certification.demoblaze.userinterfaces.LoginPage.TAB_LOGIN;
import static com.wolox.certification.demoblaze.utils.constants.EnvironmentVariables.BASE_URL;

public class NavigateToDemoBlazePage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.url(BASE_URL));
        actor.attemptsTo(Click.on(TAB_LOGIN));

    }
    public static NavigateToDemoBlazePage toGoToTheLoginTab()
    {
        return Tasks.instrumented(NavigateToDemoBlazePage.class);
    }
}
