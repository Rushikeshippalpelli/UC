package UC_wotnot_pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UC_wotnot_base.test_base;
import UC_wotnot_util.util;

public class Login_page extends test_base {
	

	@FindBy(xpath = "//*[@id='username']")
	WebElement Username_field;		
	
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement Password_field;
	
	
	@FindBy(xpath = "//*[@id='kc-login']")
	WebElement login_Button;
	
	@FindBy(xpath = "//*[@id='unifonic_logo']")
	WebElement UC_logo;
	
	

	public Login_page()throws IOException{
		PageFactory.initElements(driver, this);
		
	};


	public String VerifyTitle() {
		
		return driver.getTitle();
	}
	
	public Boolean Verifylogo() {
		
		return UC_logo.isDisplayed();
	};
	
	public Boolean verifybutton() {
		
		return login_Button.isDisplayed();
	}
	
	
	public Auth2FA_page loginaction(String un, String pass) throws IOException {
		
		Username_field.sendKeys(un);
		Password_field.sendKeys(pass);
		login_Button.click();
		util.pageloadwait();
		return new Auth2FA_page();
		
	}



}







