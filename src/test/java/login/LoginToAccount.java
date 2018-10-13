package login;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Home;
import util.ExcelReader;
import util.LogManager;

public class LoginToAccount extends TestBase {
	Logger logger  = LogManager.getLogger(LoginToAccount.class);
	
	@Test
	public void testLoginToApplication(){
		logger.info("-----> S  T  A  R  T -----> -----> -----> testLoginToApplication ");
		
		driver.get(config.getWebsite());
		
		Home loginPage = new Home(driver);
		
//		loginPage.loginToApplication(config.getUserName(), config.getPassword());
//		boolean status = loginPage.verifySuccessLoginMsg();
//		if(status){
//		   log.info("login is sucessful");	
//		}
//		else{
//			Assert.assertTrue(false, "login is not sucessful");
//		}
	}
}
