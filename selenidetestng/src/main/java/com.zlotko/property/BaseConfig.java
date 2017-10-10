package com.zlotko.property;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.ConfigFactory;

@Sources("classpath:BaseConfig.properties")
public interface BaseConfig extends Config {

    BaseConfig BASE_CONFIG = ConfigFactory.create(BaseConfig.class, System.getenv(), System.getProperties());

    @Key("driver")
    String driver();

    @Key("browser")
    String browser();

    @Key("baseUrl")
    String baseUrl();

    @Key("binary.path")
    String binaryPath();
}