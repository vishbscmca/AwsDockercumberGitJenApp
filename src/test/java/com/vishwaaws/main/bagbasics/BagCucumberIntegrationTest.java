package com.vishwaaws.main.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"pretty", "html:target/cucumber/bagbasics.html","json:target/cucumber/bagbasics.json"},
        extraGlue = "com.vishwaaws.main.bagcommons")
public class BagCucumberIntegrationTest {
}
