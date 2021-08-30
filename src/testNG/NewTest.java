package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	private static final String Regression = null;

	@BeforeMethod
	  public void beforemethod() {
		  System.out.println("before method");
	  }
	
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("before Test");
	  }
	
  @Test
  public void test1() {
	  System.out.println("test 1");
  }
  
  @Test(groups = {"Regression"})
  public void test2() {
	  System.out.println("test 2");
  }
  
  @AfterMethod
  public void aftermethod() {
	  System.out.println("after method");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("after Test");
  }
}
