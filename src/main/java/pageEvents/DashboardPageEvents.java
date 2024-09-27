package pageEvents;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseTest;
import pageObjects.DashboardPageElements;

public class DashboardPageEvents extends BaseTest {
	
	public void verifyDashboardPageDisplayed() {
		boolean checkDashboard = driver.findElements(By.xpath(DashboardPageElements.dashboard)).size() > 0;

		Assert.assertTrue(checkDashboard, "Dashboard Page Not Found");
	}
	
	public void openRecruitmentLinktPage() {
		driver.findElement(By.xpath(DashboardPageElements.recruitmentLink)).click();
	}
	
	public void clickLogoutLink() {
		driver.findElement(By.xpath(DashboardPageElements.userDropdown)).click();
		driver.findElement(By.xpath(DashboardPageElements.logoutLink)).click();
	}

}