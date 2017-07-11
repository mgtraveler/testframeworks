package com.cucumber.junit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber/cucumber-pretty"})
public class RunCukesTest {
}
