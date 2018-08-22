package application.pages;

import org.openqa.selenium.By;

import utilities.elements.Button;

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
		equals = new Button(By.name("equalButton"), "Equals", name);
		plus = new Button(By.name("plusButton"), "Plus", name);
		two = new Button(By.name("num2Button"), "Two", name);		
	}

}
