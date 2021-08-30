package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dragdrop {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	
public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
	}

public void drag() {
	
	WebElement drag = driver.findElement(By.xpath(null));
}

}
