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

public class Login_page_test extends test_base{
	
	
	public Login_page_test() throws IOException {
		super();
	
	}


	Login_page lg;
	Auth2FA_page authpage;
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		initiallisation();
		lg = new Login_page();
		
	}
	
	@Test
	public void loginpagetiletest() {
		
		String tilte = lg.VerifyTitle();
		Assert.assertEquals(tilte, "Sign In - Unifonic Cloud");
		
	}
	
	
	@Test
	public void logotest() {
		
		Boolean flag1 = lg.Verifylogo();
		Assert.assertEquals(flag1, true);
	}
	
	
	@Test
	public void buttontest() {
		
		Boolean flag2 = lg.verifybutton();
		Assert.assertEquals(flag2, true);
	}
	
	
	public void loginaction() throws IOException {
		
		String un = prop.getProperty("username");
		String pass = prop.getProperty("password");
		
		authpage = lg.loginaction(un, pass);
	}
	

	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	

	

	

}
