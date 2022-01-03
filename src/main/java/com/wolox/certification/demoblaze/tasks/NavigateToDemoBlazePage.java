package com.wolox.certification.demoblaze.tasks;

import com.wolox.certification.demoblaze.userinterface.DemoBlazePageHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import static com.wolox.certification.demoblaze.userinterface.LoginPage.TAB_LOGIN;

public class NavigateToDemoBlazePage implements Task {
    DemoBlazePageHome page;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(page));
        actor.attemptsTo(Click.on(TAB_LOGIN));

    }
    public static NavigateToDemoBlazePage toGoToTheLoginTab()
    {
        return Tasks.instrumented(NavigateToDemoBlazePage.class);
    }
}
