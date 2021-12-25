package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-html-reports", "pretty"},
        features = {"src/test/java/features"},
        glue = {"definitions"}
)

public class RunnerAll {
}


