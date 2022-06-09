package com.simple.project;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
class ApplicationTests {

	@Test (priority = 1)
	void addStudent() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8511/index");
		sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-success")).click();
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vishal");
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Vishal@gmail.com");
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("28");
		sleep(1000);
		driver.findElement(By.xpath("//option[@value='Female']")).click();
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		sleep(1000);
		WebElement successmessage = driver.findElement(By.className("text-center"));
		String actualmessage = "Operation Successful";
		Assert.assertTrue(actualmessage.contains(successmessage.getText()),
				"Actual message does not contains expected message");
		sleep(1000);
		driver.quit();
	}

	@Test (priority = 2)
	void readStudent() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8511/index");
		sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-info")).click();
		sleep(1000);
		WebElement successmessage = driver.findElement(By.className("text-center"));
		String actualmessage = "List of students";
		Assert.assertTrue(actualmessage.contains(successmessage.getText()),
				"Actual message does not contains expected message");
		sleep(1000);
		driver.quit();
	}

	@Test (priority = 3)
	void updateStudent() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8511/index");
		sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-primary")).click();
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='number' and @name='id']")).sendKeys("1");
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akshay");
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Akki@gmail.com");
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='number' and @name='age']")).sendKeys("22");
		sleep(1000);
		driver.findElement(By.xpath("//option[@value='Female']")).click();
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		sleep(1000);
		WebElement successmessage = driver.findElement(By.className("text-center"));
		String actualmessage = "Operation Successful";
		Assert.assertTrue(actualmessage.contains(successmessage.getText()),
				"Actual message does not contains expected message");
		sleep(1000);
		driver.quit();
	}

	@Test (priority = 4)
	void removeStudent() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8511/index");
		sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-danger")).click();
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='number' and @name='id']")).sendKeys("1");
		sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		sleep(1000);
		WebElement successmessage = driver.findElement(By.className("text-center"));
		String actualmessage = "Operation Successful";
		Assert.assertTrue(actualmessage.contains(successmessage.getText()),
				"Actual message does not contains expected message");
		sleep(1000);
		driver.quit();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (Exception e) {
			
		}
	}

}
