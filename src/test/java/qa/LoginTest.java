package qa;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.LoginPageEvents;

public class LoginTest extends BaseTest {
	

 LoginPageEvents loginPageEvents = new LoginPageEvents();
	
  @Test
  public void enterLoginCredentials() {
	  loginPageEvents.enterAdminCredentialsAndLogin();
  }
}
