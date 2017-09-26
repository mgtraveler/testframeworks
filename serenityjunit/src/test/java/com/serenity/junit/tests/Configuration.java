package com.serenity.junit.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuration {

    static {
        System.setProperty("webdriver.gecko.driver", "D:\\testframeworks\\serenityjunit\\driver\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
    }
}
