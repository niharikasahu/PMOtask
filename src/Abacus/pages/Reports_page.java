package Abacus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Reports_page {
	
	static WebDriver driver= null;
	public static Reports_page report;
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	
	public static void report(WebDriver driver) throws InterruptedException {
		
		driver.switchTo().frame("frmContents");
		WebElement Reports_Frame=driver.findElement(By.xpath("//*[@id='TreeControl1_mtrvDsasListn11']/img"));
		Reports_Frame.click();
		WebElement QueuedTasks=driver.findElement(By.xpath("//a[text()='Queued Tasks']"));
		QueuedTasks.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frmMain");
		//WebElement SearchQuened_BTN=driver.findElement(By.xpath("//input[@id=\"btnSearch\"]"));
		//SearchQuened_BTN.click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='btnSearch']"))).
	    doubleClick().
	    build().perform();
	      
		WebElement Downloadlink=driver.findElement(By.xpath("(//table//tbody//tr[2]//td[8]//a)[1]"));
		Downloadlink.click();
		driver.switchTo().defaultContent();
		
	}

}
