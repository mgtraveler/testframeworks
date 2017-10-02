package com.zlotko.amazon;

import com.zlotko.core.BaseTest;
import com.zlotko.steps.SearchSteps;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Maryna on 02.09.2017.
 */
public class SearchTest extends BaseTest {

    private SearchSteps searchSteps = new SearchSteps();

    @DataProvider(name = "test1")
    public static Object[] primeNumbers() {
        return new Object[] {"Alex", "Maryna"};
    }

    @Test(dataProvider = "test1")
    public void testCanSearch(final String searchTerm) {
        searchSteps.onHomePage();
        searchSteps.searchFor(searchTerm);
    }
}
