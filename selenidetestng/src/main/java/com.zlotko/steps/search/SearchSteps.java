package com.zlotko.steps.search;

import com.zlotko.pageobject.HomePage;
import com.zlotko.pageobject.widget.SearchWidget;

public class SearchSteps {

    private HomePage homePage;

    public SearchSteps() {
        this.homePage = HomePage.get();
    }

    public void searchFor(final String searchTerm) {
        SearchWidget searchWidget = homePage.getSearchWidget();
        searchWidget.getSearchTextBox().val(searchTerm);
        searchWidget.getSearchButton().click();
    }
}