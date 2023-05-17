package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MohammadHWTwo {
	public static void main(String[] args) throws InterruptedException {
		// 1 lunch chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elkha\\OneDrive\\Desktop\\Selenium-B9\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);
		// 2. navigate to the URL
		driver.get("https://demo.guru99.com/test/newtours/");
		// 3. click register
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		Thread.sleep(3000);
		// 4. verifying
		String pageTitle = driver.getTitle();
		
		if (pageTitle.contains("Mercury Tours")) {
			System.out.println("page title verification passed");
		} else {
			System.out.println("page title verification failed ");
		}
		// 5. firstname
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Mohammad");
		Thread.sleep(3000);

		// 6. lastname
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("El");
		Thread.sleep(3000);

		// 7. phone number
		WebElement phoneNum = driver.findElement(By.name("phone"));
		phoneNum.sendKeys("4159988384");
		Thread.sleep(3000);

		// 8. email
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("elmoh@gmail.com");
		Thread.sleep(3000);

		// 9. address
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("123 Java drive");
		Thread.sleep(3000);

		// 10. enter city
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("San Ramon");
		Thread.sleep(3000);

		// 11. enter state
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("CA");
		Thread.sleep(3000);

		// 12. zipcode
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("94582");
		Thread.sleep(3000);

		// 13. enter userName
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("emoha");
		Thread.sleep(3000);

		// 14. password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("abc123");
		Thread.sleep(3000);

		// 15. re enterpassword
		WebElement reEnterPassword = driver.findElement(By.name("confirmPassword"));
		reEnterPassword.sendKeys("abc123");
		Thread.sleep(3000);

		// 16. click submit
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

		// 17. retrieve the conformation
		WebElement confirmation = driver.findElement(By.tagName("body"));
		String text = confirmation.getText();

		if (text.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		driver.quit();

	}

}
