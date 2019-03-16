package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement eleoccupation = driver.findElementById("serRegistrationForm:occupation");
		Select dropdown = new Select(eleoccupation);
		//dropdown.selectByVisibleText("Public");
		//dropdown.selectByIndex(3);
		//dropdown.selectByValue("5");
		List<WebElement> options = dropdown.getOptions();
		for (WebElement singleelement : options) {
			String text = singleelement.getText();
			System.out.println(text);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
