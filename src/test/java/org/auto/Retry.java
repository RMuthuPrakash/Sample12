package org.auto;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int min = 0;
	int max = 3;

	public boolean retry(ITestResult arg0) {
		if (min < max) {
			min++;
			return true;
		}
		return false;
	}

}
