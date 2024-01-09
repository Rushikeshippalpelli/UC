package UC_wotnot_util;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import UC_wotnot_base.test_base;

public class util extends test_base{

	public util() throws IOException {
		super();
		
	}


	public static long pageloadtimeout = 20;
	public static long waittimeout = 10;
	


	public static void pageloadwait() {
		Duration s = driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(s);
		
	}
	
	
	public static void dopdownhandle(WebElement el, String text) {
		
		Select sel = new Select(el);
		
		List<WebElement> li = sel.getOptions();
		
		System.out.println(li);
		
		sel.selectByVisibleText(text);
		
		
	}
	
	
	public static void switchframe(WebElement el) {
		
		driver.switchTo().frame(el);
		
		
	}
	
	public static String window() {
		
		return driver.getWindowHandle();
	}
	
	
	public static void switchwindow(String windowhandle) {
		
		driver.switchTo().window(windowhandle);
	}
	
}
