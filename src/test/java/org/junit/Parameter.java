package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends BaseClass {
	@BeforeClass
	private void bef() {
		launchChrome();
		launchUrl("https://www.facebook.com/");
		winMax();
	}
	
	@Test(dataProvider="qwerty")
	private void tc1 (String user, String pass) { 
		WebElement userName = driver.findElement(By.id("email"));
		fill(userName, user);
		WebElement passWord = driver.findElement(By.id("pass"));
		fill(passWord, pass);
		driver.navigate().refresh();
	}
	@DataProvider(name="qwerty")
	public Object[][] data(){
		return new Object[][] {
			{"muthu","122332"},
			{"raja","12345234567"},
			{"yoga","W1234@"}
	};
	}
}
