package UC_wotnot_pages;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UC_wotnot_base.test_base;

public class UC_chatbot_List extends test_base {
	
	
	@FindBy(xpath = "//table//tbody//tr//td//uni-link[@title='new one']")
	WebElement bot;
	
	
	public UC_chatbot_List() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public String botname() {
		
		return bot.getAttribute("title");
		
	}
	
	
	public Bot_builder redirection_wotnot() throws IOException {
		bot.click();
		return new Bot_builder();
		
	}
	
	
}
