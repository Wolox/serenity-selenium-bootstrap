package com.wolox.certification.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (
                features = "src/test/resources/features/login.feature",
                glue = "com.wolox.certification.demoblaze.stepsdefinitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE
        )

public class LoginRunner {
}
