package com.zlotko.core;

import com.zlotko.entities.WebDriverContainer;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Optional;

public class BaseTest {
    private static final ThreadLocal<WebDriverContainer> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    @BeforeMethod
    public void setUp(final ITestContext context, final Method method) {
        WEB_DRIVER_THREAD_LOCAL.set(new WebDriverContainer(context, method));
    }

    @AfterSuite
    public void cleanup() {
        Optional.ofNullable(WEB_DRIVER_THREAD_LOCAL.get())
                .map(WebDriverContainer::getDriver).get().quit();
    }

    public static WebDriver getDriver() {
        return Optional.ofNullable(WEB_DRIVER_THREAD_LOCAL.get())
                .map(WebDriverContainer::getDriver)
                .orElseThrow(() -> new IllegalStateException("Unable to get WebDriver instance"));
    }
}
