package com.zlotko.amazon;

import com.zlotko.core.BaseTest;
import com.zlotko.pages.amazon.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Maryna on 02.09.2017.
 */
public class SearchTest extends BaseTest {

    @DataProvider(name = "test1")
    public static Object[] primeNumbers() {
        return new Object[] {"Alex", "Maria"};
    }

    @Test(dataProvider = "test1")
    public void testCanSearch(final String searchTerm) {
        HomePage.get().open().
                getSearchWidget().
                searchFor(searchTerm);
    }
}
