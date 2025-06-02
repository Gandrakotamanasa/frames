package com.HRM.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutility {

	public void waitforpagetoload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void mousemoveonelement(WebDriver driver,WebElement element)
	{
		Actions obj=new Actions(driver);
		obj.moveToElement(element).click().perform();
	}
	
	public void mousemoveonelement1(WebDriver driver,WebElement element1)
	{
		Actions obj=new Actions(driver);
		obj.moveToElement(element1).click().perform();
	}
	
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
}
