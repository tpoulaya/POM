/**
 * 
 */
package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author tpoulaya
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/AppFeatures" }, glue = { "stepDefinition", "AppHooks" }, plugin = {"pretty" }, publish = true)

public class MyTestRunner {

}
