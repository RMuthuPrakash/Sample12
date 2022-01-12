package org.junit;

import org.openqa.selenium.WebElement;

public class OverDriver extends BaseClass {

	@BeforeClass
	public static void befCls() {
		launchChrome();
		launchUrl("http://adactinhotelapp.com/Register.php");
		winMax();
	}

	@Test
	public void tc1() {
		LoginPojo l = new LoginPojo();
		WebElement userName = l.getUserName();
		fill(userName, "Muthu");
		Assert.assertEquals("Muthu", userName.getAttribute("value"));
		WebElement passWord = l.getPassWord();
		fill(passWord, "Muthu@123");
		Assert.assertEquals("Muthu@123", passWord.getAttribute("value"));
		WebElement conPass = l.getConPass();
		fill(conPass, "Muhtu@123");
		Assert.assertEquals("Muthu@123", conPass.getAttribute("value"));
		WebElement name = l.getName();
		fill(name, "MuthuPrakash");
		Assert.assertEquals("MuthuPrakash", name.getAttribute("value"));

	}

	@Test
	public void tc2() {
		printTitle();
		printCurrentUrl();
	}

}
