package winium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class NotePadFileMenuOperationsPage {
	private WiniumDriver driver;
	
	@FindBy(name="Save")
	private WebElement saveNotepad;
	
	@FindBy(className="Edit")
	private WebElement textBox;
	
	@FindBy(name="File")
	private WebElement fileMenu;
	
	@FindBy(name="Save As")
	private WebElement saveAs;
	
	@FindBy(name="Save")
	private WebElement save;
	
	@FindBy(name="Confirm Save As")
	private WebElement confirmSaveAs;
	
	@FindBy(name="No")
	private WebElement no;
	
	@FindBy(name="Cancel")
	private WebElement cancel;
	
	@FindBy(name="Close")
	private WebElement close;
	
	@FindBy(name="Notepad")
	private WebElement notePad;
	
	@FindBy(name="Don't Save")
	private WebElement dontSave;
	
	public NotePadFileMenuOperationsPage(WiniumDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void openNotePadAndInsertText(){
		textBox.sendKeys("This is first NotepadTest");
	}
	
	public void clickOnFileMenuItem(){
		fileMenu.click();
	}
	
	public void saveNotePad(){
		this.clickOnFileMenuItem();
		saveNotepad.click();
		if(saveAs.isDisplayed()){
		textBox.clear();
		textBox.sendKeys("FirstNotepad");
		save.click();	
		if(driver.findElementsByName("Confirm Save As").size()>0){
			no.click();
			cancel.click();
		}		
		}	
		
	}
	
	public void closeNotePad(){
		close.click();
		if(driver.findElementsByName("Notepad").size()>0){
			dontSave.click();
		}
	}
}