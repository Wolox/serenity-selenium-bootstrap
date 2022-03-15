package com.wolox.certification.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import static com.wolox.certification.demoblaze.utils.constants.EnvironmentVariables.BASE_URL;

public class NavigateToDemoBlazePage implements Task {

    public static Target TAB_NAME;

    public NavigateToDemoBlazePage(Target tabName) {
        this.TAB_NAME = tabName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(BASE_URL),
                Click.on(TAB_NAME));
    }
    public static NavigateToDemoBlazePage toGoToTheTab(Target tabName)
    {
        return Tasks.instrumented(NavigateToDemoBlazePage.class,tabName);
    }
}
