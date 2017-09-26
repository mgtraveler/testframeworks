package com.zlotko.pageobject.widget;

import com.codeborne.selenide.SelenideElement;

public class SearchWidget {
    private SelenideElement rootElement;

    public SearchWidget(final SelenideElement rootElement) {
        this.rootElement = rootElement;
    }

    public SelenideElement getSearchButton() {
        return rootElement.$x(".//*[@class='nav-input']");
    }

    public SelenideElement getSearchCategoryDropdown() {
        return rootElement.$x(".//*[@id='searchDropdownBox']");
    }

    public SelenideElement getSearchTextBox() {
        return rootElement.$x(".//*[@id='twotabsearchtextbox']");
    }
}
