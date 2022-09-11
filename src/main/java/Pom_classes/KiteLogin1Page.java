package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {

	//Step 1 Decelration
		@FindBy(xpath ="//input[@id='userid']")private WebElement UN;
		@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
		@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement lohinButton;
		
		//Step 2 Initialization
		
		public KiteLogin1Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		public void enterUN(String username) {
			UN.sendKeys("username");
		}
		public void enterPWD(String password) {
			PWD.sendKeys("password");
		}
		public void lohinButton() {
			lohinButton.click();
		}
}
