package eShopActivation;

import org.openqa.selenium.By;

public class deliverPage {
	
	
	//private String deliveryType_standard= "";
	private String identification_Video= "//label[@for='PO_Rec_Method_Video']";
	private By identifiction_SmartPostman = By.xpath("//label[@for='PO_Rec_Method_Video']//following::label[1]");
	
	public String getVideoRecognised() {
		
		return identification_Video;
	}

	public By manualRecognition() {
		
		return identifiction_SmartPostman; 
	}
}
