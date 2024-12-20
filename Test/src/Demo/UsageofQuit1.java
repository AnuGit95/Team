package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofQuit1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		String pgsrc=driver.getPageSource();
		System.out.println(pgsrc);
		driver.findElement(By.id("login-google-button")).click();
		driver.quit();
	}

}
