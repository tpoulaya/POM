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
@CucumberOptions(features = { "src/test/resources/AppFeatures" }, glue = { "stepDefinition", "AppHooks" }, 
plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/" })

public class MyTestRunner {

}
