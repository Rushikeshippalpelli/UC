package UC_wotnot_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UC_wotnot_base.test_base;
import UC_wotnot_util.util;

public class Auth2FA_page extends test_base {
	
	@FindBy(xpath = "//*[@id='code']")
	WebElement code_field;
	
	@FindBy(xpath="//*[@id=\'two-factor__form\']/div[2]/button")
	WebElement button;


	
	public Auth2FA_page() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	public String VerifyTitle() {
		
		return driver.getTitle();
			
	}
	
	public Boolean Verifybutton() {
		
		return button.isDisplayed();
	}
	
	public UC_portal authaction(String C) throws IOException {
		
		code_field.sendKeys(C);
		button.click();
		util.pageloadwait();
		return new UC_portal();
	}
	
	
}
