package org.test;

import org.junit.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross extends BaseClass{
	public WebDriver driver;

	@Parameters({"browser","userName","passWord"})
	@Test
	private void browser(String browserName,String user,String pass) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement userName = driver.findElement(By.id("email"));
			fill(userName,user);
			WebElement passWord = driver.findElement(By.id("pass"));
			fill(passWord, pass);
		}
			else if (browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.get("https://www.facebook.com/");
				WebElement UserName = driver.findElement(By.id("email"));
				fill(UserName, user);
				WebElement passWord = driver.findElement(By.id("pass"));
				fill(passWord, pass);
			}
			else {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				WebElement UserName = driver.findElement(By.id("email"));
				fill(UserName, user);
				WebElement passWord = driver.findElement(By.id("pass"));
				fill(passWord, pass);
				
			}

		}
	}

