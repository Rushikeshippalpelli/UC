package UC_wotnot_base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UC_wotnot_util.util;

public class test_base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public test_base() throws IOException {
		
		prop = new Properties();
		FileInputStream fs = new FileInputStream("/home/rushikesh/eclipse-workspace/UC_wotnot.2023/src/main/java/UC_wotnot_config/config.properties");
		prop.load(fs);
		
	}
	
	public void initiallisation() {
		
		String url = prop.getProperty("base_url");
		
		String un = prop.getProperty("username");
		
		String pass = prop.getProperty("password");
	
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(util.pageloadtimeout));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(util.waittimeout));
		
		driver.manage().window().maximize();
		
		
		
		
	}
	

}
