package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Popup {
	String Mainwindow;
	WebDriver driver;
	String childwindow;
	@Test
  public void popup() throws Exception
  {
	  
	  //click login button
	  driver.findElement(By.id("exp_new")).click();
	  
	  //click on continue login button
	  driver.findElement(By.xpath("//*[@id='banner']/div[2]/a")).click();
	  
	  //click on forgot password link
	  driver.findElement(By.linkText("Forgot Login Password")).click();
	  
	  java.util.Set<String> handles = driver.getWindowHandles();
	  
	  java.util.Iterator<String>iterator = handles.iterator();
	  
	  
	  	  while (iterator.hasNext()) 
	  	  {
		  childwindow=iterator.next();
		  driver.switchTo().window(childwindow);
		  System.out.println("Child windows name is:" + childwindow);
		    
	  }
	   Thread.sleep(3000);
	   
	  String str = driver.findElement(By.xpath("//*[@id='com_container']/div[2]/p")).getText();
	   System.out.println(str);
	   
	   
	  // click on nest button on Popup
	   
	  driver.findElement(By.id("nextStep")).click();
	  
	  //switch focus from child window to main window
	  driver.switchTo().window(Mainwindow);
	  driver.findElement(By.id("username")).sendKeys("Mukul");
  }
	  
	  
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Lib\\diver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://onlinesbi.com/");
		Mainwindow = driver.getWindowHandle();
		System.out.println("Mainwindows name is:" + Mainwindow);
		
  }

  @AfterClass
  public void afterClass() {
  }

}
