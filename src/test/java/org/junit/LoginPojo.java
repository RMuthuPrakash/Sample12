package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement passWord;
	@FindBy(id = "re_password")
	private WebElement conPass;
	@FindBy(id = "full_name")
	private WebElement name;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getConPass() {
		return conPass;
	}

	public WebElement getName() {
		return name;
	}
}
