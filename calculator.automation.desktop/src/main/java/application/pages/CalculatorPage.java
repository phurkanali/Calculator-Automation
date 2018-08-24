package application.pages;

import org.openqa.selenium.By;

import utilities.elements.winium.Button;


public class CalculatorPage extends Page
{
	public Button equals;
	public Button plus;
	public Button two;
	
	public CalculatorPage()
	{
		super("calculator");
		buildPage();
	}

	private void buildPage()
	{
		equals = new Button(By.id("equalButton"), "Equals", name);
		plus = new Button(By.id("plusButton"), "Plus", name);
		two = new Button(By.id("num2Button"), "Two", name);	
	}

}
