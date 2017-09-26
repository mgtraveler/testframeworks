package com.serenity.junit.ui;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(SearchWidgetImpl.class)
public interface SearchWidget extends WidgetObject {
    WebElementFacade getSearchTextBox();

    WebElementFacade getSearchButton();
}
