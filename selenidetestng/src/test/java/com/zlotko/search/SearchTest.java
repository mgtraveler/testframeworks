package com.zlotko.search;

import com.zlotko.BaseTest;
import com.zlotko.annotation.TestData;
import com.zlotko.asserts.search.SearchAsserts;
import com.zlotko.steps.BaseSteps;
import com.zlotko.steps.search.SearchSteps;
import org.testng.annotations.Test;

import java.util.Map;

public class SearchTest extends BaseTest {

    private BaseSteps baseSteps = new BaseSteps();
    private SearchSteps searchSteps = new SearchSteps();
    private SearchAsserts searchAsserts = new SearchAsserts();

    @Test(dataProvider = DATA_PROVIDER_METHOD)
    @TestData("testdata/book.yml")
    public void testCanSeeSelectedSearchCategory(final Map<String, Object> testData) {
        String searchTerm = (String) testData.get("searchTerm");
        String searchCategory = (String) testData.get("searchCategory");

        baseSteps.goToHomePage();
        searchSteps.searchFor(searchTerm);

        searchAsserts.assertSearchCategoryIsSelected(searchCategory);
        searchAsserts.assertSearchCategoryEquals(searchCategory);
    }
}