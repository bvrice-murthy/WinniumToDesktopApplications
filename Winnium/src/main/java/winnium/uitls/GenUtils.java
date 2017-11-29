package winnium.uitls;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;

public class GenUtils {
	private static WiniumDriver driver;
	private static  DesktopOptions options;
	
	
	private void setDesktopOptions(String applicationPath){
		options=new DesktopOptions();
		options.setApplicationPath(applicationPath);
	}
	
	public static WiniumDriver getWinniumDriver(String applicationPath){
		if(driver!=null){
			return driver;
		}
		new GenUtils().setDesktopOptions(applicationPath);
		try {
			driver= new WiniumDriver(new URL("http://127.0.0.1:9999"),options);
		} catch (MalformedURLException e) {
			System.out.println("Winnium Server is not up and running");
		}
		return driver;
	}
	
	@AfterClass
	public void tearDown(){
		if(driver!=null){
			driver.close();
		}
	}
	

}
