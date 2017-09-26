package com.zlotko.search;

import com.zlotko.BaseTest;
import com.zlotko.asserts.search.SearchAsserts;
import com.zlotko.steps.BaseSteps;
import com.zlotko.steps.search.SearchSteps;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    private BaseSteps baseSteps = new BaseSteps();
    private SearchSteps searchSteps = new SearchSteps();
    private SearchAsserts searchAsserts = new SearchAsserts();

    @Test()
    public void testCanSeeSelectedSearchCategory() {
        baseSteps.goToHomePage();
        searchSteps.searchFor("book");
        searchAsserts.assertSearchCategoryEquals("Books");
    }
}