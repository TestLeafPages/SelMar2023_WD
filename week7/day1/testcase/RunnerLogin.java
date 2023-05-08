package testcase;

import org.testng.annotations.DataProvider;

import baseClass.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/LoginData.feature",
glue="pages")

public class RunnerLogin extends BaseClass{

	
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
       
        }
	
}
