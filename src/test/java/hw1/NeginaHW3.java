package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NeginaHW3 {

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://demo.nopcommerce.com/";
		
		// webDriverManager setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver .get(url);
		
		driver.manage().window().maximize();
		
		
		//Register link
		WebElement registerLink=driver.findElement(By.xpath("//a[text()='Register']"));
		
		registerLink.click();
		Thread.sleep(3000);
		
		//Page title
		String title=driver.getTitle();
		if(title.equals("nopCommerce demo store. Register")) {
			System.out.println("page title verification passed");
		}
		else {
			System.out.println("page title verification failed");
		}
		
		
		//gender
		WebElement genderRadio = driver.findElement(By.xpath("//label[text()='Female']"));
		genderRadio.click();
		Thread.sleep(3000);
		
		
		//firstName
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Negina");
		Thread.sleep(3000);
		
		//LastName
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Sirat");
		Thread.sleep(3000);

		
		//Birthday
		WebElement bDay = driver.findElement(By.name("DateOfBirthDay"));
		WebElement bMonth = driver.findElement(By.name("DateOfBirthMonth"));
		WebElement bYear = driver.findElement(By.name("DateOfBirthYear"));
		
		
		Select daySelect=new Select(bDay);
		daySelect.selectByVisibleText("6");
		Thread.sleep(3000);

		Select monthSelect=new Select(bMonth);
		monthSelect.selectByVisibleText("February");
		Thread.sleep(3000);

		Select yearSelect=new Select(bYear);
		yearSelect.selectByVisibleText("1992");
		Thread.sleep(3000);

		//Email
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		Email.sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		
        // company
		WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
		company.sendKeys("Apple");
		Thread.sleep(3000);
		
		//Newsletter
		WebElement newsLetter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		newsLetter.click();
		Thread.sleep(3000);
		
        //password
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("abc@123");
		Thread.sleep(3000);
		
        //confirm password
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmPassword.sendKeys("abc@123");
		Thread.sleep(3000);
		
		
		//register button
		WebElement register = driver.findElement(By.xpath("//button[@id='register-button']"));
		register.click();
		Thread.sleep(3000);
		
		// confirmation text
		WebElement confirmation = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
				

		String confirmationText=confirmation.getText();
		if(confirmationText.equals("Your registration completed")) {
			System.out.println("TESTCASE PASSED");
		}
		else {
			System.out.println("TESTCASE Failed");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
