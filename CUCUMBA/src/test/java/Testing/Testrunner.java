package Testing;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/login/login.feature"},
glue= {"examples"},
dryRun=false,
plugin={"html:testouput/alex.html","json:testouput/alex.json","junit:testoutput/alex.html"}
 // this will check whether all the methods are properly implemented
)
public class Testrunner {
}
