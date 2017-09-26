package com.zlotko.entities;

import com.zlotko.props.PropUtils;
import lombok.Getter;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.logging.Logger;

@Getter
public class WebDriverContainer {

    private final WebDriver driver;
    private final XMLConfig config;
    private final String currentTestName;

    private static final Logger LOG = Logger.getLogger(WebDriverContainer.class.getName());

    public WebDriverContainer(final ITestContext context, final Method method) {
        this.config = new XMLConfig(context.getCurrentXmlTest().getAllParameters());
        this.currentTestName = method.getName();
        this.driver = WebDriverFactory.getDriver(getCapabilities());
    }

    private DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(getBrowser());
        capabilities.setPlatform(getDefaultPlatform());
        return capabilities;
    }

    private String getBrowser() {
        return config.getBrowser();
    }

    private Platform getDefaultPlatform() {
        return Platform.WINDOWS;
    }

    public WebDriver getDriver() {
        return  driver;
    }
}
