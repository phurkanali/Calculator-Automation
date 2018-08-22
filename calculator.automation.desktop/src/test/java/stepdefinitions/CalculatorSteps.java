package stepdefinitions;

import application.CalcApplication;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps
{
	@Given("^I am on the calculator application$")
	public void iRunTheTest()
	{
		System.out.println("Open Calculator");
	}

	@When("^I input two numbers to add$")
	public void  iInputTwoNumbersToAdd()
	{
		CalcApplication.calculatorPage.two.click();
		CalcApplication.calculatorPage.plus.click();
		CalcApplication.calculatorPage.two.click();
		CalcApplication.calculatorPage.equals.click();
	}
	
	@Then("^The numbers will be added together")
	public void theNumbersWillBeAddedTogether()
	{
		System.out.println("");
	}
}
