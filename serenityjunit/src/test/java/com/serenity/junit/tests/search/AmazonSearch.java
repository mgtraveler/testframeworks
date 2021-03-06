package com.serenity.junit.tests.search;

import com.serenity.junit.steps.BaseSteps;
import com.serenity.junit.steps.SearchSteps;
import com.serenity.junit.tests.Configuration;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AmazonSearch extends Configuration{

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    BaseSteps baseSteps;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void testCanSearch() {
        baseSteps.openHomePage();
        searchSteps.searchForTerm("kindle");
    }
}
