package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	private static void flipkart() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasan\\eclipse-workspace\\maven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions go = new Actions(driver);
		go.moveToElement(electronics).build().perform();
		WebElement all = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[1]"));
		all.click();
		WebElement Mi = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		Mi.sendKeys("Redmi go(Black,8gb)");
		
		

	}
	public static void main(String[] args) {
		flipkart();
	}
		
	}
		
		
		
		

	


