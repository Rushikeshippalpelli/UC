package UC_wotnot_pages_test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
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
import UC_wotnot_pages.UC_chatbot_List;
import UC_wotnot_pages.UC_portal;

public class UC_portal_test extends test_base {

	public UC_portal_test() throws IOException {
		super();
		
	}
	
	UC_portal ucp;
	UC_chatbot_List	bot_list;
	Login_page lg;
	Auth2FA_page au;
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		initiallisation();
		lg = new Login_page();
		au = new Auth2FA_page();
		String un = prop.getProperty("username");
		String pass = prop.getProperty("password");
		lg.loginaction(un,pass);
		lg.loginaction(un,pass);
		String code = prop.getProperty("code");
		au.authaction(code);
		ucp = new UC_portal();	
	}
	
	@Test
	public void dashtest() {
		
		String D = ucp.verifydash();
		AssertJUnit.assertEquals(D, "DASHBOARD");
			
	}
	
	@Test
	public void logotest() {
		
		Boolean flag = ucp.verifylogo();
		Assert.assertTrue(flag);
	}
	
	
	@Test
	public void redirection() throws IOException {
		
		bot_list = ucp.redirection();
	}
	

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
