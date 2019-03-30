package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//button[text()='Prompt Box']").click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("Test Leaf");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
	
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
