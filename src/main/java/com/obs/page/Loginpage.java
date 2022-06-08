package com.obs.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By uname = By.xpath("//input[@id='user-name']");
	By pass = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='login-button']");
	By EmptyInputError = By.xpath("//h3[contains(.,\"Epic sadface: Username is required\")]");
	By InvalidInputError = By.xpath("//h3[contains(.,\"Epic sadface: Username and password do not match any user in this service\")]");
	By productpage = By.xpath("//span[contains(.,\"Products\")]");
	

	
	public void typeusername(String username)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(uname));
		
		driver.findElement(uname).clear();
		driver.findElement(uname).sendKeys(username);
	}
	
	public void typepassword(String password)
	{
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys(password);
	}
	public void clicklogin() {
		driver.findElement(login).click();	
	}
	
	public boolean isEmptyInputDisplayed()
	{
		return driver.findElement(EmptyInputError).isDisplayed();
	}
	public boolean isInvalidInputdisplayed() {
		
		return driver.findElement(InvalidInputError).isDisplayed();
		
	}
	public boolean isProductTitledispalyed()
	{
		return driver.findElement(productpage).isDisplayed();
	}
	
}
