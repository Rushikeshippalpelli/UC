package UC_wotnot_pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UC_wotnot_base.test_base;
import UC_wotnot_util.util;

public class Bot_builder extends test_base{
	
	
	@FindBy(xpath = "//*[@class='_1WXBz-89GcUvfgtBB77Iv']")
	WebElement bot_name;
	
	@FindBy(xpath = "//button[@id='test_this_bot']")
	WebElement test_button;
	
	
	 @FindBy(xpath = "//button[@id='deploy']") 
	 WebElement deploy_button;
	 
	
	@FindBy(xpath = "//*[@id='txtNodeWidget']/div")
	WebElement trigger_block;
	
	
	@FindBy(xpath = "//*[@id='add_action_block']")
	WebElement add_widget;
	
	@FindBy(xpath = "//*[@class='sc-fpqIOt fnjvSA']")
	WebElement widget_dropdown;
	
	@FindBy(xpath = "//div[@class=\"sc-bZerux cweilX\" and text()='Send message']")
	WebElement Send_messsage_widget;
	
	

	public Bot_builder() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public String botname() {
		return bot_name.getText();
	}
	
	public boolean test_btn(){
		return test_button.isDisplayed();
	}
	
	
	public Boolean deploy_btn() {
		
		try {deploy_button.isDisplayed();}
		catch(StaleElementReferenceException e) {
			
			WebElement deploy_button = driver.findElement(By.xpath("//button[@id='test_this_bot']"));
		}
		
		return deploy_button.isDisplayed();
	
	}
	
	
	public boolean trigger_block() {
		return trigger_block.isDisplayed();
	}
	
	
	public boolean add_SM_widget() {
		
		//String parent_window = util.window();
		add_widget.click();
		//util.switchframe(widget_dropdown);
		//return Send_messsage_widget.click();
		//util.switchwindow(parent_window);
		return Send_messsage_widget.isDisplayed();
		
	}
	


}
