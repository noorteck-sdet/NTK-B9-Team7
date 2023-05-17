package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excercise3Mahmood {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.nopcommerce.com/";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);

		driver.manage().window().maximize();
			
		// Register link
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));

		registerLink.click();
		Thread.sleep(3000);

		// Page title
		String title = driver.getTitle();
		if (title.equals("nopCommerce demo store. Register")) {
			System.out.println("Page Title Verification Passed");
		} else {
			System.out.println("Page Title Verification Failed");
		}

		//Gender
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		Thread.sleep(3000);

		//FirstName
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Mahmood");
		Thread.sleep(3000);

		//LastName
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("S");
		Thread.sleep(2000);

		//Birthday
		WebElement day = driver.findElement(By.name("DateOfBirthDay"));
		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		WebElement year = driver.findElement(By.name("DateOfBirthYear"));

		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("17");
		Thread.sleep(2000);

		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("May");
		Thread.sleep(2000);

		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1987");
		Thread.sleep(2000);

		// Email
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		Email.sendKeys("tNoort127@msn.com");
		Thread.sleep(3000);

		// Company
		WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
		company.sendKeys("NoorTeck");
		Thread.sleep(3000);

		// Newsletter
		WebElement newsLetter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		newsLetter.click();
		Thread.sleep(3000);

		// Password
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("Nt@007");
		Thread.sleep(3000);

		// Confirm password
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmPassword.sendKeys("Nt@007");
		Thread.sleep(3000);

		// Register button
		WebElement register = driver.findElement(By.xpath("//button[@id='register-button']"));
		register.click();
		Thread.sleep(3000);

		// Confirmation text
		WebElement confirmation = driver.findElement(By.xpath("//div[text()='Your registration completed']"));

		String confirmationText = confirmation.getText();
		if (confirmationText.equals("Your registration completed")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE Failed");
		}

		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
