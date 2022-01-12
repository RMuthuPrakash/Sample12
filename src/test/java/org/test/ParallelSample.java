package org.test;

import org.testng.annotations.Test;

public class ParallelSample {
	@Test
	private void tc1() {
		System.out.println("Test1 "+Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
		System.out.println("Test2 "+Thread.currentThread().getId());
	}

}
