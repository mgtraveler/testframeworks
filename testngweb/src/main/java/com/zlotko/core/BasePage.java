package com.zlotko.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.zlotko.core.BaseTest.getDriver;

/**
 * Created by Maryna on 02.09.2017.
 */
public class BasePage {

    private final WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = getDriver();

        if (driver != null) {
            wait = new WebDriverWait(driver, 15);
        }
    }

    public WebElement findElement(final By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void setText(final By locator, final CharSequence text) {
        findElement(locator).sendKeys(text);
    }

    public String getValue(final By locator) {
        return findElement(locator).getAttribute("value");
    }

    public void navigateTo(final String url) {
        driver.get(url);
    }
}