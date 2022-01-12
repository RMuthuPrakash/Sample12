package org.test;

import org.testng.annotations.Test;

public class ParallelDemo {
	@Test
	private void tc11() {
		System.out.println("Test11 "+Thread.currentThread().getId());
	}
	@Test
	private void tc22() {
      System.out.println("Test22 "+Thread.currentThread().getId());
	}

}
