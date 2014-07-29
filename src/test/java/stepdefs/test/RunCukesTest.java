package stepdefs.test;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: pfisher
 * Date: 7/29/14
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"pretty", "html:target/cucumber-html-report", "json.pretty:target/cucumber-report.json"},
        features = {"cucumber/test"},
        glue = {"stepdefs/test"}
)
public class RunCukesTest {
}
