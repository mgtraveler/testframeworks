package com.zlotko.pages.widgets.amazon;

import com.zlotko.entities.WebDriverContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.zlotko.core.BaseTest.getDriver;

/**
 * Created by Maryna on 02.09.2017.
 */
public class SearchWidget {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "nav-search")
    private WebElement rootElement;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(how = How.CSS, using = "div[class*='search-submit']")
    private WebElement searchButton;

    public SearchWidget() {
        driver = getDriver();
    }


    public SearchWidget searchFor(final String searchTerm) {
        searchInput.sendKeys(searchTerm);
        searchButton.click();
        return this;
    }
}
