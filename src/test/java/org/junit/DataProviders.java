package org.junit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DataProviders extends BaseClass {
	@BeforeClass
	private void bef() {
		launchChrome();
		launchUrl("https://www.facebook.com/");
		winMax();
	}
	@Test
	private void tc1 (String user,String pass) {
		WebElement userName = driver.findElement(By.id("email"));
		fill(userName, user);
		WebElement passWord = driver.findElement(By.id("pass"));
		fill(passWord, pass);
	}
	@DataProvider(name="Data")
     public Object[][] data(){
    	 return new Object[][] {
    		 {"MUTHU@123","M12345"},
    		 {"Ramesh@123","R12345"},
    		 {"suresh@123","S12345"}
     };
}
}