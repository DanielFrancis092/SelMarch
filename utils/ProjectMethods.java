package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import week5.day2.ReadExcel;

public class ProjectMethods {
	
	public ChromeDriver driver;
	public String dataSheetName;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void startApp(String site, String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(site);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	@DataProvider(name = "FetchData")
	public String[][] getData() throws IOException {
		ReadExcel excel = new ReadExcel();
		return excel.readExcel(dataSheetName);
	}
	
	
	
	
	
	
	

}
