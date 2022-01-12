package org.ju;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunAll {
	@Test
	public void runout() {
		Result r = JUnitCore.runClasses(Car.class, Bike.class);
		System.out.println("RunCount:" + r.getRunCount());
		System.out.println("RunTime:" + r.getRunTime());
		System.out.println("FailureCount:" + r.getFailureCount());
		System.out.println("IgnoreCount:" + r.getFailureCount());
		System.out.println("Status:" + r.wasSuccessful());
	}

}
