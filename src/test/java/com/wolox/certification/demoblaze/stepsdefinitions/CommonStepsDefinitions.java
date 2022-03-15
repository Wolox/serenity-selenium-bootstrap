package com.wolox.certification.demoblaze.stepsdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonStepsDefinitions {

    @Before
    public void setUp() {
        WebDriverManager.getInstance().setup();
        OnStage.setTheStage(new OnlineCast());
    }
}
