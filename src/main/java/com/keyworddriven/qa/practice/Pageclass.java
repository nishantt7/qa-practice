package com.keyworddriven.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageclass 
{
	public static WebDriver driver;
	public static void openbrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
	}
	public static void navigate() 
	{
		driver.navigate().to("www.google.com");
	}
	public static void input_username() 
	{
		driver.findElement(By.name("username")).sendKeys("nishant_tuli");
	}
	public static void input_password() 
	{
		driver.findElement(By.name("password")).sendKeys("freecrm@123");
	}
	 public static void click_Login()
	{
	 driver.findElement(By.className("btn btn-small")).click();
	}
}
