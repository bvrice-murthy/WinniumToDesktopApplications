package winium.test;

import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import winium.pages.NotePadPage;
import winnium.uitls.GenUtils;

public class NotePadTest {
	private WiniumDriver driver;
	private String applicationPath="C://Windows/System32/notepad.exe";
	private NotePadPage page;
	
	@BeforeClass
	public void setUpReqs(){
		driver=GenUtils.getWinniumDriver(applicationPath);
		page=new NotePadPage(driver);
	}
	
	@Test
	public void notePad(){
		page.openNotePadAndInsertText();
		page.saveNotePad();
	}
}
