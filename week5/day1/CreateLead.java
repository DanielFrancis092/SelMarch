package week5.day1;

import org.testng.annotations.Test;

import utils.ProjectMethods;

public class CreateLead extends ProjectMethods{
	@Test
	public void cLead1() {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
	}

}






