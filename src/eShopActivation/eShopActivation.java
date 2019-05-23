package eShopActivation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import eShopActivation.fileRead;
public class eShopActivation {
	
	WebDriver driver;
	public WebElement e1;
	@BeforeTest
	void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.150.34.40/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}

	@Test
	void onboardingFlow() {
		
	e1= driver.findElement(By.xpath(fileRead.imagePath));
	e1.click();
		
		
	}
}
