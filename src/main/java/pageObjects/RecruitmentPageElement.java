package pageObjects;

public interface RecruitmentPageElement {

	// By XPATH identifier
	String requirement = "//h6[text()='Recruitment']";
	String addCandidateButton = "//button[@type='button' and contains(.,'Add')]";
	String addCandidate = "//h6[text()='Add Candidate']";

	// Add Candidate Form

	// By NAME identifier
	String firstName = "firstName"; // required
	String middleName = "middleName";
	String lastName = "lastName";

	// By XPATH identifier
	String emailId = "//div[@class='oxd-form-row'][3]/div/div[1]/div[1]/div[2]/input"; // required
	String contactNumber = "//div[@class='oxd-form-row'][3]/div/div[2]/div[1]/div[2]/input";
	String notes = "textarea";
	String saveCandidateButton = "//button[@type='submit']";
	
	String applicationStage =  "//h6[text()='Application Stage']";

}