package br.com.marvelopedia.bemol;


import br.com.marvelopedia.bemol.core.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTestes.json", "html:target/reports/"},
        features = {"src/main/resources/features/"},
        tags = {"@test"},
        glue = {"br.com.marvelopedia.bemol"}
)

public class RunTest extends BaseTest {

}