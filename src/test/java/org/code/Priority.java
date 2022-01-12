package org.code;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = -10)
	private void tc4() {
		System.out.println("Test 4");
	}

	@Test(priority = -6)
	private void tc3() {
		System.out.println("Test 3");
	}

	@Test(enabled = false)
	private void tc0() {
		System.out.println("Tested");
	}

	@Test(priority = -1)
	private void tc1() {
		System.out.println("Test 1");
	}

	@Test(invocationCount = 2)
	private void tc2() {
		System.out.println("MuthuPrakash");
	}

}
