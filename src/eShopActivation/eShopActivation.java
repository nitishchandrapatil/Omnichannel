package eShopActivation;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.Calendar;
import java.util.List;

//import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import eShopActivation.fileRead;
import testDataProvide.testDataprovide;


public class eShopActivation extends testDataprovide  {
	
	static WebDriver driver;
	//WebDriverWait w;
	public WebElement e1;
	public WebElement addTobasket;
	public WebDriverWait wait;
	public WebElement fName;
	public WebElement lName;
	public WebElement fisName;
	public WebElement verifyButtonToContinue;
	public WebElement email;
	public WebElement confirmEmail;
	public WebElement contactNumber;
	public WebElement documentNumber;
	public WebElement authorization;
	public WebElement issueDate;
	public WebElement endDate;
	public WebElement table;
	public WebElement street;
	public WebElement building;
	public Robot ro;
	public WebElement checks;
	WebElement continuetoidentification;
	deliverPage d;
	fileRead f;
	TakesScreenshot screenshot;
	Select se;
	testDataprovide t1;
	fillCustomerPersonalDetails fill;
	configurationPage c;
	WebElement cardNumber, month,date,cvvNumber,acceptBox ;
	
	
	@BeforeTest
	void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.150.255.167");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	void onboardingFlow() throws InterruptedException, IOException, AWTException {
	Thread.sleep(5000);	
	fileRead f= new fileRead();
	String str= f.propertyFile();
	System.out.println(str);
	driver.findElement(By.id(str)).click();
	//e1.click();
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
   
    lName.sendKeys(t1.cellValue2);
    fisName= driver.findElement(By.id(rcd.getFiscalCode_Id()));
    
    fisName.sendKeys(t1.cellValue3);
    verifyButtonToContinue= driver.findElement(By.id(f.verifyButton_continue()));
    Thread.sleep(3000);
    
    if(verifyButtonToContinue.isEnabled()) {
    	verifyButtonToContinue.click();
    }
    
    else {
    	System.out.println("verifyButtonToContinue not Enabled");
    }
    
    Thread.sleep(2000);
    
     fill= new fillCustomerPersonalDetails();
    email = driver.findElement(By.id(fill.getEmailfield()));
    email.sendKeys(t1.cellValue4);
    Thread.sleep(2000);
    confirmEmail=driver.findElement(By.xpath(fill.getEmailfield_Confirmed()));
    confirmEmail.sendKeys(t1.cellValue5);
    contactNumber = driver.findElement(By.id(fill.getContactphone()));
    contactNumber.sendKeys("3837282992");
    Thread.sleep(3000);
    se= new Select(driver.findElement(By.xpath("//select[@class=\"custom-select\" and @id=\"documents-id-type\"]")));
    se.selectByIndex(1);
    documentNumber=driver.findElement(By.id("PersonDetailsForm-documents-id-number-field"));
    documentNumber.sendKeys("S83893984");
    authorization= driver.findElement(By.id("PersonDetailsForm-documents-authority-field"));
    authorization.sendKeys("Italia");
    se= new Select(driver.findElement(By.id("documents-authority-country")));
    se.selectByVisibleText("Italia");
    issueDate= driver.findElement(fill.getDoc_startDate());
    issueDate.click();
    Thread.sleep(2000);
    issueDate.sendKeys("02/08/2019");
    endDate= driver.findElement(fill.getDoc_endDate());
    endDate.click();
    endDate.sendKeys("09/08/2029");
    
    /*table= driver.findElement(By.xpath("//input[@aria-label=\"Data di rilascio\"]"));
    List<WebElement>row_select= table.findElements(By.tagName("tr"));
    for(WebElement Row:row_select) {
    	
    	List<WebElement> cells=Row.findElements(By.tagName("td"));
    	
    	for(WebElement Cell:cells) {
    		
    		String s="10";
    		if(Cell.getText().contentEquals(s))
    		{
    			Cell.click();
    			
    			
    		}
    	}
    	
    }*/
    		
    
    //issueDate=driver.findElement(By.xpath("//input[@aria-label=\\\"Data di nascita\\\"]"));
    
   // SoftAssert soft= new SoftAssert();
    // soft.assertEquals(arg0, arg1);
    se= new Select(driver.findElement(By.id("PersonDetailsPostalAddressForm-postalAddress-province-field")));
    se.selectByVisibleText("Roma RM");
    se= new Select(driver.findElement(By.id("PersonDetailsPostalAddressForm-postalAddress-city-field")));
    se.selectByVisibleText("Roma");
    se= new Select(driver.findElement(By.id("PersonDetailsPostalAddressForm-postalAddress-postalCode-field")));
    se.selectByVisibleText("00148");
    street= driver.findElement(fill.getStreetField());
    street.sendKeys("Via Carlo Veneziani");
    building= driver.findElement(fill.getBuildingNumber());
    building.sendKeys("58");
    
    WebElement continueButton=driver.findElement(fill.buttonGoToConfiguration);
    continueButton.click();
    //screenshot = (TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    c=new configurationPage();
    WebElement simSelect= driver.findElement(By.xpath(c.selectSimCard("SIM-card")));
    Thread.sleep(2000);
    if(simSelect.isSelected()) {
    System.out.println("SIM Already Selected");
	}
    else {
    	simSelect.click();
    	
    }
    
    checks=driver.findElement(By.xpath(c.confirmCheckbox()));
    checks.click();
    continuetoidentification= driver.findElement(By.xpath(c.contineToIdentifications()));
    assertTrue(continuetoidentification.isEnabled());
    continuetoidentification.click();
    Thread.sleep(2000);
     d=new deliverPage();
    WebElement identification_smart=driver.findElement(d.manualRecognition());
    Thread.sleep(4000);
    
    identification_smart.click();
    
    WebElement continueToPaymenttypes= driver.findElement(By.xpath("//span[text()='Continua']"));
    continueToPaymenttypes.click();
    paymentMethods pay= new paymentMethods();
    WebElement creditcardOption= driver.findElement(By.xpath(pay.getPayment_creditcard()));
    Thread.sleep(4000);
    creditcardOption.click();
    Thread.sleep(2000);
    WebElement continueTocc= driver.findElement(By.xpath("//button[@type='button' and @id='b2c-checkout-payment-pay']"));
    continueTocc.click();
    Thread.sleep(20000);
    paymentGatewaySIA payment= new paymentGatewaySIA();
    //w =new WebDriverWait(driver,20);
    
    cardNumber=driver.findElement(payment.getCreditCardNumber());
    cardNumber.sendKeys("4922950260000040");
    month= driver.findElement(payment.getMonthNum());
    month.sendKeys("11");
    date= driver.findElement(payment.getDateNum());
    date.sendKeys("19");
    
    cvvNumber = driver.findElement(payment.getCvvNum());
    cvvNumber.sendKeys("111");
    Thread.sleep(2000);
    
    acceptBox= driver.findElement(payment.getAcceptCheckbox());
    acceptBox.click();
    Thread.sleep(2000);
    WebElement confirm = driver.findElement(By.id("confirm-payment-button"));
    confirm.click();
    
	}
	
	@AfterTest
	void closeBrowser() {
		
		
		//driver.close();
		
		
		
		
	}
	
}
