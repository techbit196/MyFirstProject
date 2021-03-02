package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features",
        glue={"Runner"},
        monochrome = true
//        plugin = ,
//        tags =
        )
public class RunnerClass {


}
