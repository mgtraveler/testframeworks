package com.zlotko;

import static com.zlotko.property.BaseConfig.BASE_CONFIG;

public class BaseTest {

    static {
        System.setProperty("webdriver.chrome.driver", BASE_CONFIG.driver());
        com.codeborne.selenide.Configuration.browser = BASE_CONFIG.browser();
        com.codeborne.selenide.Configuration.baseUrl = BASE_CONFIG.baseUrl();
    }
}
