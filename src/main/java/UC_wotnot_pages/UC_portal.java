package UC_wotnot_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UC_wotnot_base.test_base;


//extend page class to base class
public class UC_portal extends test_base {
	
//loacte webelements	
	@FindBy(xpath= "//uni-text-body[text()=' Dashboard ']")
	WebElement dash;
	
	
	
	@FindBy(xpath = "//a[@class=\"uni-top-bar-logo ng-star-inserted\"]/img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@class='uni-nav-item-content__main-content']//child::div[text()=' Chatbot ']")
	WebElement chatbot_button;
	
	
	
	

//contructor with pg factory initiation of web elements
	public UC_portal() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
//methods on webelement actions
	
	public String verifydash() {
		
		return dash.getText();
	}
	
	public Boolean verifylogo() {
		
		return logo.isDisplayed();
	}
	

	
	public UC_chatbot_List redirection() throws IOException {
		chatbot_button.click();
		return new UC_chatbot_List();
		
	}
	

}
