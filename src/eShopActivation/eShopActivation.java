package eShopActivation;

import static org.testng.Assert.assertTrue;

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
import testDataProvide.testDataprovide;
public class eShopActivation extends testDataprovide  {
	
	static WebDriver driver;
	public WebElement e1;
	public WebElement addTobasket;
	public WebDriverWait wait;
	public WebElement fName;
	public WebElement lName;
	public WebElement fisName;
	fileRead f;
	testDataprovide t1;

	
	
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
	Thread.sleep(6000);
	//wait =new WebDriverWait(driver, 3000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated((By) addTobasket));
	addTobasket.click();
	f= new fileRead();
	ReadCustomerdetails rcd=new ReadCustomerdetails();
	Thread.sleep(6000);
    fName= 	driver.findElement(By.id(rcd.getFirstName_Id()));	
   // fName.sendKeys(super.cellValue1);
     t1= new testDataprovide();
	 t1.readExceldata("C:\\Users\\npatil\\Desktop\\TestDataProvider.xlsx", "TestDataProvider.xlsx", "Test");
    fName.sendKeys(t1.cellValue1);
    lName=driver.findElement(By.id(rcd.getLastName_Id()));
    Thread.sleep(2000);
    //lName.sendKeys(super.cellValue2);
    lName.sendKeys(t1.cellValue2);
    fisName= driver.findElement(By.id(rcd.getFiscalCode_Id()));
    //fisName.sendKeys(super.cellValue3);
    fisName.sendKeys(t1.cellValue3);
	}
	
	@AfterTest
	void closeBrowser() {
		
		
		//driver.close();
		
		
		
		
	}
	
}
