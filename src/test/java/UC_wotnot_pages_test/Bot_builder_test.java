package UC_wotnot_pages_test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UC_wotnot_base.test_base;
import UC_wotnot_pages.Auth2FA_page;
import UC_wotnot_pages.Bot_builder;
import UC_wotnot_pages.Login_page;
import UC_wotnot_pages.UC_chatbot_List;
import UC_wotnot_pages.UC_portal;

public class Bot_builder_test extends test_base {

	public Bot_builder_test() throws IOException {
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
		bot_builder = new Bot_builder();
		
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		String c = prop.getProperty("code");
		lg.loginaction(user, pass);
		lg.loginaction(user, pass);
		au.authaction(c);
		uc.redirection();
		uc_botlist.redirection_wotnot();
	
		
	}
	
	
	
	@Test
	public void verifybot() {
		String botname = bot_builder.botname();
		Assert.assertEquals(botname, "new one");
		
	}
	
	@Test
	public void verify_test_buttons() {
		
		Boolean flag1 = bot_builder.test_btn();
		Assert.assertTrue(flag1);
	}
	
	@Test
	public void verify_deploy_buttons() {
		
		Boolean flag = bot_builder.deploy_btn();
		
		Assert.assertTrue(flag);
		
	}
	
	
	@Test
	public void verify_trigger_block() {
		Boolean flag3 = bot_builder.trigger_block();
		Assert.assertTrue(flag3);	
	}
		
	
	
	@Test
	public void verify_SM() {
		
		Boolean flag = bot_builder.add_SM_widget();
		Assert.assertTrue(flag);
		
	}
	
	
}
