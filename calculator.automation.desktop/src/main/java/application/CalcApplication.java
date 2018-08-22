package application;

import application.pages.*;

public class CalcApplication
{
	public static CalculatorPage calculatorPage;
	
	static
	{
		buildPages();
	}

	public static void buildPages()
	{
		calculatorPage = new CalculatorPage();
	}
}
