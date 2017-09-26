package com.serenity.junit.assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.FluentWait;
import org.slf4j.Logger;

import com.google.common.base.Predicate;

public final class PollingAssertion {
    //private static final Logger LOG = Utils.getLoggerForClass();

    private static final int TIMEOUT_SEC = 30;
    private static final int TIMEOUT_MS = 2500;

    private PollingAssertion() {
    }

    public static void assertPolling(final Runnable assertionCode) {
        assertPolling(TIMEOUT_SEC, TIMEOUT_MS, assertionCode);
    }

    public static void assertPolling(final int timeoutSeconds, final int pollingMs, final Runnable assertionCode) {
        final AssertionError[] actualError = new AssertionError[1];
        try {
            FluentWait<Runnable> fluentWait = new FluentWait<>(assertionCode);
            fluentWait.pollingEvery(pollingMs, TimeUnit.MILLISECONDS).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
                    .until((Runnable input) -> {
                        try {
                            input.run();
                            return true;
                        } catch (AssertionError error) {
                            actualError[0] = error;
                            //LOG.info(error.getMessage());
                        }
                        return false;
                    });

        } catch (TimeoutException e) {
            throw new AssertionError("Timeout: " + timeoutSeconds + " seconds. " + actualError[0].getMessage(), e);
        }
    }
}
