package com.zlotko.props;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

import java.util.Arrays;

public class PropUtils {
    private static final CompositeConfiguration MIXED_CONFIG;

    static {
        try {
            MIXED_CONFIG = new CompositeConfiguration(Arrays.asList(
                    new SystemConfiguration(),
                    new PropertiesConfiguration("D:\\testframeworks\\testngweb\\src\\main\\resources\\config.properties")));
        } catch (Exception ex) {
            throw new IllegalArgumentException("Can't load properties", ex);
        }
    }

    private PropUtils() {
    }

    public static final class Constants {
        public static final String HUB_URL = getStringValue("hub.url.arg");
        public static final int VISIBILITY_TIMEOUT = getIntValue("element.visibility.timeout.arg");

        private Constants() {
        }
    }

    public static String getStringValue(final String key) {
        return MIXED_CONFIG.getString(key);
    }

    public static int getIntValue(final String key) {
        return MIXED_CONFIG.getInt(key);
    }

    public static boolean getBoolValue(final String key) {
        return MIXED_CONFIG.getBoolean(key);
    }
}
