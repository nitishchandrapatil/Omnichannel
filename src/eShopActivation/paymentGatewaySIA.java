package eShopActivation;

import org.openqa.selenium.By;

public class paymentGatewaySIA {
	
	
	private By creditCardNumber = By.id("input-card-number");
	private By monthNum= By.id("input-expiration-date-month");
	private By dateNum= By.id("input-expiration-date-year");
	private By cvvNum= By.xpath("//input[@placeholder='Codice di sicurezza']");
	private By acceptCheckbox= By.xpath("//label[@for='accept-terms-checkbox']");
	
	public By getCreditCardNumber() {
		return creditCardNumber;
	}
	
	public By getMonthNum() {
		return monthNum;
	}
	
	public By getDateNum() {
		return dateNum;
	}
	
	public By getCvvNum() {
		return cvvNum;
	}
	public By getAcceptCheckbox() {
		return acceptCheckbox;
	}
	
	

}
