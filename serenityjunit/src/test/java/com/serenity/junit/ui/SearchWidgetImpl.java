package com.serenity.junit.ui;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

@Getter
public class SearchWidgetImpl extends WidgetObjectImpl implements SearchWidget{
    public static Target SEARCH_FIELD = Target.the("search field").located(By.name("q"));

    @FindBy(id = "twotabsearchtextbox")
    private WebElementFacade searchTextBox;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElementFacade searchButton;

    public SearchWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                        final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public SearchWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }
}
