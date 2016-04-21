
package com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Featured
{
	WebDriver driver;

	public Featured(WebDriver driver)
	{
		this.driver = driver;
	}

	By signIn = By.xpath("//a[@class='signin']");

	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}
}
