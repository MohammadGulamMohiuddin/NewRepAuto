package KB_Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/Feature_File",
glue={"Stepsdef"},monochrome=true,
tags="@KBSystem",
plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class TestNG_Runner  extends AbstractTestNGCucumberTests {

}
