package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class.Base;
import Pom_classes.KiteHomePage;
import Pom_classes.KiteLogin1Page;
import Pom_classes.KiteLogin2Page;
import Utility.Utility_class;

public class Test_Class extends Base {

	//declaration of useful menbers as global
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	
	@BeforeClass
	public void openBowser() {
	Openbrowser();
	  
	  //create objects of all POM classes
	  login1=new KiteLogin1Page(driver);
	  login2=new KiteLogin2Page(driver);
	  home=new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		
		//enter UN
		login1.enterUN(Utility_class.getTD(0, 0));
		
		//enter PWD
		login1.enterPWD(Utility_class.getTD(0, 1));
		
		login1.lohinButton();
		
		//enterPin
		login2.enterPin(Utility_class.getTD(0, 2));
		
		login2.clickOnContineu();
	}	
	 @Test
	 public void verifyuserID() throws Throwable {
		 Reporter.log("running from verify");
		 
		 String actuID=home.verifyuserID();
		 String expID=Utility_class.getTD(0, 0);
		 
		 Assert.assertEquals(actuID, expID);
	 }
	 @AfterMethod
	 public void logout() {
		 
	 }
	 @AfterClass
	 public void closeApp() {
		 Reporter.log("Browser close");
		 system.out.println("Hii");
	 }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
