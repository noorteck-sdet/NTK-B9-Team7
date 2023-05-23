package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeginaHw2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedas\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		
		String pageTitle = driver.getTitle();
		if(pageTitle.contains("Mercury Tours")) {
			System.out.println(" page Title verification passed");
			
		
		}else {
			System.out.println("page Title verification failed ");
		}
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Negina");
		Thread.sleep(3000);

		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Sirat");
		Thread.sleep(3000);

		
		WebElement phoneNum = driver.findElement(By.name("phone"));
		phoneNum.sendKeys("123456");
		Thread.sleep(3000);

	
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("ABC@gmail.com");
		Thread.sleep(3000);

	
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("111 main street");
		Thread.sleep(3000);

		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("ELK-GROVE");
		Thread.sleep(3000);

		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("CA");
		Thread.sleep(3000);

		
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("97656");
		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("NSirat");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12aa34bb");
		Thread.sleep(3000);

		
		WebElement reEnterPassword = driver.findElement(By.name("confirmPassword"));
		reEnterPassword.sendKeys("12aa34bb");
	

	
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

	
		WebElement confirmation = driver.findElement(By.tagName("body"));
		String confText = confirmation.getText();

		if (confText.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		driver.quit();


		
	}

}
