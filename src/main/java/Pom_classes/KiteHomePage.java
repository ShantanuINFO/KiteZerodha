package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	//Declaration
			@FindBy(xpath="//span[@class='user-id']")private WebElement ID;


			//initialization
			public KiteHomePage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//utilization
			public String verifyuserID() {

				String actID = ID.getText();
				return actID;
			}
		
		
		
	}
	

