package com.zlotko.pages.amazon;

import com.zlotko.core.BasePage;
import com.zlotko.pages.widgets.amazon.SearchWidget;
import com.zlotko.props.PropUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Maryna on 02.09.2017.
 */
public class HomePage extends BasePage {

    private static HomePage homePage;
    private SearchWidget searchWidget;

    public HomePage() {
        super();
        this.searchWidget = new SearchWidget();
    }

    public static HomePage get() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public HomePage open() {
        navigateTo(PropUtils.getStringValue("baseUrl"));
        return this;
    }

    public WebElement getSearchInput() {
        return findElement(By.id("twotabsearchtextbox"));
    }

    public WebElement getSearchButton() {
        return findElement(By.cssSelector("div[class*='search-submit']"));
    }
}
