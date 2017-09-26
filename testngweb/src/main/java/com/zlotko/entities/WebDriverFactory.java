package com.zlotko.entities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    private volatile static WebDriver webdriverInstance;

    public static WebDriver getDriver(final DesiredCapabilities capabilities) {
        if (webdriverInstance == null) {
            synchronized (WebDriverFactory.class) {
                webdriverInstance = createNewDriver(capabilities);
            }
        }
        return webdriverInstance;
    }

    private static WebDriver createNewDriver(final DesiredCapabilities capabilities) {
        System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
