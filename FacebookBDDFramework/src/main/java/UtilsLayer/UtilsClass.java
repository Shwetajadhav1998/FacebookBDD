package UtilsLayer;

import org.openqa.selenium.WebElement;

public class UtilsClass {
 
	public static void sendkeys(WebElement wb, String value) {
		
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	
	}
	public static void click(WebElement wb) {
		
		if(wb.isDisplayed() && wb.isEnabled()) {
			
			wb.click();
		}
		
	
	}
	
}
