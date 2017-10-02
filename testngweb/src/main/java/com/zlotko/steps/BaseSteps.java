package com.zlotko.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.zlotko.core.BaseTest.getDriver;

public class BaseSteps {

    private final WebDriver driver;
    private WebDriverWait wait;

    public BaseSteps() {
        this.driver = getDriver();

        if (driver != null) {
            wait = new WebDriverWait(driver, 15);
        }
    }

    public WebElement findElement(final WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void setText(final WebElement element, final CharSequence text) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }

    public String getValue(final WebElement element) {
        return findElement(element).getAttribute("value");
    }

    public void navigateTo(final String url) {
        driver.get(url);
    }

    public void click(final WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}