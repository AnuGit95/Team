package TestngExcution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassTest {
	public static WebDriver driver;
	@BeforeClass(groups= {"smokeTest","RegressionTest"})
	public void openBrowser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://localhost/login.do");
		Reporter.log("prnBrowser",true); }
	@BeforeMethod(groups= {"smokeTest","RegressionTest"})
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("ogin",true); }
	 @AfterMethod(groups={"smokeTest","RegressionTest"})
	 public void logout() {
		 driver.findElement(By.id("logoutLink")).click();
		 Reporter.log("logout",true); }
	 @AfterClass(groups= {"smokeTest","RegressionTest"})
	 public void closeBrowser() {
		 driver.manage().window().minimize();
		 driver.quit();
	
	}
		
	

}
