package Abacus.pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebDriver driver= null;
	public static LoginPage Login;
	
	public static void Login(WebDriver driver) throws InterruptedException {	
		
		String Username = null;
		String Password = null;

		try {
		 
		FileInputStream fStream = new FileInputStream(new File("C:\\Users\\sudipta.sahoo\\eclipse-workspace\\AbacusFinal\\New folder\\LoginCredential.xlsx"));

		XSSFWorkbook workbook = new XSSFWorkbook(fStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(1);
		XSSFCell cell1 = row.getCell(0);
		XSSFCell cell2 = row.getCell(1);

		Username = cell1.toString();
		Password = cell2.toString();

		   fStream.close();
		        } catch (Exception e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Username);
		WebElement NextButton=driver.findElement(By.xpath("//input[@Value='Next']"));
		NextButton.click();
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys(Password);
		WebElement Sign=driver.findElement(By.xpath("//*[@id='submitButton']"));
		Sign.click();
		Thread.sleep(30000);
		WebElement Skip_Button=driver.findElement(By.xpath("//*[@id='vipSkipBtn']"));
		//executor.executeScript("arguments[0].click();", Skip_Button);
		Skip_Button.click();
		WebElement YesButton=driver.findElement(By.xpath("//input[@type='submit']"));
		YesButton.click();
		}

}
