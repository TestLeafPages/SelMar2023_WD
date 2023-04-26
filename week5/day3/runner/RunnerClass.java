package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features="src/test/java/features/CreaateLead.feature",
                        glue="steps",
                        monochrome=true,
                        publish=true)




public class RunnerClass extends BaseClass {

}
