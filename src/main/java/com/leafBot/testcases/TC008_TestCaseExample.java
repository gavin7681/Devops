package com.leafBot.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC008_TestCaseExample {

	@Test
	public void example() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("headless");
		//opt.addArguments("disable.gp");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://leafground.com");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();

		System.out.println("Test Case is Passed");
	}
	
}
