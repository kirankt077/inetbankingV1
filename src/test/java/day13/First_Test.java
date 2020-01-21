package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First_Test {
	private WebDriver driver;
  @Test
  public void LaunchApplication() throws InterruptedException {
	  driver.findElement(By.id("Email")).sendKeys("kalpesh.lad@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("Test@123");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(3000);
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "C:\\Kiran\\Personal\\IBM\\Selenium_Reskilling_IBM\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
			  
  }
  
  @AfterClass
  public void afterClass(){
	  driver.close();
  }
}

