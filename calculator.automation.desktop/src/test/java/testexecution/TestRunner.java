package testexecution;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilities.WiniumDriverHelper;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue ={ "stepdefinitions", "utilities" },
		monochrome = true,
		// Use tags to filter what tests are want to run (Tags go at the top of feature files)
		tags = { "@Calculator" }, 
		plugin ={ 
				"pretty:target/resources/cucumber-pretty.txt", 
				"usage:TestReports/cucumber-usage.json",
				"json:TestReports/cucumber.json", })

public class TestRunner extends AbstractTestNGCucumberTests
{

	@BeforeTest
	@Parameters({"applicationPath"})
	public void testSuiteSetup(String applicationPath)
	{
		System.out.println("<---Test Suite Setup--->");
		WiniumDriverHelper.setupEnvironment(applicationPath);
	}

	@Before
	public void scenarioSetup()
	{
		System.out.println("<---Scenario Setup--->");
	}

	@After
	public void scenarioTearDown()
	{
		System.out.println("<---Scenario Tear Down--->");
	}

	@AfterTest (alwaysRun = true)
	public void testSuiteTearDown()
	{
		System.out.println("<---Test Suite Tear Down--->");
		//WiniumDriverHelper.killDriver();
	}
}
