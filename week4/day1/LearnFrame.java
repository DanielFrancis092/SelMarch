package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement eleframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(1);
		driver.findElementByXPath("//li[text()='Item 2']").click();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
