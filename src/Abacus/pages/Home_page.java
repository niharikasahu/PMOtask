package Abacus.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Home_page {

	static WebDriver driver= null;
	public static Home_page windowsHandling;
	public static Home_page switchtoframe;
	public static Home_page ClickOn_AdvancedSearch;
	public static Home_page clickon_OrganizationalProject;
	public static Home_page clickon_SearchBTN;
	public static Home_page ChooseClient;
	public static Home_page SearchScreendropdown;

	public static void windowsHandling(WebDriver driver) {
		String parent=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		while(I1.hasNext())
		{
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   driver.switchTo().window(child_window);
		   System.out.println(driver.switchTo().window(child_window).getTitle());
		   driver.findElement(By.xpath("//*[@id='btnClose']")).click();
		   driver.switchTo().window(parent);
	}
		}
	
	}
	public static void switchtoframe(WebDriver driver) {
		driver.switchTo().frame("frmContents");
		WebElement Supply_Frame=driver.findElement(By.xpath("//*[@id='TreeControl1_mtrvDsasListn6']/img"));
		Supply_Frame.click();
		WebElement SearchEditResource=driver.findElement(By.xpath("//*[@id='TreeControl1_mtrvDsasListt8']"));
		SearchEditResource.click();
		driver.switchTo().defaultContent();
		}
	
	public static void ClickOn_AdvancedSearch(WebDriver driver) {
		driver.switchTo().frame("frmMain");
		//WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement Advanced_Search=driver.findElement(By.xpath("//a[text()='Advanced Search']"));
		//executor.executeScript("arguments[0].click();", Advanced_Search);
		//WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Advanced Search']")));
		//Advanced_Search.isDisplayed();
		Advanced_Search.click();	
		}
	
	public static void clickon_OrganizationalProject(WebDriver driver) {
		WebElement Organizational_Project=driver.findElement(By.xpath("//img[@id='OrgznPjt']"));
		Organizational_Project.click();
		}
	
	public static void clickon_SearchBTN(WebDriver driver) {
		WebElement clickon_SearchBTNDeliveryUnit=driver.findElement(By.xpath("//*[@id='ctl00_CPHRsSrch_hypDU']/img"));
		clickon_SearchBTNDeliveryUnit.click();
		}
	
	public static void ChooseClient(WebDriver driver) {
		String parent=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
	    driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
		WebElement ChooseDu_TextSearch=driver.findElement(By.xpath("//input[@id='txtSearch']"));
		ChooseDu_TextSearch.sendKeys("Vi");
		WebElement ChooseDU_Search=driver.findElement(By.xpath("//input[@id='btnSearch']"));
		ChooseDU_Search.click();
		WebElement VitechNA_Link=driver.findElement(By.xpath("//*[@id='dtgResult_ctl03_lbtdtgDUNo']"));
		VitechNA_Link.click();
		driver.switchTo().window(parent);
		//executor.executeScript("window.scrollBy(0,1000)");
	   }}}		
	
	public static void SearchScreendropdown(WebDriver driver) {
		driver.switchTo().frame("frmMain");
		WebElement Search_On_screen=driver.findElement(By.xpath("(//select[@class=\"NormalSmallTextBox\"])[3]"));
		//executor.executeScript("arguments[0].scrollIntoView((true);", Search_On_screen);
		//executor.executeScript("window.scrollBy(0,250)");
		Select sct=new Select(Search_On_screen);
		sct.selectByVisibleText("Send to Queue / Export");
		driver.findElement(By.xpath("//*[@id='ctl00_Search1_Srch']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
        }
	
}

