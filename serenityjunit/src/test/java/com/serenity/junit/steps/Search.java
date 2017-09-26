package com.serenity.junit.steps;

import com.serenity.junit.ui.SearchWidgetImpl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class Search implements Task {

    private final String searchTerm;

    protected Search(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Step("Search for #searchTerm")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(searchTerm)
                     .into(SearchWidgetImpl.SEARCH_FIELD)
                     .thenHit(ENTER)
        );
    }

    public static Search forTheTerm(String searchTerm) {
        return instrumented(Search.class, searchTerm);
    }

}
