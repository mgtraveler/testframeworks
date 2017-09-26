package com.serenity.junit.steps;

import com.serenity.junit.ui.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps{

    private HomePage homePage;

    @Step
    public void searchForTerm(final String searchTerm) {
        homePage.getSearchWidget().getSearchTextBox().type(searchTerm);
        homePage.getSearchWidget().getSearchButton().click();
    }
}
