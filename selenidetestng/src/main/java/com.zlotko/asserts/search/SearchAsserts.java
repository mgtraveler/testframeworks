package com.zlotko.asserts.search;

import com.zlotko.pageobject.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchAsserts {

    private static final String SEARCH_CATEGORY = "Search Category";
    private HomePage homePage;

    public SearchAsserts() {
        this.homePage = HomePage.get();
    }

    public void assertSearchCategoryEquals(final String category) {
        assertThat(homePage.getSearchWidget().getSearchCategoryDropdown().getText()).as(SEARCH_CATEGORY).
                isEqualToIgnoringCase(category);
    }

    public void assertSearchCategoryIsSelected(final String category) {
        assertThat(homePage.getSearchWidget().getSelectedCategoryOption().getText()).as(SEARCH_CATEGORY).
                isEqualToIgnoringCase(category);
    }
}