package hw1;

import java.sql.DriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NeginaHW1 {

	@Test
	public void hw1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("ntk-admin");
		
		Thread.sleep(3000);

		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		
		Thread.sleep(3000);
		
		WebElement button= driver.findElement(By.tagName("button"));
		button.click();
		
		Thread.sleep(3000);
		
		WebElement Header= driver.findElement(By.tagName("h6"));
		String headername=Header.getText();
		
		if(headername.equals("Dashboard")) {
		System.out.println("Header is dashboard , test is PASSED");
		}
		else {
			System.out.println("header is not Dashboard, test is FAILED");
		}
		
		Thread.sleep(3000);
		driver.quit();

		
	}

}
