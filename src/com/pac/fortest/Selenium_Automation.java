package com.pac.fortest;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//ttte
public class Selenium_Automation {

	@Test
	public static void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en");
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Hi, Welcome to Jenkins automated testing");
		
		//Go to Amazone web Page 
		driver.get("https://amazon.de");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//Start search the site
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("raspberry pi 3");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//back to the main Page
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Page Title is :- " + title);
		
/*		//Go to FaceBook Page
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(2000);*/
		driver.quit();
		

	}

/*	   @Test
	    public void f() {
	       WebDriver driver;
	       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.get("http://www.google.com");
	       driver.quit();
	    }*/
}

