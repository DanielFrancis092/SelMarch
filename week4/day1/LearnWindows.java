package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.irctc.co.in/eticketing/userSignUp.jsf");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByLinkText("Contact Us").click();
        
        //take snap 
        File src = driver.getScreenshotAs(OutputType.FILE);
        File desc = new File("./snaps/img.png"); 
        FileUtils.copyFile(src, desc);
         
        // String firstWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles(); 
        List<String> ls = new ArrayList<>();
        ls.addAll(allWindows);
        
        System.out.println(driver.getTitle());
        driver.switchTo().window(ls.get(1));
        System.out.println(driver.getTitle());
        
	}

}








