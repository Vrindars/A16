package oranhm;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Proj {
	
	 @Test
	  public void f() {
		
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.get("http://localhost/orangehrm/orangehrm-5.6/web/index.php/auth/login");
		   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("admin");	    
		   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Passvrinda@07");
		   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		   
		 
	 }
 
}
