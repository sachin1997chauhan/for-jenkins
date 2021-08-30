package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		
		Web obj = new Web();
		obj.setup();
		obj.find();
		
			
		
	}
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	
	public void find() {
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(row.size());
	}

}
