package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver d;
@BeforeTest
public void openBrowser() 
{
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("http://localhost/login.do");
	Reporter.log("OpenBrowser",true);
	}
@BeforeMethod
public void Login()
{
	d.findElement(By.id("username")).sendKeys("admin");
	d.findElement(By.name("pwd")).sendKeys("manager");
	d.findElement(By.xpath("//div[text()='Login ']")).click();
	Reporter.log("Login",true);
	
	}
@AfterMethod
public void Logout()
{
	d.findElement(By.id("logoutLink")).click();
	Reporter.log("Logout",true);
	
	}
	@AfterTest
	public void closeBrowser()
	{
		d.quit();
		Reporter.log("CloseBrowser,true");
	}
	
}
