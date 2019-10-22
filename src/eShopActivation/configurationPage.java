package eShopActivation;

import org.openqa.selenium.WebDriver;

public class configurationPage {

	WebDriver driver;
	
	private String simcard = "//label[text()=\"SIM Standard\"]"; 
	private String eSIM= "//label[text()=\"eSIM\"]";
	private String checkBox = "//span[text()='Richiedi la fornitura immediata del servizio']";
	private String continueToidentification= "//span[text()='Continua']";
	public String selectSimCard(String simTypeselection) {
		
		
		if(simTypeselection.equalsIgnoreCase("eSIM")) {
			return eSIM;
		}
		else
			
		return simcard;
		
				
		
	}
	
	public String confirmCheckbox() {
		
		
		return checkBox;
		
	}
	
	public String contineToIdentifications() {
		
		return continueToidentification;
	}
}
