package com.katalon_demo_cura.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.katalon_demo_cura.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Runner {
}
