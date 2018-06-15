package com.OrangeHrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class loginPage 
{
@FindBy(xpath=".//*[@id='txtUsername']") WebElement uid;
@FindBy(name="txtPassword") WebElement pwd;
@FindBy(xpath=".//*[@id='btnLogin']") WebElement login;
public void login(String usid,String pawd)
{
uid.sendKeys(usid);
pwd.sendKeys(pawd);
login.click();
}
}
