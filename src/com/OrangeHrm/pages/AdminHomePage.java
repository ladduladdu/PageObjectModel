package com.OrangeHrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AdminHomePage 
{
@FindBy(xpath=".//*[@id='welcome']") WebElement Welcomelink;
@FindBy(xpath=".//*[@id='welcome-menu']/ul/li[3]/a") WebElement Logout;
public boolean isWelcomeLinkisDisplayed()
{
	if (Welcomelink.isDisplayed()) 
	{
		return true;
	}else
		return false;
}
public void logOut()
{
	Welcomelink.click();
	Logout.click();
}
}