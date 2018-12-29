package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class FB_Register {
	WebDriver driver;
	
	
	@BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Lib\\diver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.fb.com");
	}
	
  @Test void f() {
	  
	//Enter First Name
			driver.findElement(By.id("u_0_e")).sendKeys("mukesh");
			
			// Enter Surname
			driver.findElement(By.id("u_0_g")).sendKeys("patel");
			
			//Enter Mobile Number
			driver.findElement(By.id("u_0_j")).sendKeys("9292828381");
			
			//Enter Password
			driver.findElement(By.id("u_0_q")).sendKeys("sitaram55");
			
			//Select Month
			new Select(driver.findElement(By.id("month"))).selectByValue("7");
			
			//Select Date
			new Select(driver.findElement(By.id("day"))).selectByValue("22");
			//Select year
			
			new Select(driver.findElement(By.id("year"))).selectByValue("1977");
			
			//Select Gender
			driver.findElement(By.id("u_0_c")).click();
  }
  
	  
	  
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

}
