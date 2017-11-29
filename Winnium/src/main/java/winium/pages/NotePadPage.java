package winium.pages;

import org.openqa.selenium.winium.WiniumDriver;

public class NotePadPage {
	private WiniumDriver driver;
	//private String applicationPath="C://Windows/System32/notepad.exe";
	
	public NotePadPage(WiniumDriver driver){
		this.driver=driver;
	}
	
	public void openNotePadAndInsertText(){
		driver.findElementByClassName("Edit").sendKeys("This is first NotepadTest");
	}
	
	public void clickOnFileMenuItem(){
		driver.findElementByName("File").click();
	}
	
	public void saveNotePad(){
		this.clickOnFileMenuItem();
		driver.findElementByName("Save").click();		
		driver.findElementByClassName("Edit").clear();
		driver.findElementByClassName("Edit").sendKeys("FirstNotepad");driver.getFileDetector();
		//System.out.println("The Dialog title is "+driver.getTitle());
		driver.findElementByName("Save").click();
		System.out.println("Here the application is:"+driver.getW3CStandardComplianceLevel());
		System.out.println("The opened window count is :"+driver.getWindowHandles().size());
		driver.findElementByName("No").click();
		
		
		
	}
}