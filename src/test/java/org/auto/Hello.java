package org.auto;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Hello {
	@Test
	public void bike() {
		System.out.println("jupiter");
	}
	@Test
	public void car() {
		System.out.println("Creta");
		Assert.assertTrue(false);
	}
	@Test
	public void ebike() {
		System.out.println("Ola ebike performance");
	}

}
