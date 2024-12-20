package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoLoginPage {
	private WebElement unTbx;
	private WebElement pwdTbx;
	private WebElement loginBtn;
	
	DemoLoginPage(WebDriver driver){
		unTbx=driver.findElement(By.id("username"));
		pwdTbx=driver.findElement(By.className("pwd"));
		loginBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
		}
	
public void login() {
	unTbx.sendKeys("admin");
	pwdTbx.sendKeys("manager");
	loginBtn.click();
}
}
