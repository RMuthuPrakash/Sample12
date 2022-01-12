package org.junit;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups = "sanity")
	private void tc11() {
		System.out.println("Test11");
	}

	@Test(groups = "smoke")
	private void tc22() {
		System.out.println("Test22");
	}

	@Test(groups = "regression")
	private void tc33() {
		System.out.println("Test33");
	}
}
