package com.zlotko.asserts.search;

import com.zlotko.pageobject.HomePage;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchAsserts {
    private HomePage homePage;

    public SearchAsserts() {
        this.homePage = HomePage.get();
    }

    public void assertSearchCategoryEquals(final String category) {
        assertThat(homePage.getSearchWidget().getSearchCategoryDropdown().getText()).as("Seacrh Category").
                isEqualToIgnoringCase(category);
    }
}
