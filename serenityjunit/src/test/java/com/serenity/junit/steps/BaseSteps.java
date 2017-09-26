package com.serenity.junit.steps;

import com.serenity.junit.ui.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {

    private HomePage homePage;

    @Step("Open the application")
    public void openHomePage() {
        homePage.open();
//        Open.browserOn().the(homePage);
    }
}
