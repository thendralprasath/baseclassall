package org.testng;

public class Failtestcaserun implements IRetryAnalyzer{
	int min=0,max=5;

	public boolean retry(ITestResult arg0) {
if(min<max)
{
	min++;
	return true;
}
		return false;
	}

}
