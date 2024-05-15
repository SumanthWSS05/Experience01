package org.genericLib;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class GenericUtility {
	/**
	 * used to select the value from the dropdown  based on value 
	 */
	public void selectClass(WebElement dropDown, String option) {
		Select select =new Select(dropDown);
		int counter=0;
		try {
		int indexValue=Integer.parseInt(option);
		select.selectByIndex(indexValue);
		counter++;
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not and index value");
		}
		if(counter==0) {
			try {
			select.selectByValue(option);
			}catch (Exception e) {
				select.selectByVisibleText(option);
			}
		}	
	}
	/**
	 * To get screenshot use this method
	 * @throws IOException
	 */

	public String takeScreenshotOfPage(WebDriver driver) {
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		String filePath="./Screenshots/"+name()+".png";
		File dest=new File(filePath);
		File temp= ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+filePath;
	}
	
	public void takeScreenshotOfElement(WebElement element) {
		File temp=element.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+name()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @return it returns the date and time in 
	 * the form of string
	 */	
	public String name() {
		LocalDateTime dateTime=LocalDateTime.now();
		String fileName=dateTime.toString().replaceAll(":", "-");
		return fileName;
	}
}
