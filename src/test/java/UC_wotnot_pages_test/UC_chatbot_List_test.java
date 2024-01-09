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
import UC_wotnot_pages.Bot_builder;
import UC_wotnot_pages.Login_page;
import UC_wotnot_pages.UC_chatbot_List;
import UC_wotnot_pages.UC_portal;

public class UC_chatbot_List_test extends test_base {

	
	public UC_chatbot_List_test() throws IOException {
		super();
		
	}

	Login_page lg;
	Auth2FA_page au;
	UC_portal uc;
	UC_chatbot_List uc_botlist;
	Bot_builder bot_builder;
	
	
	@BeforeMethod
	public void setup() throws IOException {
		initiallisation();
		lg = new Login_page();
		au = new Auth2FA_page();
		uc = new UC_portal();
		uc_botlist = new UC_chatbot_List();
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		String C = prop.getProperty("code");
		lg.loginaction(user, pass);
		lg.loginaction(user, pass);
		au.authaction(C);
		uc.redirection();
		
	}
	
	
	@Test
	public void verifybotname() {
		
		String Botname = uc_botlist.botname();
		Assert.assertEquals(Botname, "new one");
		
	}
	
	
	@Test
	public void verifyredirection() throws IOException {
		
		bot_builder = uc_botlist.redirection_wotnot();
			
	}


	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	

}
