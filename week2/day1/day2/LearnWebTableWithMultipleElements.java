package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTableWithMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("CBE",Keys.TAB);
		//checkbox verification
		WebElement checkBox = driver.findElementById("chkSelectDateOnly");
		if (checkBox.isSelected()) {
		   driver.findElementById("chkSelectDateOnly").click();
		}
		Thread.sleep(2000);
		//find the table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		//go to rows
		List<WebElement> rows = table.findElements(By.tagName("tr")); 
		System.out.println("Row Count: "+rows.size()); 
		
		for (int i = 0; i < rows.size(); i++) {
			WebElement eachRow = rows.get(i);
			//go to columns
			List<WebElement> columns = eachRow.findElements(By.tagName("td"));
			//System.out.println("Column Count: " + columns.size());
			System.out.println(columns.get(1).getText());
		}
		
	}

}






