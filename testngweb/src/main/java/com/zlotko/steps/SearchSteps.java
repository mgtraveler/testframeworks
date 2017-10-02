package com.zlotko.steps;

import com.zlotko.pages.amazon.HomePage;
import com.zlotko.props.PropUtils;

public class SearchSteps extends BaseSteps {

    private HomePage homePage;

    public SearchSteps() {
        homePage = HomePage.get();
    }

    public void onHomePage() {
        navigateTo(PropUtils.getStringValue("baseUrl"));
    }

    public void searchFor(final String searchTerm) {
        setText(homePage.getSearchWidget().getSearchInput(), searchTerm);
        click(homePage.getSearchWidget().getSearchButton());
    }
}