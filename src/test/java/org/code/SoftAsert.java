package org.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsert extends BaseClass {
	public SoftAssert s;

	@BeforeClass
	private void tc1() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		browserMaximize();
	}

	@Test
	private void tc2() {
		s = new SoftAssert();
		WebElement userName = driver.findElement(By.id("email"));
		fill(userName, "Greens@123");
		s.assertEquals(userName.getAttribute("value"), "Greens@123");
		WebElement passWord = driver.findElement(By.id("pass"));
		fill(passWord, "123456789");
		s.assertEquals(passWord.getAttribute("value"), "123456789");
		s.assertAll();
	}

	@Test
	private void tc3() {
		s = new SoftAssert();
		String title = driver.getTitle();
		s.assertTrue(title.contains("Facebook"));
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		s.assertAll();
	}

}
