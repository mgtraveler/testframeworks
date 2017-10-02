package com.zlotko.pages.amazon;

import com.zlotko.pages.AbstractPage;
import com.zlotko.pages.widgets.amazon.SearchWidget;
import com.zlotko.props.PropUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.zlotko.core.BaseTest.getDriver;

/**
 * Created by Maryna on 02.09.2017.
 */
public class HomePage extends AbstractPage {

    private static HomePage homePage;
    private SearchWidget searchWidget;

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
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
}
