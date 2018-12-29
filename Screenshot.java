package AdvancedWebdriver;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Screenshot {
	
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  DateFormat date = new SimpleDateFormat("MM dd YYYY HH mm ss");
	  Date d1 = new Date();
	  String time = date.format(d1);
	  System.out.println(time);
	  
	  driver.findElement(By.id("email")).sendKeys("Mukesh");
	  driver.findElement(By.id("pass")).sendKeys("Mukesh@1234");
	  
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  FileUtils.copyFile(src, new File("F:\\selenium\\workspace\\Automation Training\\screenshot1.png"));
	  
	  driver.findElement(By.id("loginbutton")).click();
	  
	  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src1, new File("F:\\selenium\\workspace\\Automation Training\\screenshot @ " + time + ".png"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Lib\\diver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.fb.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}