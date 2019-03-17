package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartAUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement mobiles = driver.findElementByXPath("(//a[text()='Mobiles'])[1]");
		 
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).pause(2000).click(mobiles).perform();
        //builder.click(mobiles).perform(); 
	}

}








