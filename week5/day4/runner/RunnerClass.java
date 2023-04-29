package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;
import steps.Hooks;



@CucumberOptions(features="src/test/java/features/Login.feature",
                        glue={"steps"},
                        monochrome=true,
                        publish=true
                        //tags="not @regression"
                        )

// tags="@smoke",tags="@smoke or @regression,tags=@smoke and @testleaf


public class RunnerClass extends BaseClass {

}
