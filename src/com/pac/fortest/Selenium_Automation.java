package com.pac.fortest;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

//ttte
public class Selenium_Automation {

	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hi, Welcome to Jenkins automated testing");
		
		//Go to Amazone web Page 
		driver.navigate().to("https://www.amazon.de");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Start search the site
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("raspberry pi 3");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//back to the main Page
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Page Title is :- " + title);
		
		//Go to FaceBook Page
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.quit();
		

	}

/*	   @Test
	    public void f() {
	       WebDriver driver;
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\zeal\\Downloads\\Download\\chromedriver.exe"); 
	       driver = new ChromeDriver();
	       driver.get("http://www.google.com");
	       driver.quit();
	    }*/
}