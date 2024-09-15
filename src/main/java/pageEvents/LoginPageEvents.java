package pageEvents;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseTest;
import pageObjects.LoginPageElements;

public class LoginPageEvents extends BaseTest {
	
	
	public void verifyLoginPageLoaded() {
		Assert.assertTrue(driver.findElements(By.xpath(LoginPageElements.loginButton)).size() > 0, "Login page not found");
	}
	
	
	public void enterAdminCredentialsAndLogin() {
		// Enter User name
		driver.findElement(By.name(LoginPageElements.userNameField)).sendKeys("Admin");
		//Enter Password
		driver.findElement(By.name(LoginPageElements.userPasswordField)).sendKeys("admin123");
		// Click on login button
		driver.findElement(By.xpath(LoginPageElements.loginButton)).click();
	}
	
}
