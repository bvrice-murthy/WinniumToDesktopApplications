package winium.test;

import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import winium.pages.NotePadFileMenuOperationsPage;
import winnium.uitls.GenUtils;

public class NotePadFileMenuOperationsTest {
	private WiniumDriver driver;
	private String applicationPath="C://Windows/System32/notepad.exe";
	private NotePadFileMenuOperationsPage page;
	
	@BeforeClass
	public void setUpReqs(){
		driver=GenUtils.getWinniumDriver(applicationPath);
		page=new NotePadFileMenuOperationsPage(driver);
	}
	
	@Test
	public void notePad(){
		page.openNotePadAndInsertText();
		page.saveNotePad();
		page.closeNotePad();
	}
}
