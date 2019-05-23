package eShopActivation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class fileRead {
	
	 static Properties p;
	
   public void propertyFile() 
   {
		try
		{
			File f =new File("./WebLocators.properties");
			FileInputStream fr= new FileInputStream(f);
			p =new Properties();
			p.load(fr);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
   
   public static String imagePath = p.getProperty("imageLink");

}
