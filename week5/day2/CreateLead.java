package week5.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		dataSheetName = "CL";
	}
	
	@Test(dataProvider = "FetchData")
	public void cLead1(String cName,String fName,String lName) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
	}
	
	

}






