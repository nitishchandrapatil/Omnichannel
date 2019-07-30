package eShopActivation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import eShopActivation.fileRead;
public class eShopActivation  {
	
	static WebDriver driver;
	public WebElement e1;
	public WebElement addTobasket;
	public WebDriverWait wait;
	
	
	
	@BeforeTest
	void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.150.255.167");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	void onboardingFlow() throws InterruptedException, IOException {
	Thread.sleep(3000);	
	fileRead f= new fileRead();
	String str= f.propertyFile();
	System.out.println(str);
	e1= driver.findElement(By.id(str));
	e1.click();
	addTobasket= driver.findElement(By.id(f.addBasket()));
	//Thread.sleep(6000);
	wait =new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated((By) addTobasket));
	addTobasket.click();	
		
	}
	
	@AfterTest
	void closeBrowser() {
		
		
		//driver.close();
		
		
		
		
	}
	
}
