package eShopActivation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fillCustomerPersonalDetails {
	
	By by;
	
	
	private String email_field = "PersonDetailsForm-email-field";					
	private String confirm_emailfield= "//input[@id=\"PersonDetailsForm-confirmation-email-field\"]";			
	private String contact_phone="PersonDetailsForm-contact-phone-field";
	By document_startDate= By.xpath("//input[@aria-label=\"Data di rilascio\"]");
	By document_endDate= By.xpath("//input[@aria-label=\"Data di scadenza\"]");
	By streetField= By.id("PersonDetailsPostalAddressForm-postalAddress-street-field");
	By buildingNumber= By.id("PersonDetailsPostalAddressForm-postalAddress-building-field");
	By buttonGoToConfiguration=By.id("buttonGoToConfigurationInCheckoutSetup");
	
	
	//private String selectDocument= "//select[@class=\"custom-select\" and @id=\"documents-id-type\"]";
	
	public String getEmailfield() {
				
		return email_field;
		
	}
	
	public String getEmailfield_Confirmed() {
		
		return confirm_emailfield;
		
	}
	
	public String getContactphone() {
		
		return contact_phone;
			
		
	}
		
	public By getDoc_startDate() {
		
		return document_startDate;
		
	}
	public By getDoc_endDate() {
		
		return document_endDate;
		
	}
	
	public By getStreetField() {
		
		return streetField;
		
	}
	
	public By getBuildingNumber() {
		
		return buildingNumber;
		
	}
	
	public By isContinueEnabled() {
		
		
		return buttonGoToConfiguration;
		
	}
	
}
