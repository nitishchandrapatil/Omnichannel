package eShopActivation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class fileRead  {

	Properties p;

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
}



