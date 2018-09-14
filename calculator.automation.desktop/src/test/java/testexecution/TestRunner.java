package testexecution;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilities.TestHelper;
import utilities.WiniumDriverHelper;

@CucumberOptions(features = "src/test/resources/Features", glue =
{ "stepdefinitions", "utilities", "testexecution" }, monochrome = true,
		// Use tags to filter what tests are want to run (Tags go at the top of feature
		// files)
		tags =
		{ "@SimpleAddition" }, plugin =
		{ "pretty:target/resources/cucumber-pretty.txt", "usage:TestReports/cucumber-usage.json",
				"json:TestReports/cucumber.json", })

public class TestRunner extends AbstractTestNGCucumberTests
{

	@BeforeTest
	@Parameters(
	{ "applicationPath", "machineIp", "machinePort", "folderDirectory" })
	public void testSuiteSetup(String applicationPath, String machineIp, int machinePort, String folderDirectory)
	{
		System.out.println("<---Test Suite Setup--->");
		WiniumDriverHelper.setupEnvironment(applicationPath, machineIp, machinePort);
		TestHelper.setLogPath(folderDirectory);
	}

	@Before
	public static void scenarioSetup(Scenario scenario)
	{
		System.out.println("<---Scenario Setup--->");
		System.out.println("Scenario: " + scenario.getName());
	}

	@After
	public static void scenarioTearDown(Scenario scenario)
	{
		System.out.println("<---Scenario Tear Down--->");
		System.out.println("Scenario: " + scenario.getName() + " Status: " + scenario.getStatus().toUpperCase() + "\n");

		if (scenario.isFailed())
		{
			String screenshotName = scenario.getName().toString();
			TestHelper.captureWiniumScreenshot(screenshotName);
		}
	}

	@AfterTest(alwaysRun = true)
	public void testSuiteTearDown()
	{
		System.out.println("<---Test Suite Tear Down--->");
		// WiniumDriverHelper.closeDriver();
	}
}
