package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Amazon_Multi_Function {
  private FirefoxDriver driver;

@Test
  public void f() throws IOException {
	//click on hello sign button
	
	driver.findElement(By.id("nav-link-accountList")).click();
	driver.findElement(By.id("ap_email")).sendKeys("mmpatel_64804@yahoo.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("riyasavan123");
	driver.findElement(By.id("signInSubmit")).click();
	//test
	DateFormat date = new SimpleDateFormat("MM dd YYYY HH mm ss");
	  Date d1 = new Date();
	  String time = date.format(d1);
	  System.out.println(time);
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  FileUtils.copyFile(src, new File("F:\\selenium\\workspace\\Automation Training\\screenshot1.png"));
	  
	  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src1, new File("F:\\selenium\\workspace\\Automation Training\\screenshot @ " + time + ".png"));
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Lib\\diver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
}

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }
  

}
