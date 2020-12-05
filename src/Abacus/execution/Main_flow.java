package Abacus.execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Abacus.pages.Home_page;
import Abacus.pages.LoginPage;
import Abacus.pages.Reports_page;

public class Main_flow {
	
	public Main_flow(WebDriver driver) {
		
		super();
	}

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\sudipta.sahoo\\eclipse-workspace\\Click\\Drivers\\chromebrowser\\chromedriver_win32.exe");		
			WebDriver driver = new ChromeDriver();	
		
		driver.get("https://abacus-dsm-atci.accenture.com/default.aspx");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		LoginPage.Login =new LoginPage();
		LoginPage.Login(driver);
		
		Home_page.windowsHandling = new Home_page();
		Home_page.windowsHandling(driver);
		
		Home_page.switchtoframe = new Home_page();
		Home_page.switchtoframe(driver);
		
		Home_page.ClickOn_AdvancedSearch = new Home_page();
		Home_page.ClickOn_AdvancedSearch(driver);
		
		Home_page.clickon_OrganizationalProject = new Home_page();
		Home_page.clickon_OrganizationalProject(driver);
		
		Home_page.clickon_SearchBTN = new Home_page();
		Home_page.clickon_SearchBTN(driver);
		
		Home_page.ChooseClient= new Home_page();
		Home_page.ChooseClient(driver);
		
		Home_page.SearchScreendropdown = new Home_page();
		Home_page.SearchScreendropdown(driver);
		
		Reports_page.report = new Reports_page() ;
		Reports_page.report(driver);

	}

}
