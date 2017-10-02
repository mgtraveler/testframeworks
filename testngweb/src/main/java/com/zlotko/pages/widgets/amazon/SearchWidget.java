package com.zlotko.pages.widgets.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.zlotko.core.BaseTest.getDriver;

/**
 * Created by Maryna on 02.09.2017.
 */
public class SearchWidget {

    @FindBy(how = How.ID, using = "nav-search")
    private WebElement rootElement;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(how = How.CSS, using = "div[class*='search-submit']")
    private WebElement searchButton;

    public SearchWidget() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
