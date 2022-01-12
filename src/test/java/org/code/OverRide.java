package org.code;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverRide extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		browserMaximize();
	}

	@Test
	public void tc3() {
		LoginPojoCls l = new LoginPojoCls();
		WebElement name = l.getUserName();
		fill(name, "9541236");
		Assert.assertEquals("9541236", name.getAttribute("value"));
		WebElement word = l.getPassWord();
		fill(word, "passWord");
		Assert.assertEquals("password", word.getAttribute("value"));
		WebElement btn = l.getLoginBtn();
		btnClick(btn);
	}

	@Test
	public void tc1() {
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
