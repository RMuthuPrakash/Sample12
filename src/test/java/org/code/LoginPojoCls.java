package org.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoCls extends BaseClass {
	public LoginPojoCls() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindAll({ @FindBy(xpath = "//input[@placeholder='Email address or phone number']"),
			@FindBy(xpath = "//input[@autofocus='1']"), @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']") })
	private WebElement userName;
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//input[@placeholder='Password']"),
			@FindBy(xpath = "//input[@data-testid='royal_pass']"), @FindBy(xpath = "//input[@aria-label='Password']") })
	private WebElement passWord;
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//button[@type='submit']"), @FindBy(xpath = "//button[@value='1']"),
			@FindBy(xpath = "//button[@data-testid='royal_login_button']") })
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
