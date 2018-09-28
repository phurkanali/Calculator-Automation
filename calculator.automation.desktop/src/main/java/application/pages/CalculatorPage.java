package application.pages;

import org.openqa.selenium.By;

import utilities.elements.winium.Button;
import utilities.elements.winium.Text;


public class CalculatorPage extends Page
{
	public Button equals;
	public Button plus;
	public Button minus;
	public Button multiply;
	public Button divide;
	public Button one;
	public Button two;
	public Button three;
	public Button four;
	public Button five;
	public Button six;
	public Button seven;
	public Button eight;
	public Button nine;
	public Button zero;
	public Button menu;
	public Button scientific;
	public Button pi;
	public Text result;
	
	public CalculatorPage()
	{
		super("calculator");
		buildPage();
	}
	
	public void assertIsDisplayed()
	{
		one.assertElementIsDisplayed();
		two.assertElementIsDisplayed();
		three.assertElementIsDisplayed();
		four.assertElementIsDisplayed();
		five.assertElementIsDisplayed();
		six.assertElementIsDisplayed();
		seven.assertElementIsDisplayed();
		eight.assertElementIsDisplayed();
		nine.assertElementIsDisplayed();
		zero.assertElementIsDisplayed();
		plus.assertElementIsDisplayed();
		minus.assertElementIsDisplayed();
		multiply.assertElementIsDisplayed();
		divide.assertElementIsDisplayed();
		equals.assertElementIsDisplayed();
		menu.assertElementIsDisplayed();
		scientific.assertElementIsDisplayed();
	}

	private void buildPage()
	{
		equals = new Button(By.id("equalButton"), "Equals", name);
		plus = new Button(By.id("plusButton"), "Plus", name);
		minus = new Button(By.id("minusButton"), "Minus", name);
		multiply = new Button(By.id("multiplyButton"), "Multiply", name);
		divide = new Button(By.id("divideButton"), "Divide", name);
		one = new Button(By.id("num1Button"), "One", name);
		two = new Button(By.id("num2Button"), "Two", name);	
		three = new Button(By.id("num3Button"), "Three", name);
		four = new Button(By.id("num4Button"), "Four", name);
		five = new Button(By.id("num5Button"), "Five", name);
		six = new Button(By.id("num6Button"), "Six", name);
		seven = new Button(By.id("num7Button"), "Seven", name);
		eight = new Button(By.id("num8Button"), "Eight", name);
		nine = new Button(By.id("num9Button"), "Nine", name);
		zero = new Button(By.id("num0Button"), "Zero", name);
		result = new Text(By.id("CalculatorResults"), "Result", name);
		menu = new Button(By.id("Open Navigation"), "Open Navigation", name);
		scientific = new Button(By.id("Scientific Calculator"), "Scientific Calculator", name);
		pi = new Button(By.id("Pi"), "Pi", name);
		
	}

}
