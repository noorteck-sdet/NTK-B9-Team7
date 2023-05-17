package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excerise2Mahmood {
	
public static void main(String[] args) throws InterruptedException {
		
		//1. Launch CHROME browser
		System.setProperty("webdriver.chrome.driver", "/Users/mshah2class-qaengineering/Desktop/Selenium-B9/chromedriver");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);

		//2. Navigate to https://demo.guru99.com/test/newtours/
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		// 3. click register
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		String confirmationPhrase = driver.getTitle();
		if(confirmationPhrase.contains("Thank you for registering!")) {
			System.out.println(" Page Title verification passed");
		}else {
			System.out.println("page Title verification failed ");
		}
		
		// 5. Enter first name
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Mahmood");
		Thread.sleep(3000);

		// 6. Enter last name 
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("S");
		Thread.sleep(3000);

		// 7. Enter phone number
		WebElement phoneNum = driver.findElement(By.name("phone"));
		phoneNum.sendKeys("7034506789");
		Thread.sleep(3000);

		// 8. Enter email
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("Noort12@yahoo.com");
		Thread.sleep(3000);

		// 9. Enter address
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("4545 NoorTeck Cir...");
		Thread.sleep(3000);

		// 10. Enter city
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Sterling");
		Thread.sleep(3000);

		// 11. Enter state
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("VA");
		Thread.sleep(3000);

		// 12. Enter zip code
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("12345");
		Thread.sleep(3000);

		// 13. Enter userName
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Mshah1");
		Thread.sleep(3000);

		// 14. Enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Nt@007");
		Thread.sleep(3000);

		// 15. Re-Enter password in confirm password field
		WebElement reEnterPassword = driver.findElement(By.name("confirmPassword"));
		reEnterPassword.sendKeys("Nt@007");
		Thread.sleep(3000);

		// 16. Click Submit
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

		// 17. Retrieve the confirmation text message and check if the confirmation text message contains
			//following phrase: "Thank you for registering.
			//a. If it does then print TESTCASE PASSED
			//b. Otherwise print TESTCASE FAILED
		WebElement confirmation = driver.findElement(By.tagName("body"));
		String text = confirmation.getText();

		if (text.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		Thread.sleep(5000);
		driver.quit();

	}

}

/**
	Scenario: Register new user in Mercury Tours Page
		1. Launch chrome browser
		2. Navigate to https://demo.guru99.com/test/newtours/
		3. Click REGISTER link
		4. Verify the page title is Mercury Tours
		5. Enter first name
		6. Enter last name
		7. Enter phone number
		8. Enter email
		9. Enter address
		10. Enter city
		11. Enter state
		12. Enter zip code
		13. Enter username
		14. Enter password
		15. Re-Enter password in confirm password field
		16. Click Submit
		17. Retrieve the confirmation text message and check if the confirmation text message contains
		following phrase: Thank you for registering.
		a. If it does then print TESTCASE PASSED
		b. Otherwise print TESTCASE FAILED
		18. Close the browser
*/