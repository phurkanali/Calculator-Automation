package stepdefinitions;

import application.CalcApplication;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorSteps
{
	@Given("^I am on the calculator application$")
	public void iRunTheTest()
	{
		System.out.println("Open Calculator");
		// CalcApplication.calculatorPage.assertIsDisplayed();

	}

	@When("^I calculate 1 plus 1$")
	public void iCalculate1Plus1()
	{
		CalcApplication.calculatorPage.one.click();
		CalcApplication.calculatorPage.plus.click();
		CalcApplication.calculatorPage.one.click();
		CalcApplication.calculatorPage.equals.click();
	}

	@When("^I input two numbers to add$")
	public void iInputTwoNumbersToAdd()
	{
		CalcApplication.calculatorPage.two.click();
		CalcApplication.calculatorPage.plus.click();
		CalcApplication.calculatorPage.two.click();
		CalcApplication.calculatorPage.equals.click();
	}

	@When("^I make a calculation using pi$")
	public void iMakeACalculationUsingPi()
	{
		CalcApplication.calculatorPage.menu.click();
		CalcApplication.calculatorPage.scientific.click();
		
		CalcApplication.calculatorPage.pi.assertElementIsDisplayed();
		
		CalcApplication.calculatorPage.four.click();
		CalcApplication.calculatorPage.multiply.click();
		CalcApplication.calculatorPage.pi.click();
		CalcApplication.calculatorPage.equals.click();
	}

	@Then("^The result will be displayed$")
	public void theResultWillBeCalculated()
	{
		System.out.println("The result on the " + CalcApplication.calculatorPage.result.getElementAttribute("Name"));

		System.out.println("Finished");
	}

	@Then("^The answer will be 3")
	public void theAnswerWillBe3()
	{
		// String stepDescription = ("");
		String result = CalcApplication.calculatorPage.result.getElementAttribute("Name");
		assertThat(result, is(equalTo("Display is 3")));
	}

	@Then("^The numbers will be added together")
	public void theNumbersWillBeAddedTogether()
	{
		// String result =
		// WiniumDriverHelper.getWiniumDriver().findElement(By.id("CalculatorResults")).getAttribute("Name");

		System.out.println("The result on the " + CalcApplication.calculatorPage.result.getElementAttribute("Name"));

		System.out.println("Finished");

	}
}
