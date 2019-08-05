package eShopActivation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class fileRead  {

	static Properties p;
	public String firstName;
	public String lastName;
	public String fiscalCode;

	public String  propertyFile() throws IOException {
		// TODO Auto-generated method stub
		
		String imagePath;
		
		File f =new File("./WebLocators.properties");
		FileInputStream fr= new FileInputStream(f);
		p =new Properties();
		p.load(fr);		

		imagePath  = p.getProperty("imageLink");
		return imagePath;

	}

   public String addBasket() {
	   
	   
	String basketAdd=p.getProperty("basketSelect"); 
	return basketAdd;
		
	   	   
   }


   public void customerName() {
	   
	   
     firstName= p.getProperty("firstName_Id");
	 lastName= p.getProperty("lastName_Id");
	 fiscalCode=p.getProperty("fiscalCode_Id");
	 
	  
	 
   }
}



