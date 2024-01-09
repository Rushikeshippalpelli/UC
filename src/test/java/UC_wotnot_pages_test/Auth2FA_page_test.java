package UC_wotnot_pages_test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UC_wotnot_base.test_base;
import UC_wotnot_pages.Auth2FA_page;
import UC_wotnot_pages.Login_page;
import UC_wotnot_pages.UC_portal;

public class Auth2FA_page_test extends test_base {
	
	
	public Auth2FA_page_test() throws IOException {
		super();
	}
	
	Auth2FA_page au;
	UC_portal ucportal;
	Login_page lg;

	
	@BeforeMethod
	public void setup() throws IOException {
		initiallisation();
		lg = new Login_page();
		au = new Auth2FA_page();
		String un = prop.getProperty("username");
		String pass = prop.getProperty("password");
		lg.loginaction(un,pass);
		lg.loginaction(un,pass);
			
	}
	
	@Test
	public void titleverifiaction() {
		String title = au.VerifyTitle();
		
		AssertJUnit.assertEquals(title, "2 Factor Authentication - Unifonic Cloud");
		
	}
	
	@Test
	public void verifybutton() {
		
		boolean Flag = au.Verifybutton();
		AssertJUnit.assertTrue(Flag);
	}
	
	
	
	@Test
	
	public void authaction() throws IOException {
		
		String code = prop.getProperty("code");
		ucportal = au.authaction(code);
	
	}
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	
	

}
