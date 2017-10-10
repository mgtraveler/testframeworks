package com.zlotko;

import com.zlotko.annotation.TestData;
import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;

import static com.zlotko.property.BaseConfig.BASE_CONFIG;

public class BaseTest {

    public static final String DATA_PROVIDER_METHOD = "loadDataFromYml";

    static {
        System.setProperty(BASE_CONFIG.binaryPath(), BASE_CONFIG.driver());
        com.codeborne.selenide.Configuration.browser = System.getProperty("browser");
        com.codeborne.selenide.Configuration.baseUrl = BASE_CONFIG.baseUrl();
    }

    @DataProvider(name = DATA_PROVIDER_METHOD)
    public Object[][] loadDataFromYml(Method method) {
        String ymlFile = "/" + method.getAnnotation(TestData.class).value();
        Map<String, Object> testData = loadYmlFile(ymlFile);
        return new Object[][]{{testData}};
    }

    private Map<String, Object> loadYmlFile(String path) {
        InputStream in = getClass().getResourceAsStream(path);
        Yaml yaml = new Yaml();
        return (Map<String, Object>) yaml.load(in);
    }
}