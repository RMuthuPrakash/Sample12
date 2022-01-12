package org.junit;

import org.testng.annotations.Test;

public class Sample1 {

	@Test(groups = "smoke")
	private void tc1() {
		System.out.println("Test1");
	}

	@Test(groups = "sanity")
	private void tc2() {
		System.out.println("Test2");
	}

	@Test(groups = "smoke")
	private void tc3() {
		System.out.println("Test3");
	}

}
