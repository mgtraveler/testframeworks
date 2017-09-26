package com.serenity.junit.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.serenity.junit.ui.HomePage;

public class OpenTheApplication implements Task {

    HomePage googleSearchPage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(googleSearchPage)
        );
    }
}
