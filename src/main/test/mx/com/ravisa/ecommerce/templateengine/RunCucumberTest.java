package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},features = "src/main/test/resources/mx/com/ravisa/ecommerce/templateengine")
public class RunCucumberTest {
}
