package com.OrangeHrm.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.OrangeHrm.constants.OrangeHrmConstants;
import com.OrangeHrm.pages.AdminHomePage;
import com.OrangeHrm.pages.loginPage;
public class AdminLoginTest1  extends OrangeHrmConstants
{
@Test
public void  AdminLoginTest()
{
	launchApp();
	loginPage Lp=PageFactory.initElements(driver, loginPage.class);
	Lp.login("Admin", "Admin");
	AdminHomePage ahome=PageFactory.initElements(driver,AdminHomePage.class);
	boolean res=ahome.isWelcomeLinkisDisplayed();
	Assert.assertTrue(res);
	ahome.logOut();
}
}
