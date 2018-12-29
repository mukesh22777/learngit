
//This is Alert Program//

package testNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Alert {
	WebDriver driver;
	
  @Test
  public void alert() {
	  //click in oneway
	  driver.findElement(By.id("for=\"ctl00_mainContent_rbtnl_Trip_1")).click();
	  //select Fly From
	  driver.findElement(By.id("for=\"ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[2]/a")).click();
	  
	  //select Fly To
	  driver.findElement(By.xpath("html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[1]/div[2]"
	  		+ "/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]"
	  		+ "/td[2]/div[3]/div[1]/div/ul[2]/li[5]/a")).click();
	  
	  //select Date
	  driver.findElement(By.xpath("html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]/a")).click();
	  
	  //select adult
	  new  Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9");
	    
	  //select child
	  new  Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("4");
	  //select infant
	  new  Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("4");
	  //click on search Button
	  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	  //Handling Alert
	  String alttxt=driver.switchTo().alert().getText();
	  System.out.println("Text on Alert is:" +alttxt);
	  driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Lib\\diver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
