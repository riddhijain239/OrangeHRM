package pageEvents;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseTest;
import pageObjects.RecruitmentPageElement;

public class RecruitmentPageEvents extends BaseTest {

	public void verifyRequirementPageDisplayed() {
		boolean checkDashboard = driver.findElements(By.xpath(RecruitmentPageElement.requirement)).size() > 0;
		Assert.assertTrue(checkDashboard, "Requirement Page Not Found");
	}

	public void clickAddCandidateLinkAndVerifyAddCandidatePage() {
		driver.findElement(By.xpath(RecruitmentPageElement.addCandidateButton)).click();

		boolean checkAddCandidate = driver.findElements(By.xpath(RecruitmentPageElement.addCandidate)).size() > 0;
		Assert.assertTrue(checkAddCandidate, "Add Candidate Page Not Found");
	}

	public void fillCandidateFormAndSave() {

		driver.findElement(By.name(RecruitmentPageElement.firstName)).sendKeys("Riddhi");
		driver.findElement(By.name(RecruitmentPageElement.middleName)).sendKeys("Darshan");
		driver.findElement(By.name(RecruitmentPageElement.lastName)).sendKeys("Jain");
		driver.findElement(By.xpath(RecruitmentPageElement.emailId)).sendKeys("riddhijain@yopmail.com");
		driver.findElement(By.xpath(RecruitmentPageElement.contactNumber)).sendKeys("9012345678");
		driver.findElement(By.tagName(RecruitmentPageElement.notes)).sendKeys("Candidate has good Selenium skils");
		
		driver.findElement(By.xpath(RecruitmentPageElement.saveCandidateButton)).click();
	}
	
	public void verifyCandidateProfile() {
		boolean checkCandidateProfile = driver.findElements(By.xpath(RecruitmentPageElement.applicationStage)).size() > 0;
		Assert.assertTrue(checkCandidateProfile, "Candidate not found");
	}

}