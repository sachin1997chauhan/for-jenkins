package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	XSSFWorkbook WorkBook;
	XSSFSheet WorkSheet;

	@BeforeMethod
	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.simplilearn.com/");

		FileInputStream fis = new FileInputStream("java.xlsx");
		WorkBook = new XSSFWorkbook(fis);
		WorkSheet = WorkBook.getSheetAt(0);
	}

	@Test
//	@Parameters({"uname", "pass"})
	public void login() {

		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		loginlink.click();

		String userval = WorkSheet.getRow(0).getCell(0).getStringCellValue();

		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys(userval);

		String passval = WorkSheet.getRow(0).getCell(1).getStringCellValue();

		WebElement pass = driver.findElement(By.name("user_pwd"));
		pass.sendKeys(passval);

		WebElement loginbtn = driver.findElement(By.name("btn_login"));
		loginbtn.click();

		WebElement errormsg = driver.findElement(By.id("msg_box"));
		String acterror = errormsg.getText();
		String experror = "The email or password you have entered is invalid.";

//		if (acterror.equals(experror)) {
//			System.out.println("test Passed");
//
//		} else {
//			System.out.println("test failed");
//		}
		
		Assert.assertEquals(acterror,experror);

	}

	@AfterMethod
	public void tear() {
		driver.quit();
	}
}
