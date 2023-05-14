package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excerise1Mahmood {
	
	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch CHROME browser
		System.setProperty("webdriver.chrome.driver", "/Users/mshah2class-qaengineering/Desktop/Selenium-B9/chromedriver");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);

		//2. Navigate to https://ntkhr.noortecktraining.com/web/index.php/auth/login
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);

		//3. Enter ntk-admin in the username field
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ntk-admin");
		Thread.sleep(3000);

		//4. Enter Ntk-orange!admin.123 in the password field

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);
		
		//5. Click Login Button
		WebElement clickButton = driver.findElement(By.tagName("button"));
		clickButton.click();
		Thread.sleep(3000);

		//6. Retrieve the Header Text and Verify the header is Dashboard
		WebElement headerText = driver.findElement(By.tagName("h6"));
		String header = headerText.getText();

		System.out.println(" The Header is: " + header);

		Thread.sleep(5000);
		driver.quit();

	}

}

/*

		Scenario: Login to OrangeHRM application
			1. Launch chrome browser
			2. Navigate to https://ntkhr.noortecktraining.com/web/index.php/auth/login
			3. Enter ntk-admin in the username field
			4. Enter Ntk-orange!admin.123 in the password field
			5. Click Login Button
			6. Retrieve the Header Text and Verify the header is Dashboard
			7. Close the browser

*/