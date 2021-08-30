package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fblogin {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fblogin obj = new fblogin();
		obj.setup();
//		obj.login();
		obj.create();

	}
public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
	}

public void login() {
	
	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	username.sendKeys("sachin@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys("sachin");
	
	WebElement loginbtn = driver.findElement(By.xpath("//*[@name='login']"));
	loginbtn.click();
	
	
}

public void create() {
	WebElement click = driver.findElement(By.xpath("//*[text()='लॉग इन करें']"));
	click.click();
	
	WebElement daydropdown = driver.findElement(By.name(null));
	
	Select day = new Select(daydropdown);
	day.selectByVisibleText("1");
			
	
}

}
