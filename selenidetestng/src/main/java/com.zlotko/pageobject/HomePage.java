package com.zlotko.pageobject;

import com.codeborne.selenide.Selenide;
import com.zlotko.pageobject.widget.SearchWidget;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
import static com.zlotko.property.BaseConfig.BASE_CONFIG;

@Getter
public class HomePage {
    private static HomePage homePage;
    private SearchWidget searchWidget;

    public HomePage() {
        searchWidget = new SearchWidget($x(".//*[@id='nav-search']"));
    }

    public static HomePage get() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public HomePage open() {
        Selenide.open(BASE_CONFIG.baseUrl());
        return this;
    }
}
