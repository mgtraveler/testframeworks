package com.zlotko.steps;

import com.zlotko.pageobject.HomePage;

public class BaseSteps {

    private HomePage homePage;

    public BaseSteps() {
        this.homePage = HomePage.get();
    }

    public void goToHomePage() {
        homePage.open();
    }
}