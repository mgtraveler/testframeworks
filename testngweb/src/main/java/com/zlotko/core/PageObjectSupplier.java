package com.zlotko.core;

public class PageObjectSupplier {
    private PageObjectSupplier() {
        throw new UnsupportedOperationException("Illegal access to private constructor");
    }

    public static <T> T $(Class<T> pageObject) throws InstantiationException, IllegalAccessException{
        return pageObject.newInstance();
    }
}
