package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {

	
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement conetinuebutton;

	
	//Step 2
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Step 3 Utilization
	
	public void enterPin(String Pin) {
		PIN.sendKeys("Pin");
	}
	public void clickOnContineu() {
		conetinuebutton.click();
}
}