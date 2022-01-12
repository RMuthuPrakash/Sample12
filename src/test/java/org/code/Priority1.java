package org.code;

import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 0)
	private void tc1() {
		System.out.println("Raja");
	}

	@Test(invocationCount = 2)
	private void tc3() {
		System.out.println("Ram");
	}

}
