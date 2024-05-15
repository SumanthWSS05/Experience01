package org.genericLib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class JavascriptUtility
{
	/***
	 * Used to scroll the page 
	 */

	public void scrollActionTillWebElement(WebElement element,WebElement driver) 
	{
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(("window.scrollTo(" + xaxis + "," + yaxis + ")"));
	}
	/***
	 * used to handle the disable textfield
	 
	 */
	public void disabletext(WebElement element,WebElement driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='This is disabled txt field';",element);
	}
}
