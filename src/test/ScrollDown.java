package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	
WebDriver driver;
	
	public static void main(String[] args) {
		
		ScrollDown obj = new ScrollDown();
		obj.setup();
		obj.scroll();
		
			
		
	}
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	
	public void scroll() {
		
		WebElement location = driver.findElement(By.xpath("//h2[text()='Define an HTML Table']"));
		
		JavascriptExecutor objt = (JavascriptExecutor) driver;
		objt.executeScript("arguments[0].scrollIntoView();",location);
			
			
	}

}
