package com.serenity.junit.ui;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@Getter
@DefaultUrl("https://www.amazon.com/")
public class HomePage extends PageObject {

    @FindBy(xpath = ".//*[@ui-sref='product-search.filter']")
    private WebElementFacade searchButton;

    @FindBy(id = "nav-search")
    SearchWidget searchWidget;

    public HomePage(final WebDriver driver) {
        super(driver);
    }
}
