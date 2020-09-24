package com.runnerUtility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = {"com.utility.customReportListener"},
monochrome=true,
glue={"stepDefinitions"},
features = {"src\\test\\java\\features"}
)
public class RunnerCucumber extends AbstractTestNGCucumberTests {
@DataProvider(parallel = true)
 @Override
 public Object[][] scenarios() {
 return super.scenarios();
 }
}