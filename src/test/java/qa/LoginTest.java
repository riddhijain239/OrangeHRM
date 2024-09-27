package qa;

import java.time.Duration;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.DashboardPageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.RecruitmentPageEvents;

public class LoginTest extends BaseTest {

	LoginPageEvents loginPageEvents = new LoginPageEvents();
	DashboardPageEvents dashboardPageEvents = new DashboardPageEvents();
	RecruitmentPageEvents requirementPageEvents = new RecruitmentPageEvents();

	@Test
	public void enterLoginCredentials() throws InterruptedException {
		loginPageEvents.enterAdminCredentialsAndLogin();

		// verify dashboard page
		dashboardPageEvents.verifyDashboardPageDisplayed();

		// open requirement page
		dashboardPageEvents.openRecruitmentLinktPage();

		// verify requirement page
		requirementPageEvents.verifyRequirementPageDisplayed();
		
		// Add Candidate
		requirementPageEvents.clickAddCandidateLinkAndVerifyAddCandidatePage();
		requirementPageEvents.fillCandidateFormAndSave();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// View candidate profile page.
		requirementPageEvents.verifyCandidateProfile();

		Thread.sleep(3000);
		dashboardPageEvents.clickLogoutLink();
		Thread.sleep(2000);
	}

}
