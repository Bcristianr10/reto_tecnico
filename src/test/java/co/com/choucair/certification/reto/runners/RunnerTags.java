package co.com.choucair.certification.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/u_test_choucair.feature",
        tags="@stories",
        glue="co.com.choucair.certification.reto.stepdefinitions",
        snippets= SnippetType.CAMELCASE)

public class RunnerTags {
}
